package com.lbj.bean.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname Resource
 * @Description Resource是spring内部定位资源的接口。
 * @Date 2021/1/27 16:34
 * @Created by com.lbj
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
