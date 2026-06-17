package com.bytedance.push.interfaze;

import android.content.Context;
import androidx.annotation.MainThread;
import com.bytedance.push.PushBody;

/* loaded from: classes2.dex */
public interface m {
    boolean a(Context context, int i, PushBody pushBody);

    @MainThread
    boolean c(Context context, int i, PushBody pushBody);
}
