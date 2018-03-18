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
    return False;
    # write code here

target = 1

array=[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]

for x in range(6,0,-1):
    print(x)

#print(Find(target,array))