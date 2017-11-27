package cz.expertkom.ju.interfaces.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductPrice implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*název výrobku */
	private String name;
	
	/* html odkaz*/
	private String uriLink;
	
	/* cena s DPH */
	private String priceWithVAT;
	
	/*cena bez DPH */
	private String priceWithoutVAT;
	
	public ProductPrice(String name, String priceWithVAT, String priceWithoutVAT) {
		this.name = name;
		this.priceWithVAT = priceWithVAT;
		this.priceWithoutVAT = priceWithoutVAT;
	}

	public ProductPrice(ProductPrice par) {
		this.name = par.getName();
		this.uriLink=par.uriLink;
		this.priceWithVAT = par.getPriceWithVAT();
		this.priceWithoutVAT = par.getPriceWithoutVAT();
	}

	public ProductPrice() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUriLink() {
		return uriLink;
	}

	public void setUriLink(String uriLink) {
		this.uriLink = uriLink;
	}

	public String getPriceWithVAT() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductPrice [name=" + name + ", uriLink=" + uriLink + ", priceWithVAT=" + priceWithVAT
				+ ", priceWithoutVAT=" + priceWithoutVAT + "]";
	}
	 
	
	
	

}
