package com.betterjavacode.keycloakdemo.keycloakdemo.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="Task")
@Table(name = "task")
public class Task implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Task()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "taskname", nullable=false)
    private String taskname;

    @Column(name = "duedate")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dueDate;

    @Column(name = "status")
    private String status;

    @Override
    public String toString()
    {
        return "Task = { id = " + id + ", taskname = " + taskname + ", duedate = " + dueDate
                + ", status = " + status + "}";
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getTaskname ()
    {
        return taskname;
    }

    public void setTaskname (String taskname)
    {
        this.taskname = taskname;
    }

    public Date getDueDate ()
    {
        return dueDate;
    }

    public void setDueDate (Date dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }
}
