package pt.olshop.TokoIjo.models.repositori;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pt.olshop.TokoIjo.models.entities.Produk;

public interface ProdukRepositori extends CrudRepository<Produk, Long> {

    @Query("SELECT p FROM Produk p")
    Iterable <Produk> carisemua();

    @Query("SELECT p FROM Produk p WHERE p.id =:id")
    Produk cariSatuById(@Param("id") Long id);
}
