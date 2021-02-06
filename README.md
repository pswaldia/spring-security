# spring-security
Contains implementation of various methods of authentication &amp;amp; authorization with the help of spring security framework.


### Some Important Terms : 
1. Authentication :  WHO YOU ARE ? 
    - Knowledge based authentication : password & user id | based on user knowledge. 
        - simple and effective for the most part. 
        - Not fully save. 
    - Possession based authentication : OTP 
    - Multifactor authentication : Possession based + knowledge based. 
2. Authorization : WHAT DO YOU WANT ? 
    - Logged in users can have different degree of authorization.
        - ROLE_ADMIN
        - ROLE_USER
3. Principal : currently logged in user. 

### Why spring security ? 
    - Login & Logout Functionality.
    - Allow/block access to URLs to logged in users. 
    - Roles assigning (access control)
    - Handles common vulnerability.  like csrf. 
    - Widely adopted. 
  
### What spring security can do ?
    - User name and password authentication.
    - SSO/Okta/LDAP
    - App level authorization
    - Intra App Authorization like OAuth
    - Microservice security (using tokens,JWT)
    - Method level security
### Adding Spring Security to Spring boot project
Just adding spring security dependency will enforce basic authentication for local host. 
But how it does so? It uses something called FILTERS which are like guards in front of the servlets that intercepts every request and can do something with them like allowing, blocking, extracting the header info etc. 
Spring security is like a watchmen in front of our application. 

#### Spring Security Default Behaviour
- adds mandatory authentication for urls.
- adds login form.
- handles login error. 
- creates a user and sets a default passsword.  
    - password appears in console and username is 'user'.
- We can customize this user info by going to application.properties.

#### We can configure the spring securtity authentication using:
- **AuthenticationManagerBuilder** : we need to get hold of this : How to do this ? In spring security application there is a class *WebSecurityConfigurerAdapter* which contains a method and takes in *AuthenticationManagerBuilder* as an argument. we can extend the class and override the methods. If we do not do this, default configurations are used. 
