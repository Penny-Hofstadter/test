package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        //List list = new java.util.ArrayList();
        List <String> list = new ArrayList<>();
        Collection <String> collection = new ArrayList<>();
      //  collection = list;
     //   Iterable <String> iterable = list;
       // Iterable <String> iterable1 = collection;
        collection.add("collection");
        list.add("list");
        System.out.println(collection);
        System.out.println(list);
    }

}
