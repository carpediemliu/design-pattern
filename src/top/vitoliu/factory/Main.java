package top.vitoliu.factory;

/**
 *
 *
 * @author yukun.liu
 * @since 28 十一月 2018
 */
public class Main {
	public static void main(String[] args) {
		LoggerFactory loggerFactory;
		Logger logger;
		loggerFactory = new FileLoggerFactory();
		 logger = loggerFactory.createLogger();
		 logger.writeLog();
	}
}
