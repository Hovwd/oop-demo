import java.util.List;

public interface Repository<T> {
String getName();
long getId();
void addNumber(String Number);
 List<T> getFriendList();
 void addNumber(String type,String Number);
 List<TelNumber> getNumber();
 long getPassword();
 
}
