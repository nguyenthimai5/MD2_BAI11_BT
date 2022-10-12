package BT3;

import java.util.Scanner;
import java.util.Stack;

public class chuyendoithapphansangnhiphan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so ma ban muon chuyen tu thap phan-->nhi phan:");
        int num=Integer.parseInt(scanner.nextLine());
        int numSava=num;
        Stack<Integer> myStack=new Stack<>();
        while (num/2!=0){
            int soDu=num%2;
            myStack.push(soDu);
            num=num/2;
        }
        myStack.push(num);
        System.out.printf("So %d sau khi chuyen sang nhi phan la: ",numSava);
        while (!myStack.isEmpty()){
            System.out.printf("%d",myStack.pop());
        }
    }
}
