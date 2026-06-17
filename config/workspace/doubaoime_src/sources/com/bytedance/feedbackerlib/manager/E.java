package com.bytedance.feedbackerlib.manager;

import android.content.Context;
import android.media.projection.MediaProjection;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.manager.C;
import com.bytedance.feedbackerlib.model.g;

/* loaded from: classes.dex */
class E implements TranslucentOnePixelActivity.b {
    final /* synthetic */ C.e a;
    final /* synthetic */ C b;

    class a implements g.b {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.model.g.b
        public void a(MediaProjection mediaProjection) {
            MediaProjection mediaProjection2;
            E.this.b.b = mediaProjection;
            E e2 = E.this;
            C.e eVar = e2.a;
            mediaProjection2 = e2.b.b;
            ((C.a) eVar).a(mediaProjection2 != null);
        }
    }

    E(C c2, C.e eVar) {
        this.b = c2;
        this.a = eVar;
    }

    @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.b
    @RequiresApi(api = 21)
    public void a(String[] strArr, int[] iArr) {
        Context context;
        MediaProjection mediaProjection;
        if (iArr.length != 2 || iArr[0] != 0 || iArr[1] != 0) {
            ((C.a) this.a).a(false);
            return;
        }
        C c2 = this.b;
        context = c2.a;
        c2.b = com.bytedance.feedbackerlib.model.g.e(context).f(new a());
        mediaProjection = this.b.b;
        if (mediaProjection != null) {
            ((C.a) this.a).a(true);
        }
    }
}
