public class TrabalhoVoluntario extends projeto{
    String tipoTrabalho;
    int Duracao;

    public void validaProjeto(){
        Boolean valida;
        if (Duracao > 2){
            valida = true;
        }
        else valida = false;
    }

    public void imprimeProjeto(){
        String Valida;
        System.out.println(getNomeProjeto()+ " " + getDescricao()+ " " + getDataInico()+ " " + getDataFim()+ " " + tipoTrabalho+ " " + Duracao);
    }
}

