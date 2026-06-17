package com.bytedance.android.input.o;

import android.util.Log;
import android.widget.Toast;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.r.j;
import com.bytedance.feedbackerlib.Feedbacker;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements Feedbacker.IFeedbackCommonInfo {
    d() {
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getALogFilesDir() {
        return null;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public int getAid() {
        Objects.requireNonNull(IAppGlobals.a);
        return Integer.parseInt("401734");
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getAppId() {
        return "lka8483b7700f4901c";
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getChannel() {
        return d.a.b.a.c(IAppGlobals.a);
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getDid() {
        String c2 = com.bytedance.applog.a.c();
        return c2 == null ? "123456" : c2;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public Feedbacker.n getOnFeedbackClickListener() {
        return new Feedbacker.n() { // from class: com.bytedance.android.input.o.b
            @Override // com.bytedance.feedbackerlib.Feedbacker.n
            public final void f() {
                j.j("FeedbackUtils", "failed to do feed back");
                Toast.makeText(ImeApplication.f1883e, "反馈失败，请稍候重试", 0).show();
            }
        };
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public Feedbacker.o getOnMediasUploadFailedListener() {
        return new Feedbacker.o() { // from class: com.bytedance.android.input.o.a
            @Override // com.bytedance.feedbackerlib.Feedbacker.o
            public final void g() {
                Log.e("FeedbackUtils", "failed to upload media");
                Toast.makeText(ImeApplication.f1883e, "上传反馈图片或视频文件失败，请稍候重试", 0).show();
            }
        };
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getUpdateVersionCode() {
        Objects.requireNonNull(IAppGlobals.a);
        return String.valueOf(100309006);
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public String getUserId() {
        return "";
    }
}
