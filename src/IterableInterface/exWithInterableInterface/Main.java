package IterableInterface.exWithInterableInterface;

import java.util.Iterator;

public class Main {

    public static void main(String args[]){
        GenericList<String> lst = new GenericList<>();
        lst.add("a");
        lst.add("b");

        for (Object l:lst){
            System.out.println(l);
        }

    }

}
