package com.designPattern.Prototype;

import java.util.Date;

public class postive_02 {
    /*==============服务端=======================*/
    static class Resume implements Cloneable{
        private String name;
        private Integer age;
        private Date workExperience;

        public Date getWorkExperience() {
            return workExperience;
        }

        public void setWorkExperience(Date workExperience) {
            this.workExperience = workExperience;
        }

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
                    ", workExperience=" + workExperience +
                    '}';
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            Resume clone = (Resume) super.clone();
            Date cloneDate = (Date) clone.getWorkExperience().clone();
            clone.setWorkExperience(cloneDate);
            return clone;
        }
    }

    /*==============客户端=========================*/
    public static void main(String[] args) throws CloneNotSupportedException{
        Resume resume01= new Resume();
        Date date = new Date();
        resume01.setName("ling001");
        resume01.setAge(20);
        resume01.setWorkExperience(date);

        Resume resume02= (Resume) resume01.clone();
        resume02.getWorkExperience().setTime(0);

        System.out.println(resume01);
        System.out.println(resume02);

        System.out.println(resume01.equals(resume02));
    }
}
