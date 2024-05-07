import java.util.ArrayList;
import java.util.List;

public class EsCorrecta {
    private boolean esValida = false;
    private String msg = "";

    public EsCorrecta(boolean esValida, String msg) {
        this.esValida = false;
        this.msg = "";
    }

    public boolean isEsValida() {
        return esValida;
    }

    public void setEsValida(boolean esValida) {
        this.esValida = esValida;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
