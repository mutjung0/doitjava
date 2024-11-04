package ch13_3_stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        TravelCustomer c1 = new TravelCustomer("Z", 40, 100);
        TravelCustomer c2 = new TravelCustomer("B", 20, 100);
        TravelCustomer c3 = new TravelCustomer("A", 13, 50);

        List<TravelCustomer> list = new ArrayList<TravelCustomer>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println("추가된 순서대로 출력");
        list.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        //list.stream().map(TravelCustomer::getName).forEach(System.out::println);

        int total = list.stream().mapToInt(c -> c.getPrice()).sum();
        // list.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("price sum()="+total); // 250

        System.out.println("20살 이상");
        list.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s -> System.out.println(s));


    }
}
