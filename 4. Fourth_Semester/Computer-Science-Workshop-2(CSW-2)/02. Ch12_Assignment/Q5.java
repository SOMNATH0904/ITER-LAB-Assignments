class College {
    private String collegeName;
    private String collegeLoc;

    College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    String getCollegeName() {
        return collegeName;
    }

    String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    void displayStudentInfo() {
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("College Name: "+college.getCollegeName());
        System.out.println("College Location: "+college.getCollegeLoc());
        System.out.println();
    }
}

public class Q5 {
    public static void main(String[] args) {
        College college1 = new College("IIT Bbsr", "Bhubaneswar");
        College college2 = new College("ITER", "Bhubaneswar");

        Student student1 = new Student(101, "Kanisk", college1);
        Student student2 = new Student(102, "Somnath", college2);

        System.out.println("College Information -->");
        System.out.println("College 1 : "+college1.getCollegeName()+" "+college1.getCollegeLoc());
        System.out.println("College 2 : " + college2.getCollegeName()+" "+college2.getCollegeLoc());
        System.out.println();

        System.out.println("Student Information -->");
        System.out.println("Student 1 -> ");
        student1.displayStudentInfo();
        System.out.println("Student 2 -> ");
        student2.displayStudentInfo();
    }
}
