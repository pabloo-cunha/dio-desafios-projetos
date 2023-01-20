import java.util.Scanner;

public class MesadaSobrinho{
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;
        int entrada = leitor.nextInt();
        

        int totalPoupado = mesada*entrada;
        
        System.out.println(totalPoupado);
    }
}
