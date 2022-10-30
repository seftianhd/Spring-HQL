package pt.olshop.TokoIjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.Produk;
import pt.olshop.TokoIjo.models.repositori.ProdukRepositori;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProdukService {
    @Autowired
    private ProdukRepositori produkRepositori;

    public Iterable<Produk> findall(){
        return produkRepositori.carisemua();
    }

    public Produk CariPakaiId(Long id){
        return produkRepositori.cariSatuById(id);
    }
}
