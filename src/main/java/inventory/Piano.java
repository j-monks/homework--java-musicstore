package inventory;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, int numberOfKeys) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return "Do do de de ting";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public double calculateMarkup() {
        double profit = this.getSellPrice() - this.getBuyPrice();
        double cost = this.getBuyPrice();
        return profit / cost * 100;
    }
}
