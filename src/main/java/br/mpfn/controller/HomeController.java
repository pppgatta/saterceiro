package br.mpfn.controller;

import br.mpfn.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model)
    {return  "/home"; }

    @GetMapping("/index")
    public String index(Model model)
    {return  "/index"; }

    @GetMapping("/login")
    public String login(Model model)
    {return  "/login"; }

    @GetMapping("/usuario/edit")
    public String edit(Model model)
    {return  "usuario/edit"; }

    @GetMapping("/materias/primeiro")
    public String primeiro(Model model)
    {return  "/materias/primeiro"; }

    @GetMapping("/materias/segundo")
    public String segundo(Model model)
    {return  "/materias/segundo"; }

    @GetMapping("/materias/terceiro")
    public String terceiro(Model model)
    {return  "/materias/terceiro"; }

    @GetMapping("/materias/aa/matematica")
    public String matematica(Model model)
    {return  "/materias/aa/matematica"; }

    @GetMapping("/materias/aa/linguagens")
    public String linguagens(Model model)
    {return  "/materias/aa/linguagens"; }

    @GetMapping("/materias/aa/natureza")
    public String natureza(Model model)
    {return  "/materias/aa/natureza"; }

    @GetMapping("/materias/aa/ti")
    public String ti (Model model)
    {return  "/materias/aa/ti"; }

    @GetMapping("/materias/aa/humanas")
    public String humanas(Model model)
    {return  "/materias/aa/humanas"; }

    @GetMapping("/materias/aa2/matematica2")
    public String matematica2(Model model)
    {return  "/materias/aa2/matematica2"; }

    @GetMapping("/materias/aa2/linguagens2")
    public String linguagens2(Model model)
    {return  "/materias/aa2/linguagens2"; }

    @GetMapping("/materias/aa2/natureza2")
    public String natureza2(Model model)
    {return  "/materias/aa2/natureza2"; }

    @GetMapping("/materias/aa2/ti2")
    public String ti2 (Model model)
    {return  "/materias/aa2/ti2"; }

    @GetMapping("/materias/aa2/humanas2")
    public String humanas2(Model model)
    {return  "/materias/aa2/humanas2"; }

    @GetMapping("/materias/aa3/matematica3")
    public String matematica3(Model model)
    {return  "/materias/aa3/matematica3"; }

    @GetMapping("/materias/aa3/linguagens3")
    public String linguagens3(Model model)
    {return  "/materias/aa3/linguagens3"; }

    @GetMapping("/materias/aa3/natureza3")
    public String natureza3(Model model)
    {return  "/materias/aa3/natureza3"; }

    @GetMapping("/materias/aa3/ti3")
    public String ti3 (Model model)
    {return  "/materias/aa3/ti3"; }

    @GetMapping("/materias/aa3/humanas3")
    public String humanas3(Model model)
    {return  "/materias/aa3/humanas3"; }

    @GetMapping("/esquecisenha")
    public String esquecisenha(Model model)
    {return  "/esquecisenha"; }

    @GetMapping("/maisconfiguracoes")
    public String maisconfiguracoes(Model model)
    {return  "/maisconfiguracoes"; }

}
