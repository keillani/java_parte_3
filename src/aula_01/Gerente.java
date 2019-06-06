package aula_01;

//Herda todas as características da classe Funcionario.
// Gerente é um Funcionário, Gerente herda da classe Funcionário
public class Gerente extends Funcionario {

    private int senha;

//    public double getBonificacao() {
//        return this.salario;
//    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
