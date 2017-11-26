package 基于UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 * 服务器端
 * */
public class LoginServer {
	public static void main(String[] args) {
		byte[] infos=new byte[1024];
		DatagramPacket dp=new DatagramPacket(infos, infos.length);
		DatagramSocket socket=null;
		try {
			socket=new DatagramSocket(5000);
			//接收客户端的数据包，并将信息封装在dp中
			socket.receive(dp);

			//构建一个字符串
			String info=new String(dp.getData(),0,dp.getData().length);
			System.out.println("客户端说："+info);

			//给客户端一个响应
			String reply="您好，我在，请说！";
			//客户端的地址
			SocketAddress sa=dp.getSocketAddress();
			//打一个包裹
			DatagramPacket dp1=
					new DatagramPacket(reply.getBytes(),0,reply.getBytes().length,sa);
			//将包裹寄走
			socket.send(dp1);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			socket.close();
		}

	}
}
