import java.util.ArrayList;
import java.util.List;

public class Q17 {
    private List<Integer>[] data;
    public Q17(int size) {
        data = new ArrayList[size];
        for(int i = 0; i < size; i++) {
            data[i] = new ArrayList<>();
        }
    }
    public void addElement(int idx, int val) {
        if(idx < 0 || idx >= data.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        data[idx].add(val);
    }
    public int getElement(int index, int elementIndex) {
        if(index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        if(elementIndex < 0 || elementIndex >= data[index].size()) {
            throw new ArrayIndexOutOfBoundsException("Element index is out of bounds.");
        }
        return data[index].get(elementIndex);
    }

    public static void main(String[] args) {
        Q17 dataStructure = new Q17(3);
        dataStructure.addElement(0, 10);
        dataStructure.addElement(1, 20);
        dataStructure.addElement(2, 30);
        System.out.println("Element at index 0 : "+dataStructure.getElement(0, 0));
        System.out.println("Element at index 1 : "+dataStructure.getElement(1, 0));
        System.out.println("Element at index 2 : "+dataStructure.getElement(2, 0));
        try {
            System.out.println("Element at index 3 : "+dataStructure.getElement(3, 0));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred : "+e.getMessage());
        } catch(IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * Element at index 0 : 10
 * Element at index 1 : 20
 * Element at index 2 : 30
 * IndexOutOfBoundsException occurred : Index is out of bounds.
 */