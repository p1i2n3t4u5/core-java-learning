Object Cloning in Java
-------------------------
constructor in javaThe object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.

The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

protected Object clone() throws CloneNotSupportedException  
Why use clone() method ?
The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

1) The clone() method is used to create a copy of an object in Java. In order to use clone() method, class must implement java.lang.Cloneable interface and override protected clone() method from java.lang.Object.

A call to clone() method will result in CloneNotSupportedException if that class doesn't implement Cloneable interface.

2) No constructor is called during cloning of Object in Java.

3) Default implementation of clone() method in Java provides "shallow copy" of the object because it creates a copy of Object by creating a new instance and then copying content by assignment, which means if your class contains a mutable field, then both original object and clone will refer to the same internal object. 

This can be dangerous because any change made on that mutable field will reflect in both the original and copy object. In order to avoid this, override the clone() method to provide the deep copy of an object.

4) By convention, clone of an instance should be obtained by calling super.clone() method, this will help to preserve invariant of object created by clone() method i.e. clone != original and clone.getClass() == original.getClass(). Though these are not absolute requirement as mentioned in Javadoc.

5) A shallow copy of an instance is fine until it only contains primitives and Immutable objects, otherwise, you need to modify one or more mutable fields of the object returned by super.clone(), before returning it to the caller.

6)If your class contains any Collection or Mutable object than a deep copy of those fields.  when super.clone() will return, both original and cloned objects will point to the same object. To fix this, we reassign certification fields of clone object by explicitly copying data, as shown in the following line :

clone.certifications = new ArrayList(certifications); //deep copying valid as long as the arraylist contains Immutable objects.

in collection copy constructor and addAll methods creates shallow  copy.

	@Override
	protected Student clone() throws CloneNotSupportedException {
		Student clonedObj = (Student) super.clone();
		List<Address> addresses = new ArrayList<>();
		if(!CollectionUtils.isEmpty(clonedObj.getAddresses())){
		   for(Address a : clonedObj.getAddresses()){
		   addresses.add(a.clone());
		   }
		}
		clonedObj.setAddresses(addresses);

		return clonedObj;
	}



Advantage of Object cloning
-------------------------------
Although Object.clone() has some design issues but it is still a popular and easy way of copying objects. Following is a list of advantages of using clone() method:

You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4- or 5-line long clone() method.
It is the easiest and most efficient way for copying objects, especially if we are applying it to an already developed or an old project. Just define a parent class, implement Cloneable in it, provide the definition of the clone() method and the task will be done.
Clone() is the fastest way to copy array.

Disadvantage of Object cloning
------------------------------------------
Following is a list of some disadvantages of clone() method:

To use the Object.clone() method, we have to change a lot of syntaxes to our code, like implementing a Cloneable interface, defining the clone() method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.
We have to implement cloneable interface while it doesn't have any methods in it. We just have to use it to tell the JVM that we can perform clone() on our object.
Object.clone() is protected, so we have to provide our own clone() and indirectly call Object.clone() from it.
Object.clone() doesn't invoke any constructor so we don't have any control over object construction.
If you want to write a clone method in a child class then all of its superclasses should define the clone() method in them or inherit it from another parent class. Otherwise, the super.clone() chain will fail.
Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.

Object class clone() method supports shallow copying. 



https://javarevisited.blogspot.com/2013/09/how-clone-method-works-in-java.html
https://javarevisited.blogspot.com/2015/01/java-clone-tutorial-part-2-overriding-with-mutable-field-example.html
https://javarevisited.blogspot.com/2014/03/how-to-clone-collection-in-java-deep-copy-vs-shallow.html




