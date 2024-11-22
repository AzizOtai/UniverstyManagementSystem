# University Management System

# Overview:
The University Management System is a Java application designed to manage various university members, including students, teachers, and administrative staff. This project demonstrates advanced Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, interfaces, and abstraction.

# Features:
- Modular Class Hierarchy: Utilizes interfaces and abstract classes to create a structured and extensible class hierarchy.
- Polymorphism and Inheritance: Demonstrates polymorphic behavior through method overriding and inheritance.
- Interfaces Implementation: Implements multiple interfaces (Person and Reportable) to standardize operations.
- Collections Usage: Manages groups of university members using collections (List<UniversityMember>).
- Annual Expense Calculation: Calculates the total annual expense for the university by summing individual expenses.
- Role-Based Filtering: Filters and displays university members based on their roles.
- Top-Performing Student Identification: Identifies and displays the student with the highest GPA.
  
Requirements
      Java Development Kit (JDK) 8 or higher
      An IDE like Eclipse, IntelliJ IDEA, or NetBeans



   
# Usage:
The application will display details of all university members, calculate the total annual expense, filter members by role, and identify the top-performing student.

# Classes and Interfaces:

Interfaces:

    Person: Defines common behaviors for all individuals.
    Reportable: Standardizes report generation for applicable classes.

Abstract Class:

    UniversityMember: Implements Person and serves as a base class.

Classes:

    Student: Inherits from UniversityMember and implements Reportable.
    Teacher: Inherits from UniversityMember and implements Reportable.
    AdminStaff: Inherits from UniversityMember.

Main Class:

    UniversitySystem: Demonstrates the functionality of the system.

# Example Output

University Member Details:
---------------------------
    Name: Alice, ID: S001, Role: Student, Major: Computer Science, GPA: 3.90
    Student Report:
    Name: Alice
    ID: S001
    Major: Computer Science
    GPA: 3.90

    Name: Bob, ID: S002, Role: Student, Major: Mathematics, GPA: 3.60
    Student Report:
    Name: Bob
    ID: S002
    Major: Mathematics
    GPA: 3.60

    Name: Dr. Smith, ID: T001, Role: Teacher, Department: Mathematics, Annual Expense: $52000.00
    Teacher Report:
    Name: Dr. Smith
    ID: T001
    Department: Mathematics
    Subjects: Calculus, Algebra
    Annual Expense: $52000.00

    Name: Dr. Johnson, ID: T002, Role: Teacher, Department: Computer Science, Annual Expense: $57000.00
    Teacher Report:
    Name: Dr. Johnson
    ID: T002
    Department: Computer Science
    Subjects: Programming, Data Structures
    Annual Expense: $57000.00

    Name: John, ID: A001, Role: Admin Staff, Position: Accountant, Annual Expense: $48000.00

    Name: Emma, ID: A002, Role: Admin Staff, Position: HR Manager, Annual Expense: $54000.00

    Total Annual University Expense: $261000.00

    Filtering by Role: Teachers
    Name: Dr. Smith, ID: T001, Role: Teacher, Department: Mathematics, Annual Expense: $52000.00
    Name: Dr. Johnson, ID: T002, Role: Teacher, Department: Computer Science, Annual Expense: $57000.00

    Top-Performing Student: Alice, GPA: 3.90

# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Author
Abdulaziz Saad T. Al-Otaishan
