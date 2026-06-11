package Factory;


import Factory.Tutor;
import Factory.pessoaFactory;
import Factory.pessoa;


public class TutorFactory extends pessoaFactory {

    public pessoa criarpessoa() {
        return new Tutor();
    }

}