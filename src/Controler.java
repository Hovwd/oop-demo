
public class Controler {
Repository<User> onlineUser;
boolean isOnline;
Db data;
Controler()
{
	isOnline=false;
	data=Db.getDb();
	
	}
}
