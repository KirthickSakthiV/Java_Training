#include <stdio.h>
#include <stdlib.h>

#define MAX_FILENAME_LENGTH 50
#define MAX_CONTENT_LENGTH 500

void displayMenu() {
    printf("\nSimple File Management System\n");
    printf("1. Create File\n");
    printf("2. Read File\n");
    printf("3. Update File\n");
    printf("4. Delete File\n");
    printf("5. Exit\n");
    printf("Enter your choice: ");
}

void createFile() {
    char filename[MAX_FILENAME_LENGTH];
    char content[MAX_CONTENT_LENGTH];

    printf("Enter the filename: ");
    scanf("%s", filename);

    FILE *file = fopen(filename, "w");

    if (file == NULL) {
        printf("Error creating the file.\n");
        return;
    }

    printf("Enter the content (max %d characters): ", MAX_CONTENT_LENGTH);
    scanf(" %[^\n]", content);

    fprintf(file, "%s", content);

    fclose(file);
    printf("File created successfully.\n");
}

void readFile() {
    char filename[MAX_FILENAME_LENGTH];
    char content[MAX_CONTENT_LENGTH];

    printf("Enter the filename: ");
    scanf("%s", filename);

    FILE *file = fopen(filename, "r");

    if (file == NULL) {
        printf("File not found.\n");
        return;
    }

    while (fgets(content, MAX_CONTENT_LENGTH, file) != NULL) {
        printf("%s", content);
    }

    fclose(file);
}

void updateFile() {
    char filename[MAX_FILENAME_LENGTH];
    char content[MAX_CONTENT_LENGTH];

    printf("Enter the filename: ");
    scanf("%s", filename);

    FILE *file = fopen(filename, "a");

    if (file == NULL) {
        printf("File not found.\n");
        return;
    }

    printf("Enter the content to append (max %d characters): ", MAX_CONTENT_LENGTH);
    scanf(" %[^\n]", content);

    fprintf(file, "%s", content);

    fclose(file);
    printf("File updated successfully.\n");
}

void deleteFile() {
    char filename[MAX_FILENAME_LENGTH];

    printf("Enter the filename: ");
    scanf("%s", filename);

    if (remove(filename) == 0) {
        printf("File deleted successfully.\n");
    } else {
        printf("Error deleting the file.\n");
    }
}

int main() {
    int choice;

    do {
        displayMenu();
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                createFile();
                break;
            case 2:
                readFile();
                break;
            case 3:
                updateFile();
                break;
            case 4:
                deleteFile();
                break;
            case 5:
                printf("Exiting the program. Goodbye!\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 5);

    return 0;
}


