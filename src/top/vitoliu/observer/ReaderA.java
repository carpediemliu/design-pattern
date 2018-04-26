package top.vitoliu.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author vitoliu
 * @create 2018-04-26 10:08
 * @desc 观察者。根据被观察者的行为作出自身的update
 */
public class ReaderA implements Observer {
    @Override
    public void update(Observable o, Object arg) {    //被观察者为library类，update传入参数为book对象。
        System.out.println("我是读者A，我收到了新书" + arg.toString());
    }
}
