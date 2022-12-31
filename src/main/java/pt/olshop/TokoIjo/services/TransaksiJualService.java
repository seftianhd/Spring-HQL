package pt.olshop.TokoIjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.Barang;
import pt.olshop.TokoIjo.models.entities.DetailJual;
import pt.olshop.TokoIjo.models.entities.TransaksiJual;
import pt.olshop.TokoIjo.models.repositori.DetailJualRepositori;
import pt.olshop.TokoIjo.models.repositori.TransaksiJualRepositori;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

@Service
@Transactional
public class TransaksiJualService {
//    @PersistenceUnit
//    EntityManagerFactory emf;
    @Autowired
    TransaksiJualRepositori transaksiJualRepositori;

    public TransaksiJual simpan(TransaksiJual transaksiJual){
        for (DetailJual detailJual : transaksiJual.getDetailJuals()){
            detailJual.setTransaksiJual(transaksiJual);
//            detailJual.setBarang(detailJual.getBarang());
        }
        transaksiJual.setDetailJuals(transaksiJual.getDetailJuals());
        transaksiJualRepositori.save(transaksiJual);

        return transaksiJual;
    }

    public Iterable<TransaksiJual> cari(){
        return transaksiJualRepositori.carisemua();
    }
}
