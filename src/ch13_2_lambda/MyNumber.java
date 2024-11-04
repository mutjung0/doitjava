package ch13_2_lambda;
/*
13-2 람다식
함수형 인터페이스 선언하기 463

람다식은 이름이 없는 익명함수로 구현하기 때문에 인터페이스에 메서드가 여러개 있다면
어떤 메서드를 구현한 것인지 모호해짐.
따라서 람다식은 오직 하나의 메서드만 선언한 인터페이스를 구현할 수 있음.

@FunctionalInterface 애노테이션
함수형 인터페이스라는 의미로, 메서드를 하나 이상 선언하면 오류발생.
 */
@FunctionalInterface
public interface MyNumber {
    int getMax(int n1, int n2);
}
