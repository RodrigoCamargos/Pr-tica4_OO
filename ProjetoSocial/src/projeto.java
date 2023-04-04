public abstract class projeto {
    String nomeProjeto = "Newton";
    String descricao = "Paiva";
    String endereco = "Carlos Luz";
    String dataInico = "01/03/2021";
    String dataFim;

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataInico() {
        return dataInico;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataInico(String dataInico) {
        this.dataInico = dataInico;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void validaProjeto(Boolean valida){

    }

    public void imprimeProjeto(String imprime){

    }

    public abstract void validaProjeto();

    public abstract void imprimeProjeto();
}

