package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public abstract class BaseFile {

	private String name;

	BaseFile(String name) {
		this.name=name;
	}

	String getName() {
		return name;
	}

	/**
	 * list page
	 */
	public abstract void display();
}
