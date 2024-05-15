package com.example.onetoone.repository;

import com.example.onetoone.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport,Long> {
}
