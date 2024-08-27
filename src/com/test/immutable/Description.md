
To create immutable class in java, you have to do following steps.
------------------------------------------------------------------
1)Declare the class as final so it can't be extended.
2)Make all fields private so that direct access is not allowed.
3)Don't provide setter methods for variables
4)Make all mutable fields final so that it's value can be assigned only once.
5)Initialize all the fields via a constructor performing deep copy.
6)Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.


important points
-----------------

while passing arguments of object type to the constructor of immutable class we should do deep copy,
becoz if we assign the object reference directly ,from outside the value of the object can be changed.
As we already have a reference of the object passed to constructor. 

Similarly in the getter method of object type field we should not return the reference directly.
we should do a deep copy of the  object and return.

Deep and Shallow Copy/Cloning
-----------------------------
property by property copy is called deep copy.
If Object contains another object and if outer object implements Cloneable  interface by calling clone() method it does a shallow copy , means
it creates a new outer object but puts the same reference of inner-object.i.e both outer objects are pointing to same inner object.

if all the fields present in a class are primitive type or immutable objects , then there is no difference between deep copy and shallow copy.

If user defined objects are present as a field we have to implement cloneable interface and implement clone() method.While cloning the outer object
we have to call the inner objects clone() method also.

If it is a collection  and contains objects as key or value ,then we have to write our own logic to clone the collection. 

Object class clone() method always does shallow copy/cloning.


Immutability can be Broken By not declaring class as final
-----------------------------------------------------------

Notice that in my Mutable subclass, I've overridden the behavior of getValue to read a new, mutable field declared in my subclass. As a result, your class, which initially looks immutable, really isn't immutable. I can pass this Mutable object wherever an Immutable object is expected, which could do Very Bad Things to code assuming the object is truly immutable. Marking the base class final prevents this from happening




 