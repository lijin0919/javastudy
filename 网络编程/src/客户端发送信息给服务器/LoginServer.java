package 客户端发送信息给服务器;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/*
 * 服务器端
 * */
public class LoginServer {
	public static void main(String[] args) {
		try {
			//1.创建一个服务器Socket
			ServerSocket serverSocket=new ServerSocket(5000);
			//2.使用accept()等待客户的通信
			Socket socket=serverSocket.accept();
			//3.获得输入流，获得相应的用户请求
			InputStream is=socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			User user=(User)ois.readObject();
			System.out.println("我是服务器，接收到的信息："+user.getUserName()+"--"+user.getPwd());

			//给客户端一个响应
			String reply="欢迎登录！";
			byte[] replys=reply.getBytes();
			OutputStream os=socket.getOutputStream();
			os.write(replys);

			//4.释放相应资源
			os.close();
			ois.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
