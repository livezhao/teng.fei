package teng.fei;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	String sayHello(@WebParam String name);
	
	
}
