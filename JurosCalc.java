import java.util.Scanner;

public class JurosCalc{
    public static void main(String[] args) {
        // Declaração de Variáveis
        int op;
        double m, j, c, i, i2, t;
        
        
        Scanner open = new Scanner(System.in);

        // Home
    do{
        System.out.println("\n\t\tCalculadora de Juros Simples\n");
        System.out.println("\t\tA melhor calculadora do Mundo! by: Guru's Co. LTDA");

        System.out.println("\n1. Calcule seu juros");
        System.out.println("2. Calcule seu capital");
        System.out.println("3. Calcule a taxa");
        System.out.println("4. Calcule o tempo");
        System.out.println("5. Sair");

        System.out.print("\nOpção: ");
        op = open.nextInt();

        // Entradas
        switch (op) {
            case 1:
            System.out.println("\n\t\tVocê escolheu Cacule seu juros");
            System.out.print("Informe seu capital:");
            c = open.nextInt();
    
            System.out.print("Informe qual é o juros ao mês (em porcentagem):");
            i = open.nextInt();
    
            System.out.print("Por fim, informe o tempo (em mês):");
            t = open.nextInt();
    
            // Processamento
            
            i2 = i / 100;
            j = c * i2 * t;
    
            // Saída 1
            System.out.println("R$" + j + "0 de Juros!");
    
            m = c + j;
            
            System.out.println("R$" + m + "0 é o seu Juros adicionado ao seu Capital inicial!");
            break;
            case 2:
            System.out.println("\n\t\tVocê escolheu Cacule seu capital");
            System.out.print("Informe seu juros:");
            j = open.nextInt();
    
            System.out.print("Informe qual é o juros ao mês (em porcentagem):");
            i = open.nextInt();
    
            System.out.print("Por fim, informe o tempo (em mês):");
            t = open.nextInt();
    
            // Processamento
            
            i2 = i / 100;
            c = j / (i2 / 100 * t);
    
            // Saída 1
            System.out.println("R$" + c + "0 é o seu capital!");
                break;
            case 3:
            System.out.println("\n\t\tVocê escolheu Cacule sua taxa");
            System.out.print("Informe seu juros:");
            j = open.nextInt();
    
            System.out.print("Informe seu capital:");
            c = open.nextInt();
    
            System.out.print("Por fim, informe o tempo (em mês):");
            t = open.nextInt();
    
            // Processamento
            
            i = (j / (c * t)) * 100;
            
            // Saída 1
            System.out.println(c + "% é a sua taxa!");
                break;
            }
        }
    }
}