package com.huawei.b.g.e;

import android.content.Context;
import android.util.Log;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;

/* loaded from: classes2.dex */
public class g implements com.huawei.b.g.b {
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.b.g.d f6971c;

    public g(Context context, String str) {
        Log.d("AGC_FixedDecrypt", "init");
        this.a = context;
        this.b = str;
    }

    @Override // com.huawei.b.g.b
    public String a(String str, String str2) {
        if (this.f6971c == null) {
            this.f6971c = b();
        }
        return this.f6971c.a(j.b(this.a, this.b, "agc_", str), str2);
    }

    public com.huawei.b.g.d b() {
        return new f(new d(j.b(this.a, this.b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), j.b(this.a, this.b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), j.b(this.a, this.b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), j.b(this.a, this.b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", DownloadSettingValues.SYNC_INTERVAL_MS_FG));
    }
}
