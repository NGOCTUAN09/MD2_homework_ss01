package homworkSession01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn:");
        double r = sc.nextDouble();
        double chuvi = 2 * 3.14 * r;
        System.out.println("Chu vi của đường tròn là :" + chuvi);
        double dientich = 3.14 * r * r;
        System.out.println("Diện tích của đường tròn là: " + dientich);
    }
}
