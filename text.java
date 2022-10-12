import java.util.Scanner;   //这是测试类

public class text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String[]b=a.split("\\D");
        SchoolSystem schoolSystem=new SchoolSystem(Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]));
        for (int i = 3; i <b.length ; i++) {
            System.out.print(schoolSystem.addStudent(Integer.parseInt(b[i]))+"   ");

        }
    }
}
