package 使用InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    public static void main(String[] args) throws IOException {
        //根据主机名获取InetAddress实例
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        //判断是否可达
        System.out.println(ip.isReachable(2000));
        //获取ip字符串
        System.out.println(ip.getHostAddress());
        //根据原始ip获取InetAddress实例
        InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
        System.out.println(local.isReachable(5000));
        //获取全限定域名
        System.out.println(local.getCanonicalHostName());
    }
}
