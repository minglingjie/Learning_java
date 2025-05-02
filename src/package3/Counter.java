package package3;

public class Counter {
    private static int count = 0;
    //private 私有 static 静态变量
    public Counter() {
        count++;
    }//此处为构造函数，每当创建一个新的Counter对象这个构造函数会被调用
    //构造函数

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("目前为止创建的对象数: " + Counter.getCount());
    }
}
