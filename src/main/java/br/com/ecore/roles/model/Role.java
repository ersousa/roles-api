package br.com.ecore.roles.model;

import br.com.ecore.roles.dto.RoleDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "role", schema = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_role")
    private Long id;
    @Column(name = "title")
    private String title;
}
