package package6;

public class String_use {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = new String(" World");
        int a = s1.length();
        String s3 = s1.concat(s2);//把s2接到s1后面
        System.out.println(s3);
        System.out.println(a);
        //String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。
        String ss;
        double b = 1.0;
        ss = String.format("Hello %s %d %f!", s1, a, b);
        System.out.println(ss);
    }
}
