package package3;

public class some_kinds_of_class {
    private int instancevar;
    //成员变量
    private static int staticvar;
    //静态变量

    public void method(int paramVar) {//paramVar为参数变量
        int localvar = 10;
        //局部变量

        instancevar = localvar;
        staticvar = paramVar;

        System.out.println("成员变量 = " + instancevar);
        System.out.println("静态变量 = " + staticvar);
        System.out.println("参数变量 = " + paramVar);
        System.out.println("局部变量  = " + localvar);
    }

    public static void main(String[] arggs){
        some_kinds_of_class aa = new some_kinds_of_class();
        aa.method(5);
    }
}
