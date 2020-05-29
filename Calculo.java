
public class Calculo {

    public String calculaIMC(double altura, double peso) {
        double imc = peso / (altura * altura);

        if (imc < 17)
            return "Muito abaixo do peso";
        else if (imc >= 17 && imc <= 18.49)
            return "Abaixo do peso";
        else if (imc > 18.49 && imc <= 24.99)
            return "Peso normal";
        else if (imc > 24.99 && imc <= 29.99)
            return "Acima do peso";
        else if (imc > 29.99 && imc <= 34.99)
            return "Obesidade I";
        else if (imc > 34.99 && imc <= 39.99)
            return "Obesidade II (severa)";
        else if (imc >= 40)
            return "Obesidade III (mórbida)";
        else
            return erroDeCalculo();
    }

    public double calculaRaizQuadrada(int valor) {
        return Math.sqrt(valor);
    }

    public long calculaFatorial(int valor) {
        long fatorial = valor;
        while (valor > 1) {
            fatorial = fatorial * (valor-1);
            valor--;
        }

        return fatorial;
    }

    private String erroDeCalculo() {
        return "Ocorreu um erro no cálculo";
    }
}
