public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Soner";
        String ogrenci2 = "Kutluhan";
        String ogrenci3 = "Serkan";
        String ogrenci4= "Duru";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("----------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Soner";
        ogrenciler[1] = "Kutluhan";
        ogrenciler[2] = "Serkan";
        ogrenciler[3] = "Duru";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[ogrenciler.length-1-i]);
        }


        System.out.println("----------------");

    }
}
