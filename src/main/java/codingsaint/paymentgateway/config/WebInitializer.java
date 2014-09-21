/**
 * 
 */
package codingsaint.paymentgateway.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
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
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * @author Coding Saint
 *
 */
 
public class WebInitializer implements WebApplicationInitializer {
	private static final Integer LOAD_ON_STARTUP=1;
 
public void onStartup(ServletContext servletContext) throws ServletException {
 
 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
 ctx.register(Configurations.class);
 ctx.setServletContext(servletContext);
 Dynamic servlet =	servletContext.addServlet("spring",new DispatcherServlet(ctx));
 servlet.addMapping("/");
 servlet.setLoadOnStartup(LOAD_ON_STARTUP);
 
 }

}