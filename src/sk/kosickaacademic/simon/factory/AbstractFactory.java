package sk.kosickaacademic.simon.factory;

import sk.kosickaacademic.simon.Entity;

public abstract class AbstractFactory {
    public abstract Entity getEntity(String type);
}
