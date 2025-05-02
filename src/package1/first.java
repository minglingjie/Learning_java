package package1;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        animals aa = new animals();

        System.out.println(aa.age());
        System.out.println(aa.length());


    }
}

class animals{
    private static  int a = 1;
    int age(){
        System.out.println("请输入年龄");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        return a;
    }
    int length(){
        return a;
    }


}
