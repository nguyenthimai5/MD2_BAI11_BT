package BT2;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demsolanxuathien {
    public static void main(String[] args) {
        TreeMap<String,Integer> myMap=new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String stringChar=scanner.nextLine();
        String[] strings=stringChar.toLowerCase().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (myMap.containsKey(strings[i])){
                myMap.put(strings[i],myMap.get(strings[i]+1));
            }else {
                myMap.put(strings[i],1);
            }
        }
        for (String key:myMap.keySet()) {
            System.out.printf("%s - %d \n",key,myMap.get(key));
        }
    }
}
