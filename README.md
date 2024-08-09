# GPACalculator
Overview
The GPA Calculator is a Java console-based application that allows students to 
input their course details (course code, name, credits, and marks) and calculate 
their GPA according to the college's grading policy. The program also displays the 
corresponding letter grades for each course.
Features
• Input course details: course code, name, credits, and marks.
• Calculate and display GPA.
• Display letter grades based on marks.
• User-friendly prompts and instructions.
• Input validation and error handling.
Grading Policy
The program uses the following grading policy:
Letter Grade Percentage Points
A+ 90-100 4.0
A 85-89 3.7
A- 80-84 3.5
B+ 77-79 3.3
B 73-76 3.0
B- 70-72 2.7
C+ 65-69 2.5
C 60-64 2.0
D+ 55-59 1.5
D 50-54 1.0
F 0-49 0.0
Instructions
1. Compile the Program:
o Open a terminal or command prompt.
o Navigate to the directory where GPACalculator.java is saved.
o Compile the program using the following command:
javac GPACalculator.java
2. Run the Program:
o After compiling, run the program using the following command:
java GPACalculator
3. Follow Prompts:
o The program will display instructions and prompts for entering course 
details.
o Enter the course code, name, credits, and marks when prompted.
o After entering the details for a course, you will be asked if you want 
to add another course.
o Enter 'Y' to add another course or 'N' to proceed to GPA calculation.
4. View Results:
o The program will display the details of all entered courses, including 
the calculated points and letter grades.
o The final GPA will be displayed at the end.
Main Components
5. Course Class:
o Represents a course with the following attributes:
▪ String code: The course code.
▪ String name: The course name.
▪ int credits: The number of credits for the course.
▪ double marks: The marks obtained in the course.
o Methods:
▪ double getPoints(): Returns the grade points based on the 
marks.
▪ String getLetterGrade(): Returns the letter grade based 
on the marks.
6. GPACalculator Class:
o Contains the main method which drives the program.
o Displays the launch screen with developer details and instructions.
o Uses a Scanner object to read user input in a try-with-resources 
statement for automatic resource management.
o Prompts the user to enter course details and stores them in an 
ArrayList of Course objects.
o Calculates the total credits, total points, and GPA.
o Displays the course details, calculated points, letter grades, and final 
GPA
