package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
//        int index1 = Collections.binarySearch(arrayList,100);
//        System.out.println(index1);

//        Eployee emp1 = new Eployee(100,"Zaur",12345);
//        Eployee emp2 = new Eployee(15,"Ivan",6542);
//        Eployee emp3 = new Eployee(123,"Petr",8542);
//        Eployee emp4 = new Eployee(15,"Mariya",5678);
//        Eployee emp5 = new Eployee(182,"Kolya",125);
//        Eployee emp6 = new Eployee(15,"Sasha",9874);
//        Eployee emp7 = new Eployee(250,"Elena",1579);
//        List <Eployee> eployeeList = new ArrayList<>();
//        eployeeList.add(emp1);
//        eployeeList.add(emp2);
//        eployeeList.add(emp3);
//        eployeeList.add(emp4);
//        eployeeList.add(emp5);
//        eployeeList.add(emp6);
//        eployeeList.add(emp7);
//        System.out.println(eployeeList);
//
//        Collections.sort(eployeeList);
//
//        System.out.println(eployeeList);
//
//        int index2 = Collections.binarySearch(eployeeList,new Eployee(182,"Kolya",125));
//        System.out.println(index2);

//        int [] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);


    }
}


class Eployee implements Comparable<Eployee>{
    int id;
    String name;
    int salary;

    public Eployee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Eployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Eployee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
