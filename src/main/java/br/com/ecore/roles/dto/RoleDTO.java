package br.com.ecore.roles.dto;

import br.com.ecore.roles.model.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDTO {
    private String id;
    private String title;

    public static RoleDTO convert(Role role){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId().toString());
        roleDTO.setTitle(role.getTitle());
        return roleDTO;
    }
}
