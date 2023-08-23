package ezeon.tasklistmanagement.model;

// import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserTaskModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subject;
    private String descrption;
    private String priority;
    private String status;
    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date datetime;


    public UserTaskModel() {
    }


    public UserTaskModel(String subject, String descrption, String priority, String status, Date date_time) {
        // this.id = id;
        this.subject = subject;
        this.descrption = descrption;
        this.priority = priority;
        this.status = status;
        this.datetime = date_time;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getDescrption() {
        return descrption;
    }


    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }


    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Date getDate_time() {
        return datetime;
    }


    public void setDate_time(Date date_time) {
        this.datetime = date_time;
    }

    

}
