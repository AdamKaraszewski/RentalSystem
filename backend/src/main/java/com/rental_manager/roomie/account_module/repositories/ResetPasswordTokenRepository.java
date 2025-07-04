package com.rental_manager.roomie.account_module.repositories;

import com.rental_manager.roomie.entities.ResetPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ResetPasswordTokenRepository extends JpaRepository<ResetPasswordToken, UUID> {

    Optional<ResetPasswordToken> findByAccount_email(String email);

    Optional<ResetPasswordToken> findByTokenValue(String tokenValue);
}
