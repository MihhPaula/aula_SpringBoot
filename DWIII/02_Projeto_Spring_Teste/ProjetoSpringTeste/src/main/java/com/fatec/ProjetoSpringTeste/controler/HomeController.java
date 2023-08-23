package com.fatec.ProjetoSpringTeste.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index(ModelMap model){
        model.addAttribute("nomeDoAtributo", "Emilia");
        return "index";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);
        return "saudacao";
    }
}



