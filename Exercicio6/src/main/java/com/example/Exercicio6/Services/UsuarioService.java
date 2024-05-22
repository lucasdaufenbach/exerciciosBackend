package com.example.Exercicio6.Services;
import com.example.Exercicio6.Repository.UsuarioRepository;
import com.example.Exercicio6.model.Usuario;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario getUsuario(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
    }

    public Usuario atualizarUsuario(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = getUsuario(id);
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setPreferenciasMusicais(usuarioAtualizado.getPreferenciasMusicais());
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        Usuario usuario = getUsuario(id);
        usuarioRepository.delete(usuario);
    }
}