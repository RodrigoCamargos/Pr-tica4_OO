public class Funcoes implements Celular{

    private boolean ligado;
    private boolean camera;
    private boolean volume;
    private char fabricante;



    public Funcoes() {
        this.ligado = ligado;
        this.camera = camera;
        this.volume = volume;
        this.fabricante = fabricante;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public boolean getVolume() {
        return volume;
    }

    public void setVolume(boolean volume) {
        this.volume = volume;
    }

    public char getFabricante() {
        return fabricante;
    }

    public void setFabricante(char fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirCamera() {
        if (this.getLigado() ) {
            this.setCamera(true);
        }

    }

    @Override
    public void fecharCamera() {
        if (this.getLigado()) {
            this.setCamera(false);
        }

    }

    @Override
    public void aumentarVolume() {
       if (this.getLigado()) {
           this.setVolume(true);
       }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado()) {
            this.setVolume(false);
        }
    }

    @Override
    public void FabricanteA() {
        fabricante = 'a';
        System.out.println("O Fabricante celular A possui os seguintes recursos");
        System.out.println("Mensagem, Internet, E-mail, Radio e acesso aos arquvivos ");
        System.out.println("Seu valor é de R$ 6.800,00");
    }

    @Override
    public void FabricanteB() {
        System.out.println("O Fabricante celular B possui os seguintes recursos");
        System.out.println("Mensagem, Internet, E-mail, tv e acesso aos arquvivos ");
        System.out.println("Seu valor é de R$ 5.200,00");

    }


}

