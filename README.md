# 🚀 Day 1 – JVM Architecture & Stack vs Heap Deep Dive

## 📅 60-Day Core Java Deep Mastery Challenge

**Student:** Manikanta Achanta
**Duration:** 2 Hours
**Focus:** Strong Fundamentals

---

# 📌 Topics Covered

* What is Java?
* Java Compilation & Execution Process
* JVM Architecture
* Memory Structure (Stack vs Heap)
* Bytecode
* JIT Compiler
* Garbage Collection Basics

---

# 🔥 How Java Works Internally

```
.java → javac → .class (Bytecode) → JVM → Execution Engine → Machine Code
```

Java is platform independent because it compiles into **bytecode**, which runs on the JVM.

> Write Once, Run Anywhere (WORA)

---

# 🏗 JVM Architecture

JVM consists of:

## 1️⃣ Class Loader Subsystem

* Loads `.class` file into memory
* Verifies bytecode
* Links classes

## 2️⃣ Memory Areas

### 🔹 Stack

* Stores local variables
* Stores method calls
* Each thread has its own stack
* Faster memory
* Uses LIFO structure

Example:

```java
int x = 10;   // Stored in STACK
```

---

### 🔹 Heap

* Stores objects
* Shared among threads
* Managed by Garbage Collector

Example:

```java
Student s = new Student();
```

* `s` → stored in STACK (reference variable)
* Object → stored in HEAP

---

### 🔹 Method Area

* Stores class metadata
* Static variables
* Method bytecode

---

## 3️⃣ Execution Engine

* Interpreter
* JIT Compiler
* Garbage Collector

---

# 🧠 Stack vs Heap Deep Understanding

### Example:

```java
Student s1 = new Student();
```

### Internally:

1. `main()` method enters stack
2. `new Student()` allocates memory in heap
3. Object created in heap
4. Reference returned
5. Reference stored in stack variable `s1`

Memory Visualization:

```
STACK:
s1 → 0xABC123
main()

HEAP:
0xABC123 → Student Object
```

---

# ♻ Garbage Collection

If no reference points to a heap object:

```java
s1 = null;
```

The object becomes **eligible for Garbage Collection**.

---

# 🎯 Interview Questions Prepared

* Why is Java platform independent?
* Difference between JDK, JRE, JVM?
* What happens when a Java program runs?
* Explain JVM memory structure.
* Stack vs Heap difference?
* What is Bytecode?
* What is JIT Compiler?

---

# 💻 Code Implemented

✔ HelloWorld.java
✔ Student.java
✔ StackHeapDemo.java

Demonstrated:

* Primitive variable storage
* Object creation
* Reference behavior
* Stack vs Heap memory allocation

---

# ✅ Learning Outcome

Today I clearly understood:

* How Java executes internally
* How memory is managed
* Difference between stack and heap
* Why Java is platform independent

---

🔥 Day 1 Completed Successfully.
Next: Data Types Deep Dive.

# 🚀 Day 2 – Java Data Types Deep Dive

## 📅 60-Day Core Java Deep Mastery Challenge

Today I learned about Java Data Types and Type Casting.

---

# 📚 Topics Covered

* Primitive Data Types
* Non-Primitive Data Types
* Default Values
* Type Casting
* Overflow Behavior

---

# 🔹 Primitive Data Types

Java has 8 primitive types:

| Type    | Size       |
| ------- | ---------- |
| byte    | 1 byte     |
| short   | 2 bytes    |
| int     | 4 bytes    |
| long    | 8 bytes    |
| float   | 4 bytes    |
| double  | 8 bytes    |
| char    | 2 bytes    |
| boolean | true/false |

Example:

```java
int age = 21;
double salary = 55000.50;
char grade = 'A';
boolean isJavaFun = true;
```

---

# 🔹 Non-Primitive Data Types

Examples:

* String
* Arrays
* Classes
* Objects

Example:

```java
String name = "Manikanta";
```

Reference stored in Stack and object stored in Heap.

---

# 🔹 Type Casting

### Implicit Casting

```java
int num = 10;
double value = num;
```

### Explicit Casting

```java
double price = 19.99;
int p = (int) price;
```

---

# 🔹 Overflow Example

```java
byte num = 127;
num++;
```

Output:

```
-128
```

Because byte range is **-128 to 127**.

---

# 💻 Programs Implemented

* PrimitiveDemo.java
* TypeCastingDemo.java
* OverflowDemo.java

---

# 🎯 Learning Outcome

Today I understood:

* Java primitive data types
* Type casting concepts
* Overflow behavior
* Difference between primitive and non-primitive types

---

✅ Day 2 Completed



# 🚀 Day 3 – Variables in Java

## Topics Covered

* Local Variables
* Instance Variables
* Static Variables
* Variable Scope
* Final Keyword

---

# Types of Variables

Java has three types of variables:

1. Local Variables
2. Instance Variables
3. Static Variables

---

# Local Variables

Declared inside methods and stored in stack memory.

Example:

```java
int x = 10;
```

---

# Instance Variables

Declared inside class but outside methods. Stored in heap memory as part of objects.

Example:

```java
class Student {
    int age;
}
```

---

# Static Variables

Belong to the class and stored in method area.

Example:

```java
static int count = 0;
```

---

# Final Variables

Final variables cannot be modified after initialization.

Example:

```java
final int MAX = 100;
```

---

# Programs Implemented

* LocalVariableDemo.java
* Student.java
* StaticDemo.java
* FinalDemo.java

---

# Learning Outcome

Today I learned about different types of variables in Java and their memory behavior.

Day 3 Completed.


# 🚀 Day 4 – Java Operators (Deep Dive)

## 📅 60 Days Core Java Deep Mastery

**Student:** Manikanta Achanta
**Package:** `com.manikanta.operators`

---

# 📚 Topics Covered

Today I learned different types of **Java Operators** and how they work internally.

Operators studied:

* Arithmetic Operators
* Relational Operators
* Logical Operators
* Assignment Operators
* Unary Operators
* Ternary Operator
* Bitwise Operators
* Shift Operators

---

# 1️⃣ Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning             |
| -------- | ------------------- |
| +        | Addition            |
| -        | Subtraction         |
| *        | Multiplication      |
| /        | Division            |
| %        | Modulus (remainder) |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a % b);
```

Output:

```
13
1
```

---

# 2️⃣ Relational Operators

Used to compare two values.

| Operator | Meaning               |
| -------- | --------------------- |
| >        | Greater than          |
| <        | Less than             |
| >=       | Greater than or equal |
| <=       | Less than or equal    |
| ==       | Equal to              |
| !=       | Not equal to          |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a > b);
```

Output:

```
false
```

---

# 3️⃣ Logical Operators

Used with boolean expressions.

| Operator | Meaning     |   |            |
| -------- | ----------- | - | ---------- |
| &&       | Logical AND |   |            |
|          |             |   | Logical OR |
| !        | Logical NOT |   |            |

Example:

```java
int age = 25;

boolean result = age > 18 && age < 60;

System.out.println(result);
```

---

# 4️⃣ Assignment Operators

Used to assign values to variables.

| Operator | Example |
| -------- | ------- |
| =        | a = 5   |
| +=       | a += 3  |
| -=       | a -= 2  |
| *=       | a *= 4  |
| /=       | a /= 2  |

Example:

```java
int x = 10;

x += 5;

System.out.println(x);
```

Output:

```
15
```

---

# 5️⃣ Unary Operators

Operate on a single operand.

| Operator | Meaning     |
| -------- | ----------- |
| ++       | Increment   |
| --       | Decrement   |
| +        | Unary plus  |
| -        | Unary minus |

Example:

```java
int x = 5;

System.out.println(x++);
System.out.println(++x);
```

Output:

```
5
7
```

---

# 6️⃣ Ternary Operator

Short form of **if-else**.

Syntax:

```
condition ? value1 : value2
```

Example:

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);
```

Output:

```
20
```

---

# 7️⃣ Bitwise Operators

Bitwise operators work directly on **binary bits**.

Example:

```
5 = 00000101
3 = 00000011
```

| Operator | Meaning     |            |
| -------- | ----------- | ---------- |
| &        | Bitwise AND |            |
|          |             | Bitwise OR |
| ^        | Bitwise XOR |            |
| ~        | Bitwise NOT |            |

---

### Bitwise AND

```
5 & 3 = 1
```

Example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

---

### Bitwise OR

```
5 | 3 = 7
```

---

### Bitwise XOR

```
5 ^ 3 = 6
```

---

### Bitwise NOT

```
~5 = -6
```

Formula:

```
~n = -(n + 1)
```

---

# 8️⃣ Shift Operators

Used to shift bits left or right.

| Operator | Meaning     |
| -------- | ----------- |
| <<       | Left Shift  |
| >>       | Right Shift |

---

### Left Shift

```
5 << 1 = 10
```

Rule:

```
a << n = a × 2ⁿ
```

---

### Right Shift

```
8 >> 1 = 4
```

Rule:

```
a >> n = a ÷ 2ⁿ
```

---

# 💻 Programs Implemented

The following programs were implemented today:

* ArithmeticDemo.java
* RelationalDemo.java
* LogicalDemo.java
* AssignmentDemo.java
* UnaryDemo.java
* TernaryDemo.java
* BitwiseAndDemo.java
* BitwiseOrDemo.java
* BitwiseXorDemo.java
* BitwiseNotDemo.java
* LeftShiftDemo.java
* RightShiftDemo.java
* SwapUsingXOR.java

---

# 🎯 Important Interview Concepts

* Difference between `&` and `&&`
* Difference between `|` and `||`
* Pre-increment vs Post-increment
* Why `~5 = -6`
* Bit shifting multiplication and division
* XOR swap algorithm

---

# 🧠 Learning Outcome

Today I understood:

* How Java operators work internally
* How bitwise operations work using binary numbers
* How shift operators affect numbers
* Operator precedence and expression evaluation

---

✅ **Day 4 Completed – Java Operators**


# 🚀 Day 5 – Control Flow Statements

## Topics Covered

* if statement
* if-else statement
* else-if ladder
* nested if
* switch statement
* break and fall-through behavior

---

# if Statement

Executes code when condition is true.

Example:

int age = 20;

if(age >= 18){
System.out.println("Eligible to vote");
}

---

# if-else Statement

Used when two outcomes are possible.

Example:

if(number % 2 == 0){
System.out.println("Even");
}else{
System.out.println("Odd");
}

---

# else-if Ladder

Used when multiple conditions exist.

Example:

if(marks >= 90){
System.out.println("Grade A");
}
else if(marks >= 75){
System.out.println("Grade B");
}
else{
System.out.println("Fail");
}

---

# Switch Statement

Used for checking multiple fixed values.

Example:

switch(day){
case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tuesday");
break;
}

---

# Programs Implemented

* IfDemo.java
* IfElseDemo.java
* ElseIfDemo.java
* NestedIfDemo.java
* SwitchDemo.java

---

# Learning Outcome

Today I learned how Java programs make decisions using control flow statements such as if, else-if, and switch.


# Day 6 – Java Loops

## Topics Covered

* for loop
* while loop
* do-while loop
* break statement
* continue statement
* nested loops
* pattern programs

---

## For Loop

Used when iteration count is known.

Example:

for(int i=1;i<=5;i++){
System.out.print(i);
}

---

## While Loop

Used when condition-based looping is required.

Example:

while(i<=5){
System.out.print(i);
}

---

## Do-While Loop

Executes at least once.

Example:

do{
System.out.print(i);
}while(i<=5);

---

## Break Statement

Stops loop execution.

---

## Continue Statement

Skips current iteration.

---

## Pattern Program

*

**

---

---

---

## Programs Implemented

* ForLoopDemo.java
* WhileLoopDemo.java
* DoWhileDemo.java
* BreakDemo.java
* ContinueDemo.java
* NestedLoopDemo.java
* StarPattern.java
* NumberPattern.java

# Day 7 – Pattern Programming

## Topics Covered

Today I practiced pattern programming using nested loops.

Patterns implemented:

* Star triangle pattern
* Reverse star pattern
* Square star pattern
* Number increasing pattern
* Number repeating pattern
* Right aligned triangle

These patterns help understand nested loops and improve logical thinking.

## Example Pattern

```
*
**
***
****
```

## Programs Implemented

* StarPattern1.java
* StarPattern2.java
* NumberPattern1.java
* NumberPattern2.java
* SquarePattern.java
* RightTriangle.java


# Day 8 – Methods in Java

## Topics Covered

* Method definition
* Method parameters
* Return values
* Static methods
* Method overloading

Methods help in code reuse and modular programming.

Example method:

void greet(){
System.out.println("Hello");
}

## Programs Implemented

* MethodDemo.java
* MethodParameters.java
* ReturnMethod.java
* StaticMethodDemo.java
* MethodOverloading.java


# Day 9 – Recursion in Java

## Topics Covered

* What is recursion
* Base case
* Recursive calls
* Call stack behavior
* Recursive programs

Recursion is a technique where a method calls itself to solve smaller subproblems.

## Programs Implemented

* FactorialRecursion.java
* SumRecursion.java
* FibonacciRecursion.java
* ReverseNumber.java
* PowerRecursion.java

## Example

Factorial using recursion:

n! = n × (n-1)!


# Day 10 – Strings in Java

## Topics Covered

* String creation
* String constant pool
* == vs equals()
* String immutability
* String methods

## Programs Implemented

* StringCreation.java
* ReverseString.java
* PalindromeString.java

Strings are immutable objects stored in heap memory and string constant pool.


# Day 11 – StringBuilder & StringBuffer

## Topics Covered

* String immutability
* Mutable vs Immutable objects
* StringBuilder
* StringBuffer
* Performance differences

## Programs

* StringBuilderDemo.java
* ReverseUsingBuilder.java

StringBuilder and StringBuffer provide efficient ways to modify strings without creating multiple objects.


# Day 12 – Autoboxing and Unboxing

## Topics Covered

- Primitive vs Wrapper Classes
- Autoboxing
- Unboxing
- Integer Cache (-128 to 127)
- equals() vs ==
- Performance issues with autoboxing

## Key Learning

Autoboxing automatically converts primitive types into wrapper objects.
Unboxing converts wrapper objects back to primitives.

Integer caching improves memory efficiency for values between -128 and 127.


# Day 13 – StringBuffer vs StringBuilder

## Topics Covered

- StringBuffer Introduction
- Mutable Strings
- Thread Safety
- Synchronization
- Performance Comparison

## Key Differences

| Feature | StringBuilder | StringBuffer |
|-------|-------------|-------------|
| Thread Safe | No | Yes |
| Performance | Faster | Slower |

## Key Learnings

StringBuffer provides thread-safe string manipulation using synchronized methods.



# Day 14 – Advanced StringBuilder Methods

## Topics Covered

- ensureCapacity()
- setLength()
- trimToSize()
- substring()

## Key Learnings

StringBuilder provides advanced methods to control internal buffer size and string length.

ensureCapacity() ensures minimum buffer capacity.

setLength() can truncate or extend the string.

trimToSize() reduces capacity to current length.

# Day 15 – String Interview Problems

## Problems Solved

- Reverse String
- Palindrome Check
- Remove Duplicate Characters
- First Non-Repeating Character
- Anagram Check
- Longest Substring without repeating characters
- Check if Two Strings are Rotations
- Longest Palindromic Substring

## Key Learnings

- String is immutable
- StringBuilder improves performance
- indexOf() and lastIndexOf() are useful
- Sorting helps in anagram problems

## Complexity Insights

- charAt() → O(1)
- String concatenation → O(n)


# Day 16 – JVM Architecture

## Topics Covered

- JVM Overview
- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
- JIT Compiler

## Key Learnings

JVM executes bytecode and manages memory using stack and heap.

ClassLoader loads classes into memory.

Execution Engine runs bytecode using Interpreter and JIT.


# Day 17 – JVM Memory Model

## Topics Covered

- Stack Memory
- Heap Memory
- Method Area (Metaspace)
- Object Creation Process
- Memory Lifecycle

## Key Learnings

- Stack stores local variables and references
- Heap stores objects
- Method Area stores class-level data
- JVM manages memory using stack and heap


# Day 18 – Garbage Collection

## Topics Covered

- Garbage Collection Basics
- GC Algorithms (Mark & Sweep, Compact)
- Generational GC
- Minor vs Major GC
- finalize() method

## Key Learnings

- GC removes unreferenced objects
- System.gc() is not guaranteed
- Most objects die in Young Generation
- GC improves memory management automatically


# Day 19 – Exception Handling

## Topics Covered

- Exception Basics
- Checked vs Unchecked
- try-catch-finally
- throw vs throws

## Key Learnings

- Exceptions disrupt normal flow
- try-catch handles runtime errors
- finally always executes
- throw creates exception manually



# Day 20 – Advanced Exception Handling

## Topics Covered

- Multiple catch blocks
- Multi-catch (Java 7)
- Nested try-catch
- Exception propagation
- try-with-resources

## Key Learnings

- Exceptions propagate through call stack
- try-with-resources prevents memory leaks
- Multi-catch simplifies code
- Proper exception handling improves stability


# Day 21 – Advanced Exceptions

## Topics Covered

- throw vs throws
- Custom Exceptions
- Checked vs Unchecked Custom Exceptions
- Exception Chaining

## Key Learnings

- throw creates exception manually
- throws declares exception
- Custom exceptions improve business logic clarity
- Exception chaining preserves root cause


# Day 22 – Classes & Objects

## Topics Covered

- Class and Object basics
- Object creation (JVM internal flow)
- Stack vs Heap memory
- Multiple objects
- Reference behavior
- Anonymous objects

## Key Learnings

- Object is stored in heap
- Reference is stored in stack
- Multiple references can point to same object
- JVM handles memory allocation automatically


# Day 23 – Constructors

## Topics Covered

- Constructor basics
- Default constructor
- Parameterized constructor
- Constructor overloading
- Constructor chaining (this())

## Key Learnings

- Constructor initializes object
- JVM calls constructor automatically
- this() used for chaining constructors
- Default constructor exists only if no constructor defined




# Day 24 – Encapsulation

## Topics Covered

- Encapsulation concept
- Access modifiers
- Getters and setters
- Data hiding
- Immutable classes

## Key Learnings

- Use private variables
- Use public methods for access
- Apply validation in setters
- Encapsulation improves security and design


# Day 25 – Inheritance

## Topics Covered

- Inheritance basics
- Types of inheritance
- super keyword
- Constructor flow
- Method overriding

## Key Learnings

- Child class inherits parent class
- super() is automatically called
- Parent constructor executes first
- Inheritance enables code reuse


# Day 26 — Method Overriding

## Topics Covered
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Covariant Return Type
- Method Hiding

## Key Takeaways
- Overriding enables runtime polymorphism
- Method resolution happens at runtime
- Static methods are not overridden
- Final/private methods cannot be overridden

## Practice Programs
- Animal/Dog example
- Vehicle example
- Covariant return
- Static method hiding


# Day 27 — Polymorphism

## Topics Covered
- Compile-time vs Runtime Polymorphism
- Method Overriding
- Dynamic Method Dispatch
- Upcasting & Downcasting

## Key Takeaways
- Runtime decides method execution
- Reference type controls access
- Object type controls behavior
- Static methods are not polymorphic


# Day 28 — Abstraction

## Topics Covered
- Abstract Classes
- Abstract Methods
- Runtime Polymorphism with Abstraction
- Abstract Class Rules

## Key Takeaways
- Cannot instantiate abstract class
- Must override abstract methods
- Abstract classes can have constructors
- Used for flexible and scalable design



# Day 29 — Interfaces

## Topics Covered
- Interface basics
- Multiple inheritance
- Default & static methods
- Functional interfaces

## Key Takeaways
- Interfaces provide 100% abstraction
- Support multiple inheritance
- Enable loose coupling
- Widely used in backend development


# Day 30 — OOP Final Mastery

## Topics Covered
- Abstract class
- Interface
- Polymorphism
- Multiple inheritance

## Key Takeaways
- Interface = contract
- Abstract = partial implementation
- Polymorphism = runtime behavior
- Enables scalable backend systems



# Day 31 — File Handling

## Topics Covered
- File class
- File creation, deletion
- File properties
- Directory handling

## Key Takeaways
- File class does NOT read/write data
- File object ≠ actual file
- OS interaction required


# Day 32 — File Streams

## Topics Covered
- FileInputStream
- FileOutputStream
- Byte streams
- Buffer reading
- File copying

## Key Takeaways
- Streams handle actual data
- read() returns byte or -1
- Always close streams
- Buffer improves performance


# Day 33 — Buffered Streams

## Topics Covered
- BufferedReader
- BufferedWriter
- FileReader
- FileWriter
- Performance optimization

## Key Takeaways
- Buffered streams are faster
- readLine() reads full line
- Always close streams
- Use for text processing


# Day 34 — Serialization & Deserialization

## Topics Covered
- Serializable interface
- ObjectOutputStream
- ObjectInputStream
- transient keyword
- serialVersionUID

## Key Takeaways
- Converts object to byte stream
- Used for storage and communication
- transient skips fields
- serialVersionUID avoids version issues



# Day 35 — Wrapper Classes

## Topics Covered
- Wrapper classes
- Autoboxing & unboxing
- Integer caching
- Parsing methods

## Key Takeaways
- Wrapper classes convert primitives to objects
- Required for collections
- Immutable and cached


# Day 36 — Autoboxing & Unboxing

## Topics Covered
- Autoboxing
- Unboxing
- Integer caching
- Performance impact

## Key Takeaways
- Autoboxing uses valueOf()
- Unboxing can cause NullPointerException
- Avoid wrappers in loops



# Day 37 — Enums

## Topics Covered
- Enum basics
- Enum methods
- Enum constructor
- Enum with switch

## Key Takeaways
- Enum provides type safety
- Used for fixed constants
- Can have methods and constructors



# Day 38 — Static Keyword

## Topics Covered
- Static variables
- Static methods
- Static block
- Memory model

## Key Takeaways
- Static belongs to class
- Shared memory
- Static block runs once



# Day 39 — final Keyword

## Topics Covered
- final variable
- final method
- final class
- final vs finally vs finalize

## Key Takeaways
- final prevents modification
- final method cannot be overridden
- final class cannot be inherited



# Day 40 — Reflection API

## Topics Covered
- Reflection basics
- Class metadata
- Methods, fields access
- Dynamic method invocation

## Key Takeaways
- Reflection works at runtime
- Used in frameworks
- Can access private members
- Slower than normal code



# Day 41 — Collections Framework

## Topics Covered
- Collection hierarchy
- List, Set, Map
- Generics
- Basic operations

## Key Takeaways
- Collections store dynamic data
- List allows duplicates
- Set removes duplicates
- Map stores key-value pairs



# Day 42 — ArrayList

## Topics Covered
- ArrayList basics
- Internal working
- Dynamic resizing
- Time complexity

## Key Takeaways
- Uses array internally
- Resizes automatically
- Fast access, slow deletion


# Day 43 — LinkedList

## Topics Covered
- LinkedList basics
- Node structure
- Doubly linked list
- Comparison with ArrayList

## Key Takeaways
- Uses nodes, not arrays
- Fast insertion/deletion
- Slow random access



# Day 44 — HashSet

## Topics Covered
- HashSet basics
- Hashing concept
- Internal working
- hashCode & equals

## Key Takeaways
- No duplicates allowed
- Uses HashMap internally
- Fast operations (O(1))



# Day 45 — HashMap

## Topics Covered
- HashMap basics
- Key-value pairs
- Hashing
- Collision handling

## Key Takeaways
- Fast access using hashing
- Unique keys
- Internal bucket structure




# Day 46 — TreeSet & TreeMap

## Topics Covered
- TreeSet
- TreeMap
- Red-Black Tree
- Sorting

## Key Takeaways
- Sorted collections
- O(log n) performance
- Uses tree structure



# Day 47 — Comparable vs Comparator

## Topics Covered
- Comparable interface
- Comparator interface
- Sorting custom objects
- Lambda expressions

## Key Takeaways
- Comparable = default sorting
- Comparator = custom sorting
- Lambda simplifies code



# Day 48 — Iterator & ListIterator

## Topics Covered
- Iterator
- ListIterator
- Safe traversal
- Modification during iteration

## Key Takeaways
- Iterator prevents runtime errors
- ListIterator allows modification
- Important for real-world applications



# Day 49 — Multithreading Basics

## Topics Covered
- Threads
- Runnable vs Thread
- Thread lifecycle
- Basic methods

## Key Takeaways
- Thread enables parallel execution
- start() creates new thread
- Runnable is better approach




# Day 50 — Thread Lifecycle

## Topics Covered
- Thread states
- Lifecycle flow
- Thread methods
- State transitions

## Key Takeaways
- Threads go through multiple states
- Scheduler controls execution
- join() and sleep() are important




# Day 51 — Synchronization

## Topics Covered
- Race condition
- Synchronized method
- Synchronized block
- Locks

## Key Takeaways
- Prevents data inconsistency
- Ensures thread safety
- Important for shared resources



# Day 52 — Deadlock

## Topics Covered
- Deadlock concept
- Causes of deadlock
- Prevention techniques
- Thread locking

## Key Takeaways
- Deadlock freezes program
- Caused by circular waiting
- Prevent using lock ordering



# Day 53 — Thread Pool & Executors

## Topics Covered
- Thread pools
- ExecutorService
- Fixed, Cached, Single thread pool
- Task execution

## Key Takeaways
- Reuse threads efficiently
- Improves performance
- Essential for backend systems



