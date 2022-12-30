package pt.olshop.TokoIjo.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "pembelian")
public class TransaksiBeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nofrakturBeli;
    private int date;
    private int time;
    private int total;

    public TransaksiBeli() {
    }

    public TransaksiBeli(int date, int time, int total) {
        this.date = date;
        this.time = time;
        this.total = total;
    }

    public long getNofrakturBeli() {
        return nofrakturBeli;
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
}
