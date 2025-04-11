package com.eagledrift.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/students")
public class StudentController {


    @GetMapping("getstudent")
    public String get(){
        return "soniya";
    }

//    @GetMapping("/all")
//    public List<StudentController> getAll() {
//        return List.of(new StudentController(1, "Soniya"));
//    }

   // private Map<Integer,StudentController> studentMap=new HashMap<>();
//   @PostMapping("/create")
//        public String createStudent(@RequestBody StudentController student){
//            return "Student added:Soniya";
//        }



//    @PutMapping("/putstudent/{id}")
//    public String updatestudent(@PathVariable int id,@RequestBody StudentController student){
//        return "updated";
//    }

//    @DeleteMapping("/delete/{id}")
//    public String deletestudent(@PathVariable int id,@RequestBody StudentController student){
//            return "deleted";
//    }


}


