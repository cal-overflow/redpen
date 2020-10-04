package myProject;

import java.util.Set;
import javax.persistence.*;

@Entity
class Course {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
 
    @Column
    String name;
    
    @Column
    String courseDescription;
    
    
    @OneToMany(mappedBy = "course")
    Set<CourseRegistration> registrations;
    
 
    public Integer getId()	{
    	return id;
    }
    
    public String getName()	{
    	return name;
    }
    
    public void setName(String n)	{
    	this.name = n;
    }
    
    public String getCourseDescription()	{
    	return courseDescription;
    }
    
    public void setCourseDescription(String d)	{
    	this.courseDescription = d;
    }
    
    /*public Set<CourseRegistration> getRegistrations()	{
    	return registrations;
    }*/
    
    // additional properties
    // standard constructors, getters, and setters
}