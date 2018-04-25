package top.vitoliu.decorator;

/**
 * @author vitoliu
 * @create 2018-04-26 0:47
 * @desc 结合所有组件使用的主方法。通过层层构造组装这些装饰者和被装饰者到一个对象中
 */
public class Main {
    public static void main(String[] args) {
        MyPacketCreator pc = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PacketBodyCreator()));
        System.out.println(pc.handleContent());
    }
}
