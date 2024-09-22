
package studentver5;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
          while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Check if the book's return due date has arrived or not");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    personList.displayEveryone();
                    break;
                case 6:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    }
                    break;
                case 7:
                    break;
                case 8:
                    personList.checkBookBorrowing();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }
}
