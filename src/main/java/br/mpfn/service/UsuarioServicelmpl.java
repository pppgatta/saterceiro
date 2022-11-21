package br.mpfn.service;

import br.mpfn.model.Usuario;
import br.mpfn.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServicelmpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {return usuarioRepository.findAll();}

    @Override
    public Usuario findById(Long id){
        Usuario func = usuarioRepository.findById(id).get();
        return func != null ? func : new Usuario();
    }

    @Override
    public Usuario save(Usuario usuario) {
        try{
            return usuarioRepository.save(usuario);
        }catch (Exception e){
            throw e;
        }
    }


    @Override
    public void deleteById(Long id){
        try{
            usuarioRepository.deleteById(id);
        }  catch(Exception e){
            throw e;
        }
    }

}