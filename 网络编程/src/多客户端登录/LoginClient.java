package 多客户端登录;

import java.net.*;
import java.io.*;
public class LoginClient {
	public static void main(String[] args) {
		try {
			//建立客户端Socket连接，指定服务器的位置以及端口
			Socket socket=new Socket("localhost",8800);
			//打开输入输出流
			OutputStream os=socket.getOutputStream();
			InputStream is=socket.getInputStream();
			//对象序列化
			ObjectOutputStream oos=new ObjectOutputStream(os);
			//发送客户端登录信息，即向输出流写入信息
			User user=new User();
			user.setLoginName("Tom");
			user.setPwd("123456");
			oos.writeObject(user);
			socket.shutdownOutput();

			//接收服务器段的响应，即从输入流读取信息
			String reply=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			while(!((reply=br.readLine())==null)){
				System.out.println("我是客户端，服务器的响应为："+reply);
			}
			//4.关闭资源
			oos.close();
			is.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
