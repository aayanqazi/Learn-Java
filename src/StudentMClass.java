public class StudentMClass{
    public static void main(String args[]){
        Student st = new Student();
        st.display();

        Student st1 = new Student("Parameterized Constructor",2);
        st1.display();

        Student st2 = new Student(st1);
        st2.display();

        Student InheritStudent = new StudentInfo("Arsalan",14,"Karachi","03232036484");
        InheritStudent.display();
    }
}
