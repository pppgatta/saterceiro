package br.mpfn.controller;
import br.mpfn.model.Usuario;
import br.mpfn.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario/list")
    public String findAll(Model model){
        model.addAttribute("usuario", usuarioService.findAll());
        return "usuario/list";
    }

    @GetMapping("/")
    public String add(Model model){
        model.addAttribute("usuario", new Usuario());
        return "index";
    }

    @PutMapping("/usuario/edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        System.out.println(usuarioService.findById(id));
        model.addAttribute("usuario", usuarioService.findById(id));
        return "usuario/edit";
    }

    @PostMapping("/usuario/save")
    public String save(Usuario usuario, Model model){
        try{
            usuarioService.save(usuario);
            model.addAttribute("usuario", usuario);
            model.addAttribute("isSaved",true);
            return "/login";
        } catch (Exception e){
            System.out.println(e.getMessage());
            model.addAttribute("usuario", usuario);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "/home";
        }
    }


    @DeleteMapping("/usuario/delete/{id}")
    public String delete(@PathVariable long id){
        try{
            usuarioService.deleteById(id);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return "redirect:/usuario/list";
    }

    @GetMapping("/post/edit")
    public String edit(){return "post/edit";}

}

