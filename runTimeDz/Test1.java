package runTimeDz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hasan");
        list.add("Yerenchiyev");
        list.add("aswdfpq");
        list.add("jjssaj");

//        1) Выберите слова из списка, длина которых превышает 7 символов.
//        list.stream().filter(e->e.length() >= 7).forEach(e-> System.out.println(e));

//        2) Преобразуйте все слова в списке в верхний регистр.
//        list.stream().map(e->e.toUpperCase()).forEach(e-> System.out.println(e));


//        3)Создайте новый список, содержащий квадраты чисел из исходного списка.
        List <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
//        System.out.println(squaredNumbers);
//        4)Преобразуйте список строк в список их длин.
//        list.stream().map(e->e.length()).forEach(e-> System.out.println(e));

//        5)Определите, содержит ли список хотя бы одно отрицательное число.
        List<Integer>words = new ArrayList<>();
        words.add(1);
        words.add(-2);
        words.add(3);
        words.add(4);
        words.add(5);
//        words.stream().filter(e->e<0).forEach(e-> System.out.println(e));

//        6) Отсортируйте список строк по количеству символов в порядке возрастания, а затем переведите их все в нижний регистр.
        List<String> list2 = new ArrayList<>();
        list2.add("HASAN");
        list2.add("AMIRJAN");
        list2.add("ZAUR");
        list2.add("JASLAN");
        list2.add("YAN");
        list2.stream().sorted(Comparator.comparing(e->e.length())).map(e->e.toUpperCase()).forEach(e-> System.out.println(e));

//        7)Напишите анонимную функцию, которая проверяет, есть ли в списке простое число.
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        Predicate<Integer> isPrime = n -> {
            if (n <= 1){
                return false; // Числа меньше или равные 1 не являются простыми
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                System.out.println( "("+n+")"+"Math.sqrt(n) " + Math.sqrt(n));
                if (n % i == 0){
                    System.out.println( "("+n+")" + "<-----" + "n % i " + n % i);
                    return false; // Если число делится без остатка на i, то оно не простое
                }
            }
            return true; // Если делителей нет, то число простое
        };

        // Фильтруем и выводим все простые числа
        List<Integer> primeNumbers = numbers2.stream()
                .filter(isPrime)
                .collect(Collectors.toList());

        System.out.println("Простые числа в списке: " + primeNumbers);

    }



    }
