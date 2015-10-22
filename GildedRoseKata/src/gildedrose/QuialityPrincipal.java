package gildedrose;

import java.util.List;

public class QuialityPrincipal { ////////////Class where move the constructor of the class "GildedRose"

	QualitySource metodsApp = new QualitySource(); ///Instance of the class QualitySource
	public void QualityAdvance(List<Item> items) { ////New Constructor with the name "QualityAdvance"
		for (Item item : items) {

			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getQuality() > 0) {
					///metodsApp.getQuality(item);
					if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						metodsApp.RedcutirCalidad(item);///Call the metod of the class "QualitySource"
					}
				}
				
			} else if(item.getQuality() < 50) {
				metodsApp.getQuality(item);///Call the metod of the class "QualitySource"

					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11) {
							if (item.getQuality() < 50) {
								metodsApp.getQuality(item); ///Call the metod of the class "QualitySource"
								///item.setQuality(item.getQuality() + 1);
							}
						}

						
						if (item.getSellIn() < 6) {
							
							if (item.getQuality() < 50) {
								metodsApp.getQuality(item); ///Call the metod of the class "QualitySource"
								///item.setQuality(item.getQuality() + 1);
							}
						}
					}
				}
			

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				metodsApp.ReduceSellIn(item); ///Call the metod of the class "QualitySource"
				///item.setSellIn(item.getSellIn() - 1);
			}
			

			
			if(item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								metodsApp.RedcutirCalidad(item);///Call the metod of the class "QualitySource"
								///item.setQuality(item.getQuality() - 1);
							}
						}
						
						
					} else {
						metodsApp.ReduceEqualsQuiality(item);///Call the metod of the class "QualitySource"
						///item.setQuality(item.getQuality() - item.getQuality());
					}
					
				} else if (item.getQuality() < 50) {
					metodsApp.getQuality(item); ///Call the metod of the class "QualitySource"
						///item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}
	}