In Java 8, Optional is a container object that may or may not contain a value. It provides methods to handle cases where a value might be absent in a more functional way compared to using nulls.

orElse and orElseGet Methods

orElse: 
----------
Returns the value if present, otherwise returns the specified default value.
The orElse method provides a default value directly.
eager evaluation.
method calls are not accepted only constants , null ,""

orElseGet:
-----------
Returns the value if present, otherwise invokes a Supplier to get a default value.
The orElseGet method provides a default value using a Supplier, which is useful when the default value is expensive to compute or should only be computed if needed.
lazy evaluation