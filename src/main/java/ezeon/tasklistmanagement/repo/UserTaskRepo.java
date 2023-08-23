package ezeon.tasklistmanagement.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ezeon.tasklistmanagement.model.UserTaskModel;

public interface UserTaskRepo extends JpaRepository<UserTaskModel,Integer>{
    
    List<UserTaskModel> findByStatus(String status); 
    List<UserTaskModel> findByPriority(String priority); 
    // List<UserTaskModel> findByDate_Time(Date date_time); 

}
