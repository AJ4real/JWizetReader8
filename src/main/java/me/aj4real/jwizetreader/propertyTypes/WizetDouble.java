package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetDouble implements WizetProperty {

    private final String name;
    private final WizetObject parent;
    private final Double value;

    public WizetDouble(String name, WizetObject parent, Double value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public Double value() {
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
        return PropertyType.DOUBLE;
    }
}
