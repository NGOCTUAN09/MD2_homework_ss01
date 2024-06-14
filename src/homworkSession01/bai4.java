package homworkSession01;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn toán:");
        float toan = sc.nextFloat();
        System.out.println("Nhập điểm môn văn:");
        float van = sc.nextFloat();
        System.out.println("Nhập điểm môn tiếng anh:");
        float anh = sc.nextFloat();
        float đtb = (toan + van + anh) / 3;
        System.out.println("Điểm tổng trung bình " + đtb);
    }
}
