import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Db {
	private Db(){};	
	private static Db db;
//	private static String data;
	public static  Db getDb()
	{	if(db==null)
	{
		return new Db();
	}
		return db;
	}
	 private   List<User> users;
	 public   List<User> getUsers()
	 {
		 if(users==null)
		 {
			 return new ArrayList<User>();
		 }
		 return users;
	 }
	 public static User getUser(String name) throws IvaledNameException
	 {
		 if(!db.users.isEmpty()){
		 for(int i=0;i<db.users.size();i++)
		 {
			 if(db.users.get(i).getName().equals(name))
			 {
				 return db.users.get(i);
	 }
			 }
		 }
	
			 throw new IvaledNameException();
		 
	 }
	static {
		db=getDb();
		db.users=new ArrayList<User>();
		 String data="";
		 Gson gson=new GsonBuilder().setPrettyPrinting().create();
		 BufferedReader jsoninobj = null;
		try {
			jsoninobj = new BufferedReader(new FileReader("db.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			try {
				while (jsoninobj.ready()) {
					data+=jsoninobj.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			  Type type = new TypeToken<List<User>>() {
		        }.getType();
		      db.users = gson.fromJson(data, type);	
	 }
	void saveData() throws IOException
	{
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		String json=gson.toJson(getUsers());
		BufferedWriter jsoninfile=new BufferedWriter(new FileWriter(new File("db.json")));
		jsoninfile.write(json);
		jsoninfile.flush();
		jsoninfile.close();
	}
}
