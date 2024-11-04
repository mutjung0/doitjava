package ch13_1_innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            // 외부 클래스 인스턴스 변수는 메모리가 할당되지 않아서 사용불가
            //System.out.println("OutClass num="+num+" 외부클래스 인스턴스 변수");
            System.out.println("OutClass sNum="+sNum+" 외부클래스 정적 변수");
            System.out.println("InClass inNum="+inNum+" 내부클래스 인스턴스 변수");
            System.out.println("InClass sInNum="+sInNum+" 내부클래스 정적 변수");
        }

        static void sTest() {
            // 외부 클래스 인스턴스 변수는 메모리가 할당되지 않아서 사용불가
            //System.out.println("OutClass num="+num+" 외부클래스 인스턴스 변수");
            System.out.println("OutClass sNum="+sNum+" 외부클래스 정적 변수");
            //System.out.println("InClass inNum="+inNum+" 내부클래스 인스턴스 변수");
            System.out.println("InClass sInNum="+sInNum+" 내부클래스 정적 변수");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        // 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println("\n정적 내부 클래스 정적 메서드 호출");
        OutClass.InStaticClass.sTest();

        /*
        정적 내부 클래스 일반 메서드 호출
        OutClass sNum=20 외부클래스 정적 변수
        InClass inNum=100 내부클래스 인스턴스 변수
        InClass sInNum=200 내부클래스 정적 변수

        정적 내부 클래스 정적 메서드 호출
        OutClass sNum=20 외부클래스 정적 변수
        InClass sInNum=200 내부클래스 정적 변수
         */
    }
}
