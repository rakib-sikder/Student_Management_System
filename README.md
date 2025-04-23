# 🎓 Java Student Management System (Console Based)

This is a simple **Java console application** that allows you to **add**, **view**, and **search** student records. Student data is stored in a local text file for persistence, making it a great beginner project to understand Java classes, file I/O, and basic object-oriented programming.

## 📁 Project Structure

```
StudentManagementSystem/
├── Main.java                  // Entry point of the application
├── Student.java               // Student data model
├── StudentManagerList.java    // Handles add, display, and search functionality
├── README.md                  // Project documentation
└── students.txt               // Automatically created to store student records
```

## ✨ Features

- ✅ Add student (Roll No, Name, Marks)
- ✅ Display all students from file
- ✅ Search student by Roll Number
- ✅ Data stored in `students.txt` for persistence
- ✅ Supports large Roll Numbers using `long`

## 🧪 Sample Data in `students.txt`

```
2024100010032,Rakibul Hasan,100.0
2024100010045,Aryan Ahmed,88.5
```

## 🖥 How to Run

### ✅ Step 1: Compile the Java files

```bash
javac Student.java StudentManagerList.java Main.java
```

### ✅ Step 2: Run the main program

```bash
java Main
```

## 💡 Example Run

```
--- Student Management System ---
1. Add Student
2. Display All Students
3. Search Student by Roll No
4. Exit
Enter your choice: 1

Enter Roll No: 2024100010032
Enter Name: Rakibul Hasan
Enter Marks: 100

Student added and saved to file!
```

## 🧑‍💻 Author

- **Name:** Rakibul Hasan
- **ID:** 2024100010032
- **GitHub:** [@rakib-sikder](https://github.com/rakib-sikder)

## 📌 Note

- The `students.txt` file will be automatically created when the first student is added.
- Make sure you're using **Java 8 or higher**.