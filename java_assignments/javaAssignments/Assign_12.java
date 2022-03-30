package javaAssignments;

import java.util.*;
import java.util.stream.Collectors;

class StreamAPI {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //1. Print the name of all departments in the college?

        //Optional<String> department = studentList.stream().map(student -> student.engDepartment).distinct().reduce((a,b) -> a+","+b);
        List<String> department = studentList.stream().map(student -> student.engDepartment).distinct().collect(Collectors.toList());//toList() is a static method of the Collectors class that is used to collect/accumulate all the elements to a new List
//        Set<String> department = studentList.stream().map(student -> student.engDepartment).collect(Collectors.toSet());
        System.out.println("1. All Departments in college: "+department+"\n");

        //2. Get the names of all students who have enrolled after 2018?

        List<String> names = studentList.stream().filter(student -> student.yearOfEnrollment> 2018)
                .map(student -> student.name).collect(Collectors.toList());
        System.out.println("2. All students who have enrolled after 2018: "+names+"\n");

        //3. Get the details of all male student in the computer sci department?

        System.out.println("3. Details of all male student in the computer science department: ");
        studentList.stream().filter(student -> student.gender.equals("Male"))
                .filter(student -> student.engDepartment.equals("Computer Science")).forEach(System.out::println);

        //4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)

        Map<String,Long> noOfStudents = studentList.stream().collect(Collectors.groupingBy(student -> student.gender,Collectors.counting()));
        System.out.println("\n4. No of Male and Female Students: "+noOfStudents+"\n");

        //5. What is the average age of male and female students?

        Map<String,Double> avgAge = studentList.stream().collect(Collectors.groupingBy(student -> student.gender,Collectors.averagingInt(student -> student.age)));
        System.out.println("5. Average age of male and female students: "+avgAge+"\n");

        //6. Get the details of highest student having highest percentage ?

        Student highestPercent = studentList.stream().max(Comparator.comparing(student -> student.perTillDate)).get();
        System.out.println("6. Student having highest percentage: "+highestPercent+"\n");

        //7. Count the number of students in each department? (Hint :use Collectors.groupingBy())

        Map<String,Long> studentsInDept = studentList.stream().collect(Collectors.groupingBy(student -> student.engDepartment,Collectors.counting()));
        System.out.println("7. No of students in each department: "+studentsInDept+"\n");

        //8. What is the average percentage achieved in each department?

        Map<String,Double> avgPer = studentList.stream().collect(Collectors.groupingBy(student -> student.engDepartment,Collectors.averagingDouble(student -> student.perTillDate)));
        System.out.println("8. Average percentage achieved in each department: "+avgPer+"\n");

        //9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)

        Student youngMale = studentList.stream().filter(student -> student.gender.equals("Male"))
                .filter(student -> student.engDepartment.equals("Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(student -> student.age))).get();
        System.out.println("9. Youngest male student in the Electronic department: "+youngMale+"\n");

        //10. How many male and female students are there in the computer science department?

        Map<String,Long> noOfStudents1 = studentList.stream().filter(student -> student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(student -> student.gender,Collectors.counting()));
        System.out.println("10. No male and female students are there in the computer science department: "+noOfStudents1+"\n");
    }
}
class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public String toString()
    {
        return id+" "+name+" "+age+" "+gender+" "+engDepartment+" "+yearOfEnrollment+" "+perTillDate;
    }
}