package com.manas.repository;

import com.manas.entity.AuthInfo;
import com.manas.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface AuthInfoRepository extends JpaRepository<AuthInfo, Long> {
    Optional<AuthInfo> findByEmail(String email);
    Boolean existsByEmail(String email);
}