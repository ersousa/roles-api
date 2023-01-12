package br.com.ecore.roles.model;

import java.io.Serializable;

public class MembershipKey implements Serializable {
    private String userID;
    private String teamID;

    public MembershipKey(String userID, String team_id) {
        this.userID = userID;
        this.teamID = team_id;
    }
}
