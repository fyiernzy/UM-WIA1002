Q3: What is a raw type? Why is a raw type unsafe? Why is the raw type allowed in Java?

In Java, a raw type refers to a generic class or interface that is used without specifying any type parameters. For example, if you have a generic class List<T> and you use it without specifying the type parameter T, like List myList = new ArrayList();, this is a raw type.

Raw types are considered unsafe because they can lead to type errors at runtime. This is because without the type parameter, the compiler cannot perform type checking to ensure that the correct types are being used. This can lead to issues such as ClassCastException, where you try to cast an object to a type that it is not, or a runtime error where you try to call a method that does not exist on the object.

Despite the fact that raw types are unsafe, they are allowed in Java for backward compatibility with older versions of Java that did not have generics. Raw types also allow for interoperability with legacy code that does not use generics. However, it is generally recommended to use generics and avoid raw types whenever possible to ensure type safety and avoid potential runtime errors.

Q4: What is erasure? Why are Java generics implements using erasure? 

Generics are implemented using an approach called type erasure. The compile uses the generic type information to compile the code, but erases it afterwards. So the generic information is not available at run time. This approach enables the generic code to be backward-compatible with the legacy code thatuses raw types.
