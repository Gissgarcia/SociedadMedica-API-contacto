package com.sociedadmedica.contacto.controller;
import com.sociedadmedica.contacto.DTO.ContactoRequest;
import com.sociedadmedica.contacto.model.ContactoModel;
import com.sociedadmedica.contacto.service.ContactoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacto")
@RequiredArgsConstructor
public class ContactoController {

    private final ContactoService contactoService;

    @PostMapping("/enviar")
    public ContactoModel enviarFormulario(@RequestBody ContactoRequest request) {
        return contactoService.guardarContacto(request);
    }

    @GetMapping
    public List<ContactoModel> listar() {
        return contactoService.listarContactos();
    }

    @GetMapping("/{id}")
    public ContactoModel obtenerPorId(@PathVariable Long id) {
        return contactoService.obtenerContactoPorId(id);
    }
}