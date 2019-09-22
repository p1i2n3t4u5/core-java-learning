

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
































