package com.sociedadmedica.contacto.repository;
import com.sociedadmedica.contacto.model.ContactoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<ContactoModel, Long> {
}
