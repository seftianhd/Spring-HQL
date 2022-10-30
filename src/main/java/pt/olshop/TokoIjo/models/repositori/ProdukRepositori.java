package pt.olshop.TokoIjo.models.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pt.olshop.TokoIjo.models.entities.Produk;

import javax.websocket.server.PathParam;

public interface ProdukRepositori extends JpaRepository<Produk, Long> {
    @Query("SELECT p FROM Produk p")
    public Iterable <Produk> carisemua();

    @Query("SELECT p FROM Produk p WHERE p.id = :id")
    public Produk cariSatuById(@PathParam("id") Long id);
}
