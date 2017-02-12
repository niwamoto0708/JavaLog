package jp.techacademy.naoyuki.iwamoto.javalog;

/**
 * Created by niwamoto on 2017/02/11.
 */

import android.util.Log;

class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduct() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
