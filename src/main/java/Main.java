import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
    System.out.printf("Numero Digitado  = %d", numero);
    
    if (numero > 0) {
      System.out.println(" é positivo.");
    } else if (numero < 0) {
      System.out.println(" é negativo.");
    } else {
      System.out.println("O Numero zero.");
      System.out.println("0 não é nem positivo nem negativo");
    }

            sc.close();

   
  
  }
}