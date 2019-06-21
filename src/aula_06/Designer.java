package aula_06;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação Designer");
        return 200.0;
    }
}
