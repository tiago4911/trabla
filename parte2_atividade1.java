import java.util.Scanner;

public class parte2_atividade1 {
  public static void main(String[] args) throws Exception {
     //import java.util.Scanner; 

     Scanner entrada = new Scanner(System.in); 

     System.out.println("informe o seu nome: ");

     String nome = entrada.nextLine();

    System.out.println("informe sua cidade: ");

     String cidade = entrada.nextLine();

     System.out.println("ola " + nome + "voce mora na cidade de " + cidade);
    }  
}
