package com.example.Exercicio6.Repository;
import com.example.Exercicio6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
