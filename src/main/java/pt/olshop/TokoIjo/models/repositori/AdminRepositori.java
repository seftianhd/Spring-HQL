package pt.olshop.TokoIjo.models.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import pt.olshop.TokoIjo.models.entities.Admin;
import pt.olshop.TokoIjo.models.entities.Produk;

public interface AdminRepositori extends JpaRepository<Admin,Long> {

    @Query("SELECT a FROM Admin a")
    Iterable <Admin> carisemua();

    @Query("SELECT a FROM Admin a WHERE a.id =:id")
    public Admin cariId(@Param("id") Long id);
}
