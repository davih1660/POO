import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("======= Calculadora =======");
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");
            System.out.println("===========================");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                continuar = false;
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}