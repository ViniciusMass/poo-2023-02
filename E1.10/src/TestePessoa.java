import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestePessoa {
    @Test
    public void testCalculaImpostoMenorDe65() {
        Pessoa pessoa = new Pessoa("Vinicius", 2000.0, 30, 2);
        assertEquals(-343.5, pessoa.calculaImposto(), 0.01);
    }

    @Test
    public void testCalculaImpostoMaiorDe65() {
        Pessoa pessoa = new Pessoa("Ana", 3000.0, 70, 1);
        assertEquals(0.0, pessoa.calculaImposto(), 0.01);
    }
}
