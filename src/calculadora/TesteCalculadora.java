package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Testes rápidos
        calc.calc(2, 3, "+"); //5
        calc.calc(10, 4, "-"); //6
        calc.calc(3, 5, "*"); //15
        calc.calc(8, 2, "/"); //4
        calc.calc(8, 0, "/"); //Divisão por zero
        calc.calc(5, 2, "X"); //Operação inválida
    }

}
