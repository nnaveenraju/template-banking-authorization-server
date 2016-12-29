/**
 * 
 */
package com.mulesoft.templates.oauth.user;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * Extension of the User object provided by Spring.
 *
 */
public class AnypointUser extends User{
	
	private Map<String,String> customProperties;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6043819622584678780L;
	
	/**
	 * @param username
	 * @param password
	 * @param authorities
	 * @param id
	 * @param account
	 */
	public AnypointUser(String username, String password, Collection<? extends GrantedAuthority> authorities, Map<String,String> customProperties) {
		super(username, password, authorities);
		this.customProperties = customProperties;
	}
	
	/**
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public AnypointUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		
	}

	/**
	 * @param username
	 * @param password
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param authorities
	 */
	public AnypointUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	/**
	 * @return the customProperties
	 */
	public Map<String, String> getCustomProperties() {
		return customProperties;
	}

	/**
	 * @param customProperties the customProperties to set
	 */
	public void setCustomProperties(Map<String, String> customProperties) {
		this.customProperties = customProperties;
	}
	
}