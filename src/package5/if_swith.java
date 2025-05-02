package package5;

public class if_swith {
    public static void main(String[] args) {
        if_1 aa = new if_1();
        switch_1 bb = new switch_1();
        System.out.println(aa.x(11));
        System.out.println(bb.z(10));
    }
}

class if_1{
    boolean x(int a){
        if(a>10){
            return true;
        }else {
            return false;
        }
    }

}

class switch_1{
    int z(int a){
        switch(a){
            case 1: return 1;
            case 2: return 2;
            default: return 3;
        }
    }

}