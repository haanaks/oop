package week1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите длину ребра икосаэдра:");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.println("Объём икосаэдра = " + 5 * (3 + Math.sqrt(5)) / 12 * Math.pow(a, 3));
    }

}
