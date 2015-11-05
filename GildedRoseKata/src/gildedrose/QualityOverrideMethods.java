package gildedrose;

public class QualityOverrideMethods extends QualityMetods{ ///Extend of the class QualitySource
	
////////////Se utilizo SOLID, haciendo herencia de los metodos de la clase QualitySource
	///////////ademas del uso de polimorfismo sobrescribiendo  los metodos asignandoles
	//////funciones, para las condiciones IF y ELSE de la clase QualityPrincipal

	
	@Override
	public void getQualityPlus1(Item item){
	item.setQuality(item.getQuality() + 1);
	}
	
	@Override
	public void ReducingQualityLess1(Item item){
	item.setQuality(item.getQuality() - 1);
	}
	
	@Override
	public void GetShellInLess1(Item item){
		item.setSellIn(item.getSellIn() - 1);
	}
	
	
	@Override
	public void ReducingQualityThat2(Item item){
		item.setQuality(item.getQuality() - 2);
	}
	
	@Override
	public void ReduceEqualsQuiality(Item item){
		item.setQuality(item.getQuality() - item.getQuality());
	}
	
	
	
	}

