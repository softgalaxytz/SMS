package com.sms.api.Classes;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sms.api.Classes.DTO.Class_reqtest;



@RestController
@RequestMapping("/api/classes")
public class ClassController {
    private final ClassServices classServices;

    public ClassController(ClassServices classServices) {
        this.classServices = classServices;
    }
@PostMapping("/create")
  public ResponseEntity<Classes> createClass(@RequestBody Class_reqtest class_reqtest) {
        return ResponseEntity.ok(classServices.createClass(class_reqtest));
    }
@GetMapping("/{id}")
   public ResponseEntity<Classes> getClassById(@PathVariable Long id) {
       Classes classes = classServices.getClassById(id);
       if (classes != null) {
           return ResponseEntity.ok(classes);
       } else {
           return ResponseEntity.notFound().build();
       }
   }
   @GetMapping("/getAll")
   public ResponseEntity<List<Classes>> getAllClasses() {
        return ResponseEntity.ok(classServices.getAllClasses());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Classes> updateClass(@PathVariable Long id, @RequestBody Classes classes) {
        try {
            Classes updatedClass = classServices.updateClass(id, classes);
            return ResponseEntity.ok(updatedClass);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        try {
            classServices.deleteClass(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
