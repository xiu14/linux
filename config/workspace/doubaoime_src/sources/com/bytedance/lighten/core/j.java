package com.bytedance.lighten.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public class j {

    @SuppressLint({"CI_StaticFieldLeak"})
    public static final j r;
    private Uri a;
    private Object b;

    /* renamed from: c, reason: collision with root package name */
    private Context f5351c;
    private Bitmap.Config h;
    private ScaleType i;
    private String l;
    private ImageView n;
    private boolean o;
    private com.bytedance.lighten.core.k.a p;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5352d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f5353e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f5354f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f5355g = -1;
    private CircleOptions j = null;
    private ImagePiplinePriority k = ImagePiplinePriority.MEDIUM;
    private CacheChoice m = CacheChoice.DEFAULT;
    private int q = a.f5337c.a();

    static {
        j jVar = new j(new com.bytedance.lighten.core.k.a(Collections.emptyList()));
        jVar.a = Uri.parse("");
        r = jVar;
    }

    public j(@NonNull Uri uri) {
        this.a = uri;
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        return false;
    }

    public j D(int i, int i2) {
        this.f5354f = i;
        this.f5355g = i2;
        return this;
    }

    public j a(ScaleType scaleType) {
        this.i = scaleType;
        return this;
    }

    public j b(boolean z) {
        this.f5352d = z;
        return this;
    }

    public j c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.l = str;
        }
        return this;
    }

    public j d(@Nullable CircleOptions circleOptions) {
        this.j = circleOptions;
        return this;
    }

    public void e() {
        boolean z;
        i iVar;
        com.bytedance.lighten.core.k.a aVar;
        if (this.n == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        if (this.b != null && this.p == null && this.a == null) {
            Objects.requireNonNull(g.b());
        }
        if (this.a == null && ((aVar = this.p) == null || aVar.b())) {
            Log.e("Lighten:", "uri & urlModel are empty");
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iVar = null;
        } else {
            if (this.h == null) {
                this.h = g.b().a();
            }
            if (this.f5353e == -1) {
                this.f5353e = g.b().d();
            }
            if (this == r) {
                this.f5351c = g.b().b().getApplicationContext();
            }
            if (this.f5351c == null) {
                ImageView imageView = this.n;
                if (imageView != null) {
                    Context context = imageView.getContext();
                    this.f5351c = context;
                    if (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            this.f5351c = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                }
                if (this.f5351c == null) {
                    Log.e("Lighten:", "inferContext: needs context for loading image, use with(context)");
                    this.f5351c = g.b().b();
                }
            }
            Context context2 = this.f5351c;
            String simpleName = (context2 == null || !(context2 instanceof Activity)) ? "" : ((Activity) context2).getClass().getSimpleName();
            if (!TextUtils.isEmpty(simpleName)) {
                if (TextUtils.isEmpty(this.l)) {
                    this.l = simpleName;
                } else {
                    StringBuilder S = e.a.a.a.a.S(simpleName, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    S.append(this.l);
                    this.l = S.toString();
                }
            }
            if (TextUtils.isEmpty(this.l)) {
                Log.e("Lighten:", "can't infer callerId load context, please set it by callerId()");
            }
            StringBuilder M = e.a.a.a.a.M("callerId: ");
            M.append(this.l);
            Log.d("Lighten:", M.toString());
            iVar = new i(this);
        }
        g.a(iVar);
    }

    public j f(boolean z) {
        this.o = z;
        if (z) {
            this.f5353e = 1;
        }
        return this;
    }

    public ScaleType g() {
        return this.i;
    }

    public int h() {
        return this.q;
    }

    public ImageView i() {
        return this.n;
    }

    public Bitmap.Config j() {
        return this.h;
    }

    public CacheChoice k() {
        return this.m;
    }

    public String l() {
        return this.l;
    }

    public CircleOptions m() {
        return this.j;
    }

    public Context n() {
        return this.f5351c;
    }

    public int o() {
        return -1;
    }

    public int p() {
        return -1;
    }

    public int q() {
        return this.f5355g;
    }

    public int r() {
        return -1;
    }

    public int s() {
        return this.f5353e;
    }

    public ImagePiplinePriority t() {
        return this.k;
    }

    @NonNull
    public Uri u() {
        return this.a;
    }

    public com.bytedance.lighten.core.k.a v() {
        return this.p;
    }

    public int w() {
        return this.f5354f;
    }

    public j x(ImageView imageView) {
        this.n = imageView;
        return this;
    }

    public boolean y() {
        return this.o;
    }

    public boolean z() {
        return this.f5352d;
    }

    public j(@NonNull Object obj) {
        this.b = obj;
    }

    public j(@NonNull String str) {
        this.a = Uri.parse(str);
    }

    public j(@NonNull com.bytedance.lighten.core.k.a aVar) {
        this.p = aVar;
    }
}
