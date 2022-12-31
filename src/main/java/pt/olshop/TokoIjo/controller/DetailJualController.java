package pt.olshop.TokoIjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.olshop.TokoIjo.models.entities.DetailJual;
import pt.olshop.TokoIjo.services.DetailTransaksiService;

@RestController
@RequestMapping("api/detailjual")
public class DetailJualController {
    @Autowired
    DetailTransaksiService detailTransaksiService;

    @GetMapping
    public Iterable<DetailJual> cari(){
        return detailTransaksiService.carisemua();
    }
}
