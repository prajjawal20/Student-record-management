# Student Record Management System

## Overview
This is a *console-based Java application* that manages student records in memory using an ArrayList. The system allows users to *Add, View, Update, and Delete* student records. It simulates basic CRUD operations similar to a database but is implemented using Java collections.

---

## Features
1. *Add Student*
   - Input: Student ID, Name, Marks
   - Unique ID enforcement prevents duplicate student entries.
   
2. *View Students*
   - Display all students with their ID, Name, and Marks.
   - Shows a message if no records exist.
   
3. *Update Student*
   - Search by ID and display current data.
   - Choose to update *Name, **Marks, or **Both*.
   
4. *Delete Student*
   - Remove a student record by ID.
   - Works correctly because IDs are unique.
   
5. *Exit*
   - Close the program safely.

---

## Key Concepts Used
- *Classes & Objects:* Student class to represent student entities.
- *ArrayList:* Stores all student objects dynamically.
- *Encapsulation:* Private fields with getter and setter methods.
- *Control Structures:* Loops, switch-case, and conditionals for menu-driven operations.
- *Input Handling:* Scanner usage and newline consumption for smooth input.
- *CRUD Operations:* Basic Create, Read, Update, and Delete functionality.

---

## How to Run

1. *Compile the Java Program*
```bash
javac StudentManagement.java
