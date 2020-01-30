package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

class DefaultStrategy extends AbstractUpdateStrategy {

    DefaultStrategy(Item item) {
        super(item);
    }

    @Override
    public void updateItem() {
        if (item.quality > 0) {
            decreaseQuality();
        }

        decreaseSellIn();

        if (item.sellIn < 0 && item.quality > 0) {
            decreaseQuality();
        }
    }
}
