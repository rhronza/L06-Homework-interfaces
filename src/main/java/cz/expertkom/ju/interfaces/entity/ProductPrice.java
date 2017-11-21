package cz.expertkom.ju.interfaces.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductPrice /*implements Serializable*/{

	//private static final long serialVersionUID = 1L;
	
	/*název výrobku */
	private String name;
	/* cena s DPH */
	private String priceWithVAT;
	/*cena bez DPH */
	private String priceWithoutVAT;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriceVAT() {
		return priceWithVAT;
	}
	public void setPriceWithVAT(String priceWithVAT) {
		this.priceWithVAT = priceWithVAT;
	}
	public String getPriceWithoutVAT() {
		return priceWithoutVAT;
	}
	public void setPriceWithoutVAT(String priceWithoutVAT) {
		this.priceWithoutVAT = priceWithoutVAT;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", PriceWithVAT=" + priceWithVAT+ ", priceWithoutVAT= " + priceWithoutVAT+ "]";
	}
	
	

}
