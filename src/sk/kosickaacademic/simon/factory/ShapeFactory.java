package sk.kosickaacademic.simon.factory;

import sk.kosickaacademic.simon.Entity;
import sk.kosickaacademic.simon.Moon;
import sk.kosickaacademic.simon.Planet;
import sk.kosickaacademic.simon.Star;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Entity getEntity(String type) {
        if(type.equalsIgnoreCase("planet"))
            return new Planet();
        else if(type.equalsIgnoreCase("star"))
            return new Star();
        else if(type.equalsIgnoreCase("moon"))
            return new Moon();
        else return null;
    }
}
