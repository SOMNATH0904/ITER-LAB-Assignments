/**
 * Ques 7 : Write a java code that comprises of a class Address, having member variable plot no, at, post and required parameterised constructor. Create a Tree map having key as name of a person and value as address. Insert required key and value in the created tree map and use an iterator to display it.
 */

import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String getPlotNo() {
        return plotNo;
    }
    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }
    public String getAt() {
        return at;
    }
    public void setAt(String at) {
        this.at = at;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    @Override
    public String toString() {
        return "Address [plotNo=" + plotNo + ", at=" + at + ", post=" + post + "]";
    }
}
public class Q07 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        addressMap.put("Virat Kohli", new Address("1A", "Banglore", "CityA"));
        addressMap.put("MS Dhoni", new Address("2B", "Ranchi", "CityB"));
        addressMap.put("Shubman Gill", new Address("3C", "Mumbai", "CityC"));

        System.out.println("Addresses in the TreeMap:");
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name + ", Address: " + addressMap.get(name));
        }
    }
}

/**
 * OUTPUT :
 *
 * Addresses in the TreeMap:
 * Name: MS Dhoni, Address: Address [plotNo=2B, at=Ranchi, post=CityB]
 * Name: Shubman Gill, Address: Address [plotNo=3C, at=Mumbai, post=CityC]
 * Name: Virat Kohli, Address: Address [plotNo=1A, at=Banglore, post=CityA]
 */