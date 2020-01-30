package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

public class UpdateStrategyFactory {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";

    public static UpdateStrategy getStrategy(Item item) {
        if(item.name.equals(AGED_BRIE)) {
            return new AgedBrieStrategy(item);
        } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new SulfurasStrategy(item);
        } else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            return new BackstagePassStrategy(item);
        } else if (item.name.equals(CONJURED)) {
            return new ConjuredStrategy(item);
        } else {
            return new DefaultStrategy(item);
        }
    }
}
