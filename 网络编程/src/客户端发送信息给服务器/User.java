package 客户端发送信息给服务器;

import java.io.Serializable;


/*
 *用户类：用户名和密码
 */
public class User implements Serializable {
	private String userName;
	private String pwd;

















	public User() {
	}
	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


}
