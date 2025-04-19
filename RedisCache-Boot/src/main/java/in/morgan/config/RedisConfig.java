package in.morgan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import redis.clients.jedis.JedisClientConfig;

@Configuration
public class RedisConfig {
	@Value("${spring.data.redis.url}")
	private String url;
	@Value("${spring.data.redis.username}")
	private String username;
	@Value("${spring.data.redis.password}")
	private String pwd;
	@Value("${spring.data.redis.port}")
	private Integer port;
	@Bean
	JedisConnectionFactory jedisConFacBean(){
	RedisStandaloneConfiguration configuration=new RedisStandaloneConfiguration(url);
    configuration.setPort(port);
	configuration.setUsername(username);
	configuration.setPassword(pwd);
	JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().build();
	return new JedisConnectionFactory(configuration,jedisClientConfiguration);

	}
	}
