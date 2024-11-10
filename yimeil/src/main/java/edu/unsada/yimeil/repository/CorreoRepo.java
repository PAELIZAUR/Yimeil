package edu.unsada.yimeil.repository;

import edu.unsada.yimeil.models.Correo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CorreoRepo extends CrudRepository<Correo,Integer> {
    Optional<Correo> findByAttachmentsByEmailId(int emailID);
}
