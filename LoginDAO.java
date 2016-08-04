package fionaz;

public class LoginDAO {
	public boolean isValidUser(String UserId, String password)
	{
		 if(UserId.equals("niit")&&password.equals("niit"))
		 {
			 return true;
		 }
	return false;
	}
	

}
