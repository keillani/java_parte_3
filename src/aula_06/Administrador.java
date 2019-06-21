package aula_06;

//Administrador é Funcionario e assina Autenticavel;
public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica (int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
