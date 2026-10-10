import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

    
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            int score = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, score));
        }

        
        int highest = students.get(0).score;
        int lowest = students.get(0).score;
        int total = 0;

        for (Student s : students) {
            total += s.score;

            if (s.score > highest) {
                highest = s.score;
            }

            if (s.score < lowest) {
                lowest = s.score;
            }
        }

        double average = (double) total / students.size();

        
        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Score: " + s.score);
        }

        System.out.println("------------------------------------------");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
}