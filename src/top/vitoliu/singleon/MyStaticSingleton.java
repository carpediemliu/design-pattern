package top.vitoliu.singleon;

/**
 * 采用静态内部类的方式（《Effective Java》推荐的方式）
 * 由于SingletonHolder为线程私有的，除了通过getInstance()方法以外无法访问，所以它是懒汉式的，
 * 由于实例的建立是在类加载的时候完成，故天生对多线程友好，无需使用同步
 */
public class MyStaticSingleton {
    private MyStaticSingleton() {
        System.out.println("MyStaticSingleton is create");
    }

    private static class SingletonHolder {
        private static MyStaticSingleton instance = new MyStaticSingleton();
    }

    public static MyStaticSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
