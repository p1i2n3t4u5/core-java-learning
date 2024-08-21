# core-java-learning
core java  learning

Single Thread Executor : A thread pool with only one thread. So all the submitted tasks will be executed sequentially. Method : Executors.newSingleThreadExecutor()

Cached Thread Pool : A thread pool that creates as many threads it needs to execute the task in parrallel. The old available threads will be reused for the new tasks. If a thread is not used during 60 seconds, it will be terminated and removed from the pool. Method : Executors.newCachedThreadPool()

Fixed Thread Pool : A thread pool with a fixed number of threads. If a thread is not available for the task, the task is put in queue waiting for an other task to ends. Method : Executors.newFixedThreadPool()

Scheduled Thread Pool : A thread pool made to schedule future task. Method : Executors.newScheduledThreadPool()

Single Thread Scheduled Pool : A thread pool with only one thread to schedule future task. Method : Executors.newSingleThreadScheduledExecutor()

Performance Considerations:
--------------------------------
Synchronized blocks and methods can introduce performance overhead due to the locking mechanism. Carefully consider whether synchronization is necessary and whether alternative approaches like using thread-safe data structures might be more appropriate.



Compile Time Dependencies 
-----------------------------
Yes, you can package compile time dependencies with a JAR file. A JAR file, or Java Archive, is a package file format that contains all the components of a Java application, applet, or library. An "executable" JAR file includes all the dependencies needed to run the application, in addition to the project's classes and resources

