public class Main {

    public static void main(String[] args) {
        int bolen =0;
        for(int i=2;i<100;i++){
            for(int j=i-1;j>1;j--){
                if(i%j==0){
                   bolen+=1;
                }
            }
            if(bolen==0){
                System.out.println(i);
            }
            bolen=0;
        }
    }
}
