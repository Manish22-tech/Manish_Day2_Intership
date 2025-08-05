package Day2;

import java.util.ArrayList;

public class StudentManagementSystem {

    static ArrayList<Student> students=new ArrayList<>();
    public  void addStudent(int id,String name,double marks) {
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully");
    }
    public void viewAllStudents(){
        if(students.isEmpty()){
            System.out.println("No student records available");
        }else{
            for(Student s:students){
                s.display();
            }
        }
    }
    public void updateStudent(int id,String newName,double newMarks){
        boolean found =false;
        for(Student s:students){
            if(s.getId()==id){
                s.setName(newName);
                s.setMarks(newMarks);
                System.out.println("Student updated successfully");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Studen with ID "+id+" not found.");
        }
    }
    public void deleteStudent(int id){
        boolean removed=students.removeIf(s->s.getId()==id);
        if(removed){
            System.out.println("Student delete sucessfully");
        }else{
            System.out.println("Student with id"+ id +"not found.");
        }
    }

}
