public class DistribuicaoAlimento extends  projeto{

    String descAlimento = "Batata Frita";
    Float qtde  ;


    public void validaProjeto(){
        Boolean valida;
        if (dataFim != null){
            valida = false;
        }
        else valida = true;
    }

    public void imprimeProjeto() {
        String imprime;
        System.out.println(getNomeProjeto() + getDescricao() + getDataInico() + getDataFim() + descAlimento + qtde);
    }
}

