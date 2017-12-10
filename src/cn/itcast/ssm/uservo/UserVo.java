package cn.itcast.ssm.uservo;

import cn.itcast.ssm.pojo.User;

public class UserVo {
	private User user;
	private UserExtend userExtend;
	@Override
	public String toString() {
		return "UserVo [user=" + user + ", userExtend=" + userExtend + "]";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserExtend getUserExtend() {
		return userExtend;
	}
	public void setUserExtend(UserExtend userExtend) {
		this.userExtend = userExtend;
	}
	
}
