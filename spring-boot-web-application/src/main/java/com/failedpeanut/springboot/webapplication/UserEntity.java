package com.failedpeanut.springboot.webapplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Entity calss Which also cats as DAO and DTO*/
@Entity
@Table(name = "user")
public class UserEntity
{
    @Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + "]";
	}

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
 
    public UserEntity()
    {
    }

    public UserEntity(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId()
    {  
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}