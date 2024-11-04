package ch13_3_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
/*
배열에 여러 문자열이 있을때 그중 길이가 가장 긴 문자열을 찾는 예제
두번쨰 매개변수에 람다식을 직접 쓰는 경우와
BinaryOperator 인터페이스를 구현한 클래스를 사용하는 경우
 */
class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {

        // getBytes
        String a = "a";
        System.out.println(a.getBytes());
        System.out.println(Arrays.toString(a.getBytes())); //[97]
        System.out.println(a.getBytes().length); // 1

        String b = "가";
        System.out.println(Arrays.toString(b.getBytes())); // [-22, -80, -128]
        System.out.println(b.getBytes().length); // 3

        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};

        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
