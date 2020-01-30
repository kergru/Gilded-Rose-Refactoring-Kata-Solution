package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

class BackstagePassStrategy extends AbstractUpdateStrategy {

    BackstagePassStrategy(Item item) {
        super(item);
    }

    @Override
    public void updateItem() {
        increaseQuality();

        if (item.sellIn < 11) {
            increaseQuality();
        }

        if (item.sellIn < 6) {
            increaseQuality();
        }

        decreaseSellIn();

        if (item.sellIn < 0) {
            resetQuality();
        }
    }
}
