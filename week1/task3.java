package week1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("������� ����� ����� ���������:");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.println("����� ��������� = " + 5 * (3 + Math.sqrt(5)) / 12 * Math.pow(a, 3));
    }

}
