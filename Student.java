public class Student {
    long rollNo;
    String name;
    double marks;

    public Student(long rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    @Override
    public String toString() {
        return rollNo + "," + name + "," + marks;
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");
        return new Student(Long.parseLong(parts[0]), parts[1], Double.parseDouble(parts[2]));
    }
}
