package SI_lab1_gr1_115008;

import java.util.ArrayList;
import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> labPoints;


    //TODO constructor

    //TODO seters & getters

    public double getAverage() {
        float sum = 0;
        for (int points : labPoints)
            sum = sum + points;

        return sum / labPoints.size();
    }

    public boolean hasSignature() {

        if (getAverage() > 8) {
            return true;
        }
        return false;
    }

    public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.firstName = firstName;
        this.index = index;
        this.lastName = lastName;
        this.labPoints = labPoints;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getIndex() {
        return index;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index='" + index + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", labPoints=" + labPoints +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> newPoints = new ArrayList<>();

        newPoints.add(10);
        newPoints.add(10);
        newPoints.add(9);
        newPoints.add(10);
        newPoints.add(8);
        Student my_student = new Student("115008", "Kristijan", "Atanasovski", newPoints);
        System.out.println(my_student.index);
        System.out.println(my_student.firstName);
        System.out.println(my_student.lastName);
        System.out.println(my_student.labPoints);
        System.out.println(my_student.getAverage());
        System.out.println(my_student.hasSignature());
    }
}
