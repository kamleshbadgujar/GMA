package com.app.gma.service.admin;

import java.util.List;

import com.app.gma.dto.AdminDetailsDto;

public interface AdminService {
	AdminDetailsDto createAdmin(AdminDetailsDto admin);

	List<AdminDetailsDto> getAllAdmin();

	AdminDetailsDto getAdminById(int adminId);

	AdminDetailsDto updateAdminDetails(AdminDetailsDto admin);

	void deleteAdmin(int adminId);
}
