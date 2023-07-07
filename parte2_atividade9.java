import java.util.Scanner;

public class parte2_atividade9 {
    
public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in); 

   String cep, numero, cidade, estado, cpf, tel;

   

System.out.println("Digite o seu nome: ");
 
String nome = entrada.nextLine();

System.out.println("Digite o nome da sua rua: ");

String rua = entrada.nextLine();

System.out.println("Digite o numero da sua casa: ");

 numero = entrada.nextLine();

System.out.println("Digite o seu CEP: ");
 cep = entrada.nextLine();

System.out.println("Digite o nome da sua cidade: ");
  
cidade = entrada.nextLine();

System.out.println("Digite o sue estado: ");

estado = entrada.nextLine();

System.out.println("Digite o seu CPF: ");

cpf = entrada.nextLine();

System.out.println("Digite o seu telefone: ");

tel = entrada.nextLine();

System.out.println(nome);

System.out.println("Rua " + rua + ", Numero: " + numero + ", CEP: " + cep);

System.out.println("Cidade: " + cidade);

System.out.println("Estado: " + estado);

System.out.println("Seu CPF: " + cpf);

System.out.println("Seu telefone: " + tel);

}
}