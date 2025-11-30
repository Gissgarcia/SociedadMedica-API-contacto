package com.sociedadmedica.contacto.service;

import com.sociedadmedica.contacto.DTO.ContactoRequest;
import com.sociedadmedica.contacto.model.ContactoModel;
import com.sociedadmedica.contacto.repository.ContactoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactoService {

    ContactoModel guardarContacto(ContactoRequest request);

    List<ContactoModel> listarContactos();

    ContactoModel obtenerContactoPorId(Long id);
}