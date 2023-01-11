package br.com.ecore.roles.service;

import br.com.ecore.roles.dto.RoleDTO;
import br.com.ecore.roles.model.Role;
import br.com.ecore.roles.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<RoleDTO> getAll(){
        List<Role> roles = roleRepository.findAll();
        return roles
                .stream()
                .map(RoleDTO::convert)
                .collect(Collectors.toList());
    }
}
