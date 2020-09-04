package inventory;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return null;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
