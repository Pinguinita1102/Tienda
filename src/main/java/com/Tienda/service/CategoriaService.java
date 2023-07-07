package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene una categoria por su ID
    public Categoria getCategoria(Categoria categoria);
    
    //Insertar: se inserta cuando el idCategoria está vacío (valor 0 o null)
    //Modificar: se modifica cuando el idCategoria no está vacío
    public void save(Categoria categoria);
    
    //Se elimina un registro por su IdCategoria
    public void delete(Categoria categoria);
}
