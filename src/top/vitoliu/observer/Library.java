package top.vitoliu.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author vitoliu
 * @create 2018-04-26 9:52
 * @desc 图书馆类(被观察者)
 */
public class Library extends Observable {

    private List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
        //添加两本书
        bookList.add(new Book("Java","Lea"));
        bookList.add(new Book("红楼梦","曹雪芹"));
    }

    public void addBook(Book book){
        //Java.util类下，通过setChanged方法获取对象状态改变的标示
        setChanged();
        this.bookList.add(book);
        //对每一个观察者调用它们的update方法
        super.notifyObservers(book);
    }

    public void delBook(Book book){
        this.bookList.remove(book);
    }
}
