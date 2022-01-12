import java.util.Scanner;

public class main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int dj,sd,idd;
        


        System.out.print(" Em que ano nasceu a pessoa desejada? : ");
        dj = entrada.nextInt();

        System.out.print("\n Em que ano você nasceu? : ");
        sd = entrada.nextInt();
        
        System.out.print("\n Quantos anos tens? : ");
        idd = entrada.nextInt();

        int Resultado_UM, Resultado_DOIS;
        
        Resultado_UM = sd -dj;

        Resultado_DOIS = Resultado_UM + idd;

        System.out.println("A idade da pessoa desejada é: " +Resultado_DOIS);

    }
}