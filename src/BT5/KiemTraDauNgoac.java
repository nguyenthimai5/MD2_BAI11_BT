package BT5;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Stack<String> myStack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String strings=scanner.nextLine();
        String[] strings1=strings.split("");
        myStack.push(String.valueOf(strings1));
        int demNgoacPhai = 0;
        int demNgoacTrai=0;
        for (int i = 0; i < strings1.length; i++) {
            if (strings1[i].equals(")")){
                demNgoacPhai++;
            }else if (strings1[i].equals("(")){
                demNgoacTrai++;
            }else {
                continue;
            }
        }
        if (demNgoacPhai==demNgoacTrai){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
