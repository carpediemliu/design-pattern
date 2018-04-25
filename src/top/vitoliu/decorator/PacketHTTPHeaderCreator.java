package top.vitoliu.decorator;

/**
 * @author vitoliu
 * @create 2018-04-26 0:43
 * @desc 装饰器2：完成对数据包HTTP头的处理。其余部分依旧交给component内部处理
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {
    public PacketHTTPHeaderCreator(MyPacketCreator c) {
        super(c);
    }


    @Override
    public String handleContent() {     //对给定数据加上HTTP头信息
        StringBuffer sb = new StringBuffer();
        sb.append("Cache-Control:no-cache\n");
        sb.append(component.handleContent());
        return sb.toString();
    }
}
