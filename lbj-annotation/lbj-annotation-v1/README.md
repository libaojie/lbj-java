# annotation 注解

## 操作步骤

    1、编译源代码
    cd com/lbj/annotation
    javac .\CheckGetter.java .\CheckGetterProcessor.java
    
    2、创建jar包
    cd ..
    cd ..
    jar -cvf processor.jar com META-INF
    
    3、检查测试
    javac -cp processor.jar com/lbj/annotation/TestGetter.java
