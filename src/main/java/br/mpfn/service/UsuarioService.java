package br.mpfn.service;

import br.mpfn.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public void deleteById(Long id);
}
