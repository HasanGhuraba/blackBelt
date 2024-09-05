package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("kak dela ?");
        list.add("ok");
        list.add("Poka");

        List<Integer> list2 =  list.stream().map(element -> element.length())
                .collect(Collectors.toList());

//        System.out.println(list2);

        int [] arrays = {5,9,3,8,1};
        arrays =  Arrays.stream(arrays).map(element -> {
            if (element % 3 == 0) {
            element = element / 3;
            }
            return element;
        }).toArray();

//        System.out.println(Arrays.toString(arrays));

        Set<String> set  = new TreeSet<>();
        set.add("Privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("Poka");
        System.out.println(set);

        Set <Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List <Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
