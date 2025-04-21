package com.example.social_app.model;

import com.example.social_app.model.NguoiDung;
//
//public class RegisterResponse {
//    private String access_token;
//    private String refresh_token;
//    private String token_type;
//    private NguoiDung user;
//
//    public String getAccessToken() {
//        return access_token;
//    }
//
//    public String getRefreshToken() {
//        return refresh_token;
//    }
//
//    public String getTokenType() {
//        return token_type;
//    }
//
//    public NguoiDung getUser() {
//        return user;
//    }
//}



public class RegisterResponse {
    private String access_token;
    private String refresh_token;
    private String token_type;
    private NguoiDung user;

    // Getter và Setter
    public String getAccessToken() {
        return access_token;
    }

    public void setAccessToken(String access_token) {
        this.access_token = access_token;
    }

    public String getRefreshToken() {
        return refresh_token;
    }

    public void setRefreshToken(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getTokenType() {
        return token_type;
    }

    public void setTokenType(String token_type) {
        this.token_type = token_type;
    }

    public NguoiDung getUser() {
        return user;
    }

    public void setUser(NguoiDung user) {
        this.user = user;
    }
}
