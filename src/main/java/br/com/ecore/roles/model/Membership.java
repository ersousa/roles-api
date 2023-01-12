package br.com.ecore.roles.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "membership", schema = "roles")
@IdClass(MembershipKey.class)
public class Membership {
    @Id
    @Column(name = "user_id")
    private String userID;

    @Id
    @Column(name = "team_id")
    private String teamID;

    @Id
    @Column(name = "cd_role")
    private Long roleId;
}
