# lbj-nfriends n个小朋友分组

- [退回首页](../README.md)

## 问题描述
    现在有n个小朋友  可以任意组队，也可单独成队，一共多少种可能？

## 结果解析
    当1个小朋友时，只能组建1个队伍。
        1
    当2个小朋友时，每个人可单独组队，也可一起组队，共2种情况。
        1 2
        1,2
    当3个小朋友时，共5种情况：
        每个队伍最多1个人：  1,2,3
        每个队伍最多2个人：  12,3     13,2    1,23
        每个队伍最多3个人：  123
    当4个小朋友时，共15种情况：
        每个队伍最多1个人：  1,2,3,4
        每个队伍最多2个人：  12,34    13,24   14,23
                            12,3,4  13,2,4  14,2,3
                            23,1,4  24,1,3  34,1,2
        每个队伍最多3个人：  123,4   124,3   134,2   234,1
        每个队伍最多4个人：  1234

## 思路整理
    其实，核心类似杨辉三角。
    当1个小朋友时，只能有1个队伍，1种可能性。
    当2个小朋友时，新增的小朋友，可以选择加入第一个小朋友的队伍，保持原队伍数；或者新列队伍。共2种情况。
        此时，队数为1的有1种情况，队数为2的有1种情况。
    当3个小朋友时，新增的小朋友，如果面对原队数为1的情况，选择加入，那队数为1的情况有1种；选择新增，那队数为2的情况有1种。
        如果面对原队数为2的情况（共1种情况），选择加入，每种情况可加入的情况有2种（因为有2个队），共2X1=2种情况；
        选择新增，那队数为3的情况等于原队数为2的情况数，即1种。
        所以此时，队数为1的共1种情况，队数为2的共1+2x1=3种情况，队数为3的共1种情况，共5种情况。

## 二维表

** | 队数| 1 | 2 | 3 | 4| 5
---|---|---|---|---|---|---
结果  | 总人数  |
 1  | 1 | 1
 2  | 2 | 1 | 1
 5  | 3 | 1 | 1+2x1=3   | 1
 15 | 4 | 1 | 1+2x3=7   | 3+3x1=6   | 1
 52 | 5 | 1 | 1+2x7=15  | 7+3x6=25  | 6+4x1=10  | 1

## 总结
    新增成员，针对每种不同队伍情况分别处理。
    若选择不加入，新增队伍数，则新增队伍数的情况为当前情况数，作基础值
    若选择加入，保持当前队伍数，情况为基础值+当前队伍数x当前情况数。

## 就不做数据拟合了。





    
    
    
    
