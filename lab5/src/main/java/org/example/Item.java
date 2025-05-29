package org.example;

public class Item implements Comparable<Item> {
    public int value;
    public int weight;
    public int index;
    public boolean isPacked = false;

    public Item(int itemValue, int itemWeight, int itemIndex) {
        this.value = itemValue;
        this.weight = itemWeight;
        this.index = itemIndex;
    }

    @Override
    public int compareTo(Item other) {
        if (other == null) return 1;
        int thisRatio = this.value * (1000 / this.weight);
        int otherRatio = other.value * (1000 / other.weight);
        return Integer.compare(thisRatio, otherRatio);
    }

    @Override
    public String toString() {
        int ratio = value * (1000 / weight);
        return "no.: " + index + "  v: " + value + " w: " + weight + " [" + ratio + "]";
    }
}
