import java.io.*;

public class StudentManagerList {
    private final String FILE_NAME = "students.txt";

    public void addStudent(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(student.toString());
            bw.newLine();
            System.out.println("Student added and saved to file!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public void displayAllStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                Student student = Student.fromString(line);
                student.displayInfo();
                System.out.println("------------------------");
                found = true;
            }
            if (!found) {
                System.out.println("No students found in file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }

    public void searchStudent(long rollNo) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                Student student = Student.fromString(line);
                if (student.rollNo == rollNo) {
                    System.out.println("Student Found:");
                    student.displayInfo();
                    return;
                }
            }
            System.out.println("Student with Roll No " + rollNo + " not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}
