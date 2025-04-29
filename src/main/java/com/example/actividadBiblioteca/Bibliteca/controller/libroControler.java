package com.example.actividadBiblioteca.Bibliteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.actividadBiblioteca.Bibliteca.model.Libro;
import com.example.actividadBiblioteca.Bibliteca.repository.LibroRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/libros")
public class libroControler {



    @Autowired
    
    private LibroRepository libroService;
    @GetMapping("path")
    public List<Libro> obtenerLibros(){
        return libroService.obtenerLibros();
    }

    @PostMapping("path")
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroService.agregarLibro(libro);
    }

    @GetMapping({"path/{id}"})
    public Libro buscarPorId(@PathVariable int id){
        return libroService.buscarPorId(id);
    }
    
    @DeleteMapping("path/{id}")
    public void eliminarLibro(@PathVariable int id){
        libroService.eliminarLibro(id);
    }

    @PutMapping("path/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.actualizarLibro(libro);
    }
    
    
}
