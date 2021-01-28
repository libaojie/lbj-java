package com.lbj.bean.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Classname UrlResource
 * @Description TODO
 * @Date 2021/1/27 16:39
 * @Created by com.lbj
 */
public class UrlResource implements Resource{

    private final URL url;
    public UrlResource(URL url){
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
