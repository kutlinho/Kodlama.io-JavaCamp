public class Main {

    public static void main(String[] args) {
	int[] sayilar = new int[]{1,2,5,7,9,0};
    int aranan =7;
    boolean varmi=false;
    for(int i=0;i<sayilar.length-1;i++){
        if(aranan==sayilar[i]){
            System.out.println("Aranan sayı "+ aranan +", dizinin " + (i+1) +". sırasında bulundu.");
            varmi=true;
            break;
        }
      }
    if(varmi==false){
        System.out.println("Aranan sayı bulunamadı.");
    }
    }
}
