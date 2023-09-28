package Letcode;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("N Sayısını giriniz : ");
        n=sc.nextInt();
        double result=0.0;
        for(double i=1; i<=n; i++){
            result+=1/i;
            //1. Döngü i=1 result=0 + (1/1)=1;
            //2. Döngü i=2 result=1 + (1/2)=1,5;
        }
        System.out.println("Harmonik seri : "+result);


    }
}
