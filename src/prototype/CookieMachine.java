package prototype;

/*
 * Client Class
 */

public class CookieMachine {
	private Cookie cookie;
	
	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public Cookie makeCookie() {
		return (Cookie)cookie.clone(); //복제된 객체 반환//
	}
}
