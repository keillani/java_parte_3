package aula_07;

public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método bonificação Editor de video");
        return 150.0;
    }
}
