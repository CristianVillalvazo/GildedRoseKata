package gildedrose;

import java.util.List;

public class GildedRose extends ReduceQuality{
	public void updateQuality(List<Item> items) {
	QuialityPrincipal calidades = new QuialityPrincipal();///Instans of the class Quality
	calidades.updateQuality(items);///Call the constructor "QualityAdvance" of the class Quality
	}
}
  