package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public class TextFile extends BaseFile {

	TextFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.format("this is a text file ,file name : %s ", super.getName());
	}
}
