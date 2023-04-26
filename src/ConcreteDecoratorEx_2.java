public class ConcreteDecoratorEx_2 extends AbstractDecorator{


    public void doJob(String hola) {
        super.doJob();
        System.out.println("Algo extra ;) 2" + hola);
    }
}
