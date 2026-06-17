package com.bytedance.common.praise_dialog;

import android.app.Activity;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class e {
    public static final e a = null;
    private static LinkedList<Activity> b = new LinkedList<>();

    public static final Activity b() {
        if (b.isEmpty()) {
            return null;
        }
        return (Activity) b.getLast();
    }
}
