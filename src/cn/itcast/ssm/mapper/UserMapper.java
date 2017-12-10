package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.uservo.UserVo;
public interface UserMapper {
	public User findUserById(int uid) throws Exception;
	
	public List<User> findUserList(UserVo userVo)throws Exception;
	
}
