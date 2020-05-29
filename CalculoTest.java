import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculo.class)
public class CalculoTest {

    @Mock
    Double valorErro = 0.00;

    @Test
    public void calculaIMCMuitoAbaixoDoPeso() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Muito abaixo do peso";

        //act
        atual = calculo.calculaIMC(1.8, 55);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCAbaixoDoPeso() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Abaixo do peso";

        //act
        atual = calculo.calculaIMC(1.75, 55);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCPesoNormal() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Peso normal";

        //act
        atual = calculo.calculaIMC(1.75, 63.5);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCAcimaDoPeso() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Acima do peso";

        //act
        atual = calculo.calculaIMC(1.65, 70);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCObesidadeI() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Obesidade I";

        //act
        atual = calculo.calculaIMC(1.6, 80);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCObesidadeSevera() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Obesidade II (severa)";

        //act
        atual = calculo.calculaIMC(1.55, 85);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCObesidadeMorbida() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Obesidade III (mórbida)";

        //act
        atual = calculo.calculaIMC(1.5, 90);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaIMCComErroDeCalculo() {
        //arrange
        Calculo calculo = new Calculo();
        String atual = "";
        String esperado = "Ocorreu um erro no cálculo";

        //act
        atual = calculo.calculaIMC(valorErro, valorErro);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaPotencia() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 7;

        //act
        atual = calculo.calculaRaizQuadrada(49);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void calculaFatorial() {
        //arrange
        Calculo calculo = new Calculo();
        long atual = 0;
        long esperado = 720;

        //act
        atual = calculo.calculaFatorial(6);

        //assert
        Assert.assertEquals(esperado, atual);
    }
}
