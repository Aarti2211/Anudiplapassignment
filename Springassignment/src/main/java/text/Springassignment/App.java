package text.Springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import text.Entity.Agent;
import text.Entity.Agentdao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext represent the Spring IoC Containers
    	//also give path of config.xml file.
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	
    	//create object of Agentdao class age call getBean method.
    	Agentdao dao=(Agentdao) ap.getBean("x");
    	
    	//Give value to Agent class variable
    	System.out.println(dao.saveAgent(new Agent(1,"Aarti",30000)));
    	System.out.println(dao.saveAgent(new Agent(2,"Shivratna",40000)));
    	System.out.println(dao.saveAgent(new Agent(3,"Praniata",32000)));
    	System.out.println(dao.saveAgent(new Agent(4,"Mahesh",20000)));
    	
    	//update value of Agent class variable
    	System.out.println(dao.updateAgent(new Agent(1,"Pavan",50000)));
    	
    	//delete value from Agent class
    	System.out.println(dao.deleteAgent(new Agent(4)));
        System.out.println( "Hello World!" );
    }
}
//Output:
/*
1] Insertion operation:

+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Aarti     |      30000 |
|  2 | Shivratna |      40000 |
|  3 | Praniata  |      32000 |
|  4 | Mahesh    |      20000 |
+----+-----------+------------+

2]After updation operation

+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Pavan     |      50000 |
|  2 | Shivratna |      40000 |
|  3 | Praniata  |      32000 |
|  4 | Mahesh    |      20000 |
+----+-----------+------------+

3]After Delete operation:

+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Pavan     |      50000 |
|  2 | Shivratna |      40000 |
|  3 | Praniata  |      32000 |
+----+-----------+------------+

*/