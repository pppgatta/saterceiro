package br.mpfn.controller;

import br.mpfn.model.Post;
import br.mpfn.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class PostController {
    @Autowired
    br.mpfn.service.PostService PostService;

    @GetMapping("/Post/list")
    public String findAll(Model model){
        model.addAttribute("post", PostService.findAll());
        return "post/list";
    }

    @GetMapping("/Post/add")
    public String add(Model model){
        model.addAttribute("post", new Post());
        return "post/add";
    }

    @GetMapping("/post/edit/{id}")
    public String edit(Model model, @PathVariable long id){
        System.out.println( PostService.findById(id));
        model.addAttribute("post",PostService.findById(id));
        return "post/edit";
    }


    @PostMapping("/post/save")
    public String save(Post post, Model model){
        try{
            PostService.save(post);
            model.addAttribute("Post", post);
            model.addAttribute("isSaved",true);
            return "Post/add";
        } catch (Exception e){
            model.addAttribute("Post", post);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "Post/add";
        }
    }

    @GetMapping("/Post/delete/{id}")
    public String delete(@PathVariable long id){
        try{
            PostService.deleteById(id);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return "redirect:/Post/list";
    }
}
