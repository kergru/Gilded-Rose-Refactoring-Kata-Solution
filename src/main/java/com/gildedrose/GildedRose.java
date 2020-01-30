package com.gildedrose;

import com.gildedrose.updatestrategy.UpdateStrategy;
import com.gildedrose.updatestrategy.UpdateStrategyFactory;

public class GildedRose {

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