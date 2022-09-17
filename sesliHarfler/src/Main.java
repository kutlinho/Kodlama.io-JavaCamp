public class Main {

    public static void main(String[] args) {
        char[] kalin = {'a', 'A', 'ı', 'I', 'o', 'O','U','u'};
        char[] ince ={'e','E','i','İ','Ö','ö','ü','Ü'};
        char harf = 'p';
        boolean kalinmi = false;
        boolean incemi= false;
        for (int i = 0; i < kalin.length; i++) {
            if (kalin[i]==harf) {
                kalinmi = true;
            }
        }

        for (int i = 0; i < ince.length; i++) {
            if (ince[i]==harf) {
                incemi = true;
            }
        }
        if (kalinmi == true) {
            System.out.println("Harf kalındır.");
        } else if(incemi==true) {
            System.out.println("Harf incedir.");
        }
        else{
            System.out.println("Ünsüz bir harf girdiniz.");
        }
    }
}
