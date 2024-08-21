

Notify() and NotifyAll()
------------------------------
In Java, the notify() method itself does not directly release the lock held by the calling thread. Instead, it signals a single thread that is waiting on the same object's monitor to wake up.
Here's how it works:
1. Lock Held:
The thread calling notify() must already hold the lock on the object's monitor (acquired using synchronized or a Lock object).
2. Signal Sent:
notify() wakes up one of the threads waiting on the object's monitor (if any).
3. Lock Not Released Yet:
The calling thread does not release the lock immediately after calling notify(). It continues to hold the lock until it exits the synchronized block or calls wait() itself.
4. Waiting Thread Acquires Lock:
The awakened thread becomes eligible to reacquire the lock. However, it must wait until the calling thread releases the lock before it can proceed.
Therefore, while notify() doesn't directly release the lock, it sets in motion a process that allows another thread to eventually acquire the lock.


Wait()
-------------------
Yes, the wait() method in Java releases the lock on the object it is called on. This is crucial for thread synchronization, as it allows other threads to acquire the lock and potentially modify the shared object's state.
Here's how it works:
1. Acquiring the Lock:
Before calling wait(), a thread must first acquire the lock on the object using a synchronized block or method.
2. Releasing the Lock:
When wait() is called, the thread releases the lock and goes into a waiting state. It becomes eligible to be woken up by another thread calling notify() or notifyAll() on the same object.
3. Reacquiring the Lock:
After being notified, the thread doesn't immediately resume execution. It needs to re-acquire the lock on the object before it can continue.
In summary, wait() does release the lock, allowing other threads to access the shared object and potentially change its state. This coordination between threads is essential for achieving thread safety and preventing deadlocks in concurrent Java applications.

join() of Thread class
-------------------------------
Like the wait() and notify() methods, join() is another mechanism of inter-thread synchronization.


