package top.vitoliu.composite;

/**
 *
 * @author yukun.liu
 * @since 29 十一月 2018
 */
public class Main {

	public static void main(String[] args) {
		Folder folderOne = new Folder("folderOne");
		TextFile textOne = new TextFile("textOne.txt");
		ImageFile imgOne = new ImageFile("imgOne.png");
		Folder folderTwo = new Folder("folderTwo");
		folderOne.add(folderTwo);
		folderOne.add(textOne);
		folderOne.add(imgOne);

		TextFile textTwo = new TextFile("textTwo.txt");
		ImageFile imgTwo = new ImageFile("imgTwo.png");
		VideoFile videoOne = new VideoFile("videoOne.mp4");
		folderTwo.add(textTwo);
		folderTwo.add(imgTwo);
		folderTwo.add(videoOne);

		folderTwo.display();
		System.out.println("========");
		folderOne.display();
		System.out.println("========");
		folderTwo.remove(textTwo);
		System.out.println("========");
		folderTwo.display();
	}
}
