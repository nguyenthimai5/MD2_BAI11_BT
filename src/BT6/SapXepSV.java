package BT6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SapXepSV {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        Queue<Student> students=new ArrayDeque<>();
       List<Student> man=new ArrayList<>();
       List<Student> women=new ArrayList<>();
        Student student=new Student();
        System.out.println("Ban muon nhap bao nhieu hoc sinh: ");
        int number=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.printf("Nhap thong tin cho sinh vien thu %d :",i+1);
            student.inputData(scanner);
            students.offer(student);
        }
        for (Student studentList:students) {
            if (studentList.getSex().equals(true)){
                man.add(studentList);
            }
            if (studentList.getSex().equals(false)){
                women.add(studentList);
            }
        }
        System.out.println("Danh sach cac ban nam:");
        Collections.sort(man);
        for (Student mans :man) {
            mans.displayData();
        }
        System.out.println("Danh sach cac ban nu");
        Collections.sort(women);
        for (Student wommen:women) {
            wommen.displayData();
        }
    }

}
