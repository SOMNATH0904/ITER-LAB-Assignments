/**
 * Ques 2 : Write a Java code snippet that comprises of a User class and an ArrayListUser class. The User class should define private fields for name and age, along with a parameterized constructor and getter/setter methods for these attributes. Create an ArrayListUser class of User objects. After addition of objects, the ArrayListUser class should retrieve and print the name and age of users. Then, it should sort the user according to age using getter methods and print the updated array list of users.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class User {
    private String name;
    private int age;
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class ArrayListUser {
    private ArrayList <User> users;

    public ArrayListUser() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }
}
public class Q02 {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();
        arrayListUser.addUser(new User("Sukhi", 25));
        arrayListUser.addUser(new User("Sumali", 30));
        arrayListUser.addUser(new User("Sunami", 20));
        System.out.println("Before Sorting --> ");
        arrayListUser.printUsers();
        arrayListUser.sortUsersByAge();
        System.out.println("After Sorting by age --> ");
        arrayListUser.printUsers();
    }
}

/**
 * OUTPUT :
 *
 * Before Sorting -->
 * Users:
 * Name: Sukhi, Age: 25
 * Name: Sumali, Age: 30
 * Name: Sunami, Age: 20
 * After Sorting by age -->
 * Users:
 * Name: Sunami, Age: 20
 * Name: Sukhi, Age: 25
 * Name: Sumali, Age: 30
 */