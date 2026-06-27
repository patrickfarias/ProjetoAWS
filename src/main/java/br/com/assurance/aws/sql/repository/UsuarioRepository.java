package br.com.assurance.aws.sql.repository;


import br.com.assurance.aws.sql.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}