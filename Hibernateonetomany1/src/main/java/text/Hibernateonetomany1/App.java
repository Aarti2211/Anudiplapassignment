package text.Hibernateonetomany1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
	//this method create session object
	public static Session getCurrentSession() {
		  // Hibernate 5.4 SessionFactory example without XML
		
		//In hashmap put all configuration info
		  Map<String, String> settings = new HashMap<>();
		  settings.put("connection.driver_class", "com.mysql.jdbc.Driver");
		  settings.put("dialect", "org.hibernate.dialect.MySQL8Dialect");
		  settings.put("hibernate.connection.url", 
		    "jdbc:mysql://localhost/anudip");
		  settings.put("hibernate.connection.username", "root");
		  settings.put("hibernate.connection.password", "mysql");
		  settings.put("hibernate.current_session_context_class", "thread");
		  settings.put("hibernate.show_sql", "true");
		  settings.put("hibernate.format_sql", "true");

		  //this method merged with metadata about the various JPA annotated classes in the domain model.
		  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		                                    .applySettings(settings).build();

		  MetadataSources metadataSources = new MetadataSources(serviceRegistry);
		  
		  //add annotated class(Teacher and Course)
		   metadataSources.addAnnotatedClass(Teacher.class);
		 metadataSources.addAnnotatedClass(Course.class);
		  Metadata metadata = metadataSources.buildMetadata();

		  // here we build the SessionFactory (Hibernate 5.4)
		  SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		  Session session = sessionFactory.getCurrentSession();
		  return session;
		}
    public static void main( String[] args )
    {
    	//call getcurrentsession method
    	Session ss=getCurrentSession();
    	
    	//this allows the application to define units of work,
    	//while maintaining abstraction from the underlying transaction implementation
    	Transaction T=ss.beginTransaction();
    	
    	//create object of Teacher 
    	Teacher tech=new Teacher();
    	
    	//set all variable
    	tech.setTeacherid(1);
    	tech.setTeachername("Mrunali");
    	tech.setDepartment("CSE");
    	
    	//here create three object of course class and also set all varible by each object of Course class
    	Course obj=new Course();
    	obj.setCourseid(1);
    	obj.setCourse("java programming");
    	obj.setTeacher(tech);
    	
    	Course obj1=new Course();
    	obj1.setCourseid(2);
    	obj1.setCourse("Python programming");
    	obj1.setTeacher(tech);
    	
    	Course obj2=new Course();
    	obj2.setCourseid(3);
    	obj2.setCourse("Angular programming");
    	obj2.setTeacher(tech);
    	//add all object of course class in List
    	List<Course>list=new ArrayList<>();
    	list.add(obj);
    	list.add(obj1);
    	list.add(obj2);
    	//set list varible of Teacher class
    	tech.setCourse(list);
    	//save Teacher and Course in session
    	ss.save(tech);
    	ss.save(obj);
    	ss.save(obj1);
    	ss.save(obj2);
    	
    	//commit used to flush the associated Session and end the unit of work 
    	T.commit();
    	
    	
        System.out.println( "Hello World!" );
    }
}

//output:
/*Teacher Table
 * +-----------+-------------+------------+
| teacherid | teachername | department |
+-----------+-------------+------------+
|         1 | Mrunali     | CSE        |
+-----------+-------------+------------+
/Course Table
 * +----------+---------------------+-----------+
| courseid | course              | teacherid |
+----------+---------------------+-----------+
|        1 | java programming    |         1 |
|        2 | Python programming  |         1 |
|        3 | Angular programming |         1 |
+----------+---------------------+-----------+
Teacher_Course Table
+-------------------+-----------------+
| Teacher_teacherid | Course_courseid |
+-------------------+-----------------+
|                 1 |               1 |
|                 1 |               2 |
|                 1 |               3 |*/
