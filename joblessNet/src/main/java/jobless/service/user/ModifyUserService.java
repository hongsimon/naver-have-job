package jobless.service.user;

public interface ModifyUserService {
	public void modifyUserData(UserRequest user);
	public void modifyUserPw(UserRequest user);
	public void updateIsStreamer(int userId);
	public void pointPay(int userId);
	public void updatePoint(int userId);
	public void updateIconId(int iconId, int userId);
}
