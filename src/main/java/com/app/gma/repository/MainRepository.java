package com.app.gma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gma.dto.LoginDetailsDto;


public interface MainRepository extends JpaRepository<LoginDetailsDto, String> {

}
