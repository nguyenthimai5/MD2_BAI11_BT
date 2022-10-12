package BT4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Kiemtraday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra ");
        String strings = scanner.nextLine();
        String[] string = strings.trim().split("");
        Boolean check =false ;
        for (int i = 0; i < string.length/ 2; i++) {
            if (string[i].toUpperCase().equals(string[(string.length-1)-i].toUpperCase())) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.printf("%s khong phai la mot day Palindrome",strings);
        }else {
            System.out.printf("%s  la mot day Palindrome",strings);
        }
    }
}