public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Kocaeli";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Niğde";
        cities[2][0] = "İzmir";
        cities[2][1] = "Denizli";
        cities[2][2] = "Uşak";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(cities[i][j]);
            }
            System.out.println("------------------");
        }
    }
}
