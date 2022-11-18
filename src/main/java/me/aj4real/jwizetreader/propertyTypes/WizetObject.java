package me.aj4real.jwizetreader.propertyTypes;

import me.aj4real.jwizetreader.PropertyType;

public interface WizetObject {
    String getName();
    WizetObject getParent();
    PropertyType type();
    default String getPath() {
        WizetObject current = this;
        String ret = "/" + current.getName();
        while(current.getParent() != null) {
            current = current.getParent();
            ret = "/" + current.getName() + ret;
        }
        return ret;
    }
}
