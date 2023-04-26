public class DecoratorPatternEx {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        ConcreteComponent compOG = new ConcreteComponent();
        ConcreteDecoratorEx_1 compC1 = new ConcreteDecoratorEx_1();
        ConcreteDecoratorEx_2 compC2 = new ConcreteDecoratorEx_2();

        compOG.doJob();
        System.out.println("---------------------------------------------------");

        compC1.setTheComponent(compOG);
        compC1.doJob();

        System.out.println("---------------------------------------------------");

        compC2.setTheComponent(compC1);
        compC2.doJob();
    }
}
