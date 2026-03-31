package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    void deveRetornarNomeEmpresa() {
        Parametros.getInstance().setNomeEmpresa("Logística Global S.A.");
        assertEquals("Logística Global S.A.", Parametros.getInstance().getNomeEmpresa());
    }

    @Test
    void deveRetornarOperadorLogado() {
        Parametros.getInstance().setOperadorLogado("Operador 01");
        assertEquals("Operador 01", Parametros.getInstance().getOperadorLogado());
    }
    
    @Test
    void deveGarantirInstanciaUnica() {
        Parametros instancia1 = Parametros.getInstance();
        Parametros instancia2 = Parametros.getInstance();
        assertSame(instancia1, instancia2);
    }
}