from selenium import webdriver
from selenium.webdriver.chrome.options import Options

import sys
import time
import pymysql
import re

url = 'https://movie.douban.com/tag/#/?sort=U&range=0,10&tags='

browser = webdriver.Chrome()
browser.get(url)
urls=[]
print('---------------------------------------------')
print('开始爬取:' + url)
time.sleep(3)



with open("./log.txt","a") as f:
    for i in range(1, 2000):
        try:
 #           actionMovies = '//*[@id="app"]/div/div[1]/div[3]/a[' + str(i) + ']'
#            chineseMovies = "'//*[@id="app"]/div/div[1]/div[3]/a[' + str(i) + ']'"
#            koreaMovies = '//*[@id="content"]/div/div[1]/div/div[4]/div/a[1]'
            tempUrl = browser.find_element_by_xpath('//*[@id="app"]/div/div[1]/div[3]/a[1]').get_attribute('href')
            '//*[@id="content"]/div/div[1]/div/div[4]/div/a[1]'
            '//*[@id="app"]/div/div[1]/div[3]/a[1]/div/span/img'
            '//*[@id="app"]/div/div[1]/div[3]/a[1]'
            print("Xpath:" + str(i))
            print('URL:' + tempUrl)
            urls.append(tempUrl)
            f.write(tempUrl + '\n')


        except:
            time.sleep(5)
            print('error:' + str(i))
            browser.find_element_by_xpath('//*[@id="content"]/div/div[1]/div/div[4]/a').click()
            i = i - 1
            time.sleep(1)
