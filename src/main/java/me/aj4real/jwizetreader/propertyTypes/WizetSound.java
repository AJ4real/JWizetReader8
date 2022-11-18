package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetSound implements WizetProperty {
    private final String name;
    private final WizetObject parent;
    public WizetSound(String name, WizetObject parent, long offset, long size) {
        this.name = name;
        this.parent = parent;
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
        return PropertyType.SOUND;
    }
    public Object value() {
        return null;
    }
}
