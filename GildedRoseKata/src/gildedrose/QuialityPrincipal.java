package gildedrose;

import java.util.List;

public class QuialityPrincipal extends ReduceQuality{
	QualityOverrideMethods metodsApp = new QualityOverrideMethods(); ///Instance of the class QualitySource

	/**public void updateQuality(List<Item> items) {
	QuialityPrincipal calidades = new QuialityPrincipal();///Instans of the class Quality
	calidades.QualityAdvance(items);///Call the constructor "QualityAdvance" of the class Quality
	}**/
	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {

			if (!item.getName().equals("Aged Brie")
					&& !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				ReducingQuality(item);
			} else {
				if (item.getQuality() < 50) {
					metodsApp.getQualityPlus1(item);
			
					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						Reduce(item, 11);
						Reduce(item, 6);
					}
				}
			}
			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				metodsApp.GetShellInLess1(item);
			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						ReducingQuality(item);
					} else {
						metodsApp.ReduceEqualsQuiality(item);
					}
				} else {
					ReducingThan50Quality(item);
				}
				
			}
		}
	}


}
	
  