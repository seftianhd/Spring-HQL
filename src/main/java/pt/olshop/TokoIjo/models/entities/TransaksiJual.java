package pt.olshop.TokoIjo.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "penjualan")
public class TransaksiJual implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nofraktur;
    private int date;
    private int time;
    private int total;
    private int bayar;
    private int kembalian;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transaksiJual",fetch = FetchType.LAZY)
    @JsonBackReference
//    @JsonManagedReference
    private List<DetailJual> detailJuals;

    public TransaksiJual() {
    }

    public TransaksiJual(long nofraktur, int date, int time, int total, int bayar, int kembalian, List<DetailJual> detailJuals) {
        this.nofraktur = nofraktur;
        this.date = date;
        this.time = time;
        this.total = total;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.detailJuals = detailJuals;
    }

    public long getNofraktur() {
        return nofraktur;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public List<DetailJual> getDetailJuals() {
        return detailJuals;
    }

    public void setDetailJuals(List<DetailJual> detailJuals) {
        this.detailJuals = detailJuals;
    }
}
