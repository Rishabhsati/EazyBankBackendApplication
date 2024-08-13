package com.rishabh.EazyBankBackendApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
        http.authorizeHttpRequests((requests) -> requests.
                requestMatchers("/getAccount","/getBalance","/getCards","/myLoans").authenticated().
                requestMatchers("/contact","/notices","/error").permitAll());

        http.formLogin(withDefaults());
//        http.formLogin(flc->flc.disable());
        http.httpBasic(withDefaults());
//        http.httpBasic(hbl->hbl.disable());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withUsername("antrix").password("{noop}12345").build();
        UserDetails admin = User.withUsername("admin").password("{bcrypt}$2a$12$i4kjc7SI/ygx1yj05mQiPuBADFvmVk8BGiFUQqdnT.Q.ity/cEYOG").build();
        return new InMemoryUserDetailsManager(user,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
