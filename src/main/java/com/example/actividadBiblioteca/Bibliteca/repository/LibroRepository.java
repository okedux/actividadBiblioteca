package com.example.actividadBiblioteca.Bibliteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.actividadBiblioteca.Bibliteca.model.Libro;

public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }
}
