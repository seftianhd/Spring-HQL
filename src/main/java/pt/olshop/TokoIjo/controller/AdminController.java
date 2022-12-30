package pt.olshop.TokoIjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.olshop.TokoIjo.datatransferobject.SearchData;
import pt.olshop.TokoIjo.models.entities.Admin;
import pt.olshop.TokoIjo.services.AdminService;


@RestController
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping
    public Admin SimpanData(@RequestBody Admin admin){
        return adminService.simpan(admin);
    }

    @GetMapping
    public Iterable<Admin> cariSemua(){
        //JPQL
//        return adminService.cariSemuaAdmin();
        //Criteria Builder
        return adminService.cariSemuaCriteria();
    }

    @GetMapping("/{id}")
    public Admin cariId(@PathVariable("id") Long id){
        //SearchById JPQL
        return adminService.cariId(id);
    }

    @PostMapping("/search/id")
    public Iterable<Admin> SearchInConditionCriteria(@RequestBody SearchData searchData){
        return adminService.cariInConditionCriteria(searchData.getId());
    }

    @PutMapping
    public Admin Update(@RequestBody Admin admin){
        return adminService.upadte(admin);
    }

}
