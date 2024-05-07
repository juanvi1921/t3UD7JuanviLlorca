import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificaContrasenyaTest {
    @Test
    public void testVerificar1() {
        VerificaContrasenya vc = new VerificaContrasenya("");
        EsCorrecta correcta = vc.verificacion("");
        EsCorrecta esperada = new EsCorrecta(false, new StringBuilder("La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial"));
        assertFalse(correcta.isEsValida());
        Assertions.assertEquals(esperada.getMsg(),correcta.getMsg());
    }
    @Test
    public void testVerificar2() {
        VerificaContrasenya vc = new VerificaContrasenya("hola");
        EsCorrecta correcta = vc.verificacion("hola");
        EsCorrecta esperada = new EsCorrecta(false, new StringBuilder("La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial"));
        assertFalse(correcta.isEsValida());
        assertEquals(esperada.getMsg(), correcta.getMsg());
    }
    @Test
    public void testVerificar3() {
        VerificaContrasenya vc = new VerificaContrasenya("holacaracola");
        EsCorrecta correcta = vc.verificacion("holacaracola");
        EsCorrecta esperada = new EsCorrecta(false,
                new StringBuilder("La contrasenya ha de contenir almenys 2 numeros\n" +
                        "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                        "La contrasenya ha de contenir almenys un caracter especial"));
        assertFalse(correcta.isEsValida());
        assertEquals(esperada.getMsg(), correcta.getMsg());
    }
}