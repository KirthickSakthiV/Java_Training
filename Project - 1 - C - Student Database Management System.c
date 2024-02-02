Project 1 - C - Student Database


#include <stdio.h>
#include <stdlib.h>
#include <string.h>


// Define a structure for a student
struct Student {
    char rollNumber[20];
    char name[50];
    int age;
    float marks;
};

// Function to add a new student to the database
void addStudent(struct Student *database, int *numStudents) {
    printf(""Enter Roll Number: "");
    scanf(""%s"", database[*numStudents].rollNumber);

    printf(""Enter Name: "");
    scanf(""%s"", database[*numStudents].name);

    printf(""Enter Age: "");
    scanf(""%d"", &database[*numStudents].age);

    printf(""Enter Marks: "");
    scanf(""%f"", &database[*numStudents].marks);

    (*numStudents)++;
    printf(""Student added successfully!\n"");
}

// Function to display all students in the database
void displayStudents(const struct Student *database, int numStudents) {
    printf(""\nStudent Database:\n"");
    printf(""Roll Number\tName\t\tAge\tMarks\n"");

    for (int i = 0; i < numStudents; i++) {
        printf(""%s\t\t%s\t\t%d\t%.2f\n"",
               database[i].rollNumber, database[i].name,
               database[i].age, database[i].marks);
    }
}

int main() {
    // Maximum number of students in the database
    const int maxStudents = 100;

    // Array to store student information
    struct Student studentDB[maxStudents];

    // Variable to keep track of the number of students in the database
    int numStudents = 0;

    int choice;

    do {
        // Display menu
        printf(""\nStudent Database Management System\n"");
        printf(""1. Add Student\n"");
        printf(""2. Display Students\n"");
        printf(""3. Exit\n"");
        printf(""Enter your choice: "");
        scanf(""%d"", &choice);

        switch (choice) {
            case 1:
                addStudent(studentDB, &numStudents);
                break;
            case 2:
                displayStudents(studentDB, numStudents);
                break;
            case 3:
                printf(""Exiting the program. Goodbye!\n"");
                break;
            default:
                printf(""Invalid choice. Please enter a valid option.\n"");
        }
    } while (choice != 3);

    return 0;
}
"																								
 																									
																									
	EXPLANATION																								
																									
	#include <stdio.h>	  																							
		Example printf, scanf etc. If we want to use printf or scanf function in our program, we should include the stdio.																							
																									
	#include <stdlib.h>	h is the header of the general purpose standard library of C programming language which includes functions involving memory allocation, 																							
		process control, conversions and others.																							
																									
	#include <string.h>	string. h is a standard header file in the C language that contains functions for manipulating strings (arrays of characters). 																							
		<string. h> header file contains some useful string functions that can be directly used in a program by invoking the #include preprocessor directive.																							
																									
1	Structure Definition:																								
			struct Student {																						
			char rollNumber[20];																						
			char name[50];																						
			int age;																						
			float marks;																						
			};																						
	Defines a structure *Student* to represent each student’s information, including roll number, name, age, and marks																								
	 																								
2	Function Definition:																								
	a.	 'addStudent' Function																							
			void addStudent(struct Student *database, int *numStudents)																						
	Takes the input for a new student and adds them to the database																								
																									
	b.	 'displayStudents' Function:																							
			void displayStudents(const struct Student *database, int numStudents)																						
	Displays all the students in the database																								
																									
3	Main Function:																								
			int main()																						
	Defines the main function where the program execution starts																								
																									
4	Constants and Variables																								
			const int maxStudents = 100;																						
			struct Student studentDB[maxStudents];																						
			int numStudents = 0;																						
			int choice;																						
	Sets the maximum number of students in the database.																								
	 																								
	numStudents keeps track of the current number of students in the database.																								
	choice is used to store the user's menu choice.																								
																									
5	Main Menu Loop:																								
			do {																						
			// Display menu options																						
			// ...																						
			// Prompt user for choice																						
			scanf("%d", &choice);																						
																									
			switch (choice) {																						
			// ...																						
			}																						
			} while (choice != 3);																						
	This program runs in a loop until the user chooses to exit (Option 3)																								
																									
6	Switch Statement for Menu Options:																								
			switch (choice) {																						
			case 1:																						
			addStudent(studentDB, &numStudents);																						
			break;																						
			case 2:																						
			displayStudents(studentDB, numStudents);																						
			break;																						
			case 3:																						
			printf("Exiting the program. Goodbye!\n");																						
			break;																						
			default:																						
			printf("Invalid choice. Please enter a valid option.\n");																						
			}																						
	Handles user's menu choice using a switch statement			 																					
	Calls corresponding funtions based on the user's input																								
																									
7	 'addStudents' Function Details:																								
																									
	Prompts the user to input students input (roll number, name, age, marks)																								
	Increments 'numStudents' after successfully adding a student																								
																									
8	 'displayStudents' Function Details:																								
																									
	Prints the header for student database table																								
	Iterates through the 'studentDB' array and prints each student's information																								
																									
9	Documentation																								
	In a real-world scenario, you'd want to provide detailed documentation for each function, including parameters,																								
	return values, and a brief description of what the function does.																								
																									
	Documentation can be added using comments in a standardized format like Doxygen or Javadoc.																								
	This code provides a simple interactive menu for adding students and displaying the student database. 																								
	It serves as a basic foundation, and depending on your requirements, you may need to expand and enhance the functionality.