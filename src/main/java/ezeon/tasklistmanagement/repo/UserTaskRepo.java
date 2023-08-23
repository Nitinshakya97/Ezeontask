package ezeon.tasklistmanagement.repo;

// import java.util.Date;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.format.annotation.DateTimeFormat;

import ezeon.tasklistmanagement.model.UserTaskModel;

public interface UserTaskRepo extends JpaRepository<UserTaskModel,Integer>{
    
    List<UserTaskModel> findByStatus(String status); 
    List<UserTaskModel> findByPriority(String priority); 
    // List<UserTaskModel> findByDateTime( Date datetime); 
 
}
