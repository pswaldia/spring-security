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
    - SSO/ Okta/ LDAP
    - App level authorization
    - Intra App Authorization like OAuth
    - Microservice security (using tokens,JWT)
    - Method level security