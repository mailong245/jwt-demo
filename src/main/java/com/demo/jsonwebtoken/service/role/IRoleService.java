package com.demo.jsonwebtoken.service.role;


import com.demo.jsonwebtoken.model.Role;
import com.demo.jsonwebtoken.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}