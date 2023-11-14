import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Skriv inn et år du vil sjekke om er et skuddår: ");
        int aar=in.nextInt();

        in.close();
        System.out.println(erSkuddar(aar));
    }
    static boolean erSkuddar(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }return false;
    }
}
