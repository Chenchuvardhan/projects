package in.reliance.response;

import lombok.Data;

@Data
public class ApiResponse<T> {
private Integer status;
private String message;
private String token;
private T data;
}
