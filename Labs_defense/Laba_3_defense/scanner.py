# -*- coding:utf -8 -*-

from termcolor import colored
import socket



#host = input("Enter the host : ")
#print(host)
j = 0
port = [20, 21, 22, 23, 42, 43, 53, 67, 69, 80]
for i in port:
    if i >= 50 or i % 2 == 0:
        continue
    else :
        print(i)




