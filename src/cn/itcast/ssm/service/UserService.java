package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.uservo.UserVo;

public interface UserService {
	public List<User> findUserList(UserVo userVo)throws Exception;
	
	
	
}
