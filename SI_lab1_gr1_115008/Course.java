package SI_lab1_gr1_115008;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> Students;

    public Course(List<Student> students) {
        Students = students;
    }

    public Course() {
        Students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public void AddStudent(String firstName, String lastName, String index, List<Integer> labPoints) {
        Student nov_student = new Student(index, firstName, lastName, labPoints);
        Students.add(nov_student);
    }

    public void AddStudent(Student student) {
        Students.add(student);
    }

    public void DeleteStudent(String index) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).index.equals(index)){
                Students.remove(i);
                break;
            }
        }
    }

    public int GetSignatures() {
        int dobieni_potpisi= 0;
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).hasSignature()){
                dobieni_potpisi += 1;
            }
        }
        return dobieni_potpisi;
    }


    @Override
    public String toString() {
        return "Course{" +
                "Students=" + Students.toString() +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> newPoints = new ArrayList<>();
        Course kurs = new Course();

        newPoints.add(10);
        newPoints.add(10);
        newPoints.add(9);
        newPoints.add(10);
        newPoints.add(8);
        Student my_student = new Student("115008", "Kristijan", "Atanasovski", newPoints);

        newPoints = new ArrayList<>();
        newPoints.add(7);
        newPoints.add(10);
        newPoints.add(9);
        newPoints.add(10);
        newPoints.add(8);
        Student my_student2 = new Student("124008", "Petko", "Petkovski", newPoints);

        kurs.AddStudent(my_student);
        kurs.AddStudent(my_student2);
        System.out.println(kurs.toString());

        System.out.println(kurs.GetSignatures());

        kurs.DeleteStudent("115008");
        System.out.println(kurs.toString());

    }
}
