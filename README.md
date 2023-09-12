# 用户管理中心

## 1.需求分析

1. 实现简单的登录功能（要求需要有验证码校验）
2. 实现用户的增删改查

## 2.技术栈

- Mysql 	jstl 	JDBC 	servlet

## 3.项目实现

### 1.登录模块

![1](/images/1.png)

#### 核心代码

```java
if(user != null && user.getPassword().equals(pwd) && code.equals(oldCode)){
            System.out.println("登录成功！！！");
            //HttpSession session1 = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("/html/index.jsp");
        }else {
            System.out.println("登录失败");
            req.setAttribute("msg","用户名或密码错误，请重新登录！");
            req.getRequestDispatcher("/html/login.jsp").forward(req,resp);
        }
```

### 2.用户的增删改查

#### 1.增加用户

#### 
![2](/images/2.png)

#### 核心代码

```Java
String name = req.getParameter("username");
        String pwd = req.getParameter("password");
        String repwd = req.getParameter("pass");
        String phone = req.getParameter("s_phone");
        String email = req.getParameter("s_email");
        User user = new User(null,name,pwd,email,phone);
        int i = us.addUse(user);
        if (i > 0){
            System.out.println("成功");
            resp.sendRedirect("/user");
        }else {
            System.out.println("失败");
            req.setAttribute("msg","添加用户失败");
            req.getRequestDispatcher("/html/add.jsp").forward(req,resp);

        }
```

#### 2.删除用户

![3](/images/3.png)

#### 核心代码

```Java
String id = req.getParameter("id");
        int i = us.deleteUser(Integer.parseInt(id));
        if(i>0){
            System.out.println("成功");

        }else {
            System.out.println("失败");
        }
```

#### 3.修改用户

#### 
![4](/images/4.png)

#### 核心代码

```Java
String id = req.getParameter("id");
        String pwd = req.getParameter("password");
        String phone = req.getParameter("s_phone");
        String email = req.getParameter("s_email");
        int uid = Integer.parseInt(id);
        int i = us.updateUser(pwd, phone, email, uid);

        if (i > 0){
            System.out.println("成功");
            resp.sendRedirect("/user");
        }else {
            System.out.println("失败");
            req.setAttribute("msg","修改用户失败");
            req.getRequestDispatcher("/html/add.jsp").forward(req,resp);

        }
```

#### 4.查看用户

![5](/images/5.png)

#### 核心代码

```Java
try {
                List<User> users = us.queryAll();
                System.out.println(users);
                req.setAttribute("list",users);
                req.getRequestDispatcher("/html/show.jsp").forward(req,resp);

            } catch (SQLException e) {
                throw new RuntimeException(e);
                //e.printStackTrace();
            }
```





### sql部分

#### 示例代码

```Java
Connection con = JDBCUtils.getcon();
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("select  * from tjrac.user order by id desc");

        User u = null;
        List<User> list = new ArrayList<>();

        while (res.next()){
            u = new User();
            u.setId(Integer.parseInt(res.getString("id")));
            u.setUsername(res.getString("userName"));
            u.setPassword(res.getString("userPassword"));
            u.setUserPhone(res.getString("userPhone"));
            u.setUserMail(res.getString("userMail"));
            list.add(u);
        }
        return list;
```





### 总结

该项目的难度并不大，使用的技术也并不深，适合用来入门学习。