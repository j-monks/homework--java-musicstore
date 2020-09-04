package shop;

import inventory.Instrument;

public class ShopItem {
    private String description;
    private double purchasePrice;
    private double sellPrice;
    private Instrument instrument;

    public ShopItem(Instrument instrument, double purchasePrice, double sellPrice) {
//        this.description = Instrument;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
