package top.vitoliu.singleon;

/**
 * 单例模式之双重锁检查方式
 * <p>
 * 由于new操作分为以下三步：
 * 1.给instance分配内存
 * 2.调用构造函数初始化变量
 * 3.将instance指向分配的内存空间（执行完后instance就不为null了）
 * <p>
 * 由于JVM的即时编译器存在指令重排序的情况，上述顺序可能为1-2-3也可能为1-3-2。
 * 所以，需要将instance设置为volatile，禁止指令的重排序
 */
public class MySingleton {

    private volatile static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getSingleton() {
        if (instance == null) {
            synchronized (MySingleton.class){
                if(instance == null){
                    instance = new MySingleton();
                }
            }
        }
            return instance;
    }
}
