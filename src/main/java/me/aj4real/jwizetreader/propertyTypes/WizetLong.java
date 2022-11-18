package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetLong implements WizetProperty {
    private final String name;
    private final WizetObject parent;
    private final Long value;
    public WizetLong(String name, WizetObject parent, Long value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public Long value() {
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
        return PropertyType.LONG;
    }
}
