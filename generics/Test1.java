package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("sdadadsa"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("sadasdasds");
//        list.add(new Car());

        for (Object o: list) {
            System.out.println(o + " dlina " + ((String)o).length());

        }

    }
}

class Car{};
