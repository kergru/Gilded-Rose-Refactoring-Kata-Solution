package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

class ConjuredStrategy extends AbstractUpdateStrategy {

    ConjuredStrategy(Item item) {
        super(item);
    }

    @Override
    public void updateItem() {
        if (item.quality > 0) {
            decreaseQuality();
            decreaseQuality();
        }

        decreaseSellIn();
    }
}
