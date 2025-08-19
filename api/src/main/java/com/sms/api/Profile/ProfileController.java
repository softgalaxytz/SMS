package com.sms.api.Profile;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile") 
public class ProfileController {

    private final ProfileServices profileServices;

    public ProfileController(ProfileServices profileServices) {
        this.profileServices = profileServices;
    }

    @PostMapping("/createProfile")
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
        Profile createdProfile = profileServices.createProfile(profile);
        return new ResponseEntity<>(createdProfile, HttpStatus.CREATED);
    }

    @GetMapping("/getAllProfiles")
    public ResponseEntity<List<Profile>> getAllProfiles() {
        List<Profile> profiles = profileServices.getAllProfiles();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }
}
