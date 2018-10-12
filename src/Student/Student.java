package Student;

public class Student {
    String name;
    int rollNumber;

    //Default Constructor
    Student(){
        this.name = "Default Constructor";
        this.rollNumber = 1;
    }

    //Parameter Constructor
    Student(String s, int r){
        this.name = s;
        this.rollNumber = r;
    }

    //Copy Constructor
    Student(Student st){
        this.name = st.name;
        this.rollNumber = st.rollNumber;
    }

    void init_members(String n,int r){
        this.name = n;
        this.rollNumber = r;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}
