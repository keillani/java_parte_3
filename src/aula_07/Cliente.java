package aula_07;

//Contrato com a classe Autenticavel precisa implementar os métodos concretos
//Cliente é Autenticavel.
//Uma classe pode implementar mais de uma interface
public class Cliente implements Autenticavel {

    //private int senha;
    private AutenticacaoUtil util;

    public Cliente(){
        this.util = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
//        this.senha = senha;
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
////        if (this.senha == senha){
//            return true;
//        } else{
//            return false;
//        }
        return this.util.autentica(senha);
    }
}
