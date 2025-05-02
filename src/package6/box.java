package package6;

public class box {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = 5;
        float num3 = num1.floatValue();//xxxValue()类型转换
        long num4 = num1.longValue();
        System.out.println(num3);
        System.out.println(num4);
        //以上为从包装类到基本数据类型的转换

        Integer num5 = Integer.valueOf(10);
        Integer num6 = Integer.valueOf(20);
        Float num7 = Float.valueOf("1");
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        //以上为基本数据类型到对象的转换

        Integer num8 = Integer.valueOf("888",16);//radix16指的是“888”为16进制表示转换为10进制
        Integer num9 = Integer.parseInt("AB",16);//parse×××() 方法将字符串转换为对应的基本数据类型
        Integer num10 = Integer.parseInt("ABCD",16);
        System.out.println(num8);
        System.out.println(num9);
        //以上为将字符串转换为基本数据类型
    }
}
