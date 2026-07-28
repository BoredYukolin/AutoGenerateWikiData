package io.github.nickid2018.genwiki.statistic;

public record BlockPosSeedEntry(int x, int y, int z, long seed) {

    @Override
    public String toString() {
        return "[" + x + " " + y + " " + z + "] in [" + seed + "]";
    }
}
