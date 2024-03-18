class Student {
    String name;
    int rollNumber;
    int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student1 = new Student("ABC", 8778, 20);
        Student student2 = new Student("XYZ", 5567, 22);

        System.out.println("Student 1 Details -->");
        System.out.println("Name: "+student1.getName()+" Roll Number : "+student1.getRollNumber()+" Age : "+student1.getAge());

        System.out.println("Student 2 Details -->");
        System.out.println("Name: " + student2.getName()+" Roll Number : "+student2.getRollNumber()+" Age : "+student2.getAge());

        student1.setAge(21);
        student2.setName("Shobhit");

        System.out.println("Updated Student 1 Details -->");
        System.out.println("Name: "+student1.getName()+" Roll Number : "+student1.getRollNumber()+" Age : "+student1.getAge());

        System.out.println("Updated Student 2 Details -->");
        System.out.println("Name: " + student2.getName()+" Roll Number : "+student2.getRollNumber()+" Age : "+student2.getAge());
    }
}
