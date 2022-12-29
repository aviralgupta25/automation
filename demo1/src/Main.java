import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public  static void fun(){
        System.out.println(" Hello , I am in fun");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "Aviral";
        System.out.println(s.length());
        int[] marks = new int[2];
        marks[0] =100;
        marks[1]= 12;
        System.out.println(marks[1]);
        Arrays.sort(marks);
        System.out.println(marks[1]);
        int[] m = {10,11,12};
        int[][] finalmarks = {{21,11},{34,45}};
        int temp =Math.min(1,5);
        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name");
        String s1 = sc.nextLine();
        System.out.println(s1);
        fun();



    }
}