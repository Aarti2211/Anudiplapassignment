package text.Entity;

import org.springframework.jdbc.core.JdbcTemplate;


//This is dao class
public class Agentdao {
	
	//create object of JdbcTemplate
	private JdbcTemplate jdbcTemplate;
	//set JdbcTemplate
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	//save method for insert record into Agent1 table
	public int saveAgent(Agent a)
	{
		String query="insert into Agent1 value('"+a.getId()+"','"+a.getName()+"','"+a.getCommission()+"')";
		return jdbcTemplate.update(query);
	}
	
	//update method for update record from agent1 table
	public int updateAgent(Agent a)
	{
		String query1="update Agent1 set name='"+a.getName()+"' ,commission='"+a.getCommission()+"' where id='"+a.getId()+"'";
		return jdbcTemplate.update(query1);
	}
	
	//delete method for deleting record from Agent1 table
	public int deleteAgent(Agent a)
	{
		String query2="delete from Agent1 where id='"+a.getId()+"'";
		return jdbcTemplate.update(query2);
	}
}
