package week1;

public class task2 {
    public static void main(String[] args) {
        //Минимальный целый тип данных. Объём памяти 2^8 = 256. «10000000» - код минимального числа в byte,
        //«0111 1111» - код максимального числа в byte. Диапазон значений считается так:  от -2^7 до 2^7-1.
        System.out.println ("Минимальное значение byte = " + Byte.MIN_VALUE + "\n"
                + "Максимальное значение byte = " + Byte.MAX_VALUE );
        //Объём памяти 2^16. От -2^15 до 2^15-1.
        System.out.println("Минимальное значение short = " + Short.MIN_VALUE + "\n"
                + "Максимальное значение short = " + Short.MAX_VALUE);
        //Объем памяти 2^32. От -2^31 до 2^31–1.
        System.out.println("Минимальное значение int = " + Integer.MIN_VALUE + "\n"
                + "Максимальное значение int = " + Integer.MAX_VALUE);
        //Самый большой целый тип. Объём памяти 2^64. От -2^63 до 2^63 – 1.
        System.out.println("Минимальное значение long = " + Long.MIN_VALUE + "\n"
                + "Максимальное значение long = " + Long.MAX_VALUE);
        //Один из двух типов с плавующей точкой. Объём памяти 2^32. От -2^31 до 2^31–1.
        System.out.println("Минимальное значение float =  " + Float.MIN_VALUE + "\n"
                + "Максимальное значение float = " + Float.MAX_VALUE);
        //Объём памяти 2^64. От -2^63 до 2^63 – 1.
        System.out.println("Минимальное значение double = " + Double.MIN_VALUE +  "\n"
                + "Максимальное значение double = " + Double.MAX_VALUE);
    }
}
