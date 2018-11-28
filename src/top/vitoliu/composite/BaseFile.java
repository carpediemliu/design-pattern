package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public abstract class BaseFile {
	String name;

	public BaseFile(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void display();
}
