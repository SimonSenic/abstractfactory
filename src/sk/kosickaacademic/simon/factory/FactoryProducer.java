package sk.kosickaacademic.simon.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round){
        if(round) return new ShapeFactory();
        else return new RockFactory();
    }
}
