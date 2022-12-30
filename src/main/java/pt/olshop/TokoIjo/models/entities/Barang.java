package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "tabel_barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idbarang;
    private String namabarang;
    private int hargabeli;
    private int hargajual;
    private int stok;

    public Barang() {
    }

    public Barang(String namabarang, int hargabeli, int hargajual, int stok) {
        this.namabarang = namabarang;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
        this.stok = stok;
    }

    public long getIdbarang() {
        return idbarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(int hargabeli) {
        this.hargabeli = hargabeli;
    }

    public int getHargajual() {
        return hargajual;
    }

    public void setHargajual(int hargajual) {
        this.hargajual = hargajual;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

