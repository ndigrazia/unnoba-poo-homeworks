package com.example.torneos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.torneos.model.Participant;
import com.example.torneos.repository.ParticipantRepository;
import com.example.torneos.util.PasswordEncoder;

@Service
public class ParticipantServiceImp implements ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Participant create(Participant participant) throws Exception {
        if (participantRepository.findByEmail(participant.getEmail()) != null) {
            throw new Exception("El email ya se encuentra registrado");
        }
        if (participant.getPassword().length() < 8) {
            throw new Exception("La contraseña debe tener al menos 8 caracteres");
        }

        participant.setPassword(passwordEncoder.encode(participant.getPassword()));

        return participantRepository.save(participant);
    }

}
