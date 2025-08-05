package Day2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentManagementSystem  manager=new StudentManagementSystem();
        int choise;
        do{
            System.out.println("\n---Student Record Management System---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choise=scanner.nextInt();
            switch (choise){
                case 1->{
                    System.out.print("Enter ID: ");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name=scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks=scanner.nextDouble();
                    manager.addStudent(id,name,marks);

                } case 2-> manager.viewAllStudents();
                case 3->{
                    System.out.print("Enter Student Id to update: ");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String name=scanner.nextLine();
                    System.out.print("Enter New Marks: ");
                    double marks=scanner.nextDouble();
                    manager.updateStudent(id,name,marks);
                }
                case 4->{
                    System.out.print("Enter Student Id to delete: ");
                    int id=scanner.nextInt();
                    manager.deleteStudent(id);
                }
                case 5-> System.out.println("Exitinf...");

                default -> System.out.println("Invalid choise. Try again");
            }

        }while(choise!=5);
        scanner.close();
    }
}
