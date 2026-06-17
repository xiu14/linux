package com.bytedance.feedbackerlib.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.Feedbacker;

/* loaded from: classes.dex */
class a implements Feedbacker.IFeedbackCommonInfo {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4916c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f4917d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f4918e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f4919f;

    a(FeedbackCommonInfo feedbackCommonInfo, int i, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.f4916c = str2;
        this.f4917d = str3;
        this.f4918e = str4;
        this.f4919f = str5;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @Nullable
    public String getALogFilesDir() {
        return this.f4919f;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    public int getAid() {
        return this.a;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @NonNull
    public String getAppId() {
        return this.b;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @NonNull
    public String getChannel() {
        return this.f4918e;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @NonNull
    public String getDid() {
        return this.f4916c;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @Nullable
    public Feedbacker.n getOnFeedbackClickListener() {
        return null;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @Nullable
    public Feedbacker.o getOnMediasUploadFailedListener() {
        return null;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @NonNull
    public String getUpdateVersionCode() {
        return this.f4917d;
    }

    @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
    @Nullable
    public String getUserId() {
        return null;
    }
}
