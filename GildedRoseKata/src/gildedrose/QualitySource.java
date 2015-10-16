package gildedrose;

public class QualitySource extends QualityMetods{
	
	
	@Override
	public void getQuality(Item item){
		item.setQuality(item.getQuality() + 1);
	}
	
	@Override
	public void RedcutirCalidad(Item item){
		item.setQuality(item.getQuality() - 1);
	}
	
	
	public void ReduceSellIn(Item item){
		item.setSellIn(item.getSellIn() - 1);
	}
	public void ReduceEqualsQuiality(Item item){
		item.setQuality(item.getQuality() - item.getQuality());

	}
}
