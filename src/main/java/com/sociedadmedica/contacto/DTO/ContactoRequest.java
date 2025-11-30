package com.sociedadmedica.contacto.DTO;
import lombok.Data;

@Data
public class ContactoRequest {
    private String nombreCompleto;
    private String correo;
    private String telefono;
    private String mensaje;
}