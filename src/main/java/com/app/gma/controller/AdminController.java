package com.app.gma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gma.dto.AdminDetailsDto;
import com.app.gma.service.admin.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService service;

	@GetMapping()
	public ResponseEntity< List<AdminDetailsDto>> getAllAdmin(){
		return ResponseEntity.ok().body(service.getAllAdmin());
	}

	@GetMapping("/{id}")
	public ResponseEntity<AdminDetailsDto> getAdminById(@PathVariable int id){
		return ResponseEntity.ok().body(service.getAdminById(id));
	}

	@PostMapping()
	public ResponseEntity<AdminDetailsDto> createAdmin(@RequestBody AdminDetailsDto admin){
		return ResponseEntity.ok().body(service.createAdmin(admin));
	}

	@PutMapping("/{id}")
	public ResponseEntity<AdminDetailsDto> updateAdmin(@PathVariable int id, @RequestBody AdminDetailsDto admin){
		admin.setAdminId(id);
		return ResponseEntity.ok().body(service.updateAdminDetails(admin));
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteAdmin(@PathVariable int id) {
		service.deleteAdmin(id);
		return HttpStatus.OK;
	}
}
