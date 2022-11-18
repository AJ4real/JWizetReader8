package me.aj4real.jwizetreader;

public class WizetFileHeader {
    private final String name, pkg1, copyright;
    private final long size;
    private final int start;
    private final WizetFile parent;

    public WizetFileHeader(String name, WizetFile parent, String pkg1, long size, int start, String copyright) {
        this.name = name;
        this.parent = parent;
        this.pkg1 = pkg1;
        this.size = size;
        this.start = start;
        this.copyright = copyright;
    }

    public String name() {
        return name;
    }

    public WizetFile parent() {
        return parent;
    }

    public int start() {
        return start;
    }

    public long size() {
        return size;
    }

    public String copyright() {
        return copyright;
    }

    public String pkg1() {
        return pkg1;
    }
}
