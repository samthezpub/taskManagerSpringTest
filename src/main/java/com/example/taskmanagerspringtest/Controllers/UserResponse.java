package com.example.taskmanagerspringtest.Controllers;

public class UserResponse {
    private final String status;
    private final Integer code;

    public UserResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }
}
