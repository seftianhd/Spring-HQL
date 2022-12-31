package pt.olshop.TokoIjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.olshop.TokoIjo.models.entities.Barang;
import pt.olshop.TokoIjo.services.BarangService;

@RestController
@RequestMapping("api/barang")
public class BarangController {
    @Autowired
    BarangService barangService;

    @PostMapping
    public Barang Simpan(@RequestBody Barang barang){
        return barangService.simpan(barang);
    }
}
