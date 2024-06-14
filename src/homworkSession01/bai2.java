package homworkSession01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số usd cần đổi:");
        final int usd = Integer.parseInt(sc.nextLine());
        final int exchangerates = 25;
        final int vnđ = usd * exchangerates;
        System.out.println("số tiền in ra là:" + vnđ);
    }
}
