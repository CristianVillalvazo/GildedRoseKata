package gildedrose;

public class ReduceQuality extends QuialityPrincipal{
	
	 public void ReduceQualityThanNumbers(Item item) {
	        if (item.getQuality() < 50) {
	            item.setQuality(item.getQuality() + 1);
	        }
	    }

	    public void ReducingQuality(Item item) {
	        if (item.getQuality() > 0) {
	            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
	                if (item.getName() == "Conjured Mana Cake") {
	                    item.setQuality(item.getQuality() - 2);
	                } else {
	                    item.setQuality(item.getQuality() - 1);
	                }
	            }
	        }
	    }

	    public void Reduce(Item item, int x) {
	        if (item.getSellIn() < x) {
	            ReduceQualityThanNumbers(item);
	        }
	    }
	}