package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item {

    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor;
        if (this.sellIn >= 0) {
            if (this.quality < 50) {
                quality++;
            }
        } else {
            if (this.quality > 0) {
                quality--;
            }
        }
    }

}
