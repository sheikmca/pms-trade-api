package org.pms.trade.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    List<User> findAll();

    Page<User> findAll(Pageable pageable);

    User findByEmail(String email);


    @Query(nativeQuery = true, value = "SELECT u.* FROM users u where u.credentialId = :credentialId  ")
    Optional<User> findByCredentialId(@Param("credentialId") String credentialId);
}

