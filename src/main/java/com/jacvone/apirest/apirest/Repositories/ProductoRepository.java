package com.jacvone.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jacvone.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
