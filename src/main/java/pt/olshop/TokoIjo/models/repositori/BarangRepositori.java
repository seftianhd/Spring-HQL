package pt.olshop.TokoIjo.models.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.olshop.TokoIjo.models.entities.Barang;

public interface BarangRepositori extends JpaRepository<Barang,Long> {
}
