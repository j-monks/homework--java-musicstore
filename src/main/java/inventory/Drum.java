package inventory;

import behaviours.IPlay;

public class Drum extends Instrument implements IPlay {

    private int diameter;

    public Drum(int diameter) {
        this.diameter = diameter;
    }

    public String play() {
        return null;
    }

    public int getDiameter() {
        return diameter;
    }
}
