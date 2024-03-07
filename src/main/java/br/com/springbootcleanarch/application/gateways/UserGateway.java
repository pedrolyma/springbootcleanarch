package br.com.springbootcleanarch.application.gateways;

import br.com.springbootcleanarch.domain.entity.User;

public interface UserGateway {
  User createUser(User user);
}
