package top.vitoliu.decorator;

/**
 * @author vitoliu
 * @create 2018-04-26 0:21
 * @desc 返回数据包的核心数据
 */
public class PacketBodyCreator implements MyPacketCreator {

    @Override
    public String handleContent() {
        return "Content of Packet";   //负责构造核心数据，但是并不包括格式
    }
}
