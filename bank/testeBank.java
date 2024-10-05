import java.util.Scanner;

public class testeBank {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("-                                -");
        System.out.println("-       BANCO XIIII              -");
        System.out.println("-                                -");
        System.out.println("-  Digte seu nome abaixo         -");
        System.out.println("-                                -");
        System.out.println("----------------------------------");
        System.out.print("Seu nome: ");        
        String nomeDoMano = sc.nextLine();
        infoUser user = new infoUser(nomeDoMano, 500);
        

        while(user.next == true){

            System.out.println("----------------------------------");
            System.out.println("-                                ");
            System.out.println("-       BANCO XIIII              ");
            System.out.println("-                                ");
            System.out.println(  "- Seja bem-vindo " + user.nameUser);
            System.out.println("-                                ");
            System.out.println("-  1 - Fazer um Saque            ");
            System.out.println("-  2 - Fazer um Depoisto         ");
            System.out.println("-  3 - Verificar Saldo           ");
            System.out.println("-  4 - Exit                      ");
            System.out.println("-                                ");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");

            int resposta = sc.nextInt();

            switch (resposta) {
                case 1:
                    user.Retirar();
                    user.Continuar();
                break;
                case 2:
                    user.Depositar();
                    user.Continuar();
                break;
                case 3:
                    user.verificarSaldo();
                    user.Continuar();
                break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco. Ate mais!");
                    user.next = false;
                break;
                default:
                System.out.println("opção invalida");
            }
        }

        sc.close();

    }
}
