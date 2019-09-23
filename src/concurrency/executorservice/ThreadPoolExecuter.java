package concurrency.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecuter {

	public static void main(String[] args) {

		
		//at a time only two threads can be present in the thread pool.
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 1  executed");
				Thread.sleep(1000);
				return "Task 1";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 2  executed");
				Thread.sleep(1000);
				return "Task 2";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 3  executed");
				Thread.sleep(1000);
				return "Task 3";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 4  executed");
				Thread.sleep(1000);
				return "Task 4";
			}
		});

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 5  executed");
				Thread.sleep(1000);
				return "Task 5";
			}
		});

		List<Future<String>> futures = null;
		try {
			futures = executorService.invokeAll(callables);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Future<String> future : futures) {
			String s = null;
			try {
				s = future.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Future:" + s);
		}
		
		executorService.shutdown();

	}

}
