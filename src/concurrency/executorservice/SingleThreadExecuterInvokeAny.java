package concurrency.executorservice;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecuterInvokeAny {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				System.out.println("Task 1  executed");
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


		String result=null;
		try {
			result = executorService.invokeAny(callables);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("result = " + result);

		executorService.shutdown();
	}

}
