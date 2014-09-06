/**
 * 
 */
package ${package}.token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author WMS
 * 
 */
@SuppressWarnings("serial")
public class UsernamePasswordCaptchaToken extends UsernamePasswordToken {
	
	private String captcha;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public UsernamePasswordCaptchaToken() {
		super();

	}

	public UsernamePasswordCaptchaToken(String username, char[] password,
			boolean rememberMe, String host, String captcha) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
	}
}
