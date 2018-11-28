package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public class VideoFile extends BaseFile {

	public VideoFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.format("this is a video file ,file name : %s ", super.getName());
	}
}
