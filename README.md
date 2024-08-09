# GPA Calculator

## Overview
The GPA Calculator is a Java console-based application designed for students to input their course details and calculate their GPA based on a predefined grading policy. The program also outputs the corresponding letter grades for each course.

## Features
- **Input Course Details**: Allows the user to enter course code, name, credits, and marks.
- **GPA Calculation**: Calculates the GPA based on the entered courses.
- **Letter Grades**: Displays the letter grade corresponding to the marks obtained.
- **User-Friendly Prompts**: Easy-to-follow instructions and prompts.
- **Error Handling**: Includes input validation and exception handling to ensure smooth user experience.

## Grading Policy
The program uses the following grading scale:

| Letter Grade | Percentage | Points |
|--------------|-------------|--------|
| A+           | 90-100      | 4.0    |
| A            | 85-89       | 3.7    |
| A-           | 80-84       | 3.5    |
| B+           | 77-79       | 3.3    |
| B            | 73-76       | 3.0    |
| B-           | 70-72       | 2.7    |
| C+           | 65-69       | 2.5    |
| C            | 60-64       | 2.0    |
| D+           | 55-59       | 1.5    |
| D            | 50-54       | 1.0    |
| F            | 0-49        | 0.0    |

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A text editor or Integrated Development Environment (IDE) for writing and running Java code.

### Installation
1. Clone the repository to your local machine:
    ```sh
    git clone https://github.com/your-username/gpa-calculator.git
    ```
2. Navigate to the project directory:
    ```sh
    cd gpa-calculator
    ```

### Running the Program
1. **Compile the Program**:
    - Open a terminal or command prompt in the project directory.
    - Compile the Java file using the following command:
      ```sh
      javac GPACalculator.java
      ```

2. **Run the Program**:
    - Run the compiled Java class:
      ```sh
      java GPACalculator
      ```

3. **Follow the Prompts**:
    - Enter the course details when prompted.
    - After entering the details for each course, you will be asked if you want to add another course.
    - Enter 'Y' to add another course or 'N' to calculate your GPA and view the results.

## Example Usage


