package com.designPattern.Prototype;

public class negtive {
    /*==============服务端=======================*/
    static class Resume{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Resume{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    /*==============客户端=========================*/
    public static void main(String[] args) {
        Resume resume01= new Resume();
        resume01.setName("ling001");
        resume01.setAge(20);

        System.out.println(resume01);

        Resume resume02= new Resume();
        resume02.setName("ling002");
        resume02.setAge(23);

        System.out.println(resume02);
    }
}
