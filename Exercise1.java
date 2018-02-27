package Kap16Exercise1;

import java.util.LinkedList;
import java.util.List;

public class Exercise1
{

    public static void main(String[] args)
    {
    /*
    Write a method called set that accepts an index and a value
    and sets the list’s element at that index to have the given value.
    You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).
    */
    LinkedIntList linkedIntList = new LinkedIntList();

    linkedIntList.add(1);
    linkedIntList.add(2);
    linkedIntList.add(3);
    linkedIntList.add(4);
    linkedIntList.add(5);

    // Metoden kan ses i klassen LinkedIntList
    linkedIntList.set(0, 10);
    linkedIntList.set(4, 7);

    System.out.println(linkedIntList);
    }
}
