package com.sms.api.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServices {

    private final ProfileRepo profileRepo;

    @Autowired
    public ProfileServices(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    public Profile createProfile(Profile profile) {
        return profileRepo.save(profile);
    }

    public List<Profile> getAllProfiles() {
        return profileRepo.findAll();
    }
}
