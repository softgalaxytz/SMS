package com.sms.api.Classes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.api.Classes.DTO.Class_reqtest;

@Service
public class ClassServices {
    private final ClassRepo classRepo;

    public ClassServices(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }   
    public Classes createClass(Class_reqtest classes) {
        Classes newClass = new Classes();
        newClass.setClass_name(classes.getClass_name());
        newClass.setTeacher_id(classes.getTeacher_id());
        newClass.setSubject_id(classes.getSubject_id());
        newClass.setUser_id(classes.getUser_id());
        classRepo.save(newClass);
        return newClass;
    }
    public List<Classes> getAllClasses() {
        return classRepo.findAll();
    }
   public Classes updateClass(Long classId, Classes classes) {
        if (classRepo.existsById(classId)) {
            classes.setClass_id(classId);
            return classRepo.save(classes);
        } else {
            throw new RuntimeException("Class not found with id: " + classId);
        }
    }

    public void deleteClass(Long classId) {
        if (classRepo.existsById(classId)) {
            classRepo.deleteById(classId);
        } else {
            throw new RuntimeException("Class not found with id: " + classId);
        }
    }
    public Classes getClassById(Long classId) {
        return classRepo.findById(classId).orElse(null);
    }

    // Additional methods for retrieving classes can be added here

}
