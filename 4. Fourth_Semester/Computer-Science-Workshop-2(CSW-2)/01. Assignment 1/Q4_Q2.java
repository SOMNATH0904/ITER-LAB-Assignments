class Employee1 {
    private String name;
    private int age;
    private int eId;
    private String position;

    Employee1(String name, int age, int eId, String position) {
        this.name = name;
        this.age = age;
        this.eId = eId;
        this.position = position;
//        this.eId = 9426;
//        this.position = "SDE";
    }

//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setAge(int age) {
//        this.age = age;
//    }
//
//    String getName() {
//        return this.name;
//    }
//
//    int getAge() {
//        return this.age;
//    }

    String printToString() {
        return this.name+"'s age is "+this.age+", his Employee ID is "+this.eId+" & assigned in Position "+this.position;
    }
}

public class Q4_Q2 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Harry", 20, 9876, "SDE");
//        e1.setName("Harry");
//        e1.setAge(20);
        System.out.println(e1.printToString());
    }
}
