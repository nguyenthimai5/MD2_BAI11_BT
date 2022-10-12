package BT1;

import java.util.Scanner;
import java.util.Stack;

public class Daonguocso {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu phan tu cho myStack:");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            int ptu = Integer.parseInt(scanner.nextLine());
            myStack.add(ptu);
        }
        System.out.println("Cac phan tu trong myStack: ");
        for (Integer daoNguoc : myStack) {
            System.out.print(daoNguoc + "\t");
        }
        System.out.print("\n");
        System.out.println("Cac phan tu sau khi dao nguoc: ");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop() + "\t");
        }
    }
}
