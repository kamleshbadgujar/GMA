package com.app.gma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gma.dto.AdminDetailsDto;

public interface AdminRepository extends JpaRepository<AdminDetailsDto, Integer> {

}
