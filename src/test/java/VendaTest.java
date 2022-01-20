import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {


    @Test
    void deveRetonarV() {
        Venda venda = new Venda();
        venda.setValor(170000);
        assertEquals(187000.0, venda.calculaValor());
    }


    @Test
    void deveRetornarInformacoes() {
        Venda venda = new Venda();
        venda.setValor(170000);
        venda.setCidade("Juiz de Fora");
        venda.setProprietario("Walkiria");
        assertEquals("ImovelVenda{cidade=Juiz de Fora, proorietário=Walkiria, valor final=187000.0}", venda.getInfo());
    }
}