package 客户端发送信息给服务器;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 客户端
 * */
public class LoginClient {
	public static void main(String[] args) {
		try {
			//1、创建一个客户端Socket
			Socket socket=new Socket("localhost",5000);
			//2、通过输出流发送请求
			OutputStream os=socket.getOutputStream();

			User user=new User("TOM","123456");
			ObjectOutputStream oos=new ObjectOutputStream(os);
			oos.writeObject(user);

			socket.shutdownOutput();
			//通过输入流来接收到服务器给客户端的响应
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String reply;
			while((reply=br.readLine())!=null){
				System.out.println("服务器的响应："+reply);
			}

			//3、释放资源
			br.close();
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

