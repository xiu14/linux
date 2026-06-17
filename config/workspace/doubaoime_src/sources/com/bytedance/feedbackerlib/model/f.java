package com.bytedance.feedbackerlib.model;

import com.bytedance.feedbackerlib.model.b;
import com.ss.ttuploader.TTImageInfo;
import com.ss.ttuploader.TTImageUploaderListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class f implements TTImageUploaderListener {
    private List<String> a = new ArrayList();
    final /* synthetic */ b.s b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4945c;

    f(b bVar, b.s sVar, String str) {
        this.b = sVar;
        this.f4945c = str;
    }

    @Override // com.ss.ttuploader.TTImageUploaderListener
    public void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        if (i == 4 || i == 2) {
            this.b.a(1, null, null, null);
            com.bytedance.feedbackerlib.model.j.a.d(35001);
            com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload image failed");
            com.bytedance.feedbackerlib.a.l0(this.f4945c, "upload image failed", new String[0]);
            return;
        }
        if (i == 3) {
            List<String> list = this.a;
            StringBuilder M = e.a.a.a.a.M("https://voffline.byted.org/download/tos/schedule/");
            M.append(tTImageInfo.mImageToskey);
            list.add(M.toString());
        }
        if (i == 0) {
            this.b.a(0, null, this.a, null);
            com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload image succeed");
            com.bytedance.feedbackerlib.a.l0(this.f4945c, "upload image succeed", new String[0]);
        }
    }
}
