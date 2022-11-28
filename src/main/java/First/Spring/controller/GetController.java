package First.Spring.controller;


import First.Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


//@Data
//@NoArgsConstructor
@RestController
public class GetController {
    String name = "obi";

    ArrayList<Test> tests = new ArrayList<>();
    ArrayList<Users> users = new ArrayList<>(Arrays.asList(new Users("Sam","Dan",12)
            ,new Users("Dam","Red",5)));

    @RequestMapping (value = "/")
    public Users homepage(){ return users.get(1);}

    @PostMapping(value = "/test")
    public ArrayList<Test> aboutpage(){
        Test test = new Test("50","100");
        tests.add(test);
        return tests;
    }
    @GetMapping (value = "/test")
    public ArrayList <Test> aboutPageLogin(){
        return tests;
    }






    @GetMapping(value = "/weird/{unique}")
    public ArrayList<?> getCategory(@PathVariable("unique") String category){
        System.out.println(category);
        if(category.equals("users")){
            return users;
        }
        if(category.equals("tests")){
            tests.add(new Test("50","100"));
            return tests;
        }
        return new ArrayList<>(Arrays.asList("404"));

    }
//    @Autowired
    private UserRepository userRepository;

    public GetController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

//    @CrossOrigin
    @CrossOrigin("http://127.0. 0.1:5501")
    @PostMapping(value = "/json")
    public Users json(@RequestBody Users user){
        Users save = userRepository.save(user);
        return save;
    }

//    @PutMapping
//    public String to(){}



}
