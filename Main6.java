import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        String r;
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("Insira Seu nome:");
            String nome = sc2.nextLine();
            System.out.println(nome);

            System.out.println("Insira seu peso:");
            Double peso = sc.nextDouble();
            System.out.println(peso);

            System.out.println("Diga sua altura");
            Double altura = sc.nextDouble();
            System.out.println(altura);

            System.out.println("Para ver novamente, digite 1");
            r = sc.next();
        }while  (r.equalsIgnoreCase("1"));



        System.out.println("antiga:"+ p.idade);
        p.niver();
        System.out.println("atual:"+ p.idade);
    }
}
