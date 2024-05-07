public class EsCorrecta {
    private boolean esValida = false;
    private String msg = "";

    public EsCorrecta(boolean esValida, StringBuilder msg) {
        this.esValida = esValida;
        this.msg = String.valueOf(msg);
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
