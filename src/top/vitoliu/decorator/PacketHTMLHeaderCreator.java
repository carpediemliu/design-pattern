package top.vitoliu.decorator;

/**
 * @author vitoliu
 * @create 2018-04-26 0:35
 * @desc 装饰器1：负责对发布的内容进行HTML格式化操作。它委托了具体组件component进行核心业务处理
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {

    public PacketHTMLHeaderCreator(MyPacketCreator c) {
        super(c);
    }

    @Override
    public String handleContent() {     //将给定数据封装成HTML
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<body>");
        sb.append(component.handleContent());
        sb.append("</body>");
        sb.append("</html>\n");
        return sb.toString();
    }
}
