package ch13_2_lambda;
/*
13-2 람다식 > 람다식 구현과 호출 463

(매개변수) -> {실행문;}

컴파일러처럼 함수를 사용할수 있도록 만든것

int add(int x, int y) {return x+y;}
(int x, int y) -> {return x+y;}
 */
public class TestMyNumber {

    public static void main(String[] args) {
        //MyNumber max1 = (x, y) -> {(x >= y) ? x : y};

        MyNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 20)); // 20
    }
}
