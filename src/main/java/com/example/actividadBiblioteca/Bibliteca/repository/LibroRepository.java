package com.example.actividadBiblioteca.Bibliteca.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.actividadBiblioteca.Bibliteca.model.Libro;

@Repository

public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    public Libro buscarPorId(int id){
        for (Libro lib : listaLibros ){
            if (lib.getId() == id){
                return lib; 
            }
        }
        return null;
    }

    public Libro buscarPorisbn(String isbn){
        for (Libro lib : listaLibros ){
            if (lib.getIsbn().equals(isbn)){
                return lib;
            }
        }
        return null;
    }

    public Libro agregarLibro(Libro lib){
        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizarLibro(Libro lib){
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++){
            if (listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        
        listaLibros.set(idPosicion, libro1);
        return libro1;
        
    }

    public void eliminarLibro(int id){
        Libro libro = buscarPorId(id);
        if (libro != null){
            listaLibros.remove(libro);
        }
    }


}
