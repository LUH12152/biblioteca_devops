package com.example.biblioteca.service;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.LibroRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class LibroServiceTest {

    @Mock
    LibroRepository libroRepository;

    @InjectMocks
    LibroServiceImpl servicio;

    @Test
    void getLibros() {
        Libro libroEsperado = new Libro(1L,"titulo1","autor1");
        Mockito.when(this.libroRepository.findById(1L)).thenReturn(Optional.of(libroEsperado));
        Optional<Libro> resultado = servicio.getLibro(1L);
        if(resultado.isPresent()){
            assertEquals(libroEsperado, resultado.get());
        }
        Mockito.verify(libroRepository, Mockito.times(2)).findById(1L);
    }
}