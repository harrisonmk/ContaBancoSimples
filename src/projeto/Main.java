
package projeto;

import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
     Conta conta = new Conta();
     
     System.out.println("Por favor, digite o número da Agência !");
     String agencia = scan.next();
     
     System.out.println("Por favor, digite seu nome !");
     scan.next();
     String nome = scan.nextLine();
     System.out.println("Por favor, digite seu saldo !");
     double saldo = scan.nextDouble();
     System.out.println("Por favor, digite o número da conta!");
     int numero = scan.nextInt();
     
     conta.setAgencia(agencia);
     conta.setNomeCliente(nome);
     conta.setSaldo(saldo);
     conta.setNumero(numero);
     
     
     System.out.println("Ola "+ conta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+",conta "+conta.getNumero()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque.");
        
        
    }
    
}
