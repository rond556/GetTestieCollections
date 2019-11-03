package gettestie.src.main.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;

public class ClassFactoryTest {

    @Test
    public void hashSetCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        HashSet<Person> partyHashSet = ClassFactory.hashSetCreator(party);

        Assert.assertTrue(partyHashSet.contains(edgar));
    }

    @Test
    public void hashSetCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan, celes, cyan, sabin};
        HashSet<Person> partyHashSet = ClassFactory.hashSetCreator(party);

        Assert.assertEquals(5, partyHashSet.size());
    }

    @Test
    public void hashSetCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        HashSet<Person> partyHashSet = ClassFactory.hashSetCreator(party);
        partyHashSet.clear();

        Assert.assertTrue(partyHashSet.isEmpty());
    }

    @Test
    public void arrayListCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        ArrayList<Person> actualPartyReversed = ClassFactory.arrayListCreator(party);
        Collections.reverse(actualPartyReversed);
        Person[] reversedParty = {cyan, celes, shadow, edgar, sabin};
        ArrayList<Person> expectedPartyReverse = ClassFactory.arrayListCreator(reversedParty);


        Assert.assertEquals(expectedPartyReverse, actualPartyReversed);
    }

    @Test
    public void arrayListCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        ArrayList<Person> actualParty = ClassFactory.arrayListCreator(party);
        actualParty.add(cyan);
        actualParty.add(sabin);
        Person[] expectedParty = {sabin, edgar, shadow, celes, cyan, cyan, sabin};
        ArrayList<Person> expectedPartyAdditions = ClassFactory.arrayListCreator(expectedParty);

        Assert.assertEquals(expectedPartyAdditions, actualParty);
    }

    @Test
    public void arrayListCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        ArrayList<Person> actualParty = ClassFactory.arrayListCreator(party);
        actualParty.add(cyan);
        actualParty.add(sabin);

        Assert.assertEquals(7, actualParty.size());
    }

    @Test
    public void hashMapCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        HashMap<Person, String> actualParty = ClassFactory.hashMapCreator();
        actualParty.put(sabin, "Sabin");
        actualParty.put(cyan, "Cyan");
        actualParty.put(edgar, "Edgar");
        actualParty.put(celes, "Celes");
        actualParty.put(shadow, "Shadow");

        Assert.assertEquals(5, actualParty.size());
    }

    @Test
    public void hashMapCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        HashMap<Person, String> actualParty = ClassFactory.hashMapCreator();
        actualParty.put(sabin, "Sabin");
        actualParty.put(cyan, "Cyan");
        actualParty.put(edgar, "Edgar");
        actualParty.put(celes, "Celes");
        actualParty.put(shadow, "Shadow");
        String actualCeles = actualParty.get(celes);

        Assert.assertEquals("Celes", actualCeles);
    }

    @Test
    public void hashMapCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        HashMap<Person, String> actualParty = ClassFactory.hashMapCreator();
        actualParty.put(sabin, "Sabin");
        actualParty.put(cyan, "Cyan");
        actualParty.put(edgar, "Edgar");
        actualParty.put(celes, "Celes");
        actualParty.put(shadow, "Shadow");
        Assert.assertTrue(actualParty.containsValue("Celes"));
    }

    @Test
    public void queueCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Queue<Person> actualParty = ClassFactory.queueCreator(party);
        Assert.assertEquals(sabin, actualParty.peek());
    }

    @Test
    public void queueCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Queue<Person> actualParty = ClassFactory.queueCreator(party);
        actualParty.remove();
        Assert.assertEquals(edgar, actualParty.peek());
    }

    @Test
    public void queueCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {};
        Queue<Person> actualParty = ClassFactory.queueCreator(party);
        Assert.assertNull(actualParty.poll());
    }

    @Test
    public void dequeCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Deque<Person> actualParty = ClassFactory.dequeCreator(party);
        actualParty.addFirst(edgar);
        actualParty.addLast(cyan);
        Assert.assertEquals(edgar, actualParty.getFirst());
        Assert.assertEquals(cyan, actualParty.getLast());
    }

    @Test
    public void dequeCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Deque<Person> actualParty = ClassFactory.dequeCreator(party);
        actualParty.pop();
        Assert.assertEquals(edgar, actualParty.getFirst());
    }

    @Test
    public void dequeCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Deque<Person> actualParty = ClassFactory.dequeCreator(party);
        actualParty.removeFirstOccurrence(shadow);
        actualParty.push(shadow);
        Assert.assertEquals(shadow, actualParty.peek());
    }

    @Test
    public void vectorCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Vector<Person> actualPartyReversed = ClassFactory.vectorCreator(party);
        Collections.reverse(actualPartyReversed);
        Person[] reversedParty = {cyan, celes, shadow, edgar, sabin};
        Vector<Person> expectedPartyReverse = ClassFactory.vectorCreator(reversedParty);


        Assert.assertEquals(expectedPartyReverse, actualPartyReversed);
    }

    @Test
    public void vectorCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Vector<Person> actualParty = ClassFactory.vectorCreator(party);
        actualParty.add(cyan);
        actualParty.add(sabin);
        Person[] expectedParty = {sabin, edgar, shadow, celes, cyan, cyan, sabin};
        Vector<Person> expectedPartyAdditions = ClassFactory.vectorCreator(expectedParty);

        Assert.assertEquals(expectedPartyAdditions, actualParty);
    }

    @Test
    public void vectorCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Person[] party = {sabin, edgar, shadow, celes, cyan};
        Vector<Person> actualParty = ClassFactory.vectorCreator(party);
        actualParty.add(cyan);
        actualParty.add(sabin);

        Assert.assertEquals(7, actualParty.size());
    }

    @Test
    public void treeMapCreatorTest1() {
        TreeMap<Integer, String> actualParty = ClassFactory.treeMapCreator();
        actualParty.put(1985, "Sabin");
        actualParty.put(1984, "Edgar");
        actualParty.put(1983, "Shadow");
        actualParty.put(1988, "Celes");
        actualParty.put(1966, "Cyan");

        Assert.assertEquals(5, actualParty.size());
    }

    @Test
    public void treeMapCreatorTest2() {
        TreeMap<Integer, String> actualParty = ClassFactory.treeMapCreator();
        actualParty.put(1985, "Sabin");
        actualParty.put(1984, "Edgar");
        actualParty.put(1983, "Shadow");
        actualParty.put(1988, "Celes");
        actualParty.put(1966, "Cyan");

        NavigableMap<Integer, String> actualNavigable = actualParty.descendingMap();

        NavigableMap<Integer, String> expectedNavigable = ClassFactory.treeMapCreator();
        expectedNavigable.put(1966, "Cyan");
        expectedNavigable.put(1988, "Celes");
        expectedNavigable.put(1983, "Shadow");
        expectedNavigable.put(1984, "Edgar");
        expectedNavigable.put(1985, "Sabin");

        Assert.assertEquals(expectedNavigable, actualNavigable);
    }

    @Test
    public void treeMapCreatorTest3() {
        TreeMap<Integer, String> actualParty = ClassFactory.treeMapCreator();
        actualParty.put(1985, "Sabin");
        actualParty.put(1984, "Edgar");
        actualParty.put(1983, "Shadow");
        actualParty.put(1988, "Celes");
        actualParty.put(1966, "Cyan");

        Assert.assertEquals("Shadow", actualParty.get(1983));
    }

    @Test
    public void stackCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Stack actualParty = ClassFactory.stackCreator();
        Assert.assertTrue(actualParty.isEmpty());
    }

    @Test
    public void stackCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Stack actualParty = ClassFactory.stackCreator();
        actualParty.push(shadow);
        Assert.assertEquals(shadow, actualParty.peek());
    }

    @Test
    public void stackCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Stack actualParty = ClassFactory.stackCreator();
        actualParty.push(shadow);
        actualParty.push(celes);
        actualParty.pop();
        Assert.assertEquals(shadow, actualParty.peek());
    }

    @Test
    public void stackCreatorTest4() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        Stack actualParty = ClassFactory.stackCreator();
        actualParty.push(shadow);
        actualParty.push(celes);
        Assert.assertEquals(1, actualParty.search(celes));
    }

    @Test
    public void treeSetCreatorTest1() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);

        TreeSet<Integer> partyTreeSet = ClassFactory.treeSetCreator();
        partyTreeSet.add(sabin.getYearOfBirth());
        partyTreeSet.clear();

        Assert.assertTrue(partyTreeSet.isEmpty());
    }

    @Test
    public void treeSetCreatorTest2() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        TreeSet<Integer> partyTreeSet = ClassFactory.treeSetCreator();
        partyTreeSet.add(sabin.getYearOfBirth());
        Assert.assertTrue(partyTreeSet.contains(sabin.getYearOfBirth()));
    }

    @Test
    public void treeSetCreatorTest3() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        TreeSet<Integer> partyTreeSet = ClassFactory.treeSetCreator();
        partyTreeSet.add(sabin.getYearOfBirth());
        partyTreeSet.add(edgar.getYearOfBirth());
        partyTreeSet.add(celes.getYearOfBirth());
        partyTreeSet.add(cyan.getYearOfBirth());
        partyTreeSet.add(shadow.getYearOfBirth());

        Assert.assertEquals( cyan.getYearOfBirth(),(int)partyTreeSet.first());
    }
    @Test
    public void treeSetCreatorTest4() {
        Person sabin = new Person("Sabin", 1985, null);
        Person edgar = new Person("Edgar", 1984, null);
        Person shadow = new Person("Shadow", 1983, null);
        Person celes = new Person("Celes", 1988, null);
        Person cyan = new Person("Cyan", 1966, null);
        TreeSet<Integer> partyTreeSet = ClassFactory.treeSetCreator();
        partyTreeSet.add(sabin.getYearOfBirth());
        partyTreeSet.add(edgar.getYearOfBirth());
        partyTreeSet.add(celes.getYearOfBirth());
        partyTreeSet.add(cyan.getYearOfBirth());
        partyTreeSet.add(shadow.getYearOfBirth());
        NavigableSet<Integer> actualDescending = partyTreeSet.descendingSet();

        NavigableSet<Integer> expectedDescending = new TreeSet<Integer>();
        expectedDescending.add(celes.getYearOfBirth());
        expectedDescending.add(sabin.getYearOfBirth());
        expectedDescending.add(edgar.getYearOfBirth());
        expectedDescending.add(shadow.getYearOfBirth());
        expectedDescending.add(cyan.getYearOfBirth());

        Assert.assertEquals(expectedDescending,actualDescending);
    }
}


