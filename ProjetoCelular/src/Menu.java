public class Menu extends Funcoes{

    private boolean mensagem;
    private boolean internet;
    private boolean email;
    private boolean radio;
    private boolean tv;
    private boolean arquivos;

    public Menu() {
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.arquivos = arquivos;
    }



    public boolean isMensagem() {
        return mensagem;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isEmail() {
        return email;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isArquivos() {
        return arquivos;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setArquivos(boolean arquivos) {
        this.arquivos = arquivos;
    }



    }



