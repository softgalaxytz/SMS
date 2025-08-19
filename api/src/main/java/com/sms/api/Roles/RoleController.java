package com.sms.api.Roles;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sms.api.Roles.DTO.Role_request;


@RestController
@RequestMapping("/api/role")
public class RoleController {
    private final RoleServices roleServices;

    public RoleController(RoleServices roleServices) {
        this.roleServices = roleServices;
    }

    @PostMapping("/createRole")
    public ResponseEntity<Role_request> createRole(@RequestBody Role_request role_request) {
        Role_request createdRole = roleServices.createRole(role_request);
        return new ResponseEntity<>(createdRole, HttpStatus.CREATED);
    }

    @GetMapping("/getAllRoles")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = roleServices.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);  
    }
}
