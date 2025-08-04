package com.example.cadastro_usuario.business;


import com.example.cadastro_usuario.CadastroUsuarioApplication;
import com.example.cadastro_usuario.infraestructure.entitys.User;
import com.example.cadastro_usuario.infraestructure.repository.UserRepository;
import lombok.Builder;
import org.springframework.stereotype.Service;


@Builder
@Service

public class UserService {

    private final UserRepository repository;

    public UserService (UserRepository repository){
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User findUserByEmail(String email){

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }
    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserById(Integer id, User user){
        User userEntity = repository.findById(id).orElseThrow(()->
                new RuntimeException("Usuario não encontrado"));
        User userUpdated = User.builder()
                .email(user.getEmail() != null ? user.getEmail() :
                userEntity.getEmail())
                .name (user.getName() != null? user.getName() : userEntity.getName())

                .id(userEntity.getId())
                .build();

        repository.saveAndFlush(userUpdated);
    }
}
