package Student;

import Student.Student;

public class StudentInfo extends Student {
    String city;
    String phone;
    StudentInfo(){
    }
    StudentInfo(String n,int r,String c, String p){
        super(n,r);
        this.city = c;
        this.phone = p;
    }
    void display(){
        System.out.println("My Name Is => "+this.name);
        System.out.println("Roll => "+this.rollNumber);
        System.out.println("City Name Is => "+this.city);
        System.out.println("Phone Number Is => "+this.phone);

    }
}
