package tp.securingweb.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "adress")
    private String adress;
    @Column(name = "price")
    private double price;
    public Property(){

    }
    public Property(long id,String adress,double price){
        this.id=id;
        this.adress=adress;
        this.price=price;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
