package challenge.service;

public interface KakaoService {

    <T> T me(String accessToken, Class<T> clazz);
    
}