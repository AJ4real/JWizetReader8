package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetNull implements WizetProperty {
    private final String name;
    private final WizetObject parent;

    public WizetNull(String name, WizetObject parent) {
        this.name = name;
        this.parent = parent;
    }

    @Override
    public Object value() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public WizetObject getParent() {
        return parent;
    }

    @Override
    public PropertyType type() {
        return PropertyType.NULL;
    }
}
