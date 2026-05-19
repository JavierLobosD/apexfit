package com.apexfit.apexfit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apexfit.apexfit.model.Producto;
import com.apexfit.apexfit.service.ProductoService;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> listar(){
        return service.listar();
    }
    
    @PostMapping
    public Producto crear(@RequestBody Producto p){
        return service.guardar(p);
    }
    


}
