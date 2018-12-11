package jobless.service.authuser;

import jobless.service.user.UserRequest;

public interface LoginService {
	public AuthUser login(String loginId, String password);
}
