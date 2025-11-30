package com.sociedadmedica.contacto.DTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContactoRequest {
    private String nombre;
    private String apellido;
    private String correo;
    private Integer edad;
    private String numeroDocumento;
    private String tipoDocumento;
    private LocalDateTime fechaReserva;
}