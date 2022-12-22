package text.Hibernateassingment;

import text.Hibernateassingment.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.hibernate.Query;
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
		   metadataSources.addAnnotatedClass(Employeeinfo.class);
		   metadataSources.addAnnotatedClass(Address.class);
		   
		  Metadata metadata = metadataSources.buildMetadata();

		  // here we build the SessionFactory (Hibernate 5.4)
		  SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		  Session session = sessionFactory.getCurrentSession();
		  return session;
		}
	
	//this method add Employee information
	public  static String  addEmployee(Session s,Transaction t)
	{
		Employeeinfo emp=new Employeeinfo(); //create object of Employeeinfo class
		
		//scanner class used to give user input
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
	    int empid=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee name:");
		String empname=sc2.nextLine();
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Employee department:");
		String empdept=sc3.nextLine();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter Employee salary");
		int empsalary=sc4.nextInt();
		
		//set Employee record
		emp.setEid(empid);
		emp.setEname(empname);
		emp.setEdept(empdept);
		emp.setEsalary(empsalary);
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter Employee house name:");
		String emphname=sc5.nextLine();
		Scanner sc6=new Scanner(System.in);
		System.out.println("Enter Employee area name:");
		String emparea=sc6.nextLine();
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter Employee city name:");
		String empcity=sc7.nextLine();
		Scanner sc8=new Scanner(System.in);
		System.out.println("Enter Employee pincode:");
		int emppincode=sc8.nextInt();
		
		//create object of Address class
		Address ad1=new Address();
		ad1.setEhname(emphname);
		ad1.setEarea(emparea);
		ad1.setEcity(empcity);
		ad1.setEpincode(emppincode);
		
		
		emp.setAddress(ad1);   //set address class object in object of employeeinfo class
		s.save(emp);	//save Employeeinfo class
	
		//select record from table
		Query query1 = s.createQuery("from Employeeinfo");
		List<Employeeinfo> collection1 = query1.getResultList();
		for(Employeeinfo e:collection1)
		{
			System.out.println("Eid:"+e.getEid()+"Ename:"+e.getEname()+"Edepartment:"+e.getEdept()+"Esalary:"+e.getEsalary()+"Ehname:"+e.getAddress());
		}
		return "Employee added";
		
	}
	
	//main method
    public static void main( String[] args )
    {
    	//call getcurrentsession method
		Session ss=getCurrentSession();
        Transaction T=ss.beginTransaction();
        System.out.println(addEmployee(ss,T));
        T.commit();
        System.out.println( "Hello World!" );
        
    }
}

//output:
	/*Eid:1 Ename: Aarti Edepartment:CSE Esalary:30000 Ehname:text.Hibernateassingment.Address@d16be4f
	Eid:3Ename:shivratnaEdepartment:mechEsalary:40000Ehname:text.Hibernateassingment.Address@17b37e9a
	Employee added
	Hello World!*/
