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
            System.out.println("\n\t\tVocê escolheu: Calculadora de Juros");
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
            System.out.println("\n\t\tVocê escolheu: Calcule seu capital");

            System.out.print("Informe seu juros: ");
            j = open.nextDouble();
            open.nextLine(); // 

            System.out.print("Informe qual é o juros ao mês (em porcentagem): ");
            i = open.nextDouble();
            open.nextLine();

            System.out.print("Por fim, informe o tempo (em mês): ");
            t = open.nextDouble();
            open.nextLine();

            // Processamento
            
            c = j / ((i / 100) * t);
    
            // Saída 1
            System.out.printf("R$%.2f é o seu capital!\n", c);
                break;

            case 3:
            System.out.println("\n\t\tVocê escolheu: Calculadora de Taxa");
            System.out.print("Informe seu juros:");
            j = open.nextInt();
    
            System.out.print("Informe seu capital:");
            c = open.nextInt();
    
            System.out.print("Por fim, informe o tempo (em mês):");
            t = open.nextInt();
    
            // Processamento
            
            i = (j / (c * t)) * 100;
            
            // Saída 1
            System.out.println(i + "% é a sua taxa!");
                break;
            
            case 4:
            System.out.println("\n\t\tVocê escolheu: Calculadora do tempo");
            System.out.print("Informe seu capital:");
            c = open.nextInt();
    
            System.out.print("Informe qual a taxa (em porcentagem):");
            i = open.nextInt();
    
            System.out.print("Por fim, informe o juros obtido:");
            j = open.nextInt();

            // Processamento
            
            t = (j / (c * i / 100));

            // Saída 1
            System.out.println(t + ": Esse é o tempo em meses.");
                break;

            case 5:
            System.out.println("Até mais, meu chapinha.");
                break;

            //Saída Bisonha
            case 6:
            System.out.println("Escolha uma opção certa, meu chapinha.");
                break;
            }

            
        } while (op != 5);

        open.close();
    }
}