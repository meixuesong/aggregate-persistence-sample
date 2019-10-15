# aggregate-persistence-sample

![](https://travis-ci.com/meixuesong/aggregate-persistence-sample.svg?branch=master)

这是[Aggregate-Persistence](https://github.com/meixuesong/aggregate-persistence) 的示例项目。

Aggregate-Persistence为DDD落地时，提供一种优雅的、轻量级聚合持久化方案。该方案简单易行，可以真正做到领域对象是干净的对象模型，只处理业务逻辑。而Repository持久化层完全与业务无关，只负责聚合的持久化。

本项目以订单聚合为例，演示了如何采用Aggregate-Persistence如何帮助简单聚合的持久化工作。项目采用SpringBoot和Mybatis框架。你可以从OrderControllerTest了解已经实现的功能，也可以直接到OrderRepository了解持久化具体细节。
