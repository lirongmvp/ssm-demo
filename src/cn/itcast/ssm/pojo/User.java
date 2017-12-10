package cn.itcast.ssm.pojo;

public class User {
	private int uiid;
	private String username;
	private String password;
	public int getUiid() {
		return uiid;
	}
	public void setUiid(int uiid) {
		this.uiid = uiid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uiid=" + uiid + ", username=" + username + ", password="
				+ password + "]";
	}

	
}
