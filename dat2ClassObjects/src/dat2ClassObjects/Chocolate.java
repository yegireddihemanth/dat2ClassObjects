package dat2ClassObjects;

import lombok.Getter;
import lombok.Setter;

public class Chocolate {
	@Setter
	@Getter
	private String description;
	@Setter
	@Getter
	private double price;
	@Setter
	@Getter
	private double weight;
	@Setter
	@Getter
	private String packing;
	boolean sugerFree;
	
	public Chocolate() {
		
	}
	
	public Chocolate(String description, double weight, double price, String packing, boolean sugerFree ) {
		
		this.description=description;
		this.weight=weight;
		this.price=price;
		this.packing=packing;
		this.sugerFree=sugerFree;
		System.out.println(this);
	} 

//	public boolean isSugerFree() { 
//		return sugerFree;
//	}
//
//	public void setSugerFree(boolean sugerFree) {
//		this.sugerFree = sugerFree; // left hand is globle and right hand is local variable
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//
//	public String getPacking() {
//		return packing;
//	}
//
//	public void setPacking(String packing) {
//		this.packing = packing;
//	}

	@Override
	public String toString() {
		return "Chocolate [description=" + description + ", price=" + price + ", weight=" + weight + ", packing="
				+ packing + ", sugerFree=" + sugerFree + "]";
	}

}
