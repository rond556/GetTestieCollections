package gettestie.src.main.java.rocks.zipcode;

import java.util.*;

public class ClassFactory {
    private String name;

    public static HashSet<Person> hashSetCreator(Person[] people){
        return new HashSet<>(Arrays.asList(people));
    }

    public static ArrayList<Person> arrayListCreator(Person[] people){
        return new ArrayList<>(Arrays.asList(people));
    }

    public static HashMap<Person,String> hashMapCreator(){
        HashMap<Person, String> personHashMap = new HashMap();
        return personHashMap;
    }

    public static Queue<Person> queueCreator(Person[] people){
        return new LinkedList<>(Arrays.asList(people));
    }

    public static ArrayDeque<Person> dequeCreator(Person[] people){
        return new ArrayDeque<>(Arrays.asList(people));
    }

    public static Vector<Person> vectorCreator(Person[] people){
        return new Vector<>(Arrays.asList(people));
    }

    public static TreeMap<Integer,String> treeMapCreator(){
        TreeMap<Integer, String> personTreeMap = new TreeMap();
        return personTreeMap;
    }

    public static Stack stackCreator(){
        return new Stack();
    }

    public static TreeSet<Integer> treeSetCreator(){
        return new TreeSet<>(Collections.emptyList());
    }


}
