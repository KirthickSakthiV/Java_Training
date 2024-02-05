C Project - 2 - Library Management System




#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct Book {
    char title[100];
    char author[100];
    int year;
};


void addBook(struct Book library[], int *numBooks) {
    if (*numBooks < 100) {
        printf("Enter book title: ");
        scanf("%s", library[*numBooks].title);
        
        printf("Enter author name: ");
        scanf("%s", library[*numBooks].author);
        
        printf("Enter publication year: ");
        scanf("%d", &library[*numBooks].year);
        
        (*numBooks)++;
        printf("Book added successfully!\n");
    } else {
        printf("Library is full. Cannot add more books.\n");
    }
}

void displayBooks(struct Book library[], int numBooks) {
    if (numBooks > 0) {
        printf("Library Books:\n");
        for (int i = 0; i < numBooks; i++) {
            printf("Title: %s\n", library[i].title);
            printf("Author: %s\n", library[i].author);
            printf("Year: %d\n", library[i].year);
            printf("---------------------------\n");
        }
    } else {
        printf("No books in the library.\n");
    }
}


void searchBook(struct Book library[], int numBooks, char title[]) {
    int found = 0;
    for (int i = 0; i < numBooks; i++) {
        if (strcmp(library[i].title, title) == 0) {
            printf("Book found!\n");
            printf("Title: %s\n", library[i].title);
            printf("Author: %s\n", library[i].author);
            printf("Year: %d\n", library[i].year);
            found = 1;
            break;
        }
    }
    
    if (!found) {
        printf("Book not found.\n");
    }
}

int main() {
    struct Book library[100]; // Maximum 100 books in the library
    int numBooks = 0; // Number of books currently in the library

    int choice;
    char searchTitle[100];

    do {
        printf("\nLibrary Management System\n");
        printf("1. Add a book\n");
        printf("2. Display all books\n");
        printf("3. Search for a book\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addBook(library, &numBooks);
                break;
            case 2:
                displayBooks(library, numBooks);
                break;
            case 3:
                printf("Enter the title of the book to search: ");
                scanf("%s", searchTitle);
                searchBook(library, numBooks, searchTitle);
                break;
            case 4:
                printf("Exiting the program. Goodbye!\n");
                break;
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    } while (choice != 4);

    return 0;
}

-------------------------------------------------

