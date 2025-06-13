# 📚 Java Course Management System - CSCI2007 Project

A lightweight **Java-based Course Management System** developed as part of the CSCI2007 curriculum. This system provides core functionalities for managing students, instructors, and course sections—supporting both normal (in-person) and online learning environments.

---

## 🚀 Features

- 🔐 Admin dashboard (Swing GUI)
- 🎓 Student and Instructor management
- 📘 Course and Section creation
- 🖥️ Online & 🏫 Normal course types
- 💾 File-based data persistence

---

## 🗂️ Project Structure

```
CSCI2007 - Project/
└── src/
    └── Admin/
        ├── AdminDashboard2.java        # Main admin GUI
        ├── Course.java                 # Defines course data
        ├── CourseSection.java         # Abstract class for course sections
        ├── FileHandler.java           # Utilities for file I/O
        ├── Instructor.java            # Represents instructors
        ├── NormalCourseSection.java   # Implementation for physical classes
        ├── OnlineCourseSection.java   # Implementation for online classes
        ├── Person.java                # Abstract base for people
        └── Student.java               # Represents students
```

---

## 🛠️ Technologies Used

- Java SE 8+
- Java Swing (GUI)
- File I/O for persistent storage

---

## 🧑‍💻 Getting Started

### ✅ Prerequisites
- Java JDK 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools

### ▶️ Run Instructions
1. Clone or download this repository.
2. Open in your preferred Java IDE.
3. Navigate to `AdminDashboard2.java`.
4. Compile and run the file to launch the admin dashboard.

---

## 📝 Usage Notes

- All user and course data are saved locally using plain text files.
- Make sure relative paths are set correctly for file operations.
- Extend the system by adding features like authentication, search, or database integration.

---

## 📌 Future Improvements

- Integration with a real database (e.g., SQLite, MySQL)
- Role-based access control
- RESTful API for external access
- Responsive GUI enhancements

---

## 👥 Contributors

Developed as part of the **CSCI2007** course project. Contributions are welcome via pull requests.

---

## 📄 License

This project is for educational use. You may reuse and modify it for learning or academic purposes.

---