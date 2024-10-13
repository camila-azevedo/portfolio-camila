public class SalarioFuncionario {
public static void main (String [] args){

    // Declaração de Variáveis
    Scanner leitor = new Scanner(System.in);
    double salarioInicial = 0;
    double salarioFinal = 0; 
    int tipo = 0;

    // Entrada de Dados
    System.out.print("Informe o salário inicial: ");
    salarioInicial = leitor.nextDouble();

    System.out.print("Informe a categria do funcionário: ");
    categoria = leitor.nextInt();

    leitor.close();

    // Processamento

    if(tipo ==1) {
        salarioFinal = salarioInicial * 1.1;
    } else if (tipo == 2) {
        salarioFinal = salarioInicial *1.2;
    } else {
        salarioFinal = salarioInicial * 1.5;
    }

    // Saída de dados
    System.out.println("O salário final é R$" + salarioFinal);


}
}
