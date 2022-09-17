public class Main {

    public static void main(String[] args) {
        int bolen1 = 0;
        int bolen2 = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (i % j == 0) {
                    bolen1 += j;
                }
            }
            for (int k = bolen1 - 1; k > 0; k--) {
                if (bolen1 % k == 0) {
                    bolen2 += k;
                }
            }
            if(bolen2==i&& bolen1!=bolen2){
                System.out.println(bolen1+" - "+bolen2);
            }
            bolen1=0;
            bolen2=0;  //Bazen ufak bir çivi tüm ordunun gidişatını bozar.
        }
    }
}

