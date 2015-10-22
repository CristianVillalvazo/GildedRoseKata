package gildedrose;

import java.util.List;

public class GildedRose {
	
	
	
	public void updateQuality(List<Item> items) {
	QuialityPrincipal calidades = new QuialityPrincipal();///Instans of the class Quality
	calidades.QualityAdvance(items);///Call the constructor "QualityAdvance" of the class Quality
	}
  }