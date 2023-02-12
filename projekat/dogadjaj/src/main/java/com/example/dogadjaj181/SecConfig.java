package com.example.dogadjaj181;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.dogadjaj181.services.UserDetailService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecConfig {

    @Autowired
    private UserDetailService _UserDetailService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf()
        .disable()
        .authorizeHttpRequests()
        .antMatchers("/registration", "/").permitAll()
        .antMatchers("/registration/**").permitAll()
        .antMatchers("/users").hasAuthority("ADMIN")
        .antMatchers("/CategoryAddChange").hasAuthority("ADMIN")
        .antMatchers("/LocationAddChange").hasAuthority("ADMIN")
        .antMatchers("/EventAddChange").hasAuthority("ADMIN")
        .antMatchers("/AddEvent").hasAuthority("ADMIN")
        .antMatchers("/ChangeEvent").hasAuthority("ADMIN")
        .antMatchers("/AdminMenu").hasAuthority("ADMIN")
        .antMatchers("/").permitAll()
        .antMatchers("/search").permitAll()
        .antMatchers("/allEvents/**").permitAll()
        .antMatchers("/css/**").permitAll()
        .antMatchers("/bootstrap/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin(form -> form
            .loginPage("/login")
            .loginProcessingUrl("/login")
            .failureUrl("/login?error")
            .usernameParameter("username")
            .passwordParameter("sifra")
            .defaultSuccessUrl("/", true)
            .permitAll())
        .logout(
            logout -> logout
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .clearAuthentication(true)
                .permitAll())
        .rememberMe()
        .key("security-remember-secret")
        .tokenValiditySeconds(86400)
        .and()
        .userDetailsService(_UserDetailService)
        .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}