package sk.kosickaacademic.simon.factory;

import sk.kosickaacademic.simon.Asteroid;
import sk.kosickaacademic.simon.Comet;
import sk.kosickaacademic.simon.Entity;

public class RockFactory extends AbstractFactory {
    @Override
    public Entity getEntity(String type) {
        if(type.equalsIgnoreCase("asteroid"))
            return new Asteroid();
        else if(type.equalsIgnoreCase("comet"))
            return new Comet();
        else return null;
    }
}
