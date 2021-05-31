# Saas java事件函数

- [退回首页](../README.md)
  
- [官网](https://help.aliyun.com/document_detail/113518.html?spm=a2c4g.11186623.6.583.3d5d3360oynRNT)


    您在使用Java编程时，必须要实现函数计算提供的接口类，对于事件入口函数目前有两个预定义接口可以选择。这两个预定义接口分别是：
    
    StreamRequestHandler
    以流的方式接受调用输入event和返回执行结果，您需要从输入流中读取调用函数时的输入，处理完成后把函数执行结果写入到输出流中来返回。
    
    PojoRequestHandler
    通过泛型的方式，您可以自定义输入和输出的类型，但是输入和输出的类型必须是POJO类型。
