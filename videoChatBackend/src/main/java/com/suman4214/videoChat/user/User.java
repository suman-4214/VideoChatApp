package com.suman4214.videoChat.user;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class User {

    private String username;
    private String email;
    private String password;
    private String status;
}
