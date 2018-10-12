public class Student {
    String name;
    int rollNumber;
    void init_members(String n,int r){
        this.name = n;
        this.rollNumber = r;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}
