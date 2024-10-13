public class App {
    public static void main(String[] args) throws Exception {
        

        // Declaração de Variáveis
        Scanner leitor = new Scanner(System.in);

        double expoente = 0;
        double resultado = 0;

        // Entrada de Dados
        System.out.print("Digite o valor do expoente: ");
        expoente = leitor.nextdouble();

        leitor.close();

        // Processamento
        for (int i = 0; i < 100; i++) {
            double exponenciacao = 1; 
            double fatorial = 1;

        // Cálculo Exponenciação
            for (int j = 0 ; j < i ; j++) {
                exponenciacao *=expoente;
            }

        // Cálculo do Fatorial
            for (int j = i ; j > 0, j--){
                fatorial *=j;
            }

            resultado += exponenciacao/fatorial; 
        }

        // Saída de Dados
        System.out.println("O resultado calculado por Taylor é: " + resultado);

         System.out.println("O resultado calculado pelo Java é: " + Math.POW(Math.E, expoente)); 

    }
}
