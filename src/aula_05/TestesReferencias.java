package aula_05;

public class TestesReferencias {
    public static void main(String[] args) {
        //Polimorfismo: Temos um mesmo objeto, do tipo Gerente, mas há duas formas possíveis de chegarmos a este objeto, dois tipos diferentes de referência.
        //Funcionario g1 = new Gerente();
        //referência genérica Funcionario, uma vez criado o objeto sempre manterá o seu tipo. No caso "Gerente"
        //objetos não mudam de tipo
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        String nome = g1.getNome();
        g1.setSalario(5000.0);

//não funciona pois funcionário é uma classe abstrata e não concreta
//        Funcionario f = new Funcionario();
//        f.setSalario(2000.0);

        EditorVideo ev= new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        //controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(nome);
        System.out.println(controle.getSoma());
    }
}
