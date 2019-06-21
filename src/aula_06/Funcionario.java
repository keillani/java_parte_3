package aula_06;

//O construtor padrão (default) é aquele que não recebe nenhum parâmetro.
//O construtor é chamado na inicialização do objeto.
//classe mae ou pai, base class, super class
//do menor pro maior: private < protected < public
//Uma classe pode ter várias filhas, mas apenas uma mãe
//A partir de uma instância de uma classe filha, podemos chamar qualquer método público que tenha sido declarado na classe mãe.
//A palavra abstract está sempre relacionada com herança.
//Classe abstract: Não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata.

//Todos os métodos de uma interface são abstratos, os de uma classe abstrata podem não ser.

public abstract class Funcionario { //abstract: evitar a existencia de um funcionario sem um cargo específico
    private String nome;
    private String cpf;
    //protected = públicas apenas para si e para os filhos
    //não usar o public pois perde a idéia de encapsulamento do atributo
    //quem não for um funcionário não visualisa o salario
    //protected double salario;
    private double salario;

//    public double getBonificacao() {
//        return this.salario * 0.05;
//    }


    //Usamos métodos abstratos quando queremos "forçar" que um filho concreto (classe concreta) implemente um método.
    //metodo sem corpo, nao ha implementacao
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
