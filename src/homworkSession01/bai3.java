package homworkSession01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 cạnh của diện tích là :");
        int n = Integer.parseInt(sc.nextLine());
        int S = n * n;
        System.out.println("Diện tích của hình vuông là :" + S);
        int P = 4 * n;
        System.out.println("Chu vi của hình vuông là:" + P);
    }
}
