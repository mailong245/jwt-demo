package com.demo.jsonwebtoken.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/***
 * MethodSecurityConfigurer
 * vi: Bật các chức năng security mặc định cho toàn dự án
 * en: Enable global method security
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfigurer extends GlobalMethodSecurityConfiguration {
}