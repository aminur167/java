/**
 * Student class demonstrating OOP concepts
 * - encapsulation with private fields
 * - constructor, getters, setters
 * - toString override
 */
public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getCgpa() { return cgpa; }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. Must be 0.0 - 4.0");
        }
    }

    public String getGrade() {
        if (cgpa >= 3.5) return "A+";
        else if (cgpa >= 3.0) return "A";
        else if (cgpa >= 2.5) return "B+";
        else if (cgpa >= 2.0) return "B";
        else return "C";
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', CGPA=" + cgpa + ", grade=" + getGrade() + "}";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aminur Islam", 2023001, 3.75);
        Student s2 = new Student("Rakib Hasan", 2023002, 3.20);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getName() + " - Grade: " + s1.getGrade());
    }
}
