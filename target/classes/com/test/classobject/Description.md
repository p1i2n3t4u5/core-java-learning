Diffence between classpath and path 
--------------------------------------
1).Path is an environment variable which is used by the operating system to find the executables.

Classpath is an environment variable which is used by the Java compiler to find the path, of classes.ie in J2EE we give the path of jar files.


2).PATH is nothing but setting up an environment for operating system. Operating System will look in this PATH for executables.

Classpath is nothing but setting up the environment for Java. Java will use to find compiled classes

3).Path refers to the system while classpath refers to the Developing Envornment.

In path we set the path of executables while in
classpath we set path of jars for compiling classes.




Creating Class object
-----------------------
Every class has class object
1) student.getClass()
2)Student.class
3)Class.forName("com.javatest.reflection.Student")

Features
-------------
  * getting class names at runtime and creating objects of that class
  * call constructor dynamically .
  * we can access the methods and fields on an object. even we can call the private methods.
  * we can call the methods dynamically.
  * we can call static methods also with reflection
  
Uses of Reflection
-------------------

Reflection is commonly used by programs which require the ability to examine or modify the runtime behavior of applications running in the Java virtual machine. This is a relatively advanced feature and should be used only by developers who have a strong grasp of the fundamentals of the language. With that caveat in mind, reflection is a powerful technique and can enable applications to perform operations which would otherwise be impossible.

Extensibility Features
------------------------

An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names. Class Browsers and Visual Development Environments A class browser needs to be able to enumerate the members of classes. Visual development environments can benefit from making use of type information available in reflection to aid the developer in writing correct code. Debuggers and Test Tools Debuggers need to be able to examine private members in classes. Test harnesses can make use of reflection to systematically call a discoverable set APIs defined on a class, to ensure a high level of code coverage in a test suite.

Drawbacks of Reflection
------------------------

Reflection is powerful, but should not be used indiscriminately. If it is possible to perform an operation without using reflection, then it is preferable to avoid using it. The following concerns should be kept in mind when accessing code via reflection.

Performance Overhead
--------------------
Because reflection involves types that are dynamically resolved, certain Java virtual machine optimizations cannot be performed. Consequently, reflective operations have slower performance than their non-reflective counterparts and should be avoided in sections of code which are called frequently in performance-sensitive applications.

Security Restrictions
----------------------
Reflection requires a runtime permission which may not be present when running under a security manager. This is in an important consideration for code which has to run in a restricted security context, such as in an Applet.

Exposure of Internals
----------------------
Since reflection allows code to perform operations that would be illegal in non-reflective code, such as accessing private fields and methods, the use of reflection can result in unexpected side-effects, which may render code dysfunctional and may destroy portability. Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.


Object class 
------------------




package java.lang;

public class Object {

private static native void registerNatives();
static {
    registerNatives();
}

 public final native Class<?> getClass();
 
 public native int hashCode();

 public boolean equals(Object obj) {
        return (this == obj);
    }
    
 protected native Object clone() throws CloneNotSupportedException;
 
  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
   
  public final native void notify();
  
  public final native void notifyAll();
   
  public final native void wait(long timeout) throws InterruptedException;
  
  public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }
        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }
		if (nanos > 0) {
            timeout++;
        }
        wait(timeout);
    }
	
   public final void wait() throws InterruptedException {
        wait(0);
    }
}


native keyword in java
-------------------------
The native keyword is applied to a method to indicates that the method is implemented in native code using JNI (Java Native Interface). native is a modifier applicable only for methods and we can’t apply it anywhere else. The methods which are implemented in C, C++ are called as native methods or foreign methods.


abstarct class can not be final
a class can be defined inside an interface also an interface can be defined in a class.
 private transient int edition = 1; //transient variable not serialized
 
solid principles
----------------

1)Single Responsibility:
----------------------
a class should contain all the methods related to itself any method which is not directly related to that class should be placed in separated class.
In below example all printing logic should be moved to separate class.

public class Book {
 
    private String name;
    private String author;
    private String text;
 
    //constructor, getters and setters
 
    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }
 
    public boolean isWordInText(String word){
        return text.contains(word);
    }
}

public class BookPrinter {
 
    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }
 
    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}

2)Open for Extension and Close for modification
----------------------------------------------
This means that the behavior of the module can be extended. As the requirements of the application change, we are able to extend the module with new behaviors that satisfy those changes. In other words, we are able to change what the module does.  close for modification means we should not change the existing class for implementing new feature.

instead of adding the new property in the new class we are extending an new class and adding the new property.

public class Guitar {
 
    private String make;
    private String model;
    private int volume;
 
    //Constructors, getters & setters
}
 
 public class SuperCoolGuitarWithFlames extends Guitar {
 
    private String flameColor;
 
    //constructor, getters + setters
}

3)Liskov Substitution
------------------------
if class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.

4)Interface Segregation
-------------------------
larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}

public interface BearCleaner {
    void washTheBear();
}
 
public interface BearFeeder {
    void feedTheBear();
}
 
public interface BearPetter {
    void petTheBear();
}

5)Dependency Inversion
---------------------
The principle of Dependency Inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.

public class Windows98Machine {
 
    private final StandardKeyboard keyboard;
    private final Monitor monitor;
 
    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
}

Instead of creating object for Monitor and StandardKeyboard we create a abstraction with the help of interface.

public interface Keyboard { }

public class Windows98Machine{
 
    private final Keyboard keyboard;
    private final Monitor monitor;
 
    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}


ACID principles
----------------
1)Atomicity
------------
   Transactions are often composed of multiple statements. Atomicity guarantees that each transaction is treated as a single "unit", which either succeeds completely, or fails completely: if any of the statements constituting a transaction fails to complete, the entire transaction fails and the database is left unchanged. An atomic system must guarantee atomicity in each and every situation, including power failures, errors and crashes.
   
2)Consistency
--------------
Consistency ensures that a transaction can only bring the database from one valid state to another, maintaining database invariants: any data written to the database must be valid according to all defined rules, including constraints, cascades, triggers, and any combination thereof. This prevents database corruption by an illegal transaction, but does not guarantee that a transaction is correct. Referential integrity guarantees the primary key - foreign key relationship.

3)Isolation
------------
Transactions are often executed concurrently (e.g., multiple transactions reading and writing to a table at the same time). Isolation ensures that concurrent execution of transactions leaves the database in the same state that would have been obtained if the transactions were executed sequentially. Isolation is the main goal of concurrency control; depending on the method used, the effects of an incomplete transaction might not even be visible to other transactions.

4)Durability
-------------
Durability guarantees that once a transaction has been committed, it will remain committed even in the case of a system failure (e.g., power outage or crash). This usually means that completed transactions (or their effects) are recorded in non-volatile memory.















   