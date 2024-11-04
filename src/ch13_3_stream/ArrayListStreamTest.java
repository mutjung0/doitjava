package ch13_3_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("c");
        sList.add("z");
        sList.add("a");

        Stream<String> stream = sList.stream(); // 스트림 생성
        stream.forEach(s->System.out.print(s + " ")); // 배열의 요소를 하나씩 출력

        // 사용한 스트림은 재사용 불가
        sList.forEach(s->System.out.print(s + " ")); // 동일한 스트림은 됨.
        sList.forEach(s->System.out.print(s + " "));
        //stream.sorted().forEach(s -> System.out.print(s + " "));
        // 스트림이 이미 연결되거나 사용되었습니다 : 인텔리제이
        //IllegalStateException: stream has already been operated upon or closed : 이클립스
        // 스트림 새로 생성(정렬)
        sList.stream().sorted().forEach(s->System.out.print(s + " "));

        // reduce
        // 모든 배열 요소의 합
        int[] arr = {1,2,3,4,5};
        int result = Arrays.stream(arr).reduce(0, (a,b) -> a + b);
        //int result = Arrays.stream(arr).reduce(0, Integer::sum); // 람다를 메서드 참조로 바꿀 수 있음
        System.out.println(result); // 15
    }

}
