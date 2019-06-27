package aula_07;

//Administrador é Funcionario e assina Autenticavel;
public class Administrador extends Funcionario implements Autenticavel {

//    private int senha;
    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica (int senha){
//        if(this.senha == senha){
//            return true;
//        } else {
//            return false;
//        }
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
