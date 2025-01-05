package week3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class student {
    private int id;
    private String name;
    private int age;
    private char grade;

    public student(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void setGrade(char grade) {
        if ("ABCDEF".indexOf(grade) != -1) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Please use A, B, C, D, E, or F.");
        }
    }

    public String toCSV() {
        return id + "," + name + "," + age + "," + grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public static class StudentCSVStorage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fileName = "students.csv";

            try {
                File file = new File(fileName);
                boolean isNewFile = file.createNewFile();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    if (isNewFile) {
                        writer.write("ID,Name,Age,Grade");
                        writer.newLine();
                    }

                    System.out.println("Enter student information. Type 'exit' as the name to stop:");

                    int id = 1;

                    while (true) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        if (name.equalsIgnoreCase("exit")) {
                            break;
                        }

                        System.out.print("Enter age: ");
                        int age = 0;
                        try {
                            age = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid age. Please enter a valid number.");
                            continue;
                        }

                        System.out.print("Enter grade (A-F): ");
                        char grade;
                        try {
                            grade = scanner.nextLine().toUpperCase().charAt(0);
                            if ("ABCDEF".indexOf(grade) == -1) {
                                throw new IllegalArgumentException("Invalid grade.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid grade. Please enter A, B, C, D, E, or F.");
                            continue;
                        }

                        student student = new student(id, name, age, grade);

                        writer.write(student.toCSV());
                        writer.newLine();
                        System.out.println("Student data saved: " + student.toCSV());

                        id++;
                    }

                    System.out.println("All student information has been saved to " + fileName);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
}
