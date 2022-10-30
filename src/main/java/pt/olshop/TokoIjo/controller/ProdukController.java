package pt.olshop.TokoIjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.olshop.TokoIjo.models.entities.Produk;
import pt.olshop.TokoIjo.services.ProdukService;

@RestController
@RequestMapping("api/produk")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping
    public Iterable<Produk> findsemua(){
        return produkService.findall();
    }

    @GetMapping("/{id}")
    public Produk cariSatu(@PathVariable("id") Long id){
        return produkService.CariPakaiId(id);
    }
}
