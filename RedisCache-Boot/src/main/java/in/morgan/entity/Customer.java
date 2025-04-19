package in.morgan.entity;

import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash(value ="CustomerHash")
public class Customer {
private Integer id;
private String name;
}
