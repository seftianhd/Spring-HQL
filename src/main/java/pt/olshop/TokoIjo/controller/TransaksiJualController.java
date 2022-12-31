package pt.olshop.TokoIjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.olshop.TokoIjo.models.entities.TransaksiJual;
import pt.olshop.TokoIjo.services.TransaksiJualService;

@RestController
@RequestMapping("api/transaksijual")
public class TransaksiJualController {
    @Autowired
    TransaksiJualService transaksiJualService;

    @PostMapping
    public TransaksiJual simpan(@RequestBody TransaksiJual transaksiJual){
        return transaksiJualService.simpan(transaksiJual);
    }

    @GetMapping
    public Iterable<TransaksiJual> cari(){
        return transaksiJualService.cari();
    }
}
