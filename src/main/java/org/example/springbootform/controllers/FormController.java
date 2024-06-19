package org.example.springbootform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/formulario")
    public String form(Model model){
        return "form";
    }

    @PostMapping("/formulario")
    public String procesarFormulario(Model model){

        return "result";
    }
}
