package com.siemens.eams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.eams.employee.security.JwtProvider;
import com.siemens.eams.employee.security.SignInDto;

@SpringBootApplication
@RestController
public class EmployeeAssetManagementSystemApplication {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtProvider jwtProvider;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeAssetManagementSystemApplication.class, args);
	}
	@RequestMapping("/health")
    public String hello() {
        return "Running";
    }
	@PostMapping("/signin")
	public String signIn(@RequestBody  SignInDto signInDto) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInDto.getUsername(), signInDto.getPassword()));
			return jwtProvider.createToken(signInDto.getUsername());
		} catch (Exception e){
            System.out.println("Log in failed for user, " + signInDto.getUsername());
            return "Wrong User Name Password";
        }
	}

}
