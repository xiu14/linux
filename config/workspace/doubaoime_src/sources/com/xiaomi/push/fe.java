package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.ViewCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* loaded from: classes2.dex */
public class fe extends fh {
    private int a;
    private Bitmap b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f9085c;

    public fe(Context context, String str) {
        super(context, str);
        this.a = 16777216;
    }

    @Override // com.xiaomi.push.fh, android.app.Notification.Builder
    /* renamed from: a */
    public fh setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    protected String mo389a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a, reason: collision with other method in class */
    protected boolean mo382a() {
        if (!k.m654a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(a().getResources(), "bg", "id", a().getPackageName()) == 0 || a(resources, RemoteMessageConst.Notification.ICON, "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || k.a(a()) < 9) ? false : true;
    }

    public fe b(Bitmap bitmap) {
        if (m392b() && bitmap != null) {
            this.f9085c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    protected String b() {
        return null;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fe setLargeIcon(Bitmap bitmap) {
        if (m392b() && bitmap != null) {
            if (bitmap.getWidth() == 984 && 184 <= bitmap.getHeight() && bitmap.getHeight() <= 1678) {
                this.b = bitmap;
            } else {
                com.xiaomi.channel.commonutils.logger.c.m15a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public fe mo383a(String str) {
        if (m392b() && !TextUtils.isEmpty(str)) {
            try {
                this.a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.m15a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh, com.xiaomi.push.ff
    /* renamed from: a, reason: collision with other method in class */
    public void mo381a() {
        if (m392b() && this.b != null) {
            super.mo381a();
            Resources resources = a().getResources();
            String packageName = a().getPackageName();
            int a = a(resources, "bg", "id", packageName);
            if (k.a(a()) >= 10) {
                m388a().setImageViewBitmap(a, a(this.b, 30.0f));
            } else {
                m388a().setImageViewBitmap(a, this.b);
            }
            int a2 = a(resources, RemoteMessageConst.Notification.ICON, "id", packageName);
            if (this.f9085c != null) {
                m388a().setImageViewBitmap(a2, this.f9085c);
            } else {
                a(a2);
            }
            int a3 = a(resources, "title", "id", packageName);
            m388a().setTextViewText(a3, ((fh) this).f420a);
            Map<String, String> map = ((fh) this).f423a;
            if (map != null && this.a == 16777216) {
                mo383a(map.get("notification_image_text_color"));
            }
            RemoteViews m388a = m388a();
            int i = this.a;
            m388a.setTextColor(a3, (i == 16777216 || !m390a(i)) ? -1 : ViewCompat.MEASURED_STATE_MASK);
            setCustomContentView(m388a());
            Bundle bundle = new Bundle();
            bundle.putBoolean("miui.customHeight", true);
            addExtras(bundle);
            return;
        }
        m391b();
    }
}
