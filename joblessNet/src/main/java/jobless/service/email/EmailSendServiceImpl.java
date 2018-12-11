package jobless.service.email;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Repository;

@Repository("emailSendService")
public class EmailSendServiceImpl implements EmailSendService {

	@Override
	public String emailService(String email) {
		
		String host = "smtp.naver.com";
		final String userName = "tjdalsdl1214";
		final String password = "s12141214";
		
		String to = email;
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});
		
		// Compose the message
		String code = "";
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//Subject
			message.setSubject("[jobless-net] 이메일 인증 서비스");
			
			Random random = new Random();
			
			for(int i = 0; i < 6; i++) {
				
				if(random.nextBoolean()) {
					int numRandomValue = (int)(Math.random()*9)+0;
					code += Integer.toString(numRandomValue);
				}else {
						int strRandomValue = (int)(Math.random()*(90-65))+65;
						char ascii = (char)strRandomValue;
						code += Character.toString(ascii);
				}
				
			}
			System.out.println(code);
			
			
			int randomValue = (int) Math.random();
			System.out.println(randomValue);
					
			String content = "<div style=\"overflow: hidden; width: 500px; height: 600px;border: 2px solid #287A72;\">\r\n" + 
					"      <table style=\" width : 100%;\">\r\n" + 
					"        <tr>\r\n" + 
					"          <td style=\"background-color:#287A72; font-size:30px;\">\r\n" + 
					"            <div style=\"color:#ffffff;\">\r\n" + 
					"                Jobless\r\n" + 
					"            </div>\r\n" + 
					"          </td>\r\n" + 
					"        </tr>\r\n" + 
					"        <tr>\r\n" + 
					"          <td style=\"text-align: center; padding:30px;\">\r\n" + 
					"            [Jobless] 이메일 인증이 도착하였습니다.\r\n" + 
					"          </td>\r\n" + 
					"        </tr>\r\n" + 
					"        <tr>\r\n" + 
					"          <td style=\"padding-top:20px; padding-bottom:20px;\">\r\n" + 
					"            Jobless 계정에 등록한 이메일 주소가 올바른지 확인하기 위한 인증번호입니다.<br />\r\n" + 
					"            아래의 인증번호를 복사하여 이메일 인증을 완료해 주세요.\r\n" + 
					"          </td>\r\n" + 
					"        </tr>\r\n" + 
					"        <tr>\r\n" + 
					"          <td>\r\n" + 
					"            <hr style=\"border: 2px solid #287A72;\"/>\r\n" + 
					"            인증번호 : <div style=\"font-size:25px;color : #287A72; display:inline-block;\">"+ code +"</div>\r\n" + 
					"            <hr style=\"border: 2px solid #287A72; \"/>\r\n" + 
					"          </td>\r\n" + 
					"        </tr>\r\n" + 
					"        <tr>\r\n" + 
					"          <td style=\"padding-top:20px; padding-bottom:20px;\">\r\n" + 
					"            개인정보 보호를 위해 인증번호는 10분 동안만 유효합니다.<br />\r\n" + 
					"            향후 비 정상적인 계정접속등 보안이슈가 발생할 경우 해당 이메일 주소로 알려드릴 예정입니다.\r\n" + 
					"          </td>\r\n" + 
					"        </tr>\r\n" + 
					"      </table>\r\n" + 
					"    </div>";
			
			//Test
			message.setContent(content, "text/html;charset=utf-8");
			
			//send the message
			Transport.send(message);
			System.out.println("메일 발송 완료!!");
		}catch (MessagingException e) {
			e.printStackTrace();
		}

		
		return code;
	}

}
