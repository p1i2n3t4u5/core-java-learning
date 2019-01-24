Through reflection api we can 
  * getting class names at runtime and creating objects of that class
  * call constructor dynamically .
  * we can access the methods and fields on an object. even we can call the private methods.
  * we can call the methods dynamically.
  Uses of Reflection

Reflection is commonly used by programs which require the ability to examine or modify the runtime behavior of applications running in the Java virtual machine. This is a relatively advanced feature and should be used only by developers who have a strong grasp of the fundamentals of the language. With that caveat in mind, reflection is a powerful technique and can enable applications to perform operations which would otherwise be impossible.

Extensibility Features

An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names. Class Browsers and Visual Development Environments A class browser needs to be able to enumerate the members of classes. Visual development environments can benefit from making use of type information available in reflection to aid the developer in writing correct code. Debuggers and Test Tools Debuggers need to be able to examine private members in classes. Test harnesses can make use of reflection to systematically call a discoverable set APIs defined on a class, to ensure a high level of code coverage in a test suite.

Drawbacks of Reflection

Reflection is powerful, but should not be used indiscriminately. If it is possible to perform an operation without using reflection, then it is preferable to avoid using it. The following concerns should be kept in mind when accessing code via reflection.

Performance Overhead
Because reflection involves types that are dynamically resolved, certain Java virtual machine optimizations cannot be performed. Consequently, reflective operations have slower performance than their non-reflective counterparts and should be avoided in sections of code which are called frequently in performance-sensitive applications.

Security Restrictions
Reflection requires a runtime permission which may not be present when running under a security manager. This is in an important consideration for code which has to run in a restricted security context, such as in an Applet.

Exposure of Internals
Since reflection allows code to perform operations that would be illegal in non-reflective code, such as accessing private fields and methods, the use of reflection can result in unexpected side-effects, which may render code dysfunctional and may destroy portability. Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.
   