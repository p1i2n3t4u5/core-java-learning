Race condition
-----------------

A race condition occurs when two or more threads can access shared data and they try to change it at the same time. Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e. both threads are "racing" to access/change the data.

Problems often occur when one thread does a "check-then-act" (e.g. "check" if the value is X, then "act" to do something that depends on the value being X) and another thread does something to the value in between the "check" and the "act". E.g:

if (x == 5) // The "Check"
{
   y = x * 2; // The "Act"

   // If another thread changed x in between "if (x == 5)" and "y = x * 2" above,
   // y will not be equal to 10.
}
The point being, y could be 10, or it could be anything, depending on whether another thread changed x in between the check and act. You have no real way of knowing.

In order to prevent race conditions from occurring, you would typically put a lock around the shared data to ensure only one thread can access the data at a time. This would mean something like this:

// Obtain lock for x
if (x == 5)
{
   y = x * 2; // Now, nothing can change x until the lock is released. 
              // Therefore y = 10
}
// release lock for x


Race Condition In Hashmap
--------------------------
race condition in hash map means we will get some undesirable results.

In hashmap two possible race conditions that can happen are:

while doing rehashing if two threads are working upon a hashmap.
---------------------------------------------------------------
if two threads are working upon a hashmap and hashmap reaches its threshold ,it creates a array of buckets.
it distributes all the existing element in the older bucket array in new bucket array this process is called rehashing.
in rehashing in initial size of hashmap is 16 and loadfactor is 0.75.
16 * 0.75=12  while putting 13th element in bucket it will check threshold is crossed.when hashmap reaches threshold it doubles it size from 16 to 32. then the whole process of rehashing starts.

the rehashing tries to distribute in such  a way each bucket should contain one entry so that constant retrieve time can be achieved which is O(1).

when hashmap reaches threshold it doubles it size from 16 to 32.


To determine new bucket index, it uses the key's hashcode like below.
              if key's hashcode = 64
              its bucket index will be = (64 / 32)-1 = 2-1= 1st index  
              
While moving the elements from the old bucket array to new bucket array the the order of the elements in new bucket gets 
reverse. In this whole process if thread1 is pointer current node pointing  to the head element and next pointer is pointing to next element and then scheduler picks the                
thread 2 which will also tries and moves the entries from old to new (reverse order  and nodes in the new linked list or bucket array are placed at the begining to reduce the traversal time to put a new node) but first thread (according to thread1) still points to the elements thinking head is pointing to next element but in (actually ) new bucket next element pointing to head element.Now the problem happens thread1 will place the head element  again at head position in new bucket pointing to the next element(entry1) but the next element already pointing to head element(head-entry) now the circle happens head pointing to entry1 and entry one pointing to head. Becoz of the same reason while searching for an element it will never reach the end of the linkedlist (bucket) becoz the end condition is the next element is null.


2) If collision(multiple objects are placed in same bucket) happens in hash map. 
   collision happens if multiple objects are having same hashcode or some how end up in same bucket are used as key of the hashmap.
   If multiple collision happens and one thread let thread1 is about put one entry next to the last entry let at the same thread scheduler picks another thread and starts executing and put an element at the end of the linked list which is being held by first thread.Now the scheduler picks the first thread again and first thread instead of putting the entry after the new entry it will overwrite the last entry.so one entry is lost.
   
   
   http://javabypatel.blogspot.com/2016/01/infinite-loop-in-hashmap.html







