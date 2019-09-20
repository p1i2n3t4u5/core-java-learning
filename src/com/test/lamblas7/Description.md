Java 8 Streams
----------------------
All the Java Stream API interfaces and classes are in the java.util.stream package. Since we can use primitive data types such as int, long in the collections using auto-boxing and these operations could take a lot of time, there are specific classes for primitive types – IntStream, LongStream and DoubleStream.


Through Java 8 stream api we generally go internal iteration . we can take the advantage of parallel processing.

Function and BiFunction
------------------------
Function can take one type as argument and return  different type as return type.
BiFunction can take 2 different types as argument and returns third type as return type.
R apply(T t)
R apply(T t,U u)

usages  of Function functions
-----------------------------
 
*<R> Stream<R> map(Function<? super T, ? extends R> mapper)
IntStream mapToInt(ToIntFunction<? super T> mapper) – similarly for long and double returning primitive specific stream.
IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) – similarly for long and double.Takes one type and finally converts to different stream like InStream,FloatStream etc
                   
<A> A[] toArray(IntFunction<A[]> generator)
<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)


ToLongFunction
-----------------------
long applyAsLong(T value)

ToLongBiFunction
---------------------
long applyAsLong(T t, U u)


similar functions and bi-functions
------------------------------------
ToIntFunction, ToLongFunction, ToDoubleFunction, ToIntBiFunction, ToLongBiFunction, ToDoubleBiFunction


LongToDoubleFunction
----------------------
This functional interface takes primitive long type returns primitive  double  type.

double	applyAsDouble(long value)

similar type conversion functions
-----------------------------------
LongToIntFunction, LongToDoubleFunction, IntToLongFunction, IntToDoubleFunction


Predicate and BiPredicate
--------------------------
These take one and two types of data as input and returns boolean as output.

boolean	test(T t, U u)
boolean	test(T t)

similar to Function  interface  Predicate also has primitive variations.


usages  of Predicate functions
-------------------------------
Stream<T> filter(Predicate<? super T> predicate)
boolean anyMatch(Predicate<? super T> predicate)
boolean allMatch(Predicate<? super T> predicate)
boolean noneMatch(Predicate<? super T> predicate)


Consumer and BiConsumer
--------------------------
These to Functional interfaces takes one and two arguments  respectively and returns nothing.

void accept(T t)
void	accept(T t, U u)

These interface also has primitive variations

usages of  Consumer functions
--------------------------------

Stream<T> peek(Consumer<? super T> action)
void forEach(Consumer<? super T> action)
void forEachOrdered(Consumer<? super T> action)


Supplier 
-----------
This functional interface does not take any argument but returns data.
T get()

Supplier represent an operation through which we can generate new values in the stream. Some of the methods in Stream that takes Supplier argument are:
public static<T> Stream<T> generate(Supplier<T> s)
<R> R collect(Supplier<R> supplier,BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner)

java.util.Optional
-------------------
Java Optional is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value. Stream terminal operations return Optional object. Some of these methods are:

Optional<T> reduce(BinaryOperator<T> accumulator)
Optional<T> min(Comparator<? super T> comparator)
Optional<T> max(Comparator<? super T> comparator)
Optional<T> findFirst()
Optional<T> findAny()


Intermediate Operations
------------------------
ava Stream API operations that returns a new Stream are called intermediate operations. Most of the times, these operations are lazy in nature, so they start producing new stream elements and send it to the next operation. Intermediate operations are never the final result producing operations. Commonly used intermediate operations are (filter and map).

Terminal Operations
---------------------
 ava 8 Stream API operations that returns a result or produce a side effect. Once the terminal method is called on a stream, it consumes the stream and after that we can’t use stream. Terminal operations are eager in nature i.e they process all the elements in the stream before returning the result. Commonly used terminal methods are ( forEach, toArray, min, max, findFirst, anyMatch, allMatch) etc. You can identify terminal methods from the return type, they will never return a Stream.
 
Short Circuiting Operations
---------------------------
 An intermediate operation is called short circuiting, if it may produce finite stream for an infinite stream. For example (limit() and skip()) are two short circuiting intermediate operations.
 
 A terminal operation is called short circuiting, if it may terminate in finite time for infinite stream. For example (anyMatch, allMatch, noneMatch, findFirst and findAny) are short circuiting terminal operations.








