package com.example.reto3.servicio;

import com.example.reto3.entidad.Category;
import com.example.reto3.entidad.Message;
import com.example.reto3.repositorio.CategoryRepository;
import com.example.reto3.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public List<Message> getMessage(){
        return repository.findAll();
    }

    public Message saveMessage(Message message){
        return repository.save(message);
    }

}
