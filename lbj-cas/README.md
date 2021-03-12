# CAS

- [退回首页](../README.md)


    cas号称无锁优化，也称自旋。全称：CompareAndSet，比较并且设定。
    
    cas(V, E, NewValue)
    if V == E:
        V = NewValue
    else
        try again
        
    V是要改的值，E是期望这个值是啥，NewValue是新值
    内存地址V，旧的预期值A，要修改的新值B
    如果失败，E就更新为
    
    

