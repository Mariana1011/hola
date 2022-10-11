package com.example.reto3.controlador;

import com.example.reto3.entidad.Message;
import com.example.reto3.servicio.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message/")
@CrossOrigin(origins = "*")
public class ApiMessage {

    @Autowired
    private MessageService service;

    @GetMapping("/all")
    public List<Message> getMessage() {
        return service.getMessage();
    }

    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Message message){
        service.saveMessage(message);
        return ResponseEntity.status(201).build();
    }

}
