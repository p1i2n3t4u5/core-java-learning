Difference between Future and CompletableFuture
--------------------------------------------------
In Java, Future and CompletableFuture are both used to represent the result of asynchronous computations, but they have some key differences:

Blocking vs non-blocking: Future is a blocking API that requires the get() method to retrieve the result, which blocks until the result is available. CompletableFuture, on the other hand, encourages non-blocking programming, allowing you to process results with functions and actions that are applied asynchronously. This can improve your application's responsiveness.
Composition: CompletableFuture has a more powerful composition API than Future.
Exception handling: CompletableFuture also provides better exception handling than Future.
Completion: With Future, there's no way to explicitly complete the future. 
