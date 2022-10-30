package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "tabel_produk")
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    private Lembaga lembaga;

    public Produk() {
    }

    public Produk(Long id, String name, Double price, Lembaga lembaga) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.lembaga = lembaga;
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

    public Lembaga getLembaga() {
        return lembaga;
    }

    public void setLembaga(Lembaga lembaga) {
        this.lembaga = lembaga;
    }
}
