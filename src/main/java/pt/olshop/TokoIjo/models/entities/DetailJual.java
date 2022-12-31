package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailJual implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idJual;
    private int kuantitas;
    private int hargajual;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nofraktur",referencedColumnName = "nofraktur")
    private TransaksiJual transaksiJual;

    @OneToOne
    @JoinColumn(name = "idbarang",referencedColumnName = "idbarang")
    private Barang barang;

    public DetailJual(long idJual, int kuantitas, int hargajual, TransaksiJual transaksiJual, Barang barang) {
        this.idJual = idJual;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.transaksiJual = transaksiJual;
        this.barang = barang;
    }

    public DetailJual() {
    }

    public long getIdJual() {
        return idJual;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getHargajual() {
        return hargajual;
    }

    public void setHargajual(int hargajual) {
        this.hargajual = hargajual;
    }

    public TransaksiJual getTransaksiJual() {
        return transaksiJual;
    }

    public void setTransaksiJual(TransaksiJual transaksiJual) {
        this.transaksiJual = transaksiJual;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}
