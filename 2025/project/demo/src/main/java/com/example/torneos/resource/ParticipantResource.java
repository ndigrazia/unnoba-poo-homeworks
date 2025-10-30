package com.example.torneos.resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.torneos.dto.CreateParticipantRequestDTO;
import com.example.torneos.model.Participant;
import com.example.torneos.service.ParticipantService;

@RestController
public class ParticipantResource {

	@Autowired
	private ParticipantService participantService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}

	@PostMapping("/participants")
	public ResponseEntity<?> createParticipant(@RequestBody CreateParticipantRequestDTO requestDTO) {
        try {
            // Mapea el DTO al modelo de dominio
            Participant participant = modelMapper.map(requestDTO, Participant.class);

            // Delegamos la creación al servicio
            Participant created = participantService.create(participant);

            // Retorna el recurso creado con código 201
            return ResponseEntity.status(HttpStatus.CREATED).body(created);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Error al crear el participante: " + e.getMessage());
        }
    }

}