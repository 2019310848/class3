# class3
实验
## 实验目的
1. 掌握Java中抽象类和抽象方法的定义； 
2. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3. 了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验过程
1. 先跟上次实验一样先编辑学生的信息，把两名学生的姓名、年龄、学号等编入程序，然后编入接口
2. 依据实验目的和要求算出每名博士研究生的年应纳税金额
3. 运行并检查错误

## 实验结果
******************研究生1*********************
姓名:啦啦啦
年龄:19
编号:201999999
性别:男
每年学费：4500.0
每月工资：1200.0
每年纳税为：960.0
******************研究生2*********************
学生姓名:茄子
学生年龄:20
学生编号:201988888
学生性别:男
每年学费：4100.0
每月工资：1185.0
每年纳税为：924.0

## 核心方法
```
    interface Manger_student {
        double find_tuition();

        double afford_tuition();
    }

    interface Manger_teacher {
        double STANDARD = 0.2;

        double find_salary();

        double get_salary();
    }
        public Doctor(String name, int age, int number, String sex, double tuition, double salary) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.sex = sex;
            this.tuition = tuition;
            this.salary = salary;
        }

        private String name;
        private int age;
        private int number;
        private String sex;
        private double tuition;
        private double salary;
```

## 实验感想
经过这次实验，更加了解掌握了接口的使用，使用类来实现接口。在后面要求算出每名博士研究生的年应纳税金额也是对我在数学与java上面结合过程的一次锻炼，使我可以在编写程序时也能应用数学计算公式
