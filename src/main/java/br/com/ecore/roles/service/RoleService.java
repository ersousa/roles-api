package br.com.ecore.roles.service;

import br.com.ecore.roles.dto.RoleDTO;
import br.com.ecore.roles.model.Membership;
import br.com.ecore.roles.model.MembershipKey;
import br.com.ecore.roles.model.Role;
import br.com.ecore.roles.repository.MembershipRepository;
import br.com.ecore.roles.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    MembershipRepository membershipRepository;
    public List<RoleDTO> getAll(){
        List<Role> roles = roleRepository.findAll();
        return roles
                .stream()
                .map(RoleDTO::convert)
                .collect(Collectors.toList());
    }

    public RoleDTO getRoleByMembership(String userId, String teamId){
        Membership membership = membershipRepository.getById(new MembershipKey(userId, teamId));
        Optional<Role> optionalRole = roleRepository.findById(membership.getRoleId());
        Role role = optionalRole.get();
        return RoleDTO.convert(role);
    }
}
