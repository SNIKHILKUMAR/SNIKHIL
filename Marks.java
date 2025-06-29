

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String teacherName;
        System.out.println("teacher is assigning the marks of the students");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of student " + (i + 1) );
            String studentName = sc.next();
            int studentroll = sc.nextInt();
            System.out.println("Enter marks of " + studentName +studentroll );
            int marks = sc.nextInt();
            if (marks >= 40) {
                System.out.println(studentName + " is pass");
            } else {
                System.out.println(studentName + " is fail");
            }
        }
    }
}

