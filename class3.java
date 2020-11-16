public class Class3 {

    public static void main(String[] args) {
        try {
            System.out.println("******************研究生1*********************");
            Doctor la = new Doctor();
            la.setName("啦啦啦");
            la.setAge(19);
            la.setNumber(20199999);
            la.setSex("男");
            la.setTuition(4500);
            la.setSalary(1200);
            System.out.println("姓名:" + la.getName());
            System.out.println("年龄:" + la.getAge());
            System.out.println("学号:" + la.getNumber());
            System.out.println("性别:" + la.getSex());
            la.find_tuition();
            la.find_salary();
            la.taxation();
            System.out.println("******************研究生2*********************");
            Doctor qz = new Doctor();
            qz.setName("茄子");
            qz.setAge(20);
            qz.setNumber(201988888);
            qz.setSex("男");
            qz.setTuition(4100);
            qz.setSalary(1185);
            System.out.println("姓名:" + qz.getName());
            System.out.println("年龄:" + qz.getAge());
            System.out.println("学号:" + qz.getNumber());
            System.out.println("性别:" + qz.getSex());
            qz.find_tuition();
            qz.find_salary();
            qz.taxation();
        } catch (Exception e) {
            System.out.println("数据异常");
        }

    }

    interface Manger_student {
        double find_tuition();

        double afford_tuition();
    }

    interface Manger_teacher {
        double STANDARD = 0.2;

        double find_salary();

        double get_salary();
    }


    public static class Doctor implements Manger_student, Manger_teacher {
        public Doctor() {

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


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setTuition(double tuition) {
            this.tuition = tuition;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        public double getTuition() {
            return tuition;
        }

        public int getNumber() {
            return number;
        }

        public double getSalary() {
            return salary;
        }


        public double find_tuition() {
            System.out.println("每年学费：" + tuition);
            return tuition;
        }

        public double find_salary() {
            System.out.println("每月工资：" + salary);
            return salary;
        }

        public double afford_tuition() {
            System.out.println("缴纳成功，已缴纳学费" + tuition);
            return tuition;
        }

        public double get_salary() {
            double c;
            c = salary - (salary - 800) * STANDARD;
            System.out.println("薪水已经发放，发放金额：" + c);
            return salary;
        }

        public void taxation() {
            double a;
            a = 12 * ((salary - 800) * STANDARD);
            System.out.println("每年应纳税为：" + a);
        }
    }
}
