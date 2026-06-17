package com.bytedance.feedbackerlib.matisse;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    private final WeakReference<Activity> a;
    private final WeakReference<Fragment> b = new WeakReference<>(null);

    private a(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    public static a b(Activity activity) {
        return new a(activity);
    }

    public b a(Set<MimeType> set, boolean z) {
        return new b(this, set, z);
    }

    @Nullable
    Activity c() {
        return this.a.get();
    }

    @Nullable
    Fragment d() {
        WeakReference<Fragment> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
