package br.com.ecore.roles.controller;

import br.com.ecore.roles.dto.RoleDTO;
import br.com.ecore.roles.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<RoleDTO> getRoles(){
        return roleService.getAll();
    }
}
