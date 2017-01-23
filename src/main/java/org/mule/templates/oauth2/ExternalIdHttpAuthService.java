/**
 * 
 */
package org.mule.templates.oauth2;

import org.mule.api.client.OperationOptions;
import org.mule.module.http.api.HttpConstants;
import org.mule.module.http.api.client.HttpRequestOptionsBuilder;

/**
 * Class that extends the AbstractCustomHttpService, 
 * including the specific logic for invoking the Auth External service.
 *
 */
public class ExternalIdHttpAuthService extends AbstractCustomHttpService{
	
	/**
	 * @see org.mule.templates.oauth2.AbstractCustomHttpService#getUrlString(java.lang.String[])
	 */
	public String getUrlString(String...params){
		return String.format("%s:%s%s?username=%s&password=%s", getHttpHost(), 
				getHttpPort(), getHttpPath(), params[0], params[1]);
	}
	
	/**
	 * @see org.mule.templates.oauth2.AbstractCustomHttpService#getMethod()
	 */
	public OperationOptions getMethod(){
		return HttpRequestOptionsBuilder.newOptions().method(HttpConstants.Methods.POST.name()).build();
	}
}