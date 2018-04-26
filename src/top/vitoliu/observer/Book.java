package top.vitoliu.observer;

/**
 * @author vitoliu
 * @create 2018-04-26 9:56
 * @desc 图书类对象
 */
public class Book {
    //书名
    public String bookName;
    //作者
    public String author;

    public Book(String bookName,String author){
        this.bookName=bookName;
        this.author=author;
    }

    @Override
    public String toString() {
         return "Book [bookName=" + bookName + ", author=" + author + "]";
    }
}

