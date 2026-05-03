import java.util.Scanner;

/**
 * Resposta simples do  .
 */
public class Resposta01VetorSupermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor com 5 posicoes para faturamento de cada caixa.
        double[] faturamentos = new double[5];

        // Leitura dos dados de faturamento.
        for (int i = 0; i < faturamentos.length; i++) {
            System.out.print("Digite o faturamento do caixa " + (i + 1) + ": ");
            faturamentos[i] = scanner.nextDouble();
        }

        // Inicializa controles com base no primeiro elemento.
        double soma = 0;
        double maiorValor = faturamentos[0];
        double menorValor = faturamentos[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        // Percorre o vetor para calcular soma, maior e menor valor.
        for (int i = 0; i < faturamentos.length; i++) {
            soma += faturamentos[i];

            if (faturamentos[i] > maiorValor) {
                maiorValor = faturamentos[i];
                indiceMaior = i;
            }

            if (faturamentos[i] < menorValor) {
                menorValor = faturamentos[i];
                indiceMenor = i;
            }
        }

        double media = soma / faturamentos.length;

        // Exibe resumo final do dia.
        System.out.println("\n--- Resumo do dia ---");
        System.out.printf("Total do dia: %.2f%n", soma);
        System.out.printf("Media por caixa: %.2f%n", media);
        System.out.printf("Maior venda: Caixa %d com %.2f%n", (indiceMaior + 1), maiorValor);
        System.out.printf("Menor venda: Caixa %d com %.2f%n", (indiceMenor + 1), menorValor);

        scanner.close();
    }
}
