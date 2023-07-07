import java.util.Scanner;

public class parte2_atividade7 {
    
 public static void main(String[] args) throws Exception {
     //import java.util.Scanner; 

int idade;

     Scanner entrada = new Scanner(System.in); 

     System.out.println("informe o seu nome: ");

     String nome = entrada.nextLine();


 System.out.println("informe sua cidade: ");

     String cidade = entrada.nextLine();


    System.out.println("insira sua idade: ");

    idade = entrada.nextInt();

     System.out.println(nome);

     System.out.println(idade);

       System.out.println(cidade);
    }  
}


