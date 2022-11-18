package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

import java.io.IOException;

public final class WizetReference implements WizetProperty {

    private final String name;
    private final WizetObject parent;
    private final String value;
    public WizetReference(String name, WizetObject parent, String value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
    }

    @Override
    public String value() {
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
        return PropertyType.UOL;
    }
    public WizetObject getReferencedObject() throws IOException {
        WizetContainer parent = (WizetContainer) getParent();
        return parent.get(value);
    }
}
