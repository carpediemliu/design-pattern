package top.vitoliu.decorator;

/**
 * @author vitoliu
 * @create 2018-04-26 0:29
 * @desc 维护核心组件component对象，它负责告知其子类，其核心业务逻辑应该全权委托component完成，自己仅仅做增强处理
 */
public abstract class PacketDecorator implements MyPacketCreator {
    MyPacketCreator component;

    public PacketDecorator(MyPacketCreator c) {
        component = c;
    }
}
