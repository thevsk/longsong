package net.zaf.utils;

/**
 * 异常重试工具类
 * @author L.cm
 */
public class RetryUtils {
	/**
	 * 在遇到异常时尝试重试
	 * @param retryLimit 重试次数
	 * @param retryCallable 重试回调
	 * @return V 结果
	 */
	public static <V> V retryOnException(int retryLimit,
			java.util.concurrent.Callable<V> retryCallable) {

		V v = null;
		for (int i = 0; i < retryLimit; i++) {
			try {
				v = retryCallable.call();
			} catch (Exception e) {
			}
		}
		return v;
	}
	
	/**
	 * 在遇到异常时尝试重试
	 * @param retryLimit 重试次数
	 * @param sleepMillis 每次重试之后休眠的时间
	 * @param retryCallable 重试回调
	 * @return V 结果
	 * @throws InterruptedException 线程异常
	 */
	public static <V> V retryOnException(int retryLimit, long sleepMillis,
			java.util.concurrent.Callable<V> retryCallable) throws InterruptedException {

		V v = null;
		for (int i = 0; i < retryLimit; i++) {
			try {
				v = retryCallable.call();
			} catch (Exception e) {
			}
			Thread.sleep(sleepMillis);
		}
		return v;
	}
	
}
