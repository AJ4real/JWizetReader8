package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public final class WizetVector implements WizetProperty {
    private final String name;
    private final WizetObject parent;
    private final long x, y;
    public WizetVector(String name, WizetObject parent, long x, long y) {
        this.name = name;
        this.parent = parent;
        this.x = x;
        this.y = y;
        }

    public long x() {
        return this.x;
    }
    public long y() {
        return this.y;
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
        return PropertyType.VECTOR;
    }
    public Object value() {
        return null;
    }
}
