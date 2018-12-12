package jobless.service.recaptcha;

import org.springframework.stereotype.Repository;

import jobless.exception.RecaptchaNotRunningException;

@Repository("recaptchaService")
public class RecaptchaServiceImpl implements RecaptchaService {

	@Override
	public void recaptcha(String recaptcha) {
		
		if(recaptcha.equals("") || recaptcha == null) {
			throw new RecaptchaNotRunningException("리캡챠가 실행되지 않았습니다.");
		}

	}

}
