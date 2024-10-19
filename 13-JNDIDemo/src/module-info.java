	

	
	import javax.naming.Context; 
	import javax.naming.InitialContext; 
	import javax.naming.NamingException; 

	public class JNDIDemo { 
	public static void main(String[] args) { 
	try { 
	// Create an initial context 
	Context ctx = new InitialContext(); 
	// Look up a resource (e.g., a database) 
	String dbName = "myDatabase"; 
	Context dbCtx = (Context) ctx.lookup(dbName); 
	// Print the database context 
	System.out.println("Database Context: " + dbCtx); 
	} catch (NamingException e) { 
	System.out.println("JNDI Error: " + e.getMessage()); 
	} 
	} 
	} }