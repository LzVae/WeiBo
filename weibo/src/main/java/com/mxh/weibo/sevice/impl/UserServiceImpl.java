package com.mxh.weibo.sevice.impl;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxh.weibo.common.DC;
import com.mxh.weibo.common.dto.UserToken;
import com.mxh.weibo.common.email.Mail;
import com.mxh.weibo.common.exception.WeiboException;
import com.mxh.weibo.common.model.User;
import com.mxh.weibo.common.util.MD5;
import com.mxh.weibo.dao.UserMapper;
import com.mxh.weibo.sevice.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	public UserMapper userMapper;

	public void register(UserToken userToken) throws Exception {

		// 检查用户名和邮箱
		this.chickUserNameExist(userToken.getUsername());
		this.chickEmailExist(userToken.getEmail());
		
		// 判定密码相同与否
		if(!(userToken.getPassword().equals(userToken.getRpassword()))){
			throw new WeiboException("两次密码不一致");
		}
		
		// 整理数据，插入数据库
		User user = new User();
		PropertyUtils.copyProperties(user, userToken);
		user.setDeleted((byte) 0);
		user.setStatus(DC.STATUS_NORMAL);
		user.setPassword(MD5.getMD5(user.getPassword()));
		userMapper.insertSelective(user);
	}

	public User login(UserToken user) throws WeiboException {
		if(StringUtils.isBlank(user.getUsername())){
			throw new WeiboException("用户名不能为空");
		}
		User user2 = userMapper.selectByEmailOrUsername(null, user.getUsername());
		if(user2 == null || !(user2.getPassword().equals(MD5.getMD5(user.getPassword())))){
			throw new WeiboException("用户名或者密码错误");
		}
		return user2;

	}

	public void findPassword(User user) throws Exception {
		User selectByEmailOrUsername = userMapper.selectByEmailOrUsername(user.getEmail(), user.getUsername());
		if (selectByEmailOrUsername != null) {
			String pwd = Mail.send(user.getEmail(), user.getUsername());
			user.setPassword(MD5.getMD5(pwd));
			userMapper.updateByUserName(user);
		} else {
			throw new WeiboException("账号或邮箱错误");
		}

	}

	public void chickUserNameExist(String username) throws WeiboException {
		User user = userMapper.selectByEmailOrUsername(null, username);
		if (user != null) {
			throw new WeiboException("用户名存在");
		}
	}

	public void chickEmailExist(String email) throws WeiboException {
		User user = userMapper.selectByEmailOrUsername(email, null);
		if (user != null) {
			throw new WeiboException("该邮箱已经被注册");
		}
	}
}
