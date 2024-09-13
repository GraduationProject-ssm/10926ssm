# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# 10926ssm大学生综合素质评分平台

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Sh44eDEx6?p=27)


# 系统概述
进过系统的分析后，就开始记性系统的设计，系统设计包含总体设计和详细设计。总体设计只是一个大体的设计，经过了总体设计，我们能够划分出系统的一些东西，例如文件、文档、数据等。而且我们通过总体设计，大致可以划分出了程序的模块，以及功能。但是只是一个初步的分类，并没有真正的实现。

整体设计，只是一个初步设计，而且，对于一个项目，我们可以进行多个整体设计，通过对比，包括性能的对比、成本的对比、效益的对比，来最终确定一个最优的设计方案，选择优秀的整体设计可以降低开发成本，增加公司效益，从这一点来讲，整体设计还是非常重要的。

大学生综合素质评分平台工作原理图如图4-1所示：

![](/md/blog.012.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
系统架构图属于系统设计阶段，系统架构图只是这个阶段一个产物，系统的总体架构决定了整个系统的模式，是系统的基础。大学生综合素质评分平台的整体结构设计如图4-2所示。

![](/md/blog.013.png)

图4-2 系统结构图
## 4.3数据库设计
数据库是计算机信息系统的基础。目前，电脑系统的关键与核心部分就是数据库。数据库开发的优劣对整个系统的质量和速度有着直接影响。
### 4.3.1 数据库设计原则
数据库的概念结构设计采用实体—联系（E-R）模型设计方法。E-R模型法的组成元素有：实体、属性、联系，E-R模型用E-R图表示，是提示学生工作环境中所涉及的事物，属性则是对实体特性的描述。在系统设计当中数据库起着决定性的因素。下面设计出这几个关键实体的实体—关系图。
### 4.3.2 数据库实体
数据模型中的实体（Entity），也称为实例，对应现实世界中可区别于其他对象的“事件”或“事物”。例如，公司中的每个员工，家里中的每个家具。

本系统的E-R图如下图所示：

1、学生信息实体图如图4-3所示：

![](/md/blog.014.png)

图4-3学生信息实体图

2、课程信息实体图如图4-4所示：

![](/md/blog.015.png)

`      `图4-4课程信息实体图

3、教学质量评价信息实体图如图4-5所示：

![](/md/blog.016.png)

`     `图4-5教学质量评价信息实体图

#########

### 4.3.3 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。

表4-1 allusers表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|username|varchar|50|` `default NULL|
|pwd|varchar|50|` `default NULL|
|cx|varchar|50|` `default NULL|


表4-2 cepingbiaozhun表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|biaoti|varchar|50|default NULL|
|zhaiyao|varchar|50|default NULL|
|tupian|varchar|50|default NULL|
|xiangguanfujian|varchar|50|default NULL|
|neirong|varchar|50|default NULL|
|faburiqi|varchar|50|default NULL|

表4-3：huodongjilu表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|xuehao|varchar|50|default NULL|
|xueshengxingming|varchar|50|default NULL|
|shijianhuodong|varchar|50|default NULL|
|chuangxinhuodong|varchar|50|default NULL|
|zaixiaobiaoxianqingkuang|varchar|50|default NULL|


表4-4：jiangchengxinxi表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|xuehao|varchar|50|default NULL|
|xueshengxingming|varchar|50|default NULL|
|jiangchengleixing|varchar|50|default NULL|
|neirong|varchar|50|default NULL|

表4-5：jiaoxuezhiliangpingjia表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|kechengbianhao|varchar|50|default NULL|
|kechengmingcheng|varchar|50|default NULL|
|jiaoshigonghao|varchar|50|default NULL|
|jiaoshixingming|varchar|50|default NULL|
|pingfen|varchar|50|default NULL|
|pingjia|varchar|50|default NULL|
|xuehao|varchar|50|default NULL|
|xueshengxingming|varchar|50|default NULL|





# 5统详细设计
## 5.1前台首页功能模块
大学生综合素质评分平台，在系统首页可以查看首页、测评标准、新闻资讯、留言反馈、我的、跳转到后台、客服等内容，如图5-1所示。

![](/md/blog.017.png)

图5-1前台首页功能界面图



`    `注册，在注册页面可以填写学号、学生姓名、性别、联系电话等详细内容进行注册，如图5-2所示。

![](/md/blog.018.png)

图5-2注册界面图

登录，在登录页面通过填写账号、密码等信息完成登录，如图5-3所示。测评标准页面通过填写摘要、内容、发布日期、相关附件等信息进行提交操作，如图5-4所示。

![](/md/blog.019.png)

图5-3登录界面图

![](/md/blog.020.png)

图5-4测评标准界面图

## 5.2管理员功能模块
管理员登录，通过填写注册时输入的用户名、密码进行登录，如图5-5所示。

![](/md/blog.021.png)

图5-5管理员登录界面图

管理员登录进入大学生综合素质评分平台可以查看个人中心、班级信息管理、学生管理、课程信息管理、教学质量评价管理、学生成绩管理、奖惩信息管理、活动记录管理、测评标准管理、学生综合测评成绩管理、留言板管理、系统管理等信息。

班级信息管理，在班级信息管理页面中可以通过填写班级、班级人数、班主任、联系电话等内容进行修改、删除，如图5-6所示。还可以根据需要对学生管理进行详情，修改等详细操作，如图5-7所示。

![](/md/blog.022.png)

图5-6班级信息管理界面图

![](/md/blog.023.png)

图5-7学生管理界面图

课程信息管理，在课程信息管理页面中可以查看课程编号、课程名称、课时、学分、上课时间、教师工号、教师姓名等信息，并可根据需要对已有课程信息管理进行修改或删除等操作，如图5-8所示。

![](/md/blog.024.png)

图5-8课程信息管理界面图

奖惩信息管理，在奖惩信息管理页面中可以查看学号、学生姓名、奖惩类型、内容等信息，并可根据需要对已有奖惩信息管理进行修改或删除等详细操作，如图5-9所示。

![](/md/blog.025.png)

图5-9奖惩信息管理界面图

活动记录管理，在活动记录管理页面中可以查看学号、学生姓名、实践活动、创新活动、在校表现情况等内容，并且根据需要对已有活动记录管理进行详情，修改或删除等详细操作，如图5-10所示。

![](/md/blog.026.png)

图5-10活动记录管理界面图

轮播图；该页面为轮播图管理界面。管理员可以在此页面进行首页轮播图的管理，通过新建操作可在轮播图中加入新的图片，还可以对以上传的图片进行修改操作，以及图片的删除操作，如图5-11所示。

![](/md/blog.027.png)

图5-11轮播图管理界面图

学生综合测评成绩管理，在学生综合测评成绩管理页面中可以查看学号、学生姓名、学科成绩、活动表现、总成绩等内容，并且根据需要对已有学生综合测评成绩管理进行查看，修改或删除等详细操作，如图5-12所示。

![](/md/blog.028.png)

图5-12学生综合测评成绩管理界面图

留言板管理，在留言板管理页面中可以查看留言人ID、用户名、留言内容、回复内容等内容，并且根据需要对已有留言板管理进行详情，修改或删除等详细操作，如图5-13所示。

![](/md/blog.029.png)

图5-13留言板管理界面图
## 5.3学生功能模块
学生登录进入大学生综合素质评分平台可以查看个人中心、课程信息管理、教学质量评价管理、学生成绩管理、奖惩信息管理、活动记录管理、学生综合测评成绩管理、我的收藏管理等内容。

课程信息管理，在课程信息管理页面中通过填写课程编号、课程名称、课时、学分、上课时间、教师工号、教师姓名等信息，还可以根据需要对课程信息管理进行修改，如图5-14所示。

![](/md/blog.030.png)

图5-14课程信息管理界面图

教学质量评价管理，在教学质量评价管理页面中可以查看课程编号、课程名称、教师工号、教师姓名、评分、评价、学号、学生姓名等信息，并且根据需要对已有教学质量评价管理进行查看删除操作，如图5-15所示。

![](/md/blog.031.png)

图5-15教学质量评价管理界面图

奖惩信息管理，在奖惩信息管理页面中通过填写学号、学生姓名、奖惩类型、内容等内容进行修改、删除，如图5-16所示。

![](/md/blog.032.png)

图5-16奖惩信息管理界面图

活动记录管理，在活动记录管理页面中通过填写学号、学生姓名、实践活动、创新活动、在校表现情况等内容进行修改、删除，如图5-17所示。

![](/md/blog.033.png)

图5-17活动记录管理界面图

学生综合测评成绩管理，在学生综合测评成绩管理页面中通过填写学号、学生姓名、学科成绩、活动表现、总成绩等内容进行修改、删除，如图5-18所示。

![](/md/blog.034.png)

图5-18学生综合测评成绩管理界面图













