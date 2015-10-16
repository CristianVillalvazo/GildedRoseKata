package gildedrose;

import java.util.List;

public class GildedRose {
	
	
	PublicMetods metodsApp = new PublicMetods();
	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {

			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getQuality() > 0) {
					///metodsApp.getQuality(item);
					if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						metodsApp.RedcutirCalidad(item);
					}
				}
				
				
			} else if(item.getQuality() < 50) {
				metodsApp.getQuality(item);

					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11) {
							if (item.getQuality() < 50) {
								metodsApp.getQuality(item);
								///item.setQuality(item.getQuality() + 1);
							}
						}

						
						if (item.getSellIn() < 6) {
							
							if (item.getQuality() < 50) {
								metodsApp.getQuality(item);
								///item.setQuality(item.getQuality() + 1);
							}
						}
					}
				}
			

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				metodsApp.ReduceSellIn(item);
				///item.setSellIn(item.getSellIn() - 1);
			}
			

			
			if(item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								metodsApp.RedcutirCalidad(item);
								///item.setQuality(item.getQuality() - 1);
							}
						}
						
						
					} else {
						metodsApp.ReduceEqualsQuiality(item);
						///item.setQuality(item.getQuality() - item.getQuality());
					}
					
				} else if (item.getQuality() < 50) {
					metodsApp.getQuality(item);
						///item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}
	}


