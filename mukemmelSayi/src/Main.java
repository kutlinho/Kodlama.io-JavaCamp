public class Main {

    public static void main(String[] args) {
        int bolen = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = i-1; j > 0; j--) {
                if (i % j == 0) {
                    bolen =bolen+ j;
                }
            }
            if(bolen==i){
                System.out.println(i);
            }
            bolen=0;
        }
       /* int bolen=0;
        int sayi=6;
        boolean muko=false;
        for(int j=sayi-1;j>0;j--){
            if(sayi%j==0){
                bolen+=j;
            }

        }
        if(bolen==sayi){
            muko=true;
            System.out.println("Sayı mükemmeldir.");
        }
        else{
            System.out.println("Sayı mükemmel değildir.");
        }*/

    }
}
