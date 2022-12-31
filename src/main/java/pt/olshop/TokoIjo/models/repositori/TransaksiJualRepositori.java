package pt.olshop.TokoIjo.models.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pt.olshop.TokoIjo.models.entities.Admin;
import pt.olshop.TokoIjo.models.entities.TransaksiJual;

public interface TransaksiJualRepositori extends JpaRepository<TransaksiJual, Long> {
    @Query("SELECT t FROM TransaksiJual t")
    Iterable <TransaksiJual> carisemua();

}
