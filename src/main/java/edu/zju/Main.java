package edu.zju;

public class Main {
    public static void main(String[] args) {

    }

    public static void testCase1() {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Shape t1 = new Triangle();

        c1.length();
        r1.length();
        t1.area();

        // result from makeZeroOneContainerCFABuilder in IBM WALA 1.5.3
//        Node: < Application, Ledu/zju/Main, testCase1([Ljava/lang/String;)V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, area()D > Context: Everywhere

        // result from makeRTABuilder in IBM WALA 1.5.3
//        Node: < Application, Ledu/zju/Main, testCase1()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, <init>()V > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, length()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Circle, area()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Rectangle, area()D > Context: Everywhere
//                --> Node: < Application, Ledu/zju/Triangle, area()D > Context: Everywhere

        // result from https://github.com/gousiosg/java-callgraph,
        // the version under test is da81eeb6864318cbdc67c6fec5e850bf942293af
//        M:edu.zju.Main:testCase1() (O)edu.zju.Circle:<init>()
//        M:edu.zju.Main:testCase1() (O)edu.zju.Rectangle:<init>()
//        M:edu.zju.Main:testCase1() (O)edu.zju.Triangle:<init>()
//        M:edu.zju.Main:testCase1() (M)edu.zju.Circle:length()
//        M:edu.zju.Main:testCase1() (M)edu.zju.Rectangle:length()
//        M:edu.zju.Main:testCase1() (I)edu.zju.Shape:area()


        // result from Doxygen
//        <map id="edu.zju.Main.testCase1" name="edu.zju.Main.testCase1">
//        <area shape="rect" id="node2" href="..." title="edu.zju.Circle.length" alt="" coords="..."/>
//        <area shape="rect" id="node3" href="..." title="edu.zju.Rectangle.length" alt="" coords="..."/>
//        <area shape="rect" id="node4" href="..." title="edu.zju.Shape.area" alt="" coords="..."/>
//        </map>



    }
}
