package 多客户端登录;

import java.net.*;
import java.io.*;
public class LoginServer {
	public static void main(String[] args)   {
		try {
			//建立一个服务器Socket（ServerSocket）指定端口并开始监听
			ServerSocket serverSocket=new ServerSocket(8800);
			//使用accept()方法等待客户端触发通信
			Socket socket=null;
			//监听一直进行中
			while(true){
				socket=serverSocket.accept();
				LoginThread LoginThread=new LoginThread(socket);
				LoginThread.start();
			}
		}  catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
