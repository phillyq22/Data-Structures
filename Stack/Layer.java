
public class Layer {
	int numItems = 0;
	double weightOfItem = 0.0;
	double weight = 0.0;
	
	public Layer(int numItems, double weightOfItem)
	{
		this.numItems = numItems;
		this.weightOfItem = weightOfItem;
		this.weight = (numItems*weightOfItem);
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public double getWeightOfItem() {
		return weightOfItem;
	}

	public void setWeightOfItem(double weightOfItem) {
		this.weightOfItem = weightOfItem;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
