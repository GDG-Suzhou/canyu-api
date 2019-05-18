## 待办事项


- [x] 整合 jwt
- [x] spring security 方法级统一权限设置
- [x] 开发阶段热加载，不重启生效
- [ ] MongoDB 索引创建时机 => 模型注解(需要看源代码什么时候执行了)
- [ ] 密码类的改成动态读取配置
- [ ] 不同环境的配置分隔开
- [ ] 设计统一的返回数据模型
- [ ] 统一日志处理
- [ ] 加入单元测试流程

## 问题

- 粗力度的权限控制行不行


### 不同环境进行不同构建，读取不同环境变量

1. 配置本地 idea 通过环境变量使用不同配置启动，验证可行
    
    ```
    # 设置 idea 启动的 vm 参数
    -Dspring.profiles.active=dev -Ddebug
    ```
2. 配置构建脚本 => 生成不同线上运行配置（主要用于读取不一样的密码配置）
3. 配置流水线，不同环境使用 2 中生成的不同包，且传入不一样的启动参数，使用不同 spring boot 配置文件


- [方法3：构建过程中引用环境变量](https://help.aliyun.com/document_detail/59297.html?spm=5176.11065259.1996646101.searchclickresult.43b33246bpi1pC)
- [账号密码保存](https://help.aliyun.com/document_detail/60183.html?spm=a2c40.config_item_securityconfig_page.page.13.73f437adhQ83UX)

## 参考资料

- 代码及详细介绍：[Spring Boot JWT](https://github.com/murraco/spring-boot-jwt)
- [WebSecurity 和 HttpSecurity 区别](https://juejin.im/post/5a1980825188252abc5e0fd1)