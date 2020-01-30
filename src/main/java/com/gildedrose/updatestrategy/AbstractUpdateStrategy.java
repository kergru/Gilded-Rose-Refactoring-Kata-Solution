package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

public abstract class AbstractUpdateStrategy implements UpdateStrategy {

    protected Item item;

    protected AbstractUpdateStrategy(Item item) {
        this.item = item;
    }


    protected void resetQuality() {
        item.quality = 0;
    }

    protected void decreaseSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decreaseQuality() {
        item.quality = item.quality - 1;
    }
}
