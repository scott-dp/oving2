
public class oppgave2 {
    public static void main(String[] args){
        double kjottAPris=35.9;//kr
        int kjottAVekt=450;//gram

        double kjottBPris=39.5;//kr
        int kjottBVekt=500;//gram

        if (prisPrGram(kjottBPris, kjottBVekt)>prisPrGram(kjottAPris, kjottAVekt)){
            System.out.println("kjøtt A er rimeligst");
        }else if(prisPrGram(kjottBPris, kjottBVekt)==prisPrGram(kjottAPris, kjottAVekt)){
            System.out.println("De er like rimelige");
        }
        else{
            System.out.println("Kjøtt B er rimeligst");
        }
    }
    static double prisPrGram(double pris,int vekt){
        return pris/vekt;
    }
}
