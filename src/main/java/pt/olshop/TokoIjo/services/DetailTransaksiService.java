package pt.olshop.TokoIjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.olshop.TokoIjo.models.entities.DetailJual;
import pt.olshop.TokoIjo.models.repositori.DetailJualRepositori;

import javax.transaction.Transactional;

@Service
@Transactional
public class DetailTransaksiService {
    @Autowired
    DetailJualRepositori detailJualRepositoril;

    public Iterable<DetailJual> carisemua(){
        return detailJualRepositoril.findAll();
    }
}
