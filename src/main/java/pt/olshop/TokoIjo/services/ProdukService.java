package pt.olshop.TokoIjo.services;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.Produk;
import pt.olshop.TokoIjo.models.repositori.ProdukRepositori;

import javax.persistence.*;
import javax.transaction.Transactional;
//import java.lang.module.Configuration;

@Service
@Transactional
public class ProdukService {
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pt.olshop.Tokoijo");
//    @PersistenceContext
//    private EntityManager entityManager;
    @PersistenceUnit
    EntityManagerFactory emf;
    @Autowired
    private ProdukRepositori produkRepositori;

    public Produk simpan(Produk produk){
        Produk produk1 = produk;
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(produk1);
        em.getTransaction().commit();
//        emf.close();
        return produk;
    }

    public Iterable<Produk> findall(){
        return produkRepositori.carisemua();
    }

    public Produk CariPakaiId(Long id){
        return produkRepositori.cariSatuById(id);
    }

//    public Produk simpa(Produk produk) {
//        return produkRepositori.save(produk);
//    }
    public Produk update(Produk produk){
        return produk;
    }
}
