package top.vitoliu.factory;

/**
 *
 * @author yukun.liu
 * @since 28 十一月 2018
 */
public class FileLogger implements Logger {
	@Override
	public void writeLog() {
		System.out.format("user logger %s", getClass());
	}
}
