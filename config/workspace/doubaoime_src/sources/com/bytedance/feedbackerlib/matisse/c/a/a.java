package com.bytedance.feedbackerlib.matisse.c.a;

import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.lighten.core.ScaleType;
import com.bytedance.lighten.core.g;
import com.bytedance.lighten.core.j;

/* loaded from: classes.dex */
public class a {
    public void a(int i, ImageView imageView, Uri uri) {
        j e2 = g.e(uri);
        e2.a(ScaleType.CENTER_CROP);
        e2.c("GlideEngine");
        e2.b(true);
        e2.D(i, i);
        e2.f(true);
        e2.x(imageView);
        e2.e();
    }
}
