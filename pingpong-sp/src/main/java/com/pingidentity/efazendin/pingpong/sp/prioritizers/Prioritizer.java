package com.pingidentity.efazendin.pingpong.sp.prioritizers;

import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pingidentity.efazendin.pingpong.sp.model.IdentityProvider;
import com.pingidentity.efazendin.pingpong.sp.model.IdentityProviderAppFilter;

/**
 * A Prioritizer sets the priority of IdPs to query.
 * 
 * Todo: Make it so the prioritizer used is set in a config file some how.  Since the classes wouldn't be known beforehand, this will require instantiating the class in a way other than 'New ClassName()'.  Hivelive does stuff like this, I believe.
 * 
 * @author efazendin
 *
 */
public interface Prioritizer {


	//Passing in ServletContext plus classes relavent to current request if a prioritizer wanted to take runtime information, such as cookies, IP address, etc., to establish priority
	public List<IdentityProvider> prioritize(Set<IdentityProvider> identityProviderSet, ServletContext cont, HttpServletRequest req, HttpServletResponse resp);
	
	public List<IdentityProvider> prioritize(Set<IdentityProvider> identityProviderSet, IdentityProviderAppFilter filter, ServletContext cont, HttpServletRequest req, HttpServletResponse resp);
	

}
