package inventory;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return null;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
