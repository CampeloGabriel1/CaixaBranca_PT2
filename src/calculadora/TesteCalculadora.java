package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes de operações normais
        System.out.println(calc.calcular(2, 3, operador: "+"));
        System.out.println(calc.calcular(10, 4, operador: "-"));
        System.out.println(calc.calcular(3, 5, operador: "*"));
        System.out.println(calc.calcular(8, 2, operador: "/"));

        // Teste de exceção para Divisão por Zero
        try {
            System.out.println(calc.calcular(8, 0, operador: "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de exceção para Operador Inválido
        try {
            System.out.println(calc.calcular(5, 5, operador: "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}