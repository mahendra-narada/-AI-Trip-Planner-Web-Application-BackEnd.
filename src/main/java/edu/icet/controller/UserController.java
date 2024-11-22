package edu.icet.controller;

import edu.icet.Entity.LoginUser;
import edu.icet.Entity.NormalUser;
import edu.icet.service.EmailService;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService userService;
    final EmailService emailService;

    //Register a New User
    @PostMapping("/register")
    public String userRegister(@RequestBody NormalUser normalUser){
        userService.registerUser(normalUser);
        emailService.sendRegistrationEmail(normalUser.getEmail(),normalUser.getUserName());
        return "Success";
    }

    //Check the Email is Already Exist
    @GetMapping("/emailCheck")
    public ResponseEntity<Boolean> isEmailHas(@RequestParam String email){
      boolean exists= userService.isEmailHas(email);
      return ResponseEntity.ok(exists);
    }

    //Login
    @PostMapping("/login")
    public edu.icet.Entity.NormalUser userLogin(@RequestBody LoginUser loginUser){
        String email=loginUser.getUserEmail();
        String password = loginUser.getUserPassword();
        System.out.println(email+" "+password);
        return userService.loginUser(email,password);
    }



}
