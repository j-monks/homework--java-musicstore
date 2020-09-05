package shop;

import behaviours.ISell;
import inventory.Instrument;
import inventory.Piano;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.till = 100.00;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }
}



