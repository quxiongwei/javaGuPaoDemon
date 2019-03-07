package java.com.gupao.vip.SevenPrinciplesOfDesign.SRP;

public class CourseTest {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("录播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("直播课");

    }
}
