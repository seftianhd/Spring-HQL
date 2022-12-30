package pt.olshop.TokoIjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.Admin;
import pt.olshop.TokoIjo.models.entities.Barang;
import pt.olshop.TokoIjo.models.repositori.BarangRepositori;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

@Service
@Transactional
public class BarangService {
    @Autowired
    BarangRepositori barangRepositori;

    @PersistenceUnit
    EntityManagerFactory emf;

    public Barang simpan(Barang barang){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(barang);
        em.getTransaction().commit();
        return barang;
    }

}
