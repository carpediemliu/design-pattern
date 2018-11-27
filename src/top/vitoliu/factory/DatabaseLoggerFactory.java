package top.vitoliu.factory;

/**
 *
 * @author yukun.liu
 * @since 28 十一月 2018
 */
public class DatabaseLoggerFactory implements LoggerFactory {
	@Override
	public Logger createLogger() {
		return new DatabaseLogger();
	}

}
