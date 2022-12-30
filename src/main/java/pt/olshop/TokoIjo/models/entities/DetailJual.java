package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;

@Entity
public class DetailJual {
    @Id
    private long idJual;
    private int kuantitas;
    private int hargajual;

    @ManyToOne
    @JoinColumn(name = "nofraktur",insertable = false,updatable = false)
    private TransaksiJual transaksiJual;

    public DetailJual(long idJual, int kuantitas, int hargajual, TransaksiJual transaksiJual) {
        this.idJual = idJual;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.transaksiJual = transaksiJual;
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
}
