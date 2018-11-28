package top.vitoliu.composite;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public class Folder extends BaseFile {

	private ArrayList<BaseFile> files;

	public Folder(String pathname) {
		super(pathname);
		 files = new ArrayList<>();
	}

	/**
	 * 浏览文件
	 */
	public void display(){
		for (BaseFile file : files){
			file.display();
		}
	}

	/**
	 * 添加文件
	 * @param file
	 */
	public void add(BaseFile file){
		files.add(file);
	}

	/**
	 * 删除文件
	 * @param file
	 */
	public void remove(BaseFile file){
		files.remove(file);
	}
}
