package 简单客户端和服务端通信;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个serverSocket用于监听客户端Socket的链接请求
        ServerSocket serverSocket = new ServerSocket(30000);
        //采用循环不断的接收来自客户端的请求
        while (true){
            //每当接收到一个socket的请求时，服务器端也对应产生一个socket
            Socket socket = serverSocket.accept();
            //将socket对应的输出流包装成printstream
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            //进行普通io操作
            printStream.println("我是服务器，我爱你");
            //关流
            printStream.close();
            socket.close();
        }
    }
}
