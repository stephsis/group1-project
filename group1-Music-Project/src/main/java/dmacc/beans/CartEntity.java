package dmacc.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cart")
public class CartEntity {
	
    @Column(name = "ID")
    @Id
    private int id;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "ITEM_NAME")
    private String item;

    @Column(name = "PRICE")
    private String price;

    @Column(name = "PHOTO_URL")
    private String photoURL;

    @Column(name = "QUANTITY")
    private int quantity;
    
    @Column(name="ENTITY_ID")
    private String entitySessionID;
    
    public CartEntity(int id, String brand, String item, String price) {
    	this.id = id;
    	this.brand = brand;
    	this.item = item;
    	this.price = price;
    }

}
