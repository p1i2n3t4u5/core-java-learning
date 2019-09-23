package concurrency.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecuterInvokeAll {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

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
				Thread.sleep(100);
				return "Task 3";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 4  executed");
				return "Task 4";
			}
		});

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 5  executed");
				return "Task 5";
			}
		});

		List<Future<String>> futures=null;
		try {
			 futures = executorService.invokeAll(callables);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//this will be blocked till all the threads are executed
//		futures.forEach((s)-> {
//			try {
//				System.out.println(s.get());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
		
		//futures.forEach(System.out::println);
		
		for (Future<String> future : futures) {
			String s=null;
			try {
				s = future.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Future:"+s);
		}
		
		

		executorService.shutdown();
	}

}
