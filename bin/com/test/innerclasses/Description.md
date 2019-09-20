Nested class
----------------
Nested class are of two types 
     1)static Nested class 
     2)Non static Nested class

Non-static Nested class(Inner class)
-------------------------------------
1) Non-static Nested class are called inner class.
2)These are of two types:
       a)Inner class
       b)Anonymous Inner class
       
benefit of Inner class
-----------------------
we can access and update even the  static and non-static  members(methods and variables) of the outer class in side inner class. 

       
Static Inner class
---------------------
The inner class is static member of the outer class.
Inside the inner class we can only access the outer class private static members of the class.  


AnonymousInnerClass
----------------------
It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class.

Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.

Anonymous inner class are mainly created in two ways:

Class (may be abstract or concrete)
Interface
Syntax: The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

// Test can be interface,abstract/concrete class
Test t = new Test() 
{
   // data members and methods
   public void test_method() 
   {
      ........
      ........
    }   
};


