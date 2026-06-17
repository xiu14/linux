package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class ff extends Notification.Builder {
    private Context a;

    public ff(Context context) {
        super(context);
        this.a = context;
    }

    protected Context a() {
        return this.a;
    }

    public ff a(Map<String, String> map) {
        return this;
    }

    /* renamed from: a */
    protected void mo381a() {
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo381a();
        return super.build();
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return h.a(str, str2, str3, this.a);
    }

    public final int a(String str) {
        return a(a().getResources(), str, "id", a().getPackageName());
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m384a(String str) {
        try {
            return a().getResources().getString(a(a().getResources(), str, TypedValues.Custom.S_STRING, a().getPackageName()));
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("fail to get string. ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.d(M.toString());
            return "";
        }
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ff addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ff setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ff mo383a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                bh.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to set color. " + e2);
            }
        }
        return this;
    }
}
