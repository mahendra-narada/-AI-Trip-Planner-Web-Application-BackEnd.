package edu.icet.service.impl;

import edu.icet.Entity.NormalUser;
import edu.icet.repository.NormalUserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final NormalUserRepository normalUserRepository;



    @Override
    public String registerUser(edu.icet.Entity.NormalUser normalUser) {
        normalUserRepository.save(normalUser);
        return "Success";
    }

    @Override
    public boolean isEmailHas(String email) {
        return normalUserRepository.existsByEmail(email);

    }

    @Override
    public NormalUser loginUser(String email, String password) {
        NormalUser normalUser=  normalUserRepository.findByEmail(email);
        if (Objects.equals(normalUser.getPassword(), password)){
            return normalUser;
        }
        return null;

    }
}
