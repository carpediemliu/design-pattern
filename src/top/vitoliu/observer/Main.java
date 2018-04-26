package top.vitoliu.observer;

import java.util.Observer;

/**
 * @author vitoliu
 * @create 2018-04-26 10:13
 * @desc 模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Observer observerA =  new ReaderA();
        Observer observerB =  new ReaderB();
        //添加读者A为观察者（其实就是将A放入被观察者内部维护的一个观察者数组，添加或者删除观察者都是对该数组内元素的操作）
        library.addObserver(observerA);
        //添加读者B为观察者
        library.addObserver(observerB);
        //（其实就是将添加的Book作为参数传入被观察者内的notify方法，notify方法底层再调用了观察者的observe方法）
        Book book = new Book("朝花夕拾", "鲁迅");
        library.addBook(book);
        System.out.println("-----");
    }
}
