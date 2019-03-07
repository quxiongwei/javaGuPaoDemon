package com.gupao.vip.SevenPrinciplesOfDesign.dip;

public class DependencylnversionTest {
    public static void main(String[] args) {
      /*  Tom tom = new Tom();
        tom.studyJavaSourse();
        tom.stutdyPhySourse();*/

        Tom tom = new Tom();
        tom.study(new JavaSourse());
        tom.study(new PythonCourse());
        tom.study(new AiCourse());
    }

}
