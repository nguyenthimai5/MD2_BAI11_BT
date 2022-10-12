package BT6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student  {
    private String studentName;
    private Boolean sex;
    private Date myDate;

    public Student() {
    }

    public Student(String studentName, Boolean sex, Date myDate) {
        this.studentName = studentName;
        this.sex = sex;
        this.myDate = myDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
    public  void inputData(Scanner scanner) throws ParseException {
        System.out.println("Nhap ten");
        this.studentName=scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        this.sex=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Student BirthDate (dd/MM/yyyy): ");
        String birthDateStr = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = simpleDateFormat.parse(birthDateStr);
        this.myDate = birthDate;
    }
    public void displayData(){
        System.out.printf("Ten:%30s Gioi Tinh:%b Ngay/Thang/Nam sinh:%d",this.studentName,this.myDate);

    }

}