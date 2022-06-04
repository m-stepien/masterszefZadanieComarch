public class Main {
    public static void main(String[] args) {
        minimalDiff(5,3,1);
    }
public static void minimalDiff(int x, int y, int z){
        String smallerName;
        String biggerName;
        int smaller;
        int bigger;
        if(x<y){
            smaller=x;
            bigger=y;
            smallerName="Jablek";
            biggerName="Pomaranczy";
        }
        else{
            smaller=y;
            bigger=x;
            smallerName="Pomaranczy";
            biggerName="Jablek";
        }
        while((smaller<bigger)&&z>0){
            smaller++;
            z--;
        }
        if(z>0){
            smaller+=z%2;
            smaller+=z/2;
            bigger+=z/2;
        }
        int minimalDiff = Math.abs(smaller-bigger);
        printResult(minimalDiff, biggerName, smallerName, bigger, smaller);

}
public static void printResult(int d, String big, String small, int bigNum, int smallNum){
    System.out.println("Minimalna roznica: "+d);
    if(big.equals("Jablek")==true) {
        System.out.println("Ilość " + big + " : " + bigNum);
        System.out.println("Ilość " + small + " : " + smallNum);
    }
    else {
        System.out.println("Ilość " + small + " : " + smallNum);
        System.out.println("Ilość " + big + " : " + bigNum);
    }
}
}
