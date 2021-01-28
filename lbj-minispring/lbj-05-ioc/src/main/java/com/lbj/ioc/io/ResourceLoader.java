package com.lbj.ioc.io;

import java.net.URL;

/**
 * @Classname ResourceLoader
 * @Description TODO
 * @Date 2021/1/27 16:35
 * @Created by lbj
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
