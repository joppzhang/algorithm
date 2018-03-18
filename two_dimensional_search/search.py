# -*- coding:utf-8 -*-
# array 二维列表
def Find(target, array):
    for i in range(len(array)-1,-1,-1):#这是行数，从最后一行开始
        for j in range(0,len(array[0])):#这是列数，从第一列开始
            #print(array[i][j])
            if target == array[i][j]:
                return True;
            elif target > array[i][j]:
                continue
            elif target < array[i][j]:
                break
            #可以改进为二分查找
    return False;
target = 2
array=[[123],[456],[789]]
print(Find(target,array))
