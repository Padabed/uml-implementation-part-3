package overlapping;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Supplement {

    private String name;
    private double volume;
    private Double strength;
    private Double maxDose;
    private Set<Component> components = new HashSet<>();

    public Supplement(String name, double volume, Set<Component> components,
                      Double strength, Double maxDose) {
        setName(name);
        setVolume(volume);
        setComponents(components);

        if (this.components.contains(Component.Alcohol)) {
            setStrength(strength);
        }

        if (this.components.contains(Component.Caffeine)
                && !this.components.contains(Component.Electrolytes)) {
            components.add(Component.Electrolytes);
        }

        if (this.components.contains(Component.Alcohol)
                && !this.components.contains(Component.Electrolytes)) {
            setMaxDose(maxDose);   // in this case strongly required
        }

    }

    public String nextAction() {
        if (this.components.contains(Component.Melatonin)
                && this.components.contains(Component.Caffeine)) {
            return "You are taking a risk";
        }
        if (this.components.contains(Component.Melatonin)
                && !this.components.contains(Component.Caffeine)) {
            return "Get some sleep";
        }
        if (this.components.contains(Component.Caffeine)
                && this.components.contains(Component.Alcohol)) {
            return "Party hard";
        }
        if (this.components.contains(Component.Alcohol)) {
            return "Depends on the dose";
        }
        return "has no recommendations";
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        if (this.components.contains(Component.Alcohol)) {
            throw new IllegalArgumentException("Does not contains alcohol");
        }
        if (strength == null || strength < 3.6 || strength > 90) {
            throw new IllegalArgumentException("Not Client-Oriented or against the law");
        }
        this.strength = strength;
    }

    public double getMaxDose() {
        return maxDose;
    }

    public void setMaxDose(Double maxDose) {
        if (this.components.contains(Component.Alcohol)
                && this.components.contains(Component.Electrolytes)) {
            throw new IllegalArgumentException("Max dose is not required");
        }
        if (maxDose == null || maxDose <= 0) {
            throw new IllegalArgumentException("Max dose cannot be managed");
        }
        this.maxDose = maxDose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume < 50) {
            throw new IllegalArgumentException("Not worth the money");
        }
        this.volume = volume;
    }

    public Set<Component> getComponents() {
        return Collections.unmodifiableSet(components);
    }

    private void setComponents(Set<Component> components) {
        for (Component c : components) {
            if (c != null) this.components.add(c);
        }
        if (this.components.size() < 1) {
            throw new IllegalArgumentException("Supplement is a dummy");
        }
    }

    @Override
    public String toString() {
        return "Supplement{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", strength=" + strength +
                ", maxDose=" + maxDose +
                ", components=" + components +
                '}';
    }

}
