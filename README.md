### Crawler My Lol Data

* **简介** 

  通过spring boot-mybatis-mysql-redis爬取并展示个人Lol游戏信息

* **链接地址**

  ```properties
  #获取英雄数据信息
  url_hero_list = https://game.gtimg.cn/images/lol/act/img/js/heroList/hero_list.js
  
  #获取大乱斗游戏信息
  url_game_list = https://lol.sw.game.qq.com/lol/api/?c=Battle&a=matchList&areaId=25&accountId=4011711553&queueId=65,450&r1=matchList
  
  #获取单场游戏双方的具体信息
  url_game_detial = https://lol.sw.game.qq.com/lol/api/?c=Battle&a=combatGains&areaId=25&gameId={0}&r1=combatGains
  ```

* **添加简易的爬虫框架**

  <img src="C:\Users\86157\Downloads\未命名文件.png" alt="爬虫框架" style="zoom:100%;" />

  > 简单介绍

  `@HttpRequest`：封装Http请求，以及设置请求头部信息

  `@HttpResponse`：封装Http响应信息

  `@Schedule`：调度器中提供请求信息队列和响应信息队列

  `@Downloader`：获取调度队列中的请求进行下载，将响应信息封装成HttpResponse添加进调度							器中的响应队列

  `@Processor`：处理器，将调度器中的响应信息按照指定的处理策略处理数据
  
  