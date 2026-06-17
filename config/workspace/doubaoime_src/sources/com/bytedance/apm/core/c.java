package com.bytedance.apm.core;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface c {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);

    void onBackground(Activity activity);

    void onFront(Activity activity);
}
