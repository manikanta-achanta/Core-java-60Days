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
