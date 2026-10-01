package com.ejemplo.usuarios.repository;

import com.ejemplo.usuarios.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
