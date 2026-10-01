package com.ejemplo.usuarios.service;

import com.ejemplo.usuarios.dto.UserDTO;
import com.ejemplo.usuarios.entity.UserEntity;
import com.ejemplo.usuarios.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers(){
        List<UserEntity> userEntities = userRepository.findAll();
        List<UserDTO> dtos = new ArrayList<>();

        for (UserEntity userEntity : userEntities) {
            UserDTO dto = new UserDTO();
            dto.setId(userEntity.getId());
            dto.setNombre(userEntity.getNombre());
            dto.setEmail(userEntity.getEmail());
            dtos.add(dto);
        }
        return dtos;
    }

    public UserDTO createUser(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setNombre(dto.getNombre());
        entity.setEmail(dto.getEmail());

        UserEntity guardado = userRepository.save(entity);

        UserDTO respuesta = new UserDTO();
        respuesta.setId(guardado.getId());
        respuesta.setNombre(guardado.getNombre());
        respuesta.setEmail(guardado.getEmail());
        return respuesta;
    }

}
