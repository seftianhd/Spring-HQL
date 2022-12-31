package pt.olshop.TokoIjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.Admin;
import pt.olshop.TokoIjo.models.repositori.AdminRepositori;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminService {

    @Autowired
    AdminRepositori adminRepositori;
    @PersistenceUnit
    EntityManagerFactory emf;

    public Admin simpan(Admin admin){
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(admin);
        em.getTransaction().commit();
//        emf.close();
        return admin;
    }

    public Iterable<Admin> cariSemuaAdmin(){
        return adminRepositori.carisemua();
    }

    public Admin cariId(Long id){
        return adminRepositori.cariId(id);
    }

    public Admin upadte(Admin admin){
        EntityManager em = emf.createEntityManager();
        Admin admin1 = em.find(Admin.class,admin.getId());

        em.getTransaction().begin();
        admin1.setUsername(admin.getUsername());
        admin1.setPassword(admin.getPassword());
        em.getTransaction().commit();
        return admin1;
    }

    public Iterable<Admin> cariSemuaCriteria(){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Admin> a = cb.createQuery(Admin.class);
        Root<Admin> ad = a.from(Admin.class);
        a.select(ad);

        TypedQuery<Admin> query = em.createQuery(a);
        List<Admin> result = query.getResultList();
        return result;
    }

    public Iterable<Admin> cariInConditionCriteria(long id){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Admin> a = cb.createQuery(Admin.class);
        Root<Admin> root = a.from(Admin.class);
        a.select(root).where(cb.gt(root.get("id"),id));

        TypedQuery<Admin> query = em.createQuery(a);
        List<Admin> result = query.getResultList();
        return result;
    }
}
