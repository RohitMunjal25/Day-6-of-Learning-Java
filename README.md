# Day-6-of-Learning-Java
On the day 6 of learning Java, I explored the fundamentals of multithreading and synchronization in Java. This set of exercises deepened my understanding of thread creation using both inheritance (Thread class) and interfaces (Runnable), along with basic synchronization techniques. Even and Odd Number Threads
Created two threads using the Thread class. One prints even numbers from 0 to 10, and the other prints odd numbers from 1 to 10, demonstrating parallel thread execution.

Multiplication Tables using Threads
Implemented two threads to display the multiplication tables:

One using the Thread class for the table of 2.

Another using the Runnable interface for the table of 3.

Character Printing with Threads
Developed two threads using the Thread class:

First thread prints characters from 'A' to 'E'.

Second thread prints characters from 'F' to 'J'.

Synchronization with Shared Counter
Implemented a SyncDemo program to demonstrate safe increment operations on a shared counter using multithreading. A Counter class contains a synchronized increment method. A thread increments the counter 1000 times, and the final result is printed post-execution.

Each example helped me better understand thread behavior, execution order, and thread-safe programming practices in Java.

The problems I solved in this repo are following:
1. Create two threads, one thread prints even numbers from 0 to 10, and the 
second thread prints odd numbers from 1 to 10. Use the Thread class (Inheritance 
method). 
2. Create a thread to display the multiplication table of 2. 
Create another thread to display the multiplication table of 3. 
Use the Thread class for one and the Runnable interface for the other. 
3. Create two threads: 
• One thread prints characters from 'A' to 'E'. 
• Second thread prints characters from 'F' to 'J'. 
• Use the Thread class (Inheritance). 
4. Implement a Java program with the class name SyncDemo to demonstrate 
incrementing a counter using multithreading. 
Create a Counter class with an increment method. In the main method, create a 
thread that increments the counter 1000 times. After the thread completes 
execution, print the final count.
