package package1;

class student {
    public String s2;
    public void gets2(){
        System.out.println(s2);
    }
}
public class friends {
    public String s1;
    public void gets1(){
        System.out.println(s1);
    }
    public static void main(String[] args) {
            System.out.println("Inside main in friends");
            student student1 = new student();
            student1.s2= "I am a student";
            student1.gets2();
    }
}
