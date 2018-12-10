package jobless.service.authuser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

@Repository("logoutService")
public class LogoutServiceImpl implements LogoutService {

	HttpServletRequest req;
	
	@Override
	public void logout() {
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}

	}

}
