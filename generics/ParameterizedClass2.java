package generics;

import java.util.ArrayList;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair <String,Integer> pair1 = new Pair<>("Privet",20);
        System.out.println("Znacheniya pair: value1 = " + pair1.getFirstValue() +
                " , value2 = " + pair1.getSecondValue());

        Pair <Integer,Double> pair2 = new Pair<>(156,3.14);
        System.out.println("Znacheniya pair: value1 = " + pair2.getFirstValue() +
                " , value2 = " + pair2.getSecondValue());
        OtherPair<String> otherPair = new OtherPair<>("ok","Poka");

        System.out.println("otherPair "+otherPair.getFirstValue() + otherPair.getSecondValue());
    }
}


class Pair <V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair <V>{
    private V value1;
    private V value2;

    public  V abc (V val1){
        return val1;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}