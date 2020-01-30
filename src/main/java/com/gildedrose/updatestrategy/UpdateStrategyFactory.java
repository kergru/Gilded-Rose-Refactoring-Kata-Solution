package com.gildedrose.updatestrategy;

import com.gildedrose.Item;

import static com.gildedrose.GildedRose.AGED_BRIE;
import static com.gildedrose.GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.GildedRose.SULFURAS_HAND_OF_RAGNAROS;

public class UpdateStrategyFactory {

    public static UpdateStrategy getStrategy(Item item) {
        if(item.name.equals(AGED_BRIE)) {
            return new AgedBrieStrategy(item);
        } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new SulfurasStrategy(item);
        } else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            return new BackstagePassStrategy(item);
        } else {
            return new DefaultStrategy(item);
        }
    }
}
