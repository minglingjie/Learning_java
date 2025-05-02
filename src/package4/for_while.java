package package4;

public class for_while {
    public static void main(String[] args) {
        a_for aa = new a_for();
        a_while bb = new a_while();
        System.out.println(aa.a_for());
        System.out.println(bb.a_while());
    }
}

class a_for{
    int sum =0 ;
    int a_for(){
        for(int i=0;i<10;i++){
            sum += i ;
        }
        return sum;

    }


}

class a_while{
    int sum = 0;
    int i=0;
    int a_while(){
        while(i<10){
            sum += i ;
            i++;
        }
        return sum;}

}



