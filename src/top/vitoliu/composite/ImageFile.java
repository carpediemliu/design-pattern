package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public class ImageFile extends BaseFile{
	public ImageFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.format("this is a image file ,file name : %s ", super.getName());
	}
}
