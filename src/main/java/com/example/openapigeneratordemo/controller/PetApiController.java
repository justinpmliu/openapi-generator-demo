package com.example.openapigeneratordemo.controller;

import com.example.openapigeneratordemo.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/v2}")
public class PetApiController implements PetApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("White Cat");
        return ResponseEntity.ok(pet);
    }

}
