package com.example.mapptrial;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;

import org.json.simple.JSONObject;
@SpringBootApplication
@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/response")
public class MappTrialApplication {

    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void postBody(@RequestBody HashMap<String,String> person) {
       // Person persistedPerson = personService.save(person);
//        JSONObject jsonobj=new JSONObject();
//        jsonobj=ResponseEntity.created(URI.create(new JSONParser(person))).body(person).getBody();
//       String fn= String.valueOf(ResponseEntity
//                .created(URI
//                        .create(String.format("/persons/%s", person.getFirstName())))
//                .body(person).getBody());

        System.out.println(person);
    }

    public static void main(String[] args) {
        SpringApplication.run(MappTrialApplication.class, args);
    }

}
