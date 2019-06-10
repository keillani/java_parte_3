package aula_05;

//Herda todas as características da classe Funcionario.
// Gerente é um Funcionário, Gerente herda da classe Funcionário
//Gerente possui os mesmos atributos e métodos que o Funcionario
//classe filha
//extends = herda = é um
public class Gerente extends Funcionario {

    private int senha;

    //reescrita do método:  método possui a mesma assinatura. Isto é, a mesma visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros.
    public double getBonificacao() {
        //return this.salario; **this significa que o atributo deve ser definido nessa classe
        //super significa que o atributo está definido na clase mae
        //return (this.salario * 0.05) + super.getSalario();
        System.out.println("Chamando o método bonificação Gerente");
        return super.getSalario()*0.05 + super.getSalario();
    }

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
