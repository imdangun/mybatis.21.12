package ch05.ex07;

import java.util.List;

import ch05.domain.ex06.User;

public interface Map {
	List<User> selectUsers(int[] userIds);	
	List<User> selectUsers2(List<String> userNames);
}
