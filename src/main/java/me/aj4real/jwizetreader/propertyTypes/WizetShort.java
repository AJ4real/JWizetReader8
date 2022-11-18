package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetShort implements WizetProperty {
    private final String name;
    private final WizetObject parent;
    private final Short value;

    public WizetShort(String name, WizetObject parent, Short value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public Short value() {
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
        return PropertyType.SHORT;
    }
}
