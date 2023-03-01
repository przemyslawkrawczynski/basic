package studentmarks;

import java.util.HashMap;
import java.util.Map;

public class AppStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Michal");
        Student student2 = new Student("Krzysiu");
        Student student3 = new Student("Zdzisiu");

        StudentMarks marksStudent1 = new StudentMarks(5, 6, 6);
        StudentMarks marksStudent2 = new StudentMarks(4, 5, 4);
        StudentMarks marksStudent3 = new StudentMarks(2, 3, 4);

        HashMap<Student, StudentMarks> studentData = new HashMap<Student, StudentMarks>();

        studentData.put(student1, marksStudent1);
        studentData.put(student2, marksStudent2);
        studentData.put(student3, marksStudent3);

        for (Map.Entry<Student, StudentMarks> student : studentData.entrySet()){

            System.out.println("Average mark of student named: " + student.getKey().getStudentName() + " is " + student.getValue().marksAverage() );
            //tutaj mi sie udalo dostac do metod w tych klasach, ale pytanie czy
        }


    }
}
