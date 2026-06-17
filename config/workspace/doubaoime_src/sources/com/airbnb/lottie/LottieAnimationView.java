package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String t = LottieAnimationView.class.getSimpleName();
    private static final k<Throwable> u = new a();
    private final k<g> a;
    private final k<Throwable> b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private k<Throwable> f1249c;

    /* renamed from: d, reason: collision with root package name */
    @DrawableRes
    private int f1250d;

    /* renamed from: e, reason: collision with root package name */
    private final i f1251e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1252f;

    /* renamed from: g, reason: collision with root package name */
    private String f1253g;

    @RawRes
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private RenderMode o;
    private final Set<m> p;
    private int q;

    @Nullable
    private q<g> r;

    @Nullable
    private g s;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        float f1254c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1255d;

        /* renamed from: e, reason: collision with root package name */
        String f1256e;

        /* renamed from: f, reason: collision with root package name */
        int f1257f;

        /* renamed from: g, reason: collision with root package name */
        int f1258g;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.f1254c);
            parcel.writeInt(this.f1255d ? 1 : 0);
            parcel.writeString(this.f1256e);
            parcel.writeInt(this.f1257f);
            parcel.writeInt(this.f1258g);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readString();
            this.f1254c = parcel.readFloat();
            this.f1255d = parcel.readInt() == 1;
            this.f1256e = parcel.readString();
            this.f1257f = parcel.readInt();
            this.f1258g = parcel.readInt();
        }
    }

    class a implements k<Throwable> {
        a() {
        }

        @Override // com.airbnb.lottie.k
        public void onResult(Throwable th) {
            Throwable th2 = th;
            int i = com.airbnb.lottie.y.h.f1458g;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            com.airbnb.lottie.y.d.d("Unable to load composition.", th2);
        }
    }

    class b implements k<g> {
        b() {
        }

        @Override // com.airbnb.lottie.k
        public void onResult(g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    }

    class c implements k<Throwable> {
        c() {
        }

        @Override // com.airbnb.lottie.k
        public void onResult(Throwable th) {
            Throwable th2 = th;
            if (LottieAnimationView.this.f1250d != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f1250d);
            }
            (LottieAnimationView.this.f1249c == null ? LottieAnimationView.u : LottieAnimationView.this.f1249c).onResult(th2);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.a = new b();
        this.b = new c();
        this.f1250d = 0;
        this.f1251e = new i();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        n(null, C0838R.attr.lottieAnimationViewStyle);
    }

    private void l() {
        q<g> qVar = this.r;
        if (qVar != null) {
            qVar.h(this.a);
            this.r.g(this.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r0 != 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        r1 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m() {
        /*
            r5 = this;
            com.airbnb.lottie.RenderMode r0 = r5.o
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto Le
            if (r0 == r2) goto L2f
        Lc:
            r1 = r2
            goto L2f
        Le:
            com.airbnb.lottie.g r0 = r5.s
            r3 = 0
            if (r0 == 0) goto L20
            boolean r0 = r0.q()
            if (r0 == 0) goto L20
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L20
            goto L2d
        L20:
            com.airbnb.lottie.g r0 = r5.s
            if (r0 == 0) goto L2c
            int r0 = r0.m()
            r4 = 4
            if (r0 <= r4) goto L2c
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto Lc
        L2f:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L39
            r0 = 0
            r5.setLayerType(r1, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m():void");
    }

    private void n(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.a, i, 0);
        this.n = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(10, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.k = true;
            this.m = true;
        }
        if (obtainStyledAttributes.getBoolean(8, false)) {
            this.f1251e.Q(-1);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setRepeatMode(obtainStyledAttributes.getInt(13, 1));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatCount(obtainStyledAttributes.getInt(12, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        this.f1251e.i(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            this.f1251e.c(new com.airbnb.lottie.model.d("**"), n.E, new com.airbnb.lottie.z.c(new t(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.f1251e.T(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i2 = obtainStyledAttributes.getInt(11, 0);
            RenderMode.values();
            if (i2 >= 3) {
                i2 = 0;
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
        obtainStyledAttributes.recycle();
        i iVar = this.f1251e;
        Context context = getContext();
        int i3 = com.airbnb.lottie.y.h.f1458g;
        iVar.V(Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f));
        m();
        this.f1252f = true;
    }

    private void r(q<g> qVar) {
        this.s = null;
        this.f1251e.g();
        l();
        qVar.f(this.a);
        qVar.e(this.b);
        this.r = qVar;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        this.q++;
        super.buildDrawingCache(z);
        if (this.q == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.q--;
        d.a("buildDrawingCache");
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        i iVar = this.f1251e;
        if (drawable2 == iVar) {
            super.invalidateDrawable(iVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @MainThread
    public void k() {
        this.k = false;
        this.j = false;
        this.i = false;
        this.f1251e.f();
        m();
    }

    public boolean o() {
        return this.f1251e.r();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.m || this.k) {
            q();
            this.m = false;
            this.k = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (o()) {
            k();
            this.k = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.a;
        this.f1253g = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f1253g);
        }
        int i = savedState.b;
        this.h = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f1254c);
        if (savedState.f1255d) {
            q();
        }
        this.f1251e.C(savedState.f1256e);
        setRepeatMode(savedState.f1257f);
        setRepeatCount(savedState.f1258g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f1253g;
        savedState.b = this.h;
        savedState.f1254c = this.f1251e.n();
        savedState.f1255d = this.f1251e.r() || (!ViewCompat.isAttachedToWindow(this) && this.k);
        savedState.f1256e = this.f1251e.m();
        savedState.f1257f = this.f1251e.p();
        savedState.f1258g = this.f1251e.o();
        return savedState;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f1252f) {
            if (!isShown()) {
                if (o()) {
                    p();
                    this.j = true;
                    return;
                }
                return;
            }
            if (this.j) {
                if (isShown()) {
                    this.f1251e.v();
                    m();
                } else {
                    this.i = false;
                    this.j = true;
                }
            } else if (this.i) {
                q();
            }
            this.j = false;
            this.i = false;
        }
    }

    @MainThread
    public void p() {
        this.m = false;
        this.k = false;
        this.j = false;
        this.i = false;
        this.f1251e.t();
        m();
    }

    @MainThread
    public void q() {
        if (!isShown()) {
            this.i = true;
        } else {
            this.f1251e.u();
            m();
        }
    }

    public void setAnimation(@RawRes int i) {
        q<g> i2;
        this.h = i;
        this.f1253g = null;
        if (isInEditMode()) {
            i2 = new q<>(new e(this, i), true);
        } else {
            i2 = this.n ? h.i(getContext(), i) : h.j(getContext(), i, null);
        }
        r(i2);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        q<g> m;
        if (this.n) {
            Context context = getContext();
            int i = h.f1265c;
            m = h.m(context, str, "url_" + str);
        } else {
            m = h.m(getContext(), str, null);
        }
        r(m);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f1251e.w(z);
    }

    public void setCacheComposition(boolean z) {
        this.n = z;
    }

    public void setComposition(@NonNull g gVar) {
        this.f1251e.setCallback(this);
        this.s = gVar;
        this.l = true;
        boolean x = this.f1251e.x(gVar);
        this.l = false;
        m();
        if (getDrawable() != this.f1251e || x) {
            if (!x) {
                boolean o = o();
                setImageDrawable(null);
                setImageDrawable(this.f1251e);
                if (o) {
                    this.f1251e.v();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<m> it2 = this.p.iterator();
            while (it2.hasNext()) {
                it2.next().a(gVar);
            }
        }
    }

    public void setFailureListener(@Nullable k<Throwable> kVar) {
        this.f1249c = kVar;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f1250d = i;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.a aVar) {
        this.f1251e.y(aVar);
    }

    public void setFrame(int i) {
        this.f1251e.z(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f1251e.A(z);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.b bVar) {
        this.f1251e.B(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f1251e.C(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        l();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f1251e.D(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.f1251e.F(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f1251e.H(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        this.f1251e.J(f2, f3);
    }

    public void setMinFrame(int i) {
        this.f1251e.K(i);
    }

    public void setMinProgress(float f2) {
        this.f1251e.M(f2);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f1251e.N(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f1251e.O(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.f1251e.P(f2);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.o = renderMode;
        m();
    }

    public void setRepeatCount(int i) {
        this.f1251e.Q(i);
    }

    public void setRepeatMode(int i) {
        this.f1251e.R(i);
    }

    public void setSafeMode(boolean z) {
        this.f1251e.S(z);
    }

    public void setScale(float f2) {
        this.f1251e.T(f2);
        if (getDrawable() == this.f1251e) {
            boolean o = o();
            setImageDrawable(null);
            setImageDrawable(this.f1251e);
            if (o) {
                this.f1251e.v();
            }
        }
    }

    public void setSpeed(float f2) {
        this.f1251e.U(f2);
    }

    public void setTextDelegate(u uVar) {
        Objects.requireNonNull(this.f1251e);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        i iVar;
        if (!this.l && drawable == (iVar = this.f1251e) && iVar.r()) {
            p();
        } else if (!this.l && (drawable instanceof i)) {
            i iVar2 = (i) drawable;
            if (iVar2.r()) {
                iVar2.t();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f1251e.E(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f1251e.I(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f1251e.L(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f1251e.G(i, i2);
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        r(h.m(getContext(), str, str2));
    }

    public void setAnimation(String str) {
        q<g> c2;
        this.f1253g = str;
        this.h = 0;
        if (isInEditMode()) {
            c2 = new q<>(new f(this, str), true);
        } else {
            c2 = this.n ? h.c(getContext(), str) : h.d(getContext(), str, null);
        }
        r(c2);
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        r(h.f(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new b();
        this.b = new c();
        this.f1250d = 0;
        this.f1251e = new i();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        n(attributeSet, C0838R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new b();
        this.b = new c();
        this.f1250d = 0;
        this.f1251e = new i();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        n(attributeSet, i);
    }
}
