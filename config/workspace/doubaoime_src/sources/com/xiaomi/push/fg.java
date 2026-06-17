package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.ViewCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* loaded from: classes2.dex */
public class fg extends fh {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f415a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    private Bitmap f416b;

    /* renamed from: c, reason: collision with root package name */
    private int f9086c;

    /* renamed from: c, reason: collision with other field name */
    private CharSequence f417c;

    public fg(Context context, int i, String str) {
        super(context, i, str);
        this.a = 16777216;
        this.b = 16777216;
        this.f9086c = 16777216;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    protected String mo389a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    protected boolean mo382a() {
        if (!k.m654a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(resources, RemoteMessageConst.Notification.ICON, "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    public fg b(String str) {
        if (m392b() && !TextUtils.isEmpty(str)) {
            try {
                this.a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.m15a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    protected String b() {
        return "notification_colorful_copy";
    }

    public fg c(String str) {
        if (m392b() && !TextUtils.isEmpty(str)) {
            try {
                this.f9086c = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.m15a("parse colorful notification image text color error");
            }
        }
        return this;
    }

    public fg a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m392b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f417c = charSequence;
            this.f415a = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public fg mo383a(String str) {
        if (m392b() && !TextUtils.isEmpty(str)) {
            try {
                this.b = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.m15a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fg setLargeIcon(Bitmap bitmap) {
        if (m392b() && bitmap != null) {
            if (bitmap.getWidth() == 984 && bitmap.getHeight() >= 177 && bitmap.getHeight() <= 207) {
                this.f416b = bitmap;
            } else {
                com.xiaomi.channel.commonutils.logger.c.m15a("colorful notification bg image resolution error, must [984*177, 984*207]");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh, com.xiaomi.push.ff
    /* renamed from: a */
    public void mo381a() {
        if (m392b()) {
            super.mo381a();
            Resources resources = a().getResources();
            String packageName = a().getPackageName();
            int a = a(resources, RemoteMessageConst.Notification.ICON, "id", packageName);
            if (((fh) this).f418a == null) {
                a(a);
            } else {
                m388a().setImageViewBitmap(a, ((fh) this).f418a);
            }
            int a2 = a(resources, "title", "id", packageName);
            int a3 = a(resources, "content", "id", packageName);
            m388a().setTextViewText(a2, ((fh) this).f420a);
            m388a().setTextViewText(a3, ((fh) this).f425b);
            if (!TextUtils.isEmpty(this.f417c)) {
                int a4 = a(resources, "buttonContainer", "id", packageName);
                int a5 = a(resources, "button", "id", packageName);
                int a6 = a(resources, "buttonBg", "id", packageName);
                m388a().setViewVisibility(a4, 0);
                m388a().setTextViewText(a5, this.f417c);
                m388a().setOnClickPendingIntent(a4, this.f415a);
                if (this.b != 16777216) {
                    int a7 = a(70.0f);
                    int a8 = a(29.0f);
                    m388a().setImageViewBitmap(a6, com.xiaomi.push.service.ac.a(a(this.b, a7, a8, a8 / 2.0f)));
                    m388a().setTextColor(a5, m390a(this.b) ? -1 : ViewCompat.MEASURED_STATE_MASK);
                }
            }
            int a9 = a(resources, "bg", "id", packageName);
            int a10 = a(resources, "container", "id", packageName);
            if (this.a != 16777216) {
                if (k.a(a()) >= 10) {
                    m388a().setImageViewBitmap(a9, com.xiaomi.push.service.ac.a(a(this.a, 984, 192, 30.0f)));
                } else {
                    m388a().setImageViewBitmap(a9, com.xiaomi.push.service.ac.a(a(this.a, 984, 192, 0.0f)));
                }
                a(m388a(), a10, a2, a3, m390a(this.a));
            } else if (this.f416b != null) {
                if (k.a(a()) >= 10) {
                    m388a().setImageViewBitmap(a9, a(this.f416b, 30.0f));
                } else {
                    m388a().setImageViewBitmap(a9, this.f416b);
                }
                Map<String, String> map = ((fh) this).f423a;
                if (map != null && this.f9086c == 16777216) {
                    c(map.get("notification_image_text_color"));
                }
                int i = this.f9086c;
                a(m388a(), a10, a2, a3, i == 16777216 || !m390a(i));
            } else {
                m388a().setViewVisibility(a, 8);
                m388a().setViewVisibility(a9, 8);
                try {
                    bh.a((Object) this, "setStyle", t.a(a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("load class DecoratedCustomViewStyle failed");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("miui.customHeight", true);
            addExtras(bundle);
            setCustomContentView(m388a());
            return;
        }
        m391b();
    }

    private void a(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int a = a(6.0f);
        remoteViews.setViewPadding(i, a, 0, a, 0);
        if (z) {
            remoteViews.setTextColor(i2, -1);
            remoteViews.setTextColor(i3, -1);
        } else {
            remoteViews.setTextColor(i2, ViewCompat.MEASURED_STATE_MASK);
            remoteViews.setTextColor(i3, ViewCompat.MEASURED_STATE_MASK);
        }
    }

    private Drawable a(int i, int i2, int i3, float f2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }
}
