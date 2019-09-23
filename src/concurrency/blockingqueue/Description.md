
A BlockingQueue with one thread putting into it, and another thread taking from it
---------------------------------------------------------------------------------------

The producing thread will keep producing new objects and insert them into the BlockingQueue, until the queue reaches some upper
 bound on what it can contain. It's limit, in other words. If the blocking queue reaches its upper limit, the producing thread is 
 blocked while trying to insert the new object. It remains blocked until a consuming thread takes an object out of the queue.

The consuming thread keeps taking objects out of the BlockingQueue to processes them. If the consuming thread tries to take an 
object out of an empty queue, the consuming thread is blocked until a producing thread puts an object into the queue.


BlockingQueue is an interface

BlockingQueue Methods
The Java BlockingQueue interface has 4 different sets of methods for inserting, removing and examining the elements in the queue. Each set of methods behaves differently in case the requested operation cannot be carried out immediately. Here is a table of the methods:

 	    Throws Exception	Special Value	Blocks	Times Out
Insert	add(o)	           offer(o)	        put(o)	offer(o, timeout, timeunit)
Remove	remove(o)	       poll()	        take()	poll(timeout, timeunit)
Examine	element()	       peek()
	 	 
The 4 different sets of behaviour means this:

Throws Exception:
-----------------
If the attempted operation is not possible immediately, an exception is thrown.

Special Value:
--------------
If the attempted operation is not possible immediately, a special value is returned (often true / false).

Blocks:
--------
If the attempted operation is not possible immediately, the method call blocks until it is.

Times Out:
------------
If the attempted operation is not possible immediately, the method call blocks until it is, but waits no longer than the given timeout. Returns a special value telling whether the operation succeeded or not (typically true / false).
It is not possible to insert null into a BlockingQueue. If you try to insert null, the BlockingQueue will throw a NullPointerException.


implementation classes of Blocking Queue
------------------------------------------

ArrayBlockingQueue
DelayQueue
LinkedBlockingQueue
PriorityBlockingQueue

PriorityBlockingQueue
--------------------------
The PriorityBlockingQueue class implements the BlockingQueue interface. Read the BlockingQueue text for more information about the interface.

The PriorityBlockingQueue is an unbounded concurrent queue. It uses the same ordering rules as the java.util.PriorityQueue class. You cannot insert null into this queue.

All elements inserted into the PriorityBlockingQueue must implement the java.lang.Comparable interface. The elements thus order themselves according to whatever priority you decide in your Comparable implementation.

Notice that the PriorityBlockingQueue does not enforce any specific behaviour for elements that have equal priority (compare() == 0).

Also notice, that in case you obtain an Iterator from a PriorityBlockingQueue, the Iterator does not guarantee to iterate the elements in priority order.

Here is an example of how to use the PriorityBlockingQueue:

    BlockingQueue queue   = new PriorityBlockingQueue();

    //String implements java.lang.Comparable
    queue.put("Value");

    String value = queue.take();
    
    
BlockingDequeue
-----------------
The BlockingDeque interface in the java.util.concurrent class represents a deque which is thread safe to put into, and take instances from. In this text I will show you how to use this BlockingDeque.

The BlockingDeque class is a Deque which blocks threads tring to insert or remove elements from the deque, in case it is either not possible to insert or remove elements from the deque.

A deque is short for "Double Ended Queue". Thus, a deque is a queue which you can insert and take elements from, from both ends.



CountdownLatch  
---------------
await() method blocks the thread till the countDownLatch reaches zero.
to reduce the countdownlatch's value countdown() method  is used .

CountDownLatch latch = new CountDownLatch(3);

latch.await();
latch.countDown();


CyclicBarrier
---------------
CyclicBarrier is barrier which waits blocks the execution of the code till the specified number of thread reaches the barrier.
Once the specified number of thread reaches the barrier the barrier action is called and the execution of code starts again.


CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);


barrier1.await();



barrier2.await();



Exchanger
-----------
The java.util.concurrent.Exchanger class represents a kind of rendezvous point where two threads can exchange objects. Here is an illustration of this mechanism:

Exchanger exchanger = new Exchanger();

ExchangerRunnable exchangerRunnable1 =
        new ExchangerRunnable(exchanger, "A");

ExchangerRunnable exchangerRunnable2 =
        new ExchangerRunnable(exchanger, "B");

new Thread(exchangerRunnable1).start();
new Thread(exchangerRunnable2).start();
 


 public class ExchangerRunnable implements Runnable{

    Exchanger exchanger = null;
    Object    object    = null;

    public ExchangerRunnable(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    public void run() {
        try {
            Object previous = this.object;

            this.object = this.exchanger.exchange(this.object);

            System.out.println(
                    Thread.currentThread().getName() +
                    " exchanged " + previous + " for " + this.object
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


This example prints out this:

Thread-0 exchanged A for B
Thread-1 exchanged B for A


Semaphore Usage
----------------------
As semaphore typically has two uses:

To guard a critical section against entry by more than N threads at a time.
To send signals between two threads.
Guarding Critical Sections
If you use a semaphore to guard a critical section, the thread trying to enter the critical section will typically first try to acquire a permit, enter the critical section, and then release the permit again after. Like this:

Semaphore semaphore = new Semaphore(1);

//critical section
semaphore.acquire();
...
semaphore.release();

Fairness In semaphore
----------------------
No guarantees are made about fairness of the threads acquiring permits from the Semaphore. That is, there is no guarantee that the first thread to call acquire() is also the first thread to obtain a permit. If the first thread is blocked waiting for a permit, then a second thread checking for a permit just as a permit is released, may actually obtain the permit ahead of thread 1.

If you want to enforce fairness, the Semaphore class has a constructor that takes a boolean telling if the semaphore should enforce fairness. Enforcing fairness comes at a performance / concurrency penalty, so don't enable it unless you need it.

Here is how to create a Semaphore in fair mode:

Semaphore semaphore = new Semaphore(1, true);
















    





