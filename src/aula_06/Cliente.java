package aula_06;

//Contrato com a classe Autenticavel precisa implementar os métodos concretos
//Cliente é Autenticavel.
//Uma classe pode implementar mais de uma interface
public class Cliente implements Autenticavel {

    private int senha;


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        } else{
            return false;
        }
    }
}
