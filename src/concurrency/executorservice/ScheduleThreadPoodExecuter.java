package concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoodExecuter {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

    ScheduledFuture<String> scheduledFuture = scheduledExecutorService.schedule(new Callable<String>() {
      public String call() throws Exception {
        System.out.println("Executed!");
        return "Called!";
      }
    }, 5, TimeUnit.SECONDS);

//		while (!scheduledFuture.isDone()) {
//		  System.out.println("No result yet");
//			try {
//				System.out.println(scheduledFuture.get());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

    while (!scheduledFuture.isDone()) {
      try {
        Thread.sleep(1000);
        if (scheduledFuture.isDone()) {
          System.out.println(scheduledFuture.get());
        } else {
          System.out.println("Not completed yet");
        }
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    }

    scheduledExecutorService.shutdown();
  }

}
