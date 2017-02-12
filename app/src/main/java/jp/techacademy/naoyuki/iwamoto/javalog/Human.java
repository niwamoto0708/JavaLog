package jp.techacademy.naoyuki.iwamoto.javalog;

/**
 * Created by niwamoto on 2017/02/12.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {

    static String to_jp = "人";

    String name;
    int age;
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;

    }

    public static void introduce() {
        Log.d("javatest", "これは人クラスです。");
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「こんにちは」");
    }

    @Override
    public void think() {
        Log.d("javatest", this.name + "は(" + this.age + "歳)" + this.hobby + "について考える");
    }
}
