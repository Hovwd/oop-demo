import java.util.Random;

public class IdGenerator {
public static long getId(){
	Random rnd = new Random();
	Db db=Db.getDb();
	long id;
	
			if(db.getUsers().isEmpty())
			{
				return rnd.nextLong();
			}
			else
			{
				boolean isDublicat=false;
				while(true)
				{
					id=rnd.nextLong();
					for(int i=0;i<db.getUsers().size();i++)
					{
						if(db.getUsers().get(i).getId()==id)
						{
							break;
						}
						if(i==db.getUsers().size()-1)
						{
							isDublicat=true;
							break;
						}
					}
					if(isDublicat)
					{
						break;
					}
					
				}
				return id;
			}
			
}

}
