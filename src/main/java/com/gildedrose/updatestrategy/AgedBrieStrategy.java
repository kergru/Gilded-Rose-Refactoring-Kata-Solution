package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

class AgedBrieStrategy extends AbstractUpdateStrategy {

    AgedBrieStrategy(Item item) {
        super(item);
    }

    @Override
    public void updateItem() {
        increaseQuality();
        decreaseSellIn();

        if (item.sellIn < 0) {
            increaseQuality();
        }
    }
}
