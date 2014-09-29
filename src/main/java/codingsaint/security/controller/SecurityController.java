/**
 * 
 */
package codingsaint.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
/*
The MIT License (MIT)

Copyright (c) 2014 Kumar Pallav

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import codingsaint.security.bean.SecurityUser;
import codingsaint.util.UIDGenerator;

/**
 * @author Coding Saint
 *
 */
@Controller 
public class SecurityController {
	
	@Autowired
	UIDGenerator uidGenerator;
	/**
	 * <code>getLogin</code>:This method is required to bring Login Page
	 * User can either Sing in or Sign Up .  
	 * @param securityUser :Beans to hold value of Sign up 
	 * @return view of login.jsp
	 */
	@RequestMapping("/login")
	public String getLogin(@ModelAttribute("signup") SecurityUser securityUser){
		securityUser= new SecurityUser();
		System.out.println(uidGenerator.getUID());
		return "login";
	}
	/**
	 * <code>applicationSignup </code>: Sign Up the new Users
	 * @param securityUser :Keeps value of Sign up details
	 * @return view of login.jsp
	 */
	
	@RequestMapping(value="/application_signup", method=RequestMethod.POST)
	public String applicationSignup(@ModelAttribute("signup") SecurityUser securityUser){
		return "login";
	}
}
 