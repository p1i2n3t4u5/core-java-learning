package concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		System.out.println("Main Thread:" + Thread.currentThread().getId());
		executorService1.execute(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(10l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Run method called");
				System.out.println(" Thread:" + Thread.currentThread().getId());
			}
		});
		System.out.println("Main Thread:" + Thread.currentThread().getId());

		executorService1.shutdown();

		System.out.println("----------------------------runnable returning future task-------------------------------");

		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		Future future = executorService2.submit(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(100l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Run method called");
				System.out.println(" Thread:" + Thread.currentThread().getId());
			}
		});

		// future.get() is of blocking type it will block the execution of main thread
		// till the completion of the other thread. If exection completed successfully
		// it will return null
		try {
			Object object = future.get();
			System.out.println(object);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// future.isDone() is of nonblocking type.
		while (!future.isDone()) {
			System.out.println("Not done");
		}
		
		System.out.println("----------------------------runnable returning future task  with Callable-------------------------------");

		ExecutorService executorService3 = Executors.newSingleThreadExecutor();

		Future<String> future2 = executorService3.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(100);
				return "My result";
			}
		});
		
		// future.isDone() is of nonblocking type.
		while (!future2.isDone()) {
			System.out.println("Not done");
		}

		// future.get() is of blocking type it will block the execution of main thread
		// till the completion of the other thread. If exection completed successfully
		// it will return null
		try {
			Object object = future2.get();
			System.out.println(object);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService3.shutdown();
	

	}

}
