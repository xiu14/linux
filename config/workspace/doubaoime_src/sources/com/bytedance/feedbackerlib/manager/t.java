package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.FeedbackActivity;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import java.util.Arrays;

/* loaded from: classes.dex */
class t implements View.OnClickListener {
    final /* synthetic */ k a;

    t(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 19)
    public void onClick(View view) {
        Uri uri;
        Uri uri2;
        this.a.M0(1);
        this.a.M0(0);
        Context context = this.a.x0;
        uri = this.a.R;
        FeedbackActivity.j0(this.a.x0, Arrays.asList(new Item(context, uri)));
        uri2 = this.a.R;
        if (com.bytedance.feedbackerlib.util.f.f(uri2)) {
            com.bytedance.feedbackerlib.a.e0("screenShot_and_reportBug", null);
        } else {
            com.bytedance.feedbackerlib.a.e0("screenRecord_and_reportBug", null);
        }
    }
}
