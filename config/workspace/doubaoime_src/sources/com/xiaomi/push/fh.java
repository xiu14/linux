package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class fh extends ff {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    protected Bitmap f418a;

    /* renamed from: a, reason: collision with other field name */
    private RemoteViews f419a;

    /* renamed from: a, reason: collision with other field name */
    protected CharSequence f420a;

    /* renamed from: a, reason: collision with other field name */
    private String f421a;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<Notification.Action> f422a;

    /* renamed from: a, reason: collision with other field name */
    protected Map<String, String> f423a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f424a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    protected CharSequence f425b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f426b;

    public fh(Context context, String str) {
        this(context, 0, str);
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m386c() {
        Map<String, String> map = this.f423a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    private void d() {
        super.setContentTitle(this.f420a);
        super.setContentText(this.f425b);
    }

    private boolean e() {
        return m387d() && f();
    }

    private boolean f() {
        List<StatusBarNotification> c2 = com.xiaomi.push.service.an.a(a(), this.f421a).c();
        if (c2 != null && !c2.isEmpty()) {
            for (StatusBarNotification statusBarNotification : c2) {
                if (statusBarNotification.getId() == this.a) {
                    if (statusBarNotification.getNotification() == null) {
                        return false;
                    }
                    return !r0.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh setContentTitle(CharSequence charSequence) {
        this.f420a = charSequence;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected abstract String mo389a();

    protected void a(int i, Notification.Action action) {
    }

    /* renamed from: a */
    protected abstract boolean mo382a();

    @Override // android.app.Notification.Builder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public fh setContentText(CharSequence charSequence) {
        this.f425b = charSequence;
        return this;
    }

    protected abstract String b();

    public fh(Context context, int i, String str) {
        super(context);
        this.f422a = new ArrayList<>();
        this.b = 0;
        this.f421a = str;
        this.a = i;
        m385c();
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh setLargeIcon(Bitmap bitmap) {
        this.f418a = bitmap;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    protected final void m391b() {
        super.setContentTitle(this.f420a);
        super.setContentText(this.f425b);
        Bitmap bitmap = this.f418a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    private boolean m387d() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.f421a)) ? false : true;
    }

    @Override // com.xiaomi.push.ff
    public ff a(Map<String, String> map) {
        this.f423a = map;
        return this;
    }

    /* renamed from: c, reason: collision with other method in class */
    private void m385c() {
        int a = a(a().getResources(), c(), "layout", a().getPackageName());
        if (a != 0) {
            this.f419a = new RemoteViews(a().getPackageName(), a);
            this.f424a = mo382a();
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("create RemoteViews failed, no such layout resource was found");
        }
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh addAction(Notification.Action action) {
        if (action != null) {
            this.f422a.add(action);
        }
        int i = this.b;
        this.b = i + 1;
        a(i, action);
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    protected final boolean m392b() {
        return this.f424a;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    protected void mo381a() {
        super.mo381a();
        Bundle bundle = new Bundle();
        if (m387d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f426b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f422a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f422a.size()];
            this.f422a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (!m386c() && com.xiaomi.push.service.ao.m755a(a().getContentResolver())) {
            bundle.putCharSequence("mipush.customTitle", this.f420a);
            bundle.putCharSequence("mipush.customContent", this.f425b);
        } else {
            d();
        }
        addExtras(bundle);
    }

    private String c() {
        boolean e2 = e();
        this.f426b = e2;
        return e2 ? b() : mo389a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public final RemoteViews m388a() {
        return this.f419a;
    }

    protected void a(int i) {
        Bitmap a = a();
        if (a != null) {
            m388a().setImageViewBitmap(i, a);
            return;
        }
        int b = h.b(a(), this.f421a);
        if (b != 0) {
            m388a().setImageViewResource(i, b);
        }
    }

    private Bitmap a() {
        return com.xiaomi.push.service.ac.a(h.m453a(a(), this.f421a));
    }

    protected int a(float f2) {
        return (int) ((f2 * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    protected Bitmap a(Bitmap bitmap, float f2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected final boolean m390a(int i) {
        return (((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d)) < 192.0d;
    }
}
