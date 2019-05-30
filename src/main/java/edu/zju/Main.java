package edu.zju;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Shape t1 = new Triangle();

        c1.length();
        r1.length();
        t1.area();
    }

    public static void testCase1() {


        // result for makeZeroOneContainerCFABuilder
//        Node: < Application, Ledu/zju/Main, main([Ljava/lang/String;)V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, area()D > Context: Everywhere
    }
}
