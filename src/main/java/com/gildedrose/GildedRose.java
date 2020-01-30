package com.gildedrose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if(item.name.equals(AGED_BRIE)) {
                increaseQuality(item);
                decreaseSellIn(item);

                if (item.sellIn < 0) {
                    increaseQuality(item);
                }
            } else if(item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                increaseQuality(item);

                if (item.sellIn < 11) {
                    increaseQuality(item);
                }

                if (item.sellIn < 6) {
                    increaseQuality(item);
                }

                decreaseSellIn(item);

                if (item.sellIn < 0) {
                    resetQuality(item);
                }
            } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {

            } else {
                if (item.quality > 0) {
                    decreaseQuality(item);
                }

                decreaseSellIn(item);

                if (item.sellIn < 0 && item.quality > 0) {
                    decreaseQuality(item);
                }
            }
        }
    }

    private void resetQuality(Item item) {
        item.quality = 0;
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }
}