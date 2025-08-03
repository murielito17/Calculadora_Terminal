import java.util.Scanner;
import java.lang.Math;
public class Calculadora {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = 0, num_2 = 0, num_3 = 0;
        double resul=0;
        String simbol, fala, continun="S", parar="S";

        while (parar.equalsIgnoreCase("S")){

            System.out.print("Digite o primeiro numero: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalido, reescreva o numero: ");
                sc.next();
            }
            num_1 = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalido, reescreva o numero: ");
                sc.next();
            }
            num_2 = sc.nextInt();

            System.out.printf("Voce escolheu %d e %d.%n", num_1, num_2);
            while (continun.equalsIgnoreCase("S")){
                System.out.printf("%n%sEscolha a opção de calculo%s", ("=-".repeat(5)), ("=-".repeat(5)));
                System.out.print("\n[1] Somar\n[2]Subitração\n[3]Multiplicação\n[4]Divisão\n[5]Potenciação\n[6]Escolher novos numeros\nEscolha a opção que deseja para o calculo: ");
                num_3=sc.nextInt();
                if (num_3==1){
                    resul=num_1+num_2;
                    fala="mais";
                    simbol="+";
                } else if (num_3==2) {
                    resul=num_1-num_2;
                    fala="menos";
                    simbol="-";
                } else if (num_3==3) {
                    resul=num_1*num_2;
                    fala="vezes";
                    simbol="x";
                } else if (num_3==4) {
                    resul=num_1/num_2;
                    fala="dividido por";
                    simbol="÷";
                } else if (num_3==5) {
                    resul=Math.pow(num_1,num_2);
                    fala="elevado a";
                    simbol="";
                } else if (num_3==6) {
                    parar="S";
                    break;
                } else {
                    System.out.print("erro");
                    resul=0;
                    fala="";
                    simbol="";
                }
                System.out.printf("Com isso o resultado da conta de %d %s %d é igual a %.2f%nFicando asssim %d %s %d = %.2f.%n",
                        num_1,fala,num_2,resul,num_1,simbol,num_2,resul);
                System.out.print("Quer continuar?: ");
                continun = sc.next();
            }
            System.out.print("Deseja calcular um novo numero?: [S/N]");
            parar=sc.next();
        }}

}
