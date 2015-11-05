package gildedrose;

import gildedrose.GildedRose; ;

public abstract class QualityMetods { 
	////////////Se utiliza patron de diseño SOLID, en el uso Open/Close, con una clase abstracta
	///o una interface, en este caso, se utilizo la clase abstracta, donde la funcion principal de 
	////los metodos es utilizar la reduccion o aumento de calidad para las condiciones

	
	public void ReducingQualityLess1(Item item){
		item.setQuality(item.getQuality());
		///item.setQuality(item.getQuality() - 1);
	}
	
	public void getQualityPlus1(Item item){
		item.setQuality(item.getQuality());
		///item.setQuality(item.getQuality() + 1);
	}
	
	public void ReducingQualityThat2(Item item){
		item.setQuality(item.getQuality());
		///item.setQuality(item.getQuality() - 2);
	}
	
	public void GetShellInLess1(Item item){
		item.setQuality(item.getQuality());
		///item.setSellIn(item.getSellIn() - 1);
	}
	
	public void ReduceEqualsQuiality(Item item){
		item.setQuality(item.getQuality());
		///item.setQuality(item.getQuality() - item.getQuality());
	}
	
	
}
