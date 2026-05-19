package com.apexfit.apexfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apexfit.apexfit.model.Producto;
import com.apexfit.apexfit.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public List<Producto> listar(){
        return repository.findAll();
    }

    public Producto guardar(Producto p){
        return repository.save(p);
    }

    public Producto buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }

}
