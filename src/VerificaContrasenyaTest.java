import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificaContrasenyaTest {
    @Test
    public void testVerificar1() {
        VerificaContrasenya vc = new VerificaContrasenya("");
        EsCorrecta correcta = vc.verificacion("");
        EsCorrecta esperada = new EsCorrecta(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial" );
        assertFalse(correcta.isEsValida());
        Assertions.assertEquals(esperada.getMsg(),correcta.getMsg());
    }
}