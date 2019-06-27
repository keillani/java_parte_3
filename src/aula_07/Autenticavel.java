package aula_07;
//classe intermediária para evitar dulplicar código
//Desde que não haja uma alteração na classe FuncionarioAutenticavel, as suas classes filhas não serão afetadas. Esta é a vantagem do design desta abstração, do polimorfismo

//interface uma forma de aplicar o polimorfismo sem o uso de herança
//Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)

//contrato Autenticavel
//quem assinar esse contrato precisa implementar
//metodo setSenha
//metodo autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
