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



