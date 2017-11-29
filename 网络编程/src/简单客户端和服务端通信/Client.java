package 简单客户端和服务端通信;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //与服务器建立网络链接
        Socket socket = new Socket("127.0.0.1",30000);

        //将cocket对应的输入流包装成bufferedreader
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String io = bufferedReader.readLine();
        System.out.println(io);
        bufferedReader.close();
        socket.close();
    }
}
