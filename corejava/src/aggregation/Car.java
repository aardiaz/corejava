package aggregation;

public class Car {
	
	private String model;
	private String company;
	private int cc;
	private int price;
	private String color;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", cc=" + cc + ", price=" + price + ", color=" + color
				+ "]";
	}
	
	
	
	

}
