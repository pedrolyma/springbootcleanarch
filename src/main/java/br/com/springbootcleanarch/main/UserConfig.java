package br.com.springbootcleanarch.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.springbootcleanarch.application.gateways.UserGateway;
import br.com.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.springbootcleanarch.infrastructure.controllers.UserDTOMapper;
import br.com.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import br.com.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.springbootcleanarch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
  @Bean
  CreateUserInteractor createUserCase(UserGateway userGateway) {
    return new CreateUserInteractor(userGateway);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }
}
