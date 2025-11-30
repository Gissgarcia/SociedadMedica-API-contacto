package com.sociedadmedica.contacto.service;

import com.sociedadmedica.contacto.DTO.ContactoRequest;
import com.sociedadmedica.contacto.model.ContactoModel;
import com.sociedadmedica.contacto.repository.ContactoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactoServiceImpl implements ContactoService {

    private final ContactoRepository contactoRepository;

    @Override
    public ContactoModel guardarContacto(ContactoRequest request) {
        ContactoModel c = new ContactoModel();
        c.setNombreCompleto(request.getNombreCompleto());
        c.setCorreo(request.getCorreo());
        c.setTelefono(request.getTelefono());
        c.setMensaje(request.getMensaje());
        return contactoRepository.save(c);
    }

    @Override
    public List<ContactoModel> listarContactos() {
        return contactoRepository.findAll();
    }

    @Override
    public ContactoModel obtenerContactoPorId(Long id) {
        return contactoRepository.findById(id).orElse(null);
    }
}