package Factory;

public class Main {

    public static void main(String[] args) {

        pessoaFactory factory = new TutorFactory();

        pessoa pessoa = factory.criarpessoa();

        System.out.println(
                pessoa.getClass().getSimpleName()
        );

    }

}
