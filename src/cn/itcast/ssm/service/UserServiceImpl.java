package cn.itcast.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.uservo.UserVo;

public class UserServiceImpl implements UserService {
//	@Autowired
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> findUserList(UserVo userVo) throws Exception {
		
		return userMapper.findUserList(userVo);
	}

}
