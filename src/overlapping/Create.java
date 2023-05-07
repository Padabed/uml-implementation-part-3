package overlapping;

import dynamic.SuperCar;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Create {

    public static void main(String[] args) {
        Set<Component> components = new HashSet<>();
        components.add(null);
        components.add(Component.Caffeine);
        components.add(null);

        System.out.println(components.size());

        Supplement supplement = new Supplement("Idea", 100, components, null, null);

        System.out.println(supplement.getComponents().size());

        for (Component component : supplement.getComponents()) {
            System.out.println(component);
        }

        System.out.println(supplement.nextAction());

    }

}
