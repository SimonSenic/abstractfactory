package sk.kosickaacademic.simon;

import sk.kosickaacademic.simon.factory.AbstractFactory;
import sk.kosickaacademic.simon.factory.FactoryProducer;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Entity earth = shapeFactory.getEntity("Planet");
        earth.print();

        AbstractFactory rockFactory = FactoryProducer.getFactory(false);
        Entity chiron = rockFactory.getEntity("COMET");
        chiron.print();
    }
}
