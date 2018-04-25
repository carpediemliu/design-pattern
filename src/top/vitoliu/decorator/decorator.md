#### 装饰者模式：
  装饰者（Decorator）和被装饰者（ConcreteComponent）拥有相同的接口Component。被装饰者通常是系统的核心组件，完成特定的功能目标。而装饰者可以在被装饰者的方法前后加上特定的前置处理和后置处理，增强被装饰者的功能  

案例：将某一个结果通过HTML的形式发布。同时，由于需要在网络上通过HTTP方式传输，还需要增加HTTP头(简化处理)

核心思想：将内容构建、HTML文本构造、HTTP头生成分解为三个独立的组件。

MyPacketCreator为装饰接口，用于处理具体内容。  
PacketBodyCreator为具体组件，用于构造发布信息的核心内容，但它并不负责将其构造为一个格式工整、可直接发布的数据格式。  
PacketHTTPHeaderCreator负责为给定的内容加上HTTP头部  
PacketHTMLHeaderCreator负责将内容转化成HTML文本
