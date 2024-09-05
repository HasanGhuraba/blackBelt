package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//        String s = info1.getValue();

//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);
//        Integer i1 = info2.getValue();
//
//        Info<Double> info21 = new Info<>(3.14);
//        System.out.println(info21);
//        Double d21 = info21.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info2);
//        Bus b1 = info3.getValue();
    }



}

class Info <T extends Number&I1&I2 > {
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

interface I1{

}

interface I2{

}

//

//class Child extends Parent {
//    public void abc (Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}

class Bus {

}