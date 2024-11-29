import java.io.*;

public class Serialization {

    // Define the Student class with Serializable
    public static class Student implements Serializable {
        private String name;
        private int age;
        private char grade;

        // Constructor
        public Student(String name, int age, char grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Getters for the fields
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGrade() {
            return grade;
        }

        // Override toString for easy printing
        @Override
        public String toString() {
            return "Student Name: " + name + ", Age: " + age + ", Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 20, 'A');

        // Serialize the student object to studentData.ser
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("studentData.ser"))) {
            out.writeObject(student);
            System.out.println("Student object serialized to studentData.ser");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the student object from studentData.ser
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("studentData.ser"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Deserialized Student: ");
            System.out.println(deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
