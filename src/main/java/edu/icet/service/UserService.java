package edu.icet.service;

import edu.icet.Entity.NormalUser;

public interface UserService {
    public String registerUser(NormalUser normalUser);
    boolean isEmailHas(String email);
    public edu.icet.Entity.NormalUser loginUser(String email, String password);

}
