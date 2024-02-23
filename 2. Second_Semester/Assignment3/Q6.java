class Box<T> {
    T contents;

    public  void setContents (T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }
}

public class Q6 {
    public static void main(String[] args) {
        //First Part
        Box<String> stringBox = new Box<>();
        stringBox.setContents("Hello");
        Box<String> box1 = stringBox;
        Box<String> box2 = stringBox;
        box1.setContents("Hi There!");
        System.out.println(box2.getContents());

        //Second Part
        Box<Integer> integerBox = new Box<>();
        integerBox.setContents(15);
        Box<Integer> box3 = integerBox;
        Box<Integer> box4 = integerBox;
        box3.setContents(20);
        System.out.println(box4.getContents());

        //Third Part
        Box<Object> objectBox = new Box<>();
        objectBox.setContents("Have a good day!");
        String str = (String) objectBox.getContents();
        System.out.println(str);
        objectBox.setContents(50);
        int num = (int) objectBox.getContents();
        System.out.println(num);
    }
}