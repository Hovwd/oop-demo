import java.util.ArrayList;
import java.util.List;

public class User implements Repository<User>{
	private String name;
	private final long id;
	private String password;
	private List<User> friendList;
	private  List<TelNumber> numberList;
	public User(String name, String password)
	{
		id=IdGenerator.getId();
		this.password=password;
		this.name=name;
		friendList=new ArrayList<User>();
		numberList=new ArrayList<TelNumber>();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "dsf";
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addNumber(String Number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getFriendList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TelNumber> getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getPassword() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void addNumber(String type, String Number) {
		// TODO Auto-generated method stub
		
	}


}
