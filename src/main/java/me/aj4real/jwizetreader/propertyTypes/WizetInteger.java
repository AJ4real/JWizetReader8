package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetInteger implements WizetProperty {
    private final String name;
    private final WizetObject parent;
    private final Integer value;
    public WizetInteger(String name, WizetObject parent, Integer value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public Integer value() {
        return this.value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public WizetObject getParent() {
        return this.parent;
    }

    @Override
    public PropertyType type() {
        return PropertyType.INTEGER;
    }
}
