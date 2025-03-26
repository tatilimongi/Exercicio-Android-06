# Mobile Educational Platform

## 📌 Project Description
This project is a mobile educational platform developed using Android Studio, Java, and Gradle. The system allows course creation and student enrollments. If a course reaches its maximum enrollment limit, an exception is thrown.

## 🚀 Features
- Course creation with a maximum enrollment limit.
- Student registration and enrollment.
- Exception handling when enrollment limit is reached.
- Logging student enrollments.

## 🛠️ Technologies Used
- **Java** (Main programming language)
- **Android Studio** (Development environment)
- **Gradle** (Build automation)
- **Logcat** (Logging system for debugging)

## 📂 Estrutura do Projeto
```
📦 Exercicio-Android-06
├── 📁 app
│   ├── 📁 manifests
│   ├── 📁 java
│   │   ├── 📁 com/example/exercicio_android_06
│   │   │   ├── EnrollmentLimitException.java
│   │   │   ├── Student.java
│   │   │   ├── Course.java
│   │   │   ├── MainActivity.java
│   │   ├── 📁 com/example/exercicio_android_06 (androidTest)
│   │   ├── 📁 com/example/exercicio_android_06 (test)
│   ├── 📁 java (generated)
│   ├── 📁 res
│   ├── 📁 res (generated)
├── 📁 Gradle Scripts
├── README.md
```

## ⚙️ How to Run
1. Clone the repository:
   ```sh
   git clone git remote add origin https://github.com/tatilimongi/Exercicio-Android-06.git
   ```
2. Open **Android Studio** and import the project.
3. Build and run the application on an emulator or physical device.

## 📝 Example Usage
```java
try {
    Course javaCourse = new Course("Java for Beginners", 2);
    Student student1 = new Student("Diogenes", 1);
    Student student2 = new Student("Tatiana", 2);
    Student student3 = new Student("Marlon", 3);

    javaCourse.enrollStudent(student1);
    javaCourse.enrollStudent(student2);
    javaCourse.enrollStudent(student3); // Should throw an exception
} catch (EnrollmentLimitException e) {
    Log.i("Error", e.getMessage());
}
```

