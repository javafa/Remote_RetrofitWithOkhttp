package com.kodonho.android.remote_retrofitwithokhttp;

import java.net.CookieManager;
import java.net.CookiePolicy;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by fastcampus on 2016-10-26.
 */

public class RestAdapter {
    public static final int CONNECT_TIMEOUT = 3;
    public static final int WRITE_TIMEOUT = 5;
    public static final int READ_TIMEOUT = 3;
    private static final String SERVER_URL = "http://openapi.seoul.go.kr:8088";
    private static OkHttpClient client;
    private static ISeoulOpenData service;

    public synchronized static ISeoulOpenData getInstance(){
        if(service == null){
            // 통신로그를 확인하기 위한 interceptor 설정
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            // 쿠키매니저 설정
            CookieManager manager = new CookieManager();
            manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

            // okHttp 설정 ...
            // SSL 통한 서버연결인 경우 인증서가 없으면 통신자체가 안된다
            // 이럴경우 회피하기 위해 인증서를 무시하는 세팅을 해줄 수 있다
            //clent =
        }
        return service;
    }



}
