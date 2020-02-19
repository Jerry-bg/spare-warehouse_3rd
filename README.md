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

  