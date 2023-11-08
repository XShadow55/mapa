package com.example.mapa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;
@RestController

public class EmployeeController {

    private EmployeeService servis;
    public EmployeeController(EmployeeService servis){
        this.servis = servis;

    }


    @GetMapping("/add")
    public Set add(@RequestParam String name,@RequestParam String lastname) {
        return servis.add(name, lastname);
    }
    @GetMapping("/remove")
    public String  remove(@RequestParam String name,@RequestParam String lastname) {
        return servis.remove(name, lastname);
    }
    @GetMapping("/search")
    public Boolean search(@RequestParam String name,@RequestParam String lastname) {
        return servis.search(name, lastname);
    }
    @GetMapping("/size")
    public Integer search() {
        return servis.size();
    }


}
