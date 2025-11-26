package calculadora;

/**
 * <p><strong>Classe de Teste para Calculadora</strong></p>
 *
 * <p>Esta classe contém o método principal para demonstrar o uso
 * da classe {@link Calculadora} e testar suas funcionalidades,
 * incluindo o tratamento de exceções.</p>
 *
 * <p>O principal objetivo é verificar a robustez dos métodos da
 * {@link Calculadora} para diferentes tipos de entrada e operadores.</p>
 *
 * @author Gabriel Campelo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Ponto de entrada da aplicação de teste.
     *
     * <p>Instancia a classe {@link Calculadora} e executa uma série de testes,
     * incluindo operações normais e testes de exceção para divisão por zero
     * e operador inválido.</p>
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes de operações normais
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de exceção para Divisão por Zero
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de exceção para Operador Inválido
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}