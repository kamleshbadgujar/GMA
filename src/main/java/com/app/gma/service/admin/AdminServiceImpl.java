package com.app.gma.service.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gma.dto.AdminDetailsDto;
import com.app.gma.exception.CustomException;
import com.app.gma.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public AdminDetailsDto createAdmin(AdminDetailsDto admin) {
		return adminRepo.save(admin);
	}

	@Override
	public List<AdminDetailsDto> getAllAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public AdminDetailsDto getAdminById(int adminId) {
		Optional<AdminDetailsDto> admin = adminRepo.findById(adminId);
		if(admin.isPresent())
			return admin.get();
		else {
			throw new CustomException("Record not found with id : " + adminId);
		}
	}

	@Override
	public AdminDetailsDto updateAdminDetails(AdminDetailsDto admin) {
		Optional<AdminDetailsDto> adminObj = adminRepo.findById(admin.getAdminId());
		if(adminObj.isPresent()) {
			AdminDetailsDto updatedAdmin = adminObj.get();
			updatedAdmin.setAdminId(admin.getAdminId());
			updatedAdmin.setEmailId(admin.getEmailId());
			updatedAdmin.setPersonalDetails(admin.getPersonalDetails());
			adminRepo.save(updatedAdmin);
			return updatedAdmin;
		}
		else {
			throw new CustomException("Record not found with id : " + admin.getAdminId());
		}
	}

	@Override
	public void deleteAdmin(int adminId) {
		Optional<AdminDetailsDto> adminObj = adminRepo.findById(adminId);
		if(adminObj.isPresent()) {
			adminRepo.delete(adminObj.get());
		}
		else {
			throw new CustomException("Record not found with id : " + adminId);
		}

	}


}
