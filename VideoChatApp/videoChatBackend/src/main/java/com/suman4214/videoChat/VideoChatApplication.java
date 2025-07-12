package com.suman4214.videoChat;

import com.suman4214.videoChat.user.User;
import com.suman4214.videoChat.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoChatApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {
			if (service.findAllUsers().stream().noneMatch(u -> u.getEmail().equalsIgnoreCase("Suman@gmail.com"))) {
				service.register(User.builder()
						.username("Suman")
						.email("Suman@gmail.com")
						.password("Suman")
						.build());
			}
			if (service.findAllUsers().stream().noneMatch(u -> u.getEmail().equalsIgnoreCase("Suman@gmail.com"))) {
				service.register(User.builder()
						.username("Arin")
						.email("Arin@gmail.com")
						.password("Arin")
						.build());
			}
			if (service.findAllUsers().stream().noneMatch(u -> u.getEmail().equalsIgnoreCase("Suman@gmail.com"))) {
				service.register(User.builder()
						.username("Samir")
						.email("Samir@gmail.com")
						.password("Samir")
						.build());
			}
		};
	}
}
