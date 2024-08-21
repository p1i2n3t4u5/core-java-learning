
converts  chars array to string
--------------------------------
String s=new String(char[] chars);
String s=String.valueOf(char[] chars)


Collections.reverse(List<Character> chars);
StringBuffer sb=new StringBuffer(String s);
sb.reverse();
sb.toString();
 
StringBuilder sb=new StringBuilder();
sb.reverse();
sb.toString();

String
-------

String is immutable  ( once created can not be changed )object  . The object created as a String is stored in the  Constant String Pool  . 
Every immutable object in Java is thread safe ,that implies String is also thread safe . String can not be used by two threads simultaneously.
String  once assigned can not be changed.

String  demo = " hello " ;
// The above object is stored in constant string pool and its value can not be modified.


demo="Bye" ;     //new "Bye" string is created in constant pool and referenced by the demo variable            
 // "hello" string still exists in string constant pool and its value is not overrided but we lost reference to the  "hello"string  

StringBuffer
------------

StringBuffer is mutable means one can change the value of the object . The object created through StringBuffer is stored in the heap . StringBuffer  has the same methods as the StringBuilder , but each method in StringBuffer is synchronized that is StringBuffer is thread safe . 

Due to this it does not allow  two threads to simultaneously access the same method . Each method can be accessed by one thread at a time .

But being thread safe has disadvantages too as the performance of the StringBuffer hits due to thread safe property . Thus  StringBuilder is faster than the StringBuffer when calling the same methods of each class.

StringBuffer value can be changed , it means it can be assigned to the new value . Nowadays its a most common interview question ,the differences between the above classes .
String Buffer can be converted to the string by using 
toString() method.

StringBuffer demo1 = new StringBuffer("Hello") ;
// The above object stored in heap and its value can be changed .
demo1=new StringBuffer("Bye");
// Above statement is right as it modifies the value which is allowed in the StringBuffer

StringBuilder
--------------

StringBuilder  is same as the StringBuffer , that is it stores the object in heap and it can also be modified . The main difference between the StringBuffer and StringBuilder is that StringBuilder is also not thread safe. 
StringBuilder is fast as it is not thread safe .

clone() method in String class
--------------------------------
String is an immutable object, so it needn't a clone method since the client code can't change its state inside the String class.
you can just ref to the original String, for example:
String key2 = key1;// or using key1 directly instead.


Immutability of Strings:
------------------------------
Strings in Java are immutable, meaning their state cannot be changed once created. When you modify a String, you are actually creating a new String object. Therefore, locking on a String object might not be as common as locking on mutable objects.




  

