import java.util.Scanner;

public class parte2_atividade10 {
    
public static void main(String[] args) throws Exception {
  
        
     Scanner entrada = new Scanner(System.in); 

 int numero1,numero2,x=0;  

        System.out.println("Digite o primeiro número: ");

        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");

        numero2 = entrada.nextInt();

        x = numero1;
        numero1 = numero2;
        numero2 = x;

        System.out.println( numero1);
        System.out.println( numero2);

}
}