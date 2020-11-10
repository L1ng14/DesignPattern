package com.designPattern.Prototype;

public class postvie_01 {
        /*==============服务端=======================*/
        static class Resume implements Cloneable{
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

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        /*==============客户端=========================*/
        public static void main(String[] args) throws CloneNotSupportedException {
            Resume resume01= new Resume();
            resume01.setName("ling001");
            resume01.setAge(20);

            Resume resume02= (Resume) resume01.clone();
            resume02.setName("li666");

            System.out.println(resume01);
            System.out.println(resume02);
            System.out.println(resume01.equals(resume02));
        }
}
