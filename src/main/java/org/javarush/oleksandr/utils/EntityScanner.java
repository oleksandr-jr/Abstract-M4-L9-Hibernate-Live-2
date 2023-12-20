package org.javarush.untils;

import javax.persistence.Entity;
import java.util.Set;
import org.reflections.Reflections;

public class EntityScanner {

    public static Set<Class<?>> getEntities() {
        Reflections reflections = new Reflections("org.javarush.entity");
        return reflections.getTypesAnnotatedWith(Entity.class);
    }

}

