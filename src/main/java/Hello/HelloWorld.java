package Hello;

import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello,World");
//        StdOut.print("你好");
//
//        System.out.println("请输入三个整数");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        equals(x,y,z);

//        System.out.println("please input two number of double");
//        Scanner scanner = new Scanner(System.in);
//        Double a = scanner.nextDouble();
//        Double b = scanner.nextDouble();
//        zeroToOne(a, b);

//        double t = 9.0;
//        while(Math.abs(t - 9.0 / t) > 0.001){
//            t = (9.0 / t + t) / 2.0;
//        }
//        StdOut.printf("%.5f\n",t);

//        System.out.println("please input a number");
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        String s = "";
//        for(int n = N; n > 0; n /= 2){
//            s = (n % 2) + s;
//        }
//        System.out.println(s);


    }

    public static void equals(int x, int y,  int z){
        if(x == y && y == z){
            System.out.println("equal");
        }else{
            System.out.println("no equal");
        }
    }

    public static void zeroToOne(double a, double b){
        if(a >= 0 && a <= 1 && b >=0 && b <=1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
