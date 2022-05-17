package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO 
{
//performs CURD operations with the customer table,hence needs JdbcTemplate
   private JdbcTemplate mysqlTemplate;

   public JdbcTemplate getTemplate() 
   {
	   return mysqlTemplate;
   }
   public void setTemplate(JdbcTemplate template)
   {
	   this.mysqlTemplate = template;
   }
   public int insertRow()
   {
	return mysqlTemplate.update("insert into customer values(171,'Sid',1221)");
   }

}
