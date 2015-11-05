package gildedrose;


public class ReduceQuality {
	QualityOverrideMethods qualityMethods = new QualityOverrideMethods(); ///Instance of the class QualitySource
	
    public void ReducingThan50Quality(Item item) {
        if (item.getQuality() < 50) {
        	qualityMethods.getQualityPlus1(item);
        }
    }

    public void ReducingQuality(Item item) {
        if (item.getQuality() > 0) {
            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                if (item.getName() == "Conjured Mana Cake") {
                  qualityMethods.ReducingQualityThat2(item);
                } else {
                  qualityMethods.ReducingQualityLess1(item);
                }
            }
        }
    }
    
    public void Reduce(Item item, int x) {
        if (item.getSellIn() < x) {
            ReducingThan50Quality(item);
        }
    }
}
/**public void qualityLessThat50(Item item) {
if (item.getQuality() < 50) {
    item.setQuality(item.getQuality() + 1);
}
}

private void lessTo(Item item, int x) {
if (item.getSellIn() < x) {
    qualityLessThat50(item);
}
}


private void lessQuality(Item item) {
if (item.getQuality() > 0) {
    if (item.getName() != "Sulfuras, Hand of Ragnaros") {
        if (item.getName() == "Conjured Mana Cake") {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
}**/
