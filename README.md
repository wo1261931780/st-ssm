# :star: st-ssm.github.io

整个ssm的笔记项目。暂时告一段落。

本项目旨在学习和记录 Spring、SpringMVC 和 MyBatis 框架，主要包括课堂代码、课堂案例和个人笔记。

## 📊 项目架构图

```mermaid
graph TB
    subgraph "SSM框架架构"
        A[st-ssm] --> B[Spring Framework<br/>核心容器]
        A --> C[SpringMVC<br/>Web层框架]
        A --> D[MyBatis<br/>持久层框架]
    end
    
    subgraph "Spring核心"
        B --> E[IOC容器]
        B --> F[AOP面向切面]
        B --> G[事务管理]
        B --> H[依赖注入]
    end
    
    subgraph "SpringMVC层"
        C --> I[DispatcherServlet<br/>前端控制器]
        C --> J[Controller<br/>控制器]
        C --> K[ViewResolver<br/>视图解析器]
        C --> L[HandlerMapping<br/>处理器映射]
    end
    
    subgraph "MyBatis层"
        D --> M[SqlSessionFactory]
        D --> N[Mapper接口]
        D --> O[XML配置]
        D --> P[动态SQL]
    end
    
    subgraph "三层架构"
        Q[表现层] --> R[业务逻辑层]
        R --> S[数据访问层]
        
        C --> Q
        B --> R
        D --> S
    end
    
    subgraph "学习内容"
        T[课堂代码] --> A
        U[课堂案例] --> A
        V[个人笔记] --> A
    end
    
    style A fill:#4CAF50,stroke:#2E7D32,color:#fff
    style B fill:#2196F3,stroke:#1565C0,color:#fff
    style C fill:#FF9800,stroke:#F57C00,color:#fff
    style D fill:#9C27B0,stroke:#6A1B9A,color:#fff
    style Q fill:#E91E63,stroke:#C2185B,color:#fff
    style R fill:#607D8B,stroke:#455A64,color:#fff
    style S fill:#795548,stroke:#5D4037,color:#fff
```

## 背景

在当今的 IT 行业，Spring、SpringMVC 和 MyBatis 三者组合，是非常流行的一种三层架构，用于构建 Java 应用程序。本项目旨在帮助用户深入学习三者的有关知识，掌握经典案例，从而更好地应用三者构建项目，提升自身能力。

## 内容

本项目主要包括课堂代码、课堂案例和个人笔记：

- 课堂代码：收集教程的所有课堂代码，以便于后期查阅和复习。
- 课堂案例：根据教程中的案例，提供完整的案例代码，以便于用户学习和实践。
- 个人笔记：记录个人学习过程中的一些心得和体会，帮助自己更好地理解和掌握知识点。

## 目标

本项目旨在帮助用户深入学习 Spring、SpringMVC 和 MyBatis，掌握经典案例，从而更好地应用三者构建项目，提升自身能力。
