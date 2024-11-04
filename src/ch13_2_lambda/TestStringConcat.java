package ch13_2_lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcat concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2); // Hello,World

        // 람다식으로 인터페이스 구현하기
        StringConcat concat2 = (s, v) -> System.out.println(s+","+v);
        concat2.makeString(s1, s2);
    }
}
