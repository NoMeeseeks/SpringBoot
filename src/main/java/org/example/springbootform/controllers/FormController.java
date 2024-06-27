package org.example.springbootform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/formulario")
    public String form(Model model){
        model.addAttribute("titulo","Formulario de usuarios");
        return "form";
    }

    @PostMapping("/formulario")
    public String procesarFormulario(Model model,
                                     @RequestParam String usuario,
                                     @RequestParam String nombre,
                                     @RequestParam String apellido,
                                     @RequestParam String email,
                                     @RequestParam String password){

        model.addAttribute("titulo","Formulario de usuarios");
        model.addAttribute("usuario",usuario);
        model.addAttribute("nombre",nombre);
        model.addAttribute("apellido",apellido);
        model.addAttribute("email",email);
        model.addAttribute("password",password);

        return "resultado";
    }
}
