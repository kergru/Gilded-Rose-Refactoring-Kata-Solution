package com.gildedrose;

import com.gildedrose.updatestrategy.UpdateStrategy;
import com.gildedrose.updatestrategy.UpdateStrategyFactory;

public class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateStrategy strategy = UpdateStrategyFactory.getStrategy(item);
            strategy.updateItem();
        }
    }
}