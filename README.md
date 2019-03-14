
# springcloud-exam

springcloud开发demo


## 开发环境

- idea
- jdk1.8+
- eureka
- mysql
- maven

## 项目中使用到的私有包

- [optimus-common](https://github.com/deepexi/optimus-commons)

## deepexi-service-a

该微服务下实现要求的功能


## deepexi-service-b

该微服务作为消费者，调用deepexi-service-a，实现远程调用


## docker部署

e.g.

```bash
$ cd deepexi-service-a
$ ./start-code.sh
```
