Thread Pool
-------------
Why you need thread pool in Java? 
Answer is usually when you develop a simple, concurrent application in Java, you create some Runnable objects and then create the corresponding Thread objects to execute them. Creating a thread in Java is an expensive operation. And if you start creating new thread instance everytime to execute a task, application performance will degrade surely.


A thread pool is a collection of pre-initialized threads. Generally the size of collection is fixed, but it is not mandatory. It facilitates the execution of N number of tasks using same threads. If there are more tasks than threads, then tasks need to wait in a queue like structure.

When any thread completes it�s execution, it can pickup a new task from queue and execute it. When all tasks are completed the threads remain active and wait for more tasks in thread pool.


ExecutorService executorService1 = Executors.newSingleThreadExecutor();

ExecutorService executorService2 = Executors.newFixedThreadPool(10);

ExecutorService executorService3 = Executors.newScheduledThreadPool(10);


SingleThreadExecuterService
----------------------------------
it internally creates a thread pool of one thread

Correct

in case of failure a new one will be created

It traps all Throwable so it doesn't fail when you get an error in the first place.

So my concern is do I need to shutdown this executor service, when there are no more tasks in the system?

You should shutdown is you are worried about resources. If you thread is a daemon thread it won't prevent the JVM from shutting down (by default it will be a non-daemon thread.


ThreadPoolExecutor  
--------------------
We can create thread pool executers 2 different ways

approach1
----------
ExecutorService threadPoolExecutor =
		        new ThreadPoolExecutor(
		                corePoolSize,
		                maxPoolSize,
		                keepAliveTime,
		                TimeUnit.MILLISECONDS,
		                new LinkedBlockingQueue<Runnable>()
		                );
		                
approach2
----------		
ExecutorService executorService=Executors.newFixedThreadPool(10);




ExecutorService Usage
-----------------------
There are a few different ways to delegate tasks for execution to an ExecutorService:

execute(Runnable)  --> runs the threads asynchronously does not return any value
submit(Runnable)   --> runs the threads asynchronously  and returns Future task future.get() gives in case successful execution of the task
submit(Callable)   --> runs the threads asynchronously and future.get() returns the result from the executed thread
invokeAny(...)     --> Runs any one of the Callable task  submitted to the executer  service.
invokeAll(...)	   --> Rans all callable tasks parallel manner.












