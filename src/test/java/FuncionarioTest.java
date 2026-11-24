import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarCategoriaBeneficio() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCategoriaBeneficio("A");

        assertEquals("A", funcionario.getCategoriaBeneficio());
    }

    @Test
    void deveRetornarPontosBeneficio() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCategoriaBeneficio("A");

        assertEquals(9.0f, funcionario.getPontosBeneficio());
    }
}