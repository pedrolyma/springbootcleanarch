package br.com.springbootcleanarch.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}
