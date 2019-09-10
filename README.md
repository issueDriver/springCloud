## 项目结构
.
├── EurekaClient
│   ├── EurekaClient.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── zuojie
│   │   │   │           ├── controller
│   │   │   │           │   └── ServiceHiApplication.java
│   │   │   │           └── tmp.java
│   │   │   └── resources
│   │   │       └── application.yml
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   ├── application.yml
│       │   └── com
│       │       └── zuojie
│       │           ├── controller
│       │           │   └── ServiceHiApplication.class
│       │           └── tmp.class
│       └── generated-sources
│           └── annotations
├── EurekaServer
│   ├── EurekaServer.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── zuojie
│   │   │   │           └── app
│   │   │   │               └── EurekaApplication.java
│   │   │   └── resources
│   │   │       └── application.yml
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   ├── application.yml
│       │   └── com
│       │       └── zuojie
│       │           └── app
│       │               └── EurekaApplication.class
│       └── generated-sources
│           └── annotations
├── README.md
├── member
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── zuojie
│       │   │           ├── App.java
│       │   │           ├── controller
│       │   │           │   └── UserApiController.java
│       │   │           ├── dao
│       │   │           │   └── UserDao.java
│       │   │           ├── entity
│       │   │           │   └── UserEntity.java
│       │   │           └── service
│       │   │               └── UserService.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           └── java
├── order
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── zuojie
│   │   │   │           ├── controller
│   │   │   │           │   └── OrderController.java
│   │   │   │           └── tmp.java
│   │   │   └── resources
│   │   │       └── application.yml
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   ├── application.yml
│       │   └── com
│       │       └── zuojie
│       │           ├── controller
│       │           │   └── OrderController.class
│       │           └── tmp.class
│       ├── generated-sources
│       │   └── annotations
│       ├── maven-archiver
│       │   └── pom.properties
│       ├── maven-status
│       │   └── maven-compiler-plugin
│       │       ├── compile
│       │       │   └── default-compile
│       │       │       ├── createdFiles.lst
│       │       │       └── inputFiles.lst
│       │       └── testCompile
│       │           └── default-testCompile
│       │               └── inputFiles.lst
│       ├── order-1.0-SNAPSHOT.jar
│       └── order-1.0-SNAPSHOT.jar.original
├── pom.xml
├── service-feign
│   ├── pom.xml
│   ├── service-feign.iml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── zuojie
│       │   │           ├── ServiceFeign.java
│       │   │           ├── Tmp.java
│       │   │           ├── controller
│       │   │           │   └── IndexController.java
│       │   │           └── service
│       │   │               ├── FeignService.java
│       │   │               └── SchedualServiceHiHystric.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           └── java
├── service-ribbon 
│   ├── pom.xml
│   ├── service-ribbon.iml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── zuojie
│   │   │   │           ├── RibbonApplication.java
│   │   │   │           ├── controller
│   │   │   │           │   └── RibbonController.java
│   │   │   │           └── service
│   │   │   │               └── HelloService.java
│   │   │   └── resources
│   │   │       └── application.yml
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   ├── application.yml
│       │   └── com
│       │       └── zuojie
│       │           ├── RibbonApplication.class
│       │           ├── controller
│       │           │   └── RibbonController.class
│       │           └── service
│       │               └── HelloService.class
│       └── generated-sources
│           └── annotations
└── springcloud.iml
## 启动步骤
### 第一步先启动Eureka服务
### 第二步启动Eureka客户端
### 第三步根据需要启动服务 也可以都启动
