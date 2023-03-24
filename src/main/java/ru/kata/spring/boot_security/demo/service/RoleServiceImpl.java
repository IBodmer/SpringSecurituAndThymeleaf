package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repo.RoleRepo;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepo repo;

    public RoleServiceImpl(RoleRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Role> findAllRoles() {
        return repo.findAll();
    }
}