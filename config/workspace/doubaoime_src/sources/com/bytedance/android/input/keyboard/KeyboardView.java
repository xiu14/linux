package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.LruCache;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.res.ResourcesCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.utils.ShapeUtils;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.view.AsrLongPressView;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KeyboardView extends RelativeLayout {
    public static final String KEYBOARD_VIEW_ID = "soft_view";
    private static final long LONG_PRESS_TIMEOUT = 500;
    private static final int MSG_LONGPRESS = 1;
    private static final String TAG = "KeyboardView";
    private static final int TEXT_SIZE_CACHE_SIZE = 100;
    public static HashMap<String, KeyboardView> sViewManager;
    private AsrLongPressView mAsrLongPressView;
    private Bitmap mBitmapBuffer;
    private final Canvas mCurrentCanvas;
    private final Rect mDirty;
    private final b mDrawEventTracker;
    private com.bytedance.android.input.popup.l mFusiyinSingleBubble;
    private ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private final Handler mHandler;
    private int mHeight;
    private ArrayList<d> mListenerList;
    private boolean mMultiTouchOccurred;
    private long mNativeViewId;
    public Paint mPaint;
    private double mScale;
    private int mWidth;
    private String mWindowName;
    private static LruCache<e, Pair<Integer, Integer>> sTextSizeCache = new LruCache<>(100);
    private static double mSoftKeyboardScale = 1.0d;
    private static float mSoftKeyboardStretchScale = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private boolean a = false;
        private long b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f2514c = 0;

        /* renamed from: d, reason: collision with root package name */
        private long f2515d = 0;

        b(a aVar) {
        }

        public void a(long j) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    Objects.requireNonNull(IAppGlobals.a);
                    jSONObject.put("ime_version", "1.3.9");
                    jSONObject.put("max_time", j);
                    com.bytedance.android.input.r.j.i(KeyboardView.TAG, "post draw display event - max: " + j);
                    IAppLog.a aVar = IAppLog.a;
                    Objects.requireNonNull(aVar);
                    aVar.t("draw", jSONObject);
                } catch (Exception e2) {
                    com.bytedance.android.input.r.j.j(KeyboardView.TAG, "DrawEventTracker error: " + e2);
                }
            } finally {
                this.a = false;
            }
        }

        public void b() {
            final long j = this.f2515d;
            if (j <= 0) {
                return;
            }
            this.b = 0L;
            this.f2514c = 0L;
            this.f2515d = 0L;
            this.a = true;
            com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.keyboard.g
                @Override // java.lang.Runnable
                public final void run() {
                    KeyboardView.b.this.a(j);
                }
            });
        }

        public void c() {
            this.b = SystemClock.uptimeMillis();
        }

        public void d() {
            this.f2515d = Math.max(this.f2515d, SystemClock.uptimeMillis() - this.b);
            long j = this.f2514c + 1;
            this.f2514c = j;
            if (j <= 100 || this.a) {
                return;
            }
            b();
        }
    }

    private static class c extends Handler {
        SoftReference<KeyboardView> a;

        public c(KeyboardView keyboardView) {
            super(Looper.getMainLooper());
            this.a = new SoftReference<>(keyboardView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.a.get() == null) {
                return;
            }
            KeyboardView keyboardView = this.a.get();
            if (message.what == 1) {
                com.bytedance.android.input.r.j.m(KeyboardView.TAG, "handleMessage:  MSG_LONGPRESS");
                keyboardView.nativeTouch(keyboardView.mNativeViewId, message.arg1, message.arg2, -1, KeyboardView.getCurrentMicrosecond());
            }
        }
    }

    interface d {
        void a(int i);
    }

    private static class e {
        final String a;
        final Typeface b;

        /* renamed from: c, reason: collision with root package name */
        final int f2516c;

        /* renamed from: d, reason: collision with root package name */
        final int f2517d;

        /* renamed from: e, reason: collision with root package name */
        final float f2518e;

        /* renamed from: f, reason: collision with root package name */
        final float f2519f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f2520g;

        public e(String str, Typeface typeface, int i, int i2, float f2, float f3, boolean z) {
            this.a = str;
            this.b = typeface;
            this.f2516c = i;
            this.f2517d = i2;
            this.f2518e = f2;
            this.f2519f = f3;
            this.f2520g = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f2516c == eVar.f2516c && this.f2517d == eVar.f2517d && Float.compare(eVar.f2518e, this.f2518e) == 0 && Float.compare(eVar.f2519f, this.f2519f) == 0 && this.f2520g == eVar.f2520g && Objects.equals(this.a, eVar.a) && Objects.equals(this.b, eVar.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, Integer.valueOf(this.f2516c), Integer.valueOf(this.f2517d), Float.valueOf(this.f2518e), Float.valueOf(this.f2519f), Boolean.valueOf(this.f2520g));
        }
    }

    public KeyboardView(Context context) {
        super(context);
        this.mScale = 1.0d;
        this.mNativeViewId = 0L;
        this.mCurrentCanvas = new Canvas();
        this.mPaint = new Paint();
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDirty = new Rect(0, 0, 0, 0);
        this.mBitmapBuffer = null;
        this.mAsrLongPressView = null;
        this.mMultiTouchOccurred = false;
        this.mListenerList = new ArrayList<>();
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.input.keyboard.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                KeyboardView.this.updateLocation();
            }
        };
        this.mFusiyinSingleBubble = null;
        this.mHandler = new c(this);
        this.mDrawEventTracker = new b(null);
    }

    static void CreateView(String str, long j, int i, int i2) {
        com.bytedance.android.input.r.j.m(TAG, "native call CreateView begin " + str + " nativeId = " + j + " width = " + i + " height = " + i2);
        if (sViewManager == null) {
            com.bytedance.android.input.r.j.m(TAG, "view manager is null");
            sViewManager = new HashMap<>();
        }
        KeyboardView keyboardView = sViewManager.get(str);
        if (keyboardView == null) {
            com.bytedance.android.input.r.j.m(TAG, "view is null");
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            keyboardView = new KeyboardView(aVar.getContext());
            sViewManager.put(str, keyboardView);
        }
        keyboardView.SetNativeId(j, str);
        keyboardView.SetViewSize(i, i2);
        com.bytedance.android.input.r.j.m(TAG, "native call CreateView end");
    }

    public static Pair<Integer, Integer> calcTextSize(String str, Typeface typeface, int i, int i2, float f2, float f3, boolean z) {
        Pair<Integer, Integer> pair;
        e eVar = new e(str, typeface, i, i2, f2, f3, z);
        if (com.bytedance.android.input.l.a.a() && (pair = sTextSizeCache.get(eVar)) != null) {
            return pair;
        }
        Paint paint = new Paint();
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        paint.setLetterSpacing(f3);
        float f4 = i;
        paint.setTextSize(f4);
        paint.setAntiAlias(true);
        Rect rect = new Rect();
        if (z) {
            paint.getTextBounds(str, 0, str.length(), rect);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int measureText = (int) paint.measureText(str);
            if (measureText < rect.width() + rect.left) {
                measureText = rect.left + rect.width();
            }
            Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(measureText), Integer.valueOf(fontMetricsInt.bottom - fontMetricsInt.top));
            if (com.bytedance.android.input.l.a.a()) {
                sTextSizeCache.put(eVar, pair2);
            }
            return pair2;
        }
        TextPaint textPaint = new TextPaint();
        if (i2 <= 0) {
            return new Pair<>(0, 0);
        }
        com.bytedance.android.input.r.j.i(TAG, "text = " + str + ", width = " + i2);
        textPaint.setTextSize(f4);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Pair<Integer, Integer> pair3 = new Pair<>(Integer.valueOf(i2), Integer.valueOf(new StaticLayout(str, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, f2, 0.0f, false).getHeight()));
        if (com.bytedance.android.input.l.a.a()) {
            sTextSizeCache.put(eVar, pair3);
        }
        return pair3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    public static Typeface createTypeFace(String str, boolean z, int i) {
        e.a.a.a.a.r0("[initialize] createTypeFace facename=", str, TAG);
        int i2 = 0;
        try {
            KeyboardJni.updateIsSupportSystemFont();
            if (str.endsWith(".ttf")) {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                str = Typeface.createFromAsset(aVar.getContext().getAssets(), "skin/default/" + str);
            } else if (str.equalsIgnoreCase("oimeui2023")) {
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                str = ResourcesCompat.getFont(aVar2.getContext(), C0838R.font.oimeui2023);
            } else if (str.equalsIgnoreCase("oimeui2025")) {
                IAppGlobals.a aVar3 = IAppGlobals.a;
                Objects.requireNonNull(aVar3);
                str = ResourcesCompat.getFont(aVar3.getContext(), C0838R.font.oimeui2025);
            } else if (str.contains("_adaptive")) {
                IAppGlobals.a aVar4 = IAppGlobals.a;
                Objects.requireNonNull(aVar4);
                if (aVar4.F()) {
                    Objects.requireNonNull(aVar4);
                    if (!aVar4.h()) {
                        str = Typeface.create(str, 0);
                    }
                }
                if (KeyboardJni.isSupportSystemFont()) {
                    str = Typeface.create(str, 0);
                } else {
                    Objects.requireNonNull(aVar4);
                    str = ResourcesCompat.getFont(aVar4.getContext(), C0838R.font.qihei);
                }
            } else {
                IAppGlobals.a aVar5 = IAppGlobals.a;
                Objects.requireNonNull(aVar5);
                if (aVar5.F()) {
                    Objects.requireNonNull(aVar5);
                    if (!aVar5.h()) {
                        str = Typeface.create(str, 0);
                    }
                }
                Objects.requireNonNull(aVar5);
                str = ResourcesCompat.getFont(aVar5.getContext(), C0838R.font.qihei);
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("createTypeFace error: ");
            M.append(e2.getMessage());
            com.bytedance.android.input.r.j.j(TAG, M.toString());
            str = Typeface.create(str, 0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return i != str.getWeight() ? Typeface.create(str, i, z) : str;
        }
        if (z) {
            i2 = i >= 500 ? 3 : 2;
        } else if (i >= 500) {
            i2 = 1;
        }
        return Typeface.create(str, i2);
    }

    private void delaySendLongPressMessage(int i, int i2) {
        Message obtain = Message.obtain(this.mHandler, 1);
        obtain.arg1 = i;
        obtain.arg2 = i2;
        this.mHandler.sendMessageDelayed(obtain, LONG_PRESS_TIMEOUT);
    }

    private void drawText(String str, Typeface typeface, int i, int i2, boolean z, float f2, float f3, Rect rect, boolean z2) {
        Layout.Alignment alignment;
        int i3;
        String str2 = str;
        double d2 = z2 ? mSoftKeyboardScale : this.mScale;
        if (z) {
            this.mPaint.setUnderlineText(true);
        }
        this.mPaint.setAntiAlias(true);
        this.mPaint.setTextSize((float) (i * d2));
        if (typeface != null) {
            this.mPaint.setTypeface(typeface);
        }
        this.mPaint.setLetterSpacing(f3);
        if ((i2 & 32) == 0) {
            TextPaint textPaint = new TextPaint(this.mPaint);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            if ((i2 & 1) != 0) {
                alignment2 = Layout.Alignment.ALIGN_CENTER;
            } else if ((i2 & 2) != 0) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout staticLayout = new StaticLayout(str, textPaint, rect.width(), alignment2, f2, 0.0f, false);
            this.mCurrentCanvas.save();
            if ((i2 & 4) != 0) {
                this.mCurrentCanvas.translate(rect.left, ((rect.height() - staticLayout.getHeight()) / 2.0f) + rect.top);
            } else {
                this.mCurrentCanvas.translate(rect.left, rect.top);
            }
            staticLayout.draw(this.mCurrentCanvas);
            this.mCurrentCanvas.restore();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = this.mPaint.getFontMetricsInt();
        int i4 = (int) ((-(fontMetricsInt.top + fontMetricsInt.bottom)) / 2.0f);
        if ((i2 & 1) != 0) {
            this.mPaint.setTextAlign(Paint.Align.CENTER);
            alignment = Layout.Alignment.ALIGN_CENTER;
            i3 = rect.centerX();
        } else if ((i2 & 2) != 0) {
            this.mPaint.setTextAlign(Paint.Align.RIGHT);
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
            i3 = rect.right;
        } else {
            this.mPaint.setTextAlign(Paint.Align.LEFT);
            alignment = Layout.Alignment.ALIGN_NORMAL;
            i3 = rect.left;
        }
        Layout.Alignment alignment3 = alignment;
        int centerY = (i2 & 4) != 0 ? rect.centerY() + i4 : (i2 & 8) != 0 ? (rect.bottom - ((fontMetricsInt.bottom - fontMetricsInt.top) / 2)) + i4 : ((fontMetricsInt.bottom - fontMetricsInt.top) / 2) + rect.top + i4;
        if (str2.contains("\n")) {
            str2 = str2.replaceAll("\\n", " ");
        }
        String str3 = str2;
        TextPaint textPaint2 = new TextPaint(this.mPaint);
        if ((i2 & 4096) != 0) {
            str3 = new StaticLayout(str3, 0, str3.length(), textPaint2, Integer.MAX_VALUE, alignment3, f2, 0.0f, false, TextUtils.TruncateAt.END, rect.width()).getText().toString();
        } else if ((i2 & 8192) != 0) {
            str3 = new StaticLayout(str3, 0, str3.length(), textPaint2, Integer.MAX_VALUE, alignment3, f2, 0.0f, false, TextUtils.TruncateAt.START, rect.width()).getText().toString();
        }
        this.mCurrentCanvas.drawText(str3, i3, centerY, this.mPaint);
    }

    public static AssetManager getAssetsMgr() {
        return KeyboardJni.getService().getAssets();
    }

    public static final Bitmap getBitmapFromAssets(String str) {
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        InputStream g2 = aVar.g(str);
        if (g2 != null) {
            return BitmapFactory.decodeStream(g2);
        }
        return null;
    }

    public static final Bitmap getBitmapFromContent(String str) {
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            return BitmapFactory.decodeStream(aVar.getApplication().getContentResolver().openInputStream(Uri.parse(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Bitmap getBitmapFromPath(String str) {
        try {
            return BitmapFactory.decodeFile(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getCurrentMicrosecond() {
        return (System.currentTimeMillis() * 1000) + ((System.nanoTime() % 1000000) / 1000);
    }

    public static int getFontHeight(Typeface typeface, int i) {
        Paint paint = new Paint();
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        paint.setTextSize(i);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        return fontMetricsInt.bottom - fontMetricsInt.top;
    }

    public static final Movie getMovieFromPath(String str) {
        try {
            IEnvironment.a aVar = IEnvironment.a;
            Objects.requireNonNull(aVar);
            Movie f2 = aVar.f(str);
            return f2 != null ? f2 : Movie.decodeFile(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static float getStretchScale() {
        return mSoftKeyboardStretchScale;
    }

    public static void hideFusiyinSingleBubble() {
        com.bytedance.android.input.popup.l lVar;
        try {
            KeyboardView keyboardView = sViewManager.get(KEYBOARD_VIEW_ID);
            if (keyboardView != null && (lVar = keyboardView.mFusiyinSingleBubble) != null) {
                lVar.dismiss();
            }
        } catch (Exception e2) {
            e.a.a.a.a.o0("hide Bubble exception = ", e2, TAG);
        }
    }

    public static void moveFusiyinSingleBubble(int i, int i2) {
        KeyboardView keyboardView = sViewManager.get(KEYBOARD_VIEW_ID);
        if (keyboardView == null) {
            return;
        }
        keyboardView.mFusiyinSingleBubble.e(i, i2);
        keyboardView.mFusiyinSingleBubble.d();
    }

    private native void nativeDraw(long j, Rect rect);

    private native void nativeOnCreate(long j);

    private native void nativeOnLayout(long j, int i, int i2);

    private native void nativeOnScale(long j, float f2, float f3);

    private native void nativeOnSize(long j, int i, int i2);

    private native void nativeOnVisibleChanged(long j, boolean z);

    public static native void nativeTimerCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeTouch(long j, int i, int i2, int i3, long j2);

    public static void showFusiyinSingleBubble(String str, int i, int i2) {
        KeyboardView keyboardView = sViewManager.get(KEYBOARD_VIEW_ID);
        if (keyboardView == null) {
            return;
        }
        keyboardView.removeLongPressMessage();
        keyboardView.mFusiyinSingleBubble.g(keyboardView.getContext());
        keyboardView.mFusiyinSingleBubble.f(str);
        keyboardView.mFusiyinSingleBubble.e(i, i2);
        keyboardView.mFusiyinSingleBubble.d();
    }

    public void SetNativeId(long j, String str) {
        this.mNativeViewId = j;
        this.mWindowName = str;
        nativeOnCreate(j);
        nativeOnScale(this.mNativeViewId, (float) this.mScale, mSoftKeyboardStretchScale);
    }

    public void SetViewSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void addGlobalLayoutListener() {
        getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }

    public void clearClip() {
        this.mCurrentCanvas.restore();
    }

    public void drawCircle(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.mPaint.reset();
        this.mPaint.setColor(i4);
        this.mPaint.setAntiAlias(true);
        if (z) {
            this.mPaint.setStyle(Paint.Style.FILL);
        } else {
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(i5);
        }
        this.mCurrentCanvas.drawCircle(i, i2, i3, this.mPaint);
    }

    public final void drawGif(Movie movie, long j, Rect rect) {
        if (movie == null) {
            return;
        }
        float max = Math.max(movie.height() / rect.height(), movie.width() / rect.width());
        movie.setTime(Math.toIntExact((SystemClock.uptimeMillis() - j) % (movie.duration() == 0 ? 1000 : movie.duration())));
        this.mCurrentCanvas.save();
        float f2 = 1.0f / max;
        this.mCurrentCanvas.scale(f2, f2);
        this.mCurrentCanvas.clipRect(rect.left * max, rect.top * max, rect.right * max, rect.bottom * max);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        movie.draw(this.mCurrentCanvas, rect.left * max, rect.top * max, paint);
        this.mCurrentCanvas.restore();
        invalidateRect(rect);
    }

    public void drawImage(Bitmap bitmap, Rect rect, Rect rect2, int i) {
        this.mCurrentCanvas.save();
        this.mCurrentCanvas.rotate(i, (rect2.left + rect2.right) >> 1, (rect2.top + rect2.bottom) >> 1);
        this.mCurrentCanvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        this.mCurrentCanvas.restore();
    }

    public void drawLine(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mPaint.reset();
        this.mPaint.setColor(i7);
        this.mPaint.setStrokeWidth(i5);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mCurrentCanvas.drawLine(i, i2, i3, i4, this.mPaint);
    }

    public void drawLinerGradientText(String str, Typeface typeface, int i, int i2, int i3, int i4, int i5, boolean z, float f2, float f3, Rect rect, boolean z2) {
        this.mPaint.reset();
        Pair<Integer, Integer> calcTextSize = calcTextSize(str, typeface, i, rect.width(), f2, f3, true);
        Rect rect2 = new Rect();
        if ((i2 & 1) != 0) {
            int width = ((rect.width() - ((Integer) calcTextSize.first).intValue()) / 2) + rect.left;
            rect2.left = width;
            rect2.right = ((Integer) calcTextSize.first).intValue() + width;
        } else if ((i2 & 2) != 0) {
            int i6 = rect.right;
            rect2.right = i6;
            rect2.left = i6 - ((Integer) calcTextSize.first).intValue();
        } else {
            int i7 = rect.left;
            rect2.left = i7;
            rect2.right = ((Integer) calcTextSize.first).intValue() + i7;
        }
        if ((i2 & 4) != 0) {
            int height = ((rect.height() - ((Integer) calcTextSize.second).intValue()) / 2) + rect.top;
            rect2.top = height;
            rect2.bottom = ((Integer) calcTextSize.second).intValue() + height;
        } else if ((i2 & 8) != 0) {
            int i8 = rect.bottom;
            rect2.bottom = i8;
            rect2.top = i8 - ((Integer) calcTextSize.second).intValue();
        } else {
            int i9 = rect.top;
            rect2.top = i9;
            rect2.bottom = ((Integer) calcTextSize.second).intValue() + i9;
        }
        Point point = new Point(rect2.left, rect2.top);
        Point point2 = new Point(rect2.right, rect2.top);
        if (i5 == 1) {
            point2.x = rect2.left;
            point2.y = rect2.bottom;
        } else if (i5 == 2) {
            point2.x = rect2.right;
            point2.y = rect2.bottom;
        } else if (i5 == 3) {
            point.y = rect2.bottom;
            point2.x = rect2.right;
            point2.y = rect2.top;
        }
        this.mPaint.setShader(new LinearGradient(point.x, point.y, point2.x, point2.y, i3, i4, Shader.TileMode.REPEAT));
        drawText(str, typeface, i, i2, z, f2, f3, rect, z2);
        this.mPaint.setShader(null);
    }

    public void drawRect(int i, int i2, int i3, int i4, int i5, int i6, float f2) {
        this.mPaint.reset();
        this.mPaint.setColor(i5);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(i6);
        float f3 = f2 - (i6 / 2);
        this.mCurrentCanvas.drawRoundRect(new RectF(i + r7, i2 + r7, i3 - r7, i4 - r7), f3, f3, this.mPaint);
    }

    public void drawShadow(int i, int i2, int i3, int i4, float f2, float f3, float f4, float f5, int i5, float f6) {
        this.mPaint.reset();
        this.mPaint.setColor(i5);
        this.mPaint.setMaskFilter(new BlurMaskFilter(f6, BlurMaskFilter.Blur.OUTER));
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        Path path = new Path();
        path.addRoundRect(new RectF(i, i2, i3, i4), fArr, Path.Direction.CW);
        this.mCurrentCanvas.drawPath(path, this.mPaint);
        this.mPaint.setMaskFilter(null);
    }

    public void drawTouchTipBubble(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i) {
        Path g2 = ShapeUtils.g(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
        this.mPaint.setColor(i);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mCurrentCanvas.drawPath(g2, this.mPaint);
    }

    public void drawTouchTipBubbleShadow(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, float f12) {
        Path g2 = ShapeUtils.g(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
        this.mPaint.setColor(i);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setMaskFilter(new BlurMaskFilter(f12, BlurMaskFilter.Blur.OUTER));
        this.mCurrentCanvas.drawPath(g2, this.mPaint);
        this.mPaint.setMaskFilter(null);
    }

    public void drawXYAxisShadow(int i, int i2, int i3, int i4, float f2, float f3, float f4, float f5, int i5, float f6, float f7) {
        this.mPaint.reset();
        this.mPaint.setColor(i5);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        float f8 = i;
        float f9 = i2;
        float f10 = i3;
        float f11 = i4;
        path.addRoundRect(new RectF(f8 + f6, f9 + f7, f6 + f10, f7 + f11), fArr, Path.Direction.CW);
        Path path2 = new Path();
        path2.addRoundRect(new RectF(f8, f9, f10, f11), fArr, Path.Direction.CW);
        path.op(path2, Path.Op.DIFFERENCE);
        this.mCurrentCanvas.drawPath(path, this.mPaint);
    }

    public void fillRect(int i, int i2, int i3, int i4, int i5, int i6, boolean z, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8 = i;
        float f9 = i2;
        if (z) {
            f7 = i4;
            f6 = f8;
        } else {
            f6 = i3;
            f7 = f9;
        }
        LinearGradient linearGradient = new LinearGradient(f8, f9, f6, f7, i5, i6, Shader.TileMode.CLAMP);
        this.mPaint.reset();
        this.mPaint.setShader(linearGradient);
        this.mPaint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.addRoundRect(new RectF(f8, f9, i3, i4), new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        this.mCurrentCanvas.drawPath(path, this.mPaint);
    }

    public void generateClip(int i, int i2, int i3, int i4) {
        this.mCurrentCanvas.save();
        this.mCurrentCanvas.clipRect(new Rect(i, i2, i3, i4));
    }

    public float getDeviceScale() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        float K = com.bytedance.android.input.keyboard.areacontrol.k.K();
        com.bytedance.android.input.r.j.i(TAG, "getDeviceScale scale = " + K);
        return K;
    }

    public void invalidateRect(Rect rect) {
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] start draw ui");
        invalidate(rect);
        this.mDirty.union(rect);
        Paint paint = new Paint();
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setColorFilter(new BlendModeColorFilter(0, BlendMode.CLEAR));
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.mCurrentCanvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, paint);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged  ");
        M.append(this.mWindowName);
        com.bytedance.android.input.r.j.m(TAG, M.toString());
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.mBitmapBuffer = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.mDirty.set(0, 0, getWidth(), getHeight());
        this.mCurrentCanvas.setBitmap(this.mBitmapBuffer);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] draw start");
        this.mDrawEventTracker.c();
        super.onDraw(canvas);
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] draw start: parent finish");
        if (!this.mDirty.isEmpty()) {
            nativeDraw(this.mNativeViewId, this.mDirty);
        }
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] draw start: native finish");
        Bitmap bitmap = this.mBitmapBuffer;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] draw start: bitmap finish");
        this.mDirty.setEmpty();
        this.mDrawEventTracker.d();
        com.bytedance.android.input.s.h.d();
        com.bytedance.android.input.common_biz.performance.j.o("[android][ui] draw finish");
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.mWidth;
        if (i3 == 0 && this.mHeight == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i4 = BasicMeasure.EXACTLY;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3 != 0 ? 1073741824 : 0);
        int i5 = this.mHeight;
        if (i5 == 0) {
            i4 = 0;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, i4);
        StringBuilder M = e.a.a.a.a.M("onMeasure ");
        M.append(this.mWindowName);
        M.append(", widthMeasureSpec=");
        M.append(makeMeasureSpec);
        M.append(", heightMeasureSpec=");
        M.append(makeMeasureSpec2);
        M.append(", mWidth=");
        M.append(this.mWidth);
        M.append(", mHeight=");
        e.a.a.a.a.C0(M, this.mHeight, TAG);
        setMeasuredDimension(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (TextUtils.equals(this.mWindowName, KEYBOARD_VIEW_ID)) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            if (i2 < com.bytedance.android.input.keyboard.areacontrol.k.q()) {
                int n = com.bytedance.android.input.keyboard.areacontrol.k.n();
                float f2 = (i2 - n) / (r8 - n);
                mSoftKeyboardStretchScale = f2;
                if (f2 < 0.8d) {
                    mSoftKeyboardStretchScale = 0.8f;
                }
                this.mScale = mSoftKeyboardStretchScale * mSoftKeyboardScale;
            } else {
                this.mScale = mSoftKeyboardScale;
                mSoftKeyboardStretchScale = 1.0f;
            }
        } else {
            com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int F = com.bytedance.android.input.keyboard.areacontrol.k.F();
            if (i2 < F) {
                float f3 = i2 / F;
                mSoftKeyboardStretchScale = f3;
                this.mScale = f3 * mSoftKeyboardScale;
            } else {
                this.mScale = mSoftKeyboardScale;
                mSoftKeyboardStretchScale = 1.0f;
            }
        }
        StringBuilder O = e.a.a.a.a.O("onSizeChanged  ================   w = ", i, ", h = ", i2, " density = ");
        O.append(getResources().getDisplayMetrics().density);
        O.append(" scaleDensity = ");
        O.append(getResources().getDisplayMetrics().scaledDensity);
        O.append(" scale = ");
        O.append(this.mScale);
        O.append(", stretchScale = ");
        O.append(mSoftKeyboardStretchScale);
        com.bytedance.android.input.r.j.m(TAG, O.toString());
        nativeOnScale(this.mNativeViewId, (float) this.mScale, mSoftKeyboardStretchScale);
        StringBuilder M = e.a.a.a.a.M("onSizeChanged  ");
        M.append(this.mWindowName);
        M.append(", w = ");
        M.append(i);
        M.append(", h = ");
        e.a.a.a.a.C0(M, i2, TAG);
        if (i != 0 && i2 != 0) {
            this.mBitmapBuffer = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.mDirty.set(0, 0, i, i2);
            this.mCurrentCanvas.setBitmap(this.mBitmapBuffer);
        }
        nativeOnSize(this.mNativeViewId, i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = action & 255;
        int actionIndex = motionEvent.getActionIndex();
        int x = (int) motionEvent.getX(actionIndex);
        int y = (int) motionEvent.getY(actionIndex);
        StringBuilder O = e.a.a.a.a.O("onTouchEvent: mask = ", i, ", actionIndex = ", actionIndex, ", isVisible ");
        O.append(getVisibility());
        com.bytedance.android.input.r.j.i(TAG, O.toString());
        Boolean preHandleTouchEvent = preHandleTouchEvent(motionEvent);
        if (preHandleTouchEvent != null) {
            return preHandleTouchEvent.booleanValue();
        }
        if (action == 0) {
            delaySendLongPressMessage(x, y);
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_DOWN");
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.c();
            AsrManager.a.s();
        } else if (i == 5) {
            this.mHandler.removeMessages(1);
            this.mMultiTouchOccurred = true;
            delaySendLongPressMessage(x, y);
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_POINTER_DOWN");
        } else if (action == 1) {
            this.mHandler.removeMessages(1);
            this.mMultiTouchOccurred = false;
            ImeService.x.C();
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_UP");
        } else if (action == 6) {
            this.mHandler.removeMessages(1);
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_POINTER_UP");
            if (actionIndex == 0) {
                return true;
            }
        } else if (action == 2) {
            if (this.mMultiTouchOccurred) {
                return true;
            }
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_MOVE");
        } else if (action == 3) {
            this.mHandler.removeMessages(1);
            this.mMultiTouchOccurred = false;
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] onTouchEvent ACTION_CANCEL");
        }
        try {
            nativeTouch(this.mNativeViewId, x, y, i, getCurrentMicrosecond());
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k(TAG, "onTouchEvent: Exception", e2);
        }
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this) {
            StringBuilder M = e.a.a.a.a.M("onVisibilityChanged: name = ");
            M.append(this.mWindowName);
            M.append(" , visible ");
            M.append(i);
            M.append(" , memvisible ");
            M.append(getVisibility());
            M.append(". view = ");
            M.append(view);
            com.bytedance.android.input.r.j.m(TAG, M.toString());
            if (i != 0) {
                this.mDrawEventTracker.b();
            }
            nativeOnVisibleChanged(this.mNativeViewId, getVisibility() == 0);
            for (int i2 = 0; i2 < this.mListenerList.size(); i2++) {
                this.mListenerList.get(i2).a(getVisibility());
            }
        }
    }

    public Boolean preHandleTouchEvent(MotionEvent motionEvent) {
        if (!com.bytedance.android.input.common.u.c.f()) {
            C0603x.f2629e.b("当前输入法无法使用");
            return Boolean.TRUE;
        }
        AsrLongPressView asrLongPressView = this.mAsrLongPressView;
        if (asrLongPressView == null || asrLongPressView.getVisibility() != 0 || getVisibility() == 0) {
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("preHandleTouchEvent AsrLongPressView dispatchTouchEvent.action: ");
        M.append(motionEvent.getAction());
        com.bytedance.android.input.r.j.i(TAG, M.toString());
        return Boolean.valueOf(this.mAsrLongPressView.dispatchTouchEvent(motionEvent));
    }

    public void removeGlobalLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }

    public void removeLongPressMessage() {
        this.mHandler.removeMessages(1);
    }

    public void resizeView(int i, int i2) {
        StringBuilder M = e.a.a.a.a.M("native call resizeView ");
        M.append(this.mWindowName);
        M.append(" , w = ");
        M.append(i);
        M.append(" h = ");
        M.append(i2);
        com.bytedance.android.input.r.j.m(TAG, M.toString());
        SetViewSize(i, i2);
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        requestLayout();
    }

    public void setAsrLongPressView(AsrLongPressView asrLongPressView) {
        com.bytedance.android.input.r.j.i(TAG, "setAsrLongPressView: " + asrLongPressView);
        this.mAsrLongPressView = asrLongPressView;
    }

    public void setIdName(int i, boolean z) {
        super.setId(i);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        String string = aVar.getContext().getResources().getString(i);
        com.bytedance.android.input.r.j.m(TAG, "keyboard view id = " + string);
        if (sViewManager == null) {
            sViewManager = new HashMap<>();
        }
        if (sViewManager.containsKey(string)) {
            com.bytedance.android.input.r.j.m(TAG, "view already exist " + string);
            return;
        }
        sViewManager.put(string, this);
        this.mFusiyinSingleBubble = new com.bytedance.android.input.popup.l(getContext(), this, Integer.MIN_VALUE);
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        double E = com.bytedance.android.input.keyboard.areacontrol.k.E() / 3.0f;
        mSoftKeyboardScale = E;
        this.mScale = E;
        if (z) {
            Object obj = new Object() { // from class: com.bytedance.android.input.keyboard.f
            };
            com.bytedance.android.input.common_biz.performance.j jVar = com.bytedance.android.input.common_biz.performance.j.a;
            kotlin.s.c.l.f(obj, "callback");
        }
    }

    public void setListener(d dVar) {
        this.mListenerList.add(dVar);
    }

    public void showView(boolean z) {
        StringBuilder M = e.a.a.a.a.M("native call showView ");
        M.append(this.mWindowName);
        M.append(" , show = ");
        M.append(z);
        com.bytedance.android.input.r.j.m(TAG, M.toString());
        if (this.mWindowName.compareTo(KEYBOARD_VIEW_ID) != 0) {
            setVisibility(z ? 0 : 8);
        } else {
            if (z || KeyboardJni.getService() == null) {
                return;
            }
            KeyboardJni.getService().requestHideSelf(0);
        }
    }

    public void updateLocation() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        long j = this.mNativeViewId;
        if (j != 0) {
            nativeOnLayout(j, iArr[0], iArr[1]);
        }
        StringBuilder M = e.a.a.a.a.M("onGlobalLayout: name = ");
        M.append(this.mWindowName);
        M.append(", { ");
        M.append(iArr[0]);
        M.append(", ");
        M.append(iArr[1]);
        M.append(", ");
        M.append(getWidth());
        M.append(", ");
        M.append(getHeight());
        e.a.a.a.a.H0(M, " }", TAG);
    }

    public void generateClip(int i, int i2, int i3, int i4, float f2, float f3, float f4, float f5) {
        this.mCurrentCanvas.save();
        Path path = new Path();
        path.addRoundRect(i, i2, i3, i4, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        this.mCurrentCanvas.clipPath(path);
    }

    public void fillRect(int i, int i2, int i3, int i4, int i5, float f2, boolean z) {
        this.mPaint.reset();
        this.mPaint.setColor(i5);
        this.mPaint.setStyle(Paint.Style.FILL);
        if (z) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.mPaint.setBlendMode(BlendMode.SRC_OUT);
            } else {
                this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            }
        }
        this.mCurrentCanvas.drawRoundRect(new RectF(i, i2, i3, i4), f2, f2, this.mPaint);
    }

    public void fillRect(int i, int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5, boolean z) {
        this.mPaint.reset();
        this.mPaint.setColor(i5);
        this.mPaint.setStyle(Paint.Style.FILL);
        if (z) {
            this.mPaint.setBlendMode(BlendMode.SRC_OUT);
        }
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        Path path = new Path();
        path.addRoundRect(new RectF(i, i2, i3, i4), fArr, Path.Direction.CW);
        this.mCurrentCanvas.drawPath(path, this.mPaint);
    }

    public KeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScale = 1.0d;
        this.mNativeViewId = 0L;
        this.mCurrentCanvas = new Canvas();
        this.mPaint = new Paint();
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDirty = new Rect(0, 0, 0, 0);
        this.mBitmapBuffer = null;
        this.mAsrLongPressView = null;
        this.mMultiTouchOccurred = false;
        this.mListenerList = new ArrayList<>();
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.input.keyboard.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                KeyboardView.this.updateLocation();
            }
        };
        this.mFusiyinSingleBubble = null;
        this.mHandler = new c(this);
        this.mDrawEventTracker = new b(null);
    }

    public void drawText(String str, Typeface typeface, int i, int i2, int i3, boolean z, float f2, float f3, Rect rect, boolean z2) {
        this.mPaint.reset();
        this.mPaint.setColor(i3);
        drawText(str, typeface, i, i2, z, f2, f3, rect, z2);
    }
}
