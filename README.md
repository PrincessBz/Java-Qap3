# High School Application and Shape Classes in Java

[https://github.com/PrincessBz/Java-Qap3.git](https://github.com/PrincessBz/Java-Qap3.git)

## Overview

This repository contains Java code implementing a high school application with inheritance, as well as classes for geometric shapes using abstract classes and interfaces. The project demonstrates object-oriented programming principles, including inheritance, polymorphism, abstraction, and interfaces.

## Project Structure

The repository is organized into the following directories and files:

*   **Problem1:** Contains the files related to the High School Application problem.
    *   `Person.java`: Base class for individuals.
    *   `Student.java`: Subclass of Person representing a student.
    *   `Teacher.java`: Subclass of Person representing a teacher.
    *   `CollegeStudent.java`: Subclass of Student representing a college student.
    *   `Demo.java`: Main class to demonstrate the classes.
    *   `screenshot.png`: Screenshot of the running code's output.
*   **Problem2:** Contains the files related to the Point and MovablePoint problem.
    *   `Point.java`: Class representing a point in 2D space.
    *   `MovablePoint.java`: Subclass of Point that can be moved.
    *   `Demo.java`: Main class to demonstrate the classes.
    *   `screenshot.png`: Screenshot of the running code's output.
*   **Problem3:** Contains the files related to the Abstract Classes (Shapes) problem.
    *   `Shape.java`: Abstract base class for geometric shapes.
    *   `Circle.java`: Subclass of Shape representing a circle.
    *   `Ellipse.java`: Subclass of Shape representing an ellipse.
    *   `Triangle.java`: Subclass of Shape representing a triangle.
    *   `EquilateralTriangle.java`: Subclass of Triangle representing an equilateral triangle.
    *   `Demo.java`: Main class to demonstrate the classes.
    *   `screenshot.png`: Screenshot of the running code's output.
*   **Problem4:** Contains the files related to the Interfaces (Scalable) problem.
    *   `Scalable.java`: Interface for scalable objects.
    *   `Shape.java`: Abstract base class for geometric shapes (modified to implement Scalable).
    *   `Circle.java`: Subclass of Shape representing a circle.
    *   `Ellipse.java`: Subclass of Shape representing an ellipse.
    *   `Triangle.java`: Subclass of Shape representing a triangle.
    *   `EquilateralTriangle.java`: Subclass of Triangle representing an equilateral triangle.
    *   `Demo.java`: Main class to demonstrate the classes.
    *   `screenshot.png`: Screenshot of the running code's output.

## Problems Description

### Problem 1: High School Application

This problem demonstrates inheritance in Java by creating a class hierarchy for a high school application. The `Person` class serves as the base class, with subclasses for `Student`, `Teacher`, and `CollegeStudent`. This showcases how to reuse code and model real-world relationships using inheritance.

### Problem 2: Point and MovablePoint

This problem focuses on creating a `Point` class and a `MovablePoint` subclass. The `MovablePoint` class extends the `Point` class and adds the ability to move the point in 2D space.

### Problem 3: Abstract Classes (Shapes)

This problem involves creating an abstract `Shape` class with subclasses for different geometric shapes, such as `Circle`, `Ellipse`, `Triangle`, and `EquilateralTriangle`. The goal is to demonstrate abstraction and polymorphism.

### Problem 4: Interfaces (Scalable)

This problem introduces the concept of interfaces by creating a `Scalable` interface and implementing it in the shape classes. The goal is to demonstrate how interfaces can be used to achieve multiple inheritance-like behavior.

## Getting Started

These instructions will guide you on how to set up and run the project on your local machine.

### Prerequisites

*   Java Development Kit (JDK) installed (version 8 or higher recommended)
*   A text editor or Integrated Development Environment (IDE) for writing and editing code (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Installation

1.  Clone the repository to your local machine:

    ```bash
    git clone https://github.com/PrincessBz/Java-Qap3.git
    ```

2.  Navigate to the project directory:

    ```bash
    cd Java-Qap3
    ```

### Compilation

Compile the Java files using the following command:

```bash
javac Problem1/*.java
javac Problem2/*.java
javac Problem3/*.java
javac Problem4/*.java
