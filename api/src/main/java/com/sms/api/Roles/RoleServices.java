package com.sms.api.Roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.api.Roles.DTO.Role_request;

@Service
public class RoleServices {
    @Autowired
    private final RoleRepo roleRepo;

    public RoleServices(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }

    public Role_request createRole(Role_request role_request){
       Role role = new Role();
       role.setRole_name(role_request.getRole_name());
       Role savedRole = roleRepo.save(role);
       Role_request response = new Role_request();
       response.setRole_name(savedRole.getRole_name());
       return response;
    }
}
