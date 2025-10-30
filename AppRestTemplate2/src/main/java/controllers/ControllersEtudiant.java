package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ServiceEtudiant;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class ControllersEtudiant {
    @Autowired
    ServiceEtudiant serviceEtudiant = new ServiceEtudiant();
    @GetMapping
    public List<Map<String, Object>> getAllEtudiants() {
        return serviceEtudiant.getAllEtudiants();
    }
}
