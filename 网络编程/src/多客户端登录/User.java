package 多客户端登录;

import java.io.Serializable;
public class User implements Serializable{
	private String loginName; //用户名
	private String pwd; //用户密码

	public User() {
	}
	public User(String loginName, String pwd) {
		super();
		this.loginName = loginName;
		this.pwd = pwd;
	}

	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}