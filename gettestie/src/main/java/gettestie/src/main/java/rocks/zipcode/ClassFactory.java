package gettestie.src.main.java.rocks.zipcode;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ClassFactory {
    private String name;

    public HashSet<Person> hashSetCreator(Person[] people){
        return new HashSet<>(Arrays.asList(people));
    }

    public ArrayList<Person> arrayListCreator(Person[] people){
        return new ArrayList<Person>(Arrays.asList(people));
    }

    public HashMap<Person,String> hashMapCreator(Person person, String name){
        HashMap<Person, String> personHashMap = new HashMap;
        personHashMap.put(person,name);
        return personHashMap;
    }

    public Queue<Person> queueCreator(Person[] people){
        return new LinkedList<>(Arrays.asList(people));
    }

    public ArrayDeque<Person> dequeCreator(Person[] people){
        return new ArrayDeque<>(Arrays.asList(people));
    }
}
