package package7;

public class array {
    public static void main(String[] args) {
        int[] a;//声明数组a

        int[] b = new int[5];//声明数组b并且创建数组
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;
        int sum = 0;
        for(int i=0;i<b.length;i++){//数组从0开始计数
            sum += b[i];
        }
        System.out.println(sum);
        for_array arr = new for_array();
        arr.for_arry(b);
    }

}

class for_array{
//    for(type element: array)
//    {
//        System.out.println(element);
//    }
    void for_arry(int[] a){//类似于数组的遍历
        for(int element: a){
            System.out.println(element);
        }
    }

}
