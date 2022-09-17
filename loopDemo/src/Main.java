public class Main {

    public static void main(String[] args) {
        // for döngüsü
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For döngüsü sona erdi");
        //while
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While döngüsü sona erdi");

        //Do-while döngüsü
        //While'dan sonra noktalı virgüle dikkat :)
        //While döngüsünden  farklı olarak döngü şarta uymasa bile bir kere çalışır.
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("While döngüsü sona erdi");
        System.out.println(j);
    }
}

