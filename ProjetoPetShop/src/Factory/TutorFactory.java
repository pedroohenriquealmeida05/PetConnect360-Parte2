package Factory;


import Factory.Tutor;
import Factory.pessoaFactory;
import Factory.pessoa;


public class TutorFactory extends pessoaFactory {

    @Override
    public pessoa criarpessoa() {
        return new Tutor();
    }

}