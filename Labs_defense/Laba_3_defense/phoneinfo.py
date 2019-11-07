import urllib.request
import json
import os


phone = input("Enter phone: ")
getInfo = "https://htmlweb.ru/geo/api.php?json&telcod=" + phone

try:
    infoPhone = urllib.request.urlopen( getInfo )
except:
    print( "\n[!] - Phone not found - [!]\n" )

infoPhone = json.load(infoPhone)

print( "-" * 60 )

print( u"Номер сотового --->", "+" + phone )
print( u"Страна ---> ", infoPhone["country"]["name"] )
try:
    print( u"Регион ---> ", infoPhone["region"]["name"] )
except:
    print( u"Регион ---> not defined")
print( u"Оператор ---> ", infoPhone["0"]["oper"] )
print( u"Часть света ---> ", infoPhone["country"]["location"] )
