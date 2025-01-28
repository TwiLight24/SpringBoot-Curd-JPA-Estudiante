package com.project.tienda.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.project.tienda.servicio.EstudianteServicio;



import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes", "/"})
    public String litarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";
    }
    

}
