package com.cell.user.service.task;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class RunTeskSerivce {

	private static Logger logger = LoggerFactory
			.getLogger(RunTeskSerivce.class);
	// 创建线程池

	final static ListeningExecutorService service2 = MoreExecutors
			.listeningDecorator(Executors.newCachedThreadPool());

	final static ListeningExecutorService service = MoreExecutors
			.listeningDecorator(Executors.newFixedThreadPool(20));

	/***
	 * 回调函数如果也是非耗时的操作
	 * 
	 * @throws ExecutionException
	 * @throws InterruptedException
	 ****/
	public <V> void execute1(Callable<V> call, FutureCallback<V> callback)
			throws InterruptedException, ExecutionException {
		ListenableFuture<V> future = service.submit(call);
		// 同步获取调用结果
		// logger.info(" execute get:{}", JSON.toJSONString(future.get()));
		Futures.addCallback(future, callback);
	}

	/***
	 * 回调函数如果也是耗时的操作，异步处理
	 * 
	 * @throws ExecutionException
	 * @throws InterruptedException
	 ****/
	public <V> void execute2(Callable<V> call, FutureCallback<V> callback)
			throws InterruptedException, ExecutionException {
		ListenableFuture<V> future = service.submit(call);
		// 同步获取调用结果
		// logger.info(" execute get:{}", JSON.toJSONString(future.get()));
		Futures.addCallback(future, callback, service);
	}

	public static void main(String[] args) throws Exception {

		Long startTime = System.currentTimeMillis();

		RunTeskSerivce service = new RunTeskSerivce();

		QueryTaskCallBack callback = new QueryTaskCallBack();
		QueryTask task = new QueryTask();
		service.execute1(task, callback);
		// 预期结果: result是获取不到结果，因为子线程未执行完成.
		String result = callback.getCallbackResult();
		logger.info(" QueryTaskResult:{}", JSON.toJSONString(result));

		QueryUserCallBack userCallback = new QueryUserCallBack();
		QueryUserTask userTask = new QueryUserTask();
		service.execute2(userTask, userCallback);

		String userResult = callback.getCallbackResult();
		logger.info(" userResult:{}", JSON.toJSONString(userResult));
		// 执行时间
		long endTime = System.currentTimeMillis();
		logger.info(" time:{}", JSON.toJSONString((endTime - startTime)));
	}
}

/*****
 * ListeningExecutorService executor =
 * MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
 * List<Callable<Foo>> tasks = new ArrayList<Callable<Foo>>();
 * 
 * List<ListenableFuture<Foo>> futures = Lists.newArrayList(); for(Callable<Foo>
 * task : tasks) { futures.add(executor.submit(task)); }
 * 
 * final ListenableFuture<List<Foo>> resultsFuture = Futures.allAsList(futures);
 * 
 * // block until all tasks are done List<Foo> results = resultsFuture.get();
 * 
 * // or add a callback to get called when the tasks complete
 *
 * Futures.addCallback(resultsFuture, new FutureCallback<List<Foo>>() {
 * 
 * @Override public void onSuccess(List<Foo> results) { }
 * @Override public void onFailure(Throwable throwable) { . } }, someExecutor);
 * ******/
