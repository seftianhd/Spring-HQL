package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tabel_produk")
public class Produk{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;

//    @ManyToOne
//    private Lembaga lembaga;

    public Produk() {
    }

    public Produk(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
