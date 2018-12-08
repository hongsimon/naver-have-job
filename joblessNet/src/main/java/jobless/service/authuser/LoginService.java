package jobless.service.authuser;

import jobless.model.AuthUserVO;
import jobless.service.user.UserRequest;

public interface LoginService {
	public AuthUserVO login(String loginId, String password);
}
