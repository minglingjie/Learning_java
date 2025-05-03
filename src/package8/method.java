package package8;

public class method {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = new A();
        c.count();
        System.out.println(c.i);

        B b1 = new B();//此处为给参数对应下方构造方法重载中未给参数的B()
        B b2 = new B(1,2,3);

    }
}

class A{
    static int i = 0;//static！！！
    A(){//构造函数(注意构造函数没有返回值）
        i++;
    }

    int count(){
        System.out.println("以构建对象数为：");
        return i;
    }


}

class B{
    private int a;
    private int b;
    B(int a, int b){
        this.a = a+1;//this.a就是int a    a是上方的private int a
        this.b = b+1;//this.b就是int b    b是上方的private int b
        System.out.println(this.a);
        System.out.println(this.b);

    }
    B(int a){
        this.a = a+1;
        System.out.println(this.a);
    }
    B(){
        System.out.println("未给出参数");

    }
    B(int a,int b,int c){
        this(1,2);//此处this调用了上方两个参数的构造方法
    }


}