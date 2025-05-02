package package6;
//和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
//由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(10);//类似于创建数组，从0开始
        builder.append("Hello");
        System.out.println(builder);
        builder.insert(3,"  lala  ");
        System.out.println(builder);
    }
}
