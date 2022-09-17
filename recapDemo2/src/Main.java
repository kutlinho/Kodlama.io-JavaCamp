public class Main {

    public static void main(String[] args) {
	double[] myList = {1.2,1.3,5.6,4.3};
    double total =0;
    double enBuyuk=0;
    for(double number:myList){
        total+=number;
        if(number>enBuyuk){
            enBuyuk=number;
        }
       System.out.println(number);
    }
    System.out.println("En büyük sayı ="+ enBuyuk);
    System.out.println("Toplam ="+ total);
    }
}
