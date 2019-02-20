why Lambdas
-------------
1)Enables Functional programming
2)lesser code 
3) easy to use
4)Enable parallel processing



Lambdas are nothing but function which are used as values.
function remains in isolation.

for one liner lambda expression it is invalid to write return statement. it returns the value what ever that line returns.

functional interface should have only one method.

example:

(int a) -> a*2 ;

(int a,int b) -> {
    if(b==0) return 0;
    return a/b;
}

() -> System.out.println("Hello world");

The below line java compiler tries to match the functional interface with lambda declaration 

Greeting greeting2=() -> System.out.println("Hello World From Lambda");


Method Reference in Lambda
------------------------------
rules for using method reference:

arguments should match both side of arrow function
if it is static method it needs to be called with class name 
ex:
 ClassName::method

if it is non-static  it should be called object 
ex:
 System.out::println 
 this:printMethod();
 









