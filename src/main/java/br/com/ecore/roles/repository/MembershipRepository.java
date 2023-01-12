package br.com.ecore.roles.repository;

import br.com.ecore.roles.model.Membership;
import br.com.ecore.roles.model.MembershipKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, MembershipKey> {
}
