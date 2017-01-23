package com.cell.user.service.job;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class ListenableFutureCallback {

	private static Logger logger = LoggerFactory
			.getLogger(ListenableFutureCallback.class);
	// 创建线程池
	final static ListeningExecutorService service = MoreExecutors
			.listeningDecorator(Executors.newCachedThreadPool());

	public <V> void execute1(Callable<V> call, FutureCallback<V> callback) {
		ListenableFuture<V> future = service.submit(call);
		Futures.addCallback(future, callback);
	}

	public <V> void execute2(Callable<V> call, FutureCallback<V> callback) {
		ListenableFuture<V> future = service.submit(call);
		Futures.addCallback(future, callback, service);
	}

	public static void main(String[] args) throws Exception {

		Long t1 = System.currentTimeMillis();

		ListenableFutureCallback test = new ListenableFutureCallback();
		test.execute2(new QueryJob(), new QueryJobCallBack());

		// 任务1
		ListenableFuture<Boolean> booleanTask = service
				.submit(new Callable<Boolean>() {
					@Override
					public Boolean call() throws Exception {
						return true;
					}
				});

		Futures.addCallback(booleanTask, new FutureCallback<Boolean>() {
			@Override
			public void onSuccess(Boolean result) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				logger.info("Boolean Task:{}", JSON.toJSONString(result));
			}

			@Override
			public void onFailure(Throwable t) {
			}
		});

		// 任务2
		ListenableFuture<String> stringTask = service
				.submit(new Callable<String>() {
					@Override
					public String call() throws Exception {
						return "Hello World";
					}
				});

		Futures.addCallback(stringTask, new FutureCallback<String>() {
			@Override
			public void onSuccess(String result) {
				logger.info("String Task:{}", JSON.toJSONString(result));
			}

			@Override
			public void onFailure(Throwable t) {
			}
		});

		// 任务3
		ListenableFuture<Integer> integerTask = service
				.submit(new Callable<Integer>() {
					@Override
					public Integer call() throws Exception {
						return new SecureRandom().nextInt(100);
					}
				});

		Futures.addCallback(integerTask, new FutureCallback<Integer>() {
			@Override
			public void onSuccess(Integer result) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				logger.info("Integer Task:{}", JSON.toJSONString(result));
			}

			@Override
			public void onFailure(Throwable t) {
			}
		});

		// 执行时间
		logger.info(" time:{}",
				JSON.toJSONString((System.currentTimeMillis() - t1)));
	}
}

/*****
 
 
 ListeningExecutorService executor = ...
List<Callable<Foo>> tasks = ...

List<ListenableFuture<Foo>> futures = Lists.newArrayList();
for (Callable<Foo> task : tasks) {
  futures.add(executor.submit(task));
}

final ListenableFuture<List<Foo>> resultsFuture
    = Futures.allAsList(futures);

// block until all tasks are done
List<Foo> results = resultsFuture.get();

// or add a callback to get called when the tasks complete
Futures.addCallback(resultsFuture, new FutureCallback<List<Foo>>() {
  @Override public void onSuccess(List<Foo> results) {
    // ...
  }

  @Override public void onFailure(Throwable throwable) {
    // ...
  }
}, someExecutor);
 * ******/
