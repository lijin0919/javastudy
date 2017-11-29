package 客户端发送信息给服务器字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			//包装输出流
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String info;
			while((info=br.readLine())!=null){
				System.out.println("客户端说："+info);
			}

			//给客户端一个响应
			String reply="欢迎登录！";
			byte[] replys=reply.getBytes();
			OutputStream os=socket.getOutputStream();
			os.write(replys);

			//4.释放相应资源
			os.close();
			br.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
