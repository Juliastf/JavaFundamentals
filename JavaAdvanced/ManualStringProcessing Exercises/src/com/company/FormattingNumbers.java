package com.company;

        import java.util.Scanner;

/**
 * Created by nikijul on 07.02.2017.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();

        String binaryString=Integer.toString(a, 2);
        while (binaryString.length()<10){
            binaryString="0"+binaryString;
        }
        if    (binaryString.length()>10){
            binaryString=binaryString.substring(0,10);
        }

        StringBuilder sb=new StringBuilder();
        sb.append("|").append(String.format("%-10X",a));
        sb.append("|").append(binaryString);
        sb.append("|").append(String.format("%10.2f",b));
        sb.append(String.format("|%-10.3f|",c));

        System.out.println(sb);
    }
}
