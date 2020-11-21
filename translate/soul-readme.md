<p align="center" >
    <a href="https://dromara.org"><img src="https://yu199195.github.io/images/soul/soul-logo.png" width="45%"></a>
</p>
<p align="center">
  <strong>易扩展，高性能，响应式API网关</strong>
</p>
<p align="center">
  <a href="https://dromara.org">https://dromara.org/</a>
</p>

<p align="center">
    <a target="_blank" href="http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.dromara%22%20AND%soul">
        <img src="https://img.shields.io/maven-central/v/org.dromara/soul.svg?label=maven%20central" />
    </a>
    <a target="_blank" href="https://github.com/Dromara/soul/blob/master/LICENSE">
        <img src="https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license" />
    </a>
    <a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
        <img src="https://img.shields.io/badge/JDK-8+-green.svg" />
    </a>
    <a target="_blank" href="https://github.com/dromara/soul">
        <img src="https://github.com/dromara/soul/workflows/build/badge.svg" />
    </a>
    <a href="https://www.codacy.com/app/yu199195/soul?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Dromara/soul&amp;utm_campaign=Badge_Grade">
        <img src="https://api.codacy.com/project/badge/Grade/4367ffad5b434b7e8078b3a68cc6398d"/>
    </a>
    <a target="_blank" href='https://gitee.com/shuaiqiyu/soul/stargazers'>
        <img src='https://gitee.com/shuaiqiyu/soul/badge/star.svg?theme=gvp' alt='gitee stars'/>
   </a>
   <a target="_blank" href='https://github.com/dromara/soul'>
        <img src="https://img.shields.io/github/forks/dromara/soul.svg" alt="github forks"/>
   </a>
   <a target="_blank" href='https://github.com/dromara/soul'>
        <img src="https://img.shields.io/github/stars/dromara/soul.svg" alt="github stars"/>
   </a>
   <a target="_blank" href='https://github.com/dromara/soul'>
        <img src="https://img.shields.io/github/contributors/dromara/soul.svg" alt="github contributors"/>
   </a>     
   <a href="https://github.com/Dromara/soul">
        <img src="https://tokei.rs/b1/github/Dromara/soul?category=lines"/>
   </a>
   <a target="_blank" href="https://codecov.io/gh/dromara/soul">
        <img src="https://codecov.io/gh/dromara/soul/branch/master/graph/badge.svg" />
   </a>
</p>
<br/>

--------------------------------------------------------------------------------

# 架构

 ![](https://yu199195.github.io/images/soul/soul-framework.png)  

--------------------------------------------------------------------------------

# 执行流程

 ![](https://yu199195.github.io/images/soul/soul-handler.png)

--------------------------------------------------------------------------------

# 模块列表

 * soul-admin : 插件、规则、选择器等配置的管理后台模块。

 * soul-bootstrap : soul 项目启动模块。

 * soul-client : soul 客户端模块，默认支持 springMvc、dubbo、springCloud 请求。
  
 * soul-common : soul 项目的公共模块。

 * soul-dist : admin 后台以及 bootstrap 项目启动的脚本。

 * soul-metrics : soul 监控模块，以 SPI 方式提供指标聚合统计以监控当前应用的运行状况，默认是 prometheus 实现。 

 * soul-plugin : soul 提供的插件集合模块。

 * soul-spi : soul 自定义的 SPI 模块。

 * soul-spring-boot-starter : soul 的 spring boot starter 支持模块。

 * soul-sync-data-center : 配置信息同步模块，默认支持 http、nacos、websocket、zk。

 * soul-test : soul 单元测试模块。

 * soul-web : soul 核心逻辑模块，如请求过滤、路由转发、限流等配置。

--------------------------------------------------------------------------------

# 功能列表

   * soul 提供了一些插件，例如限流，融合，转发，路由监视等。
   
   * soul 支持与 http、restful、websocket、dubbo、springcloud 等的无缝对接。
   
   * soul 基于插件热插拔设计，用户可以自定义扩展。
   
   * soul 支持路由选择规则动态配置。

   * soul 支持集群部署。
   
   * soul 支持 A/B 测试和灰度发布。

--------------------------------------------------------------------------------

# 插件化

在 soul 架构中，当一个请求进来，soul 会以责任链的方式执行用户配置的插件。soul 的设计核心就是插件化，并且支持插件可扩展性以及可热插拔。

不同的插件处理不同的逻辑。当然，用户可以自定义自己的插件。如有必要，请参考[plugin-extend](https://dromara.org/website/zh-cn/docs/soul/extend.html)

--------------------------------------------------------------------------------

# 选择器和路由 

soul 基于 http 请求头并根据配置的选择器和规则进行请求的路由转发；选择器是第一层路由，它的粒度较粗，通常指应用模块层面；

规则是第二层路由，也就是请求真正的映射着落点，通常指模块方法层面；选择器和规则仅匹配一次并返回响应结果，所以粗粒度应该配置在最后。

--------------------------------------------------------------------------------

# 数据缓存和同步

为了提高配置信息的访问速度，soul 所有的配置信息都以并发的方式缓存在 JVM 内存中；

同时 soul 集群通过心跳机制与 admin 后台保持长连接，默认支持 zk、websocket、http 长轮询；
所以当用户在 admin 后台修改了配置，soul 会快速动态的更新本地 JVM 缓存。具体架构图如下：

  ![Data Sync](https://bestkobe.gitee.io/images/soul/soul-config-processor.png?_t=201908032316)

  ![Sync Flow](https://bestkobe.gitee.io/images/soul/config-strage-processor.png?_t=201908032339)

--------------------------------------------------------------------------------

# 环境准备

   * JDK 1.8+
   
   * Mysql

--------------------------------------------------------------------------------

# 关于

Soul 已经应用于生产环境；使用过程中，它的性能和灵活性使我们的业务开发如虎添翼；

在双11中，我们部署了6个集群以支持更大容量的业务请求。

--------------------------------------------------------------------------------

# 文档和网站
如果你想更多了解它，可以参考 [Website](https://dromara.org/website/zh-cn/docs/soul/soul.html)
如果你想在项目中引入它，可以参考 [Document](https://github.com/Dromara/soul/blob/master/doc/setup.md)

--------------------------------------------------------------------------------

# 开源热度

[![Stargazers over time](https://starchart.cc/Dromara/soul.svg)](https://starchart.cc/Dromara/soul)

--------------------------------------------------------------------------------

# 视频介绍

* [evn setup 01 ](http://www.iqiyi.com/w_19s6521605.html)

* [evn setup 02 ](http://www.iqiyi.com/w_19s65203ap.html)

* [source code debug](http://www.iqiyi.com/w_19s650tbol.html)

* [plugins](http://www.iqiyi.com/w_19s651zyo9.html)

--------------------------------------------------------------------------------

# 使用用户

按照登记顺序排序，更多接入公司，欢迎在[https://github.com/Dromara/soul/issues/68](https://github.com/Dromara/soul/issues/68)登记（仅供开源用户参考）

<table>
  <thead>
    <th>广州思埠集团有限公司</th>
    <th>上海凯京信达科技集团有限公司</th>
    <th>上海彩贝壳科技有限公司</th>
    <th>江苏永钢集团有限公司</th>
  </thead>
  <tbody>
    <tr>
      <td><img src="https://yu199195.github.io/images/soul/users/sibu.jpg"  width="1800" height="90" alt="思埠集团"/>
      <td><img src="https://yu199195.github.io/images/soul/users/keking.png"  width="1800" height="90" alt="凯京集团"/>
      <td><img src="https://yu199195.github.io/images/soul/users/caibeike.png"  width="1800" height="90" alt="彩贝壳"/>
      <td><img src="https://yu199195.github.io/images/soul/users/jiangsuyonggang.jpg"  width="1800" height="90" alt="江苏永钢集团"/>
    </tr>
  </tbody>
  <thead>
      <th>上海方付通科技有限公司 </th>
      <th>上海理想信息产业集团有限公司</th>
      <th>北京开普云科技有限公司</th>
      <th>武汉颂大教育科技股份有限公司</th>
   </thead>
   <tbody>
       <tr>
         <td><img src="https://yu199195.github.io/images/soul/users/fangfutong.png"  width="1800" height="90" alt="上海方付通科技有限公司"/>
         <td><img src="https://yu199195.github.io/images/soul/users/lixiang.jpg"  width="1800" height="90" alt="上海理想信息产业集团有限公司"/>
         <td><img src="https://yu199195.github.io/images/soul/users/kaipuyun.png"  width="1800" height="90" alt="彩贝壳"/>
         <td><img src="https://yu199195.github.io/images/soul/users/songda.png"  width="1800" height="90" alt="江苏永钢集团"/>
       </tr>
    </tbody>
    <thead>
          <th>浙江翱游科技有限公司 </th>
          <th>车易拍(北京)汽车技术服务有限公司</th>
          <th>上海草帽科技</th>
          <th>深圳竹云科技有限公司</th>
    </thead>
    <tbody>
           <tr>
             <td><img src="https://yu199195.github.io/images/soul/users/aoyou.jpg"  width="1800" height="90" alt="浙江翱游科技有限公司"/>
             <td><img src="https://yu199195.github.io/images/soul/users/cheyipai.jpg"  width="1800" height="90" alt="车易拍(北京)汽车技术服务有限公司"/>
             <td><img src="https://yu199195.github.io/images/soul/users/caomao.jpg"  width="1800" height="90" alt="上海草帽科技"/>
             <td><img src="https://yu199195.github.io/images/soul/users/zuyun.jpg"  width="1800" height="90" alt="深圳竹云科技有限公司"/>
           </tr>
     </tbody>
     <thead>
               <th>深圳盒知科技 </th>
               <th>杭州奇点云科技</th>
               <th>深圳万威科技</th>
               <th>武汉物易云通网络科技有限公司</th>
      </thead>
      <tbody>
                <tr>
                  <td><img src="https://yu199195.github.io/images/soul/users/hezhi.png"  width="1800" height="90" alt="深圳盒知科技"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/qidianyun.jpg"  width="1800" height="90" alt="杭州奇点云科技"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/wanwei.gif"  width="1800" height="90" alt="万威科技"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/wuyiyuntong.jpg"  width="1800" height="90" alt="武汉物易云通网络科技有限公司"/>
                </tr>
      </tbody>
      <thead>
               <th>好慷在家</th>
               <th>闪送科技</th>
               <th>国家电网</th>
               <th>凯撒旅游</th>
      </thead>
      <tbody>
                <tr>
                  <td><img src="https://yu199195.github.io/images/soul/users/haokangzaijia.jpg"  width="1800" height="90" alt="好慷在家"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/shansong.jpg"  width="1800" height="90" alt="闪送科技"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/guojiadianwang.jpg"  width="1800" height="90" alt="国家电网"/>
                  <td><img src="https://yu199195.github.io/images/soul/users/caissa.jpg"  width="1800" height="90" alt="凯撒旅游"/>
                </tr>
      </tbody>     
</table>


# 开源支持  

<table>
  <thead>
    <th>微信公众号</th>
    <th>QQ交流群</th>
    <th>芋道源码</th>
  </thead>
  <tbody>
    <tr>
      <td><img src="https://yu199195.github.io/images/public.jpg"   alt="微信公众号"/>
      <td><img src="https://yu199195.github.io/images/soul-qq.png"  alt="QQ交流群"/>
      <td><img src="http://www.iocoder.cn/images/common/erweima.jpg"  alt="芋道源码"/>
    </tr>
  </tbody>
</table>
  

