package com.bytedance.bdinstall;

import android.content.Context;
import androidx.annotation.RequiresApi;
import org.json.JSONArray;

/* loaded from: classes.dex */
public interface J {
    String a(Context context, Q q);

    String b(Context context, Q q);

    String c(Context context, Q q);

    String[] d(Context context, Q q);

    JSONArray e(Context context);

    @RequiresApi(api = 26)
    String f(Context context, int i, Q q);

    @RequiresApi(api = 26)
    String g(Context context, int i, Q q);
}
