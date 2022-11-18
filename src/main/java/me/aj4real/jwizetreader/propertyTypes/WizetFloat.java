package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetFloat implements WizetProperty {

    private final String name;
    private final WizetObject parent;
    private final Float value;

    public WizetFloat(String name, WizetObject parent, Float value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public Float value() {
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
        return PropertyType.FLOAT;
    }
}
