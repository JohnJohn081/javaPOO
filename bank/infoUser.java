import java.util.Scanner;
import java.text.NumberFormat;

public class infoUser {

    String nameUser = "John";
    int moneyUser = 100;
    Scanner sc = new Scanner(System.in);
    boolean next = true;

    infoUser(String nome, int money){

        this.nameUser = nome;
        this.moneyUser = money;

    }

    void Retirar(){
        System.out.print("Quanto voce deseja sacar? valor: ");
        double sacar = sc.nextDouble();
        if (moneyUser >= sacar){
            moneyUser -= sacar;
            System.out.println("Voce sacou com sucesso o valor de " + NumberFormat.getCurrencyInstance().format(sacar) + " e ficou com o saldo de " + NumberFormat.getCurrencyInstance().format(moneyUser));
        }
        else{
            System.out.println("Saldo insuficiente. Saldo atual " + moneyUser);
        }
    }


    void Depositar(){
        System.out.print("Quanto voce deseja depositar? valor: ");
        double depositar = sc.nextDouble();
        moneyUser += depositar;
        System.out.println("Voce depositou com sucesso " + NumberFormat.getCurrencyInstance().format(depositar) + " e ficou com o saldo de " + NumberFormat.getCurrencyInstance().format(moneyUser));

    }

    void verificarSaldo(){
        System.out.println("Voce tem " + NumberFormat.getCurrencyInstance().format(moneyUser) + " na sua conta!");
        
    }


    void Continuar(){
        System.out.print("Deseja fazer outra operação? (true/false): ");
        next = sc.nextBoolean();
        if(next == false){
            System.out.println("Obrigado por usar nosso banco. Ate mais!");
        }
    }
}
