package com.bytedance.push.interfaze;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.push.PushBody;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface z {
    @Nullable
    @MainThread
    JSONObject a(@NonNull Context context, int i, PushBody pushBody, String str);
}
