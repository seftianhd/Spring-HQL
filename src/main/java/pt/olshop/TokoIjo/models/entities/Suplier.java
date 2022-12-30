package pt.olshop.TokoIjo.models.entities;


import javax.persistence.*;

@Entity
@Table(name = "suplier")
public class Suplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplierid;
    private String suppliername;
    private String alamat;
    private String kota;
    private String notelepon;

    public Suplier() {
    }

    public Suplier(String suppliername, String alamat, String kota, String notelepon) {
        this.suppliername = suppliername;
        this.alamat = alamat;
        this.kota = kota;
        this.notelepon = notelepon;
    }

    public long getSupplierid() {
        return supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
    }
}
