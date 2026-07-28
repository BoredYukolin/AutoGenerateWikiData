package io.github.nickid2018.genwiki.statistic;

public record BlockPosEntry(int x, int y, int z) {

    @Override
    public String toString() {
        return x + ", " + y + ", " + z;
    }
}
