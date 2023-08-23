package ezeon.tasklistmanagement.controller;

// import java.util.Date;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ezeon.tasklistmanagement.model.UserTaskModel;
import ezeon.tasklistmanagement.repo.UserTaskRepo;

@RestController
@RequestMapping("user")
@CrossOrigin(origins ="*")
public class UserTaskController {

    @Autowired
    private UserTaskRepo urepo;
	@CrossOrigin(origins ="*")

     @GetMapping("/show")   // to show all the data 
    public List<UserTaskModel> index() {
        return urepo.findAll();
    }
@CrossOrigin(origins ="*")
     @PostMapping(path = "/save")        //to save the new data in database 
    public Boolean userAdd(@RequestBody UserTaskModel um) {
        System.out.println(um);
     //userModel un=new userModel(email, email, email, email, 0, 0);
        urepo.save(um);
        return true;
    }

    @DeleteMapping("/delete/{id}")       //to delete the data from database by id 
    public Boolean userDel(@PathVariable int id) {
        System.out.println(id);
        urepo.deleteById(id);
        return true;
    }
    @GetMapping(value = "/search/{id}")     //search data from database by id
    public Optional<UserTaskModel> getMethodName(@PathVariable int id) {
        return urepo.findById(id);
        // return true;
    }
    
    @PostMapping(value = "/update") //update data on other place of exist user 
    public Boolean userUpdate(@RequestBody UserTaskModel um) {
        urepo.save(um);
        return true;
    }



///////////////////////////////////////////////////////////////////






    @GetMapping(value = "/searchbyStatus/{status}") //search data from database by status
    public List<UserTaskModel> searchByStatus(@PathVariable String status) {
        List<UserTaskModel> data = urepo.findByStatus(status);
        System.out.println(data);
        return data;
        
    }
    
    @GetMapping(value = "/searchbypriority/{priority}") //search data from database by status
    public List<UserTaskModel> searchByPriority(@PathVariable String priority) {
        List<UserTaskModel> data = urepo.findByPriority(priority);
        return data;
        // return urepo.findAll(priority);
        // return true;
    }
    
    // @GetMapping(value = "/searchBydate/{date_time}") //search data from database by status
    // public List<UserTaskModel> searchByDate(@PathVariable Date date_time) {
    //     List<UserTaskModel> data = urepo.findByDateTime(date_time);
    //     return data;
        // return urepo.findAll(date_time);
        
    // }

}
