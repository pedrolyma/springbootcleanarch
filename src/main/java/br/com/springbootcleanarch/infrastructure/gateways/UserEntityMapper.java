package br.com.springbootcleanarch.infrastructure.gateways;

import br.com.springbootcleanarch.domain.entity.User;
import br.com.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
  UserEntity toEntity(User userDomainObj) {
    return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
  }

  User toDomainObj(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
  }

}
