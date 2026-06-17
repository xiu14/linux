package com.bytedance.android.doubaoime;

import android.R;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionExt;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.activity.LauncherActivity;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.editor.SelectionTracker;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.TimerManager;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import com.bytedance.android.input.keyboard.aiwrite.V;
import com.bytedance.android.input.popup.BackspaceSwipeWindow;
import com.bytedance.android.input.q.v;
import com.bytedance.android.input.q.z;
import com.bytedance.android.input.receiver.AdbReceiver;
import com.bytedance.android.input.service.LifecycleInputMethodService;
import com.bytedance.android.input.speech.AsrContext;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.view.AsrEditorLayoutView;
import com.bytedance.android.input.speech.x;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ImeService extends LifecycleInputMethodService {
    private static boolean A = false;
    private static boolean B = true;
    public static final /* synthetic */ int C = 0;
    private static InputView x = null;
    private static boolean y = true;
    private static int z;
    private final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final int[] f1886c = new int[2];

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.android.input.editor.a f1887d;

    /* renamed from: e, reason: collision with root package name */
    private SelectionTracker f1888e;

    /* renamed from: f, reason: collision with root package name */
    private BroadcastReceiver f1889f;

    /* renamed from: g, reason: collision with root package name */
    private AdbReceiver f1890g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private com.bytedance.android.input.upgrade.a n;
    private final e o;
    private boolean p;
    private final f q;
    private Integer r;
    private TextView s;
    private final Runnable t;
    private final BroadcastReceiver u;
    private final BroadcastReceiver v;
    private String w;

    private static final class a implements Runnable {
        public static final a a = new a();
        private static final Handler b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private static kotlin.s.b.a<Boolean> f1891c;

        private a() {
        }

        public final void a(kotlin.s.b.a<Boolean> aVar) {
            kotlin.s.c.l.f(aVar, "isDefaultInputMethodFunc");
            f1891c = aVar;
            b.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            kotlin.s.b.a<Boolean> aVar2 = f1891c;
            if (aVar2 == null) {
                kotlin.s.c.l.l("mIsDefaultInputMethodFunc");
                throw null;
            }
            jSONObject.put("default_ime", aVar2.invoke().booleanValue());
            aVar.t("input_method_info", jSONObject);
            IAppGlobals.a aVar3 = IAppGlobals.a;
            Objects.requireNonNull(aVar3);
            if (aVar3.B()) {
                aVar.i("dark_mode_follow_system");
            }
            b.postDelayed(this, com.heytap.mcssdk.constant.a.f6888f);
        }
    }

    private static final class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.s.c.l.f(context, "context");
            kotlin.s.c.l.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            com.bytedance.android.input.keyboard.r.a().b();
        }
    }

    private static final class c implements Runnable {
        public static final c a = new c();
        private static final Handler b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private static boolean f1892c = true;

        private c() {
        }

        public final void a() {
            if (f1892c) {
                b.post(this);
                f1892c = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.common.a
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsConfigNext.i();
                }
            });
            b.postDelayed(this, com.heytap.mcssdk.constant.a.f6888f);
        }
    }

    public static final class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.s.c.l.f(view, "v");
            com.bytedance.android.input.r.j.i("ImeService", "changeNavigationBarColor onViewAttachedToWindow");
            Integer num = ImeService.this.r;
            if (num != null) {
                ImeService imeService = ImeService.this;
                imeService.n(num.intValue());
                imeService.r = null;
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.s.c.l.f(view, "v");
        }
    }

    public static final class e implements com.bytedance.android.input.basic.settings.api.b {
        e() {
        }

        @Override // com.bytedance.android.input.basic.settings.api.b
        public void onSettingsUpdate() {
            com.bytedance.android.input.upgrade.a aVar = ImeService.this.n;
            if (aVar != null) {
                aVar.p();
            }
        }
    }

    public static final class f extends SettingsConfigNext.b {
        f() {
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
            KeyboardJni.getKeyboardJni().ReloadConfig(SettingsConfigNext.a.a(true));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            InputView inputView;
            kotlin.s.c.l.f(str, "key");
            com.bytedance.android.input.r.j.i("ImeService", "onSettingsConfigChanged, key = " + str + ", value = " + t);
            if (kotlin.s.c.l.a(str, ImeService.this.getString(C0838R.string.full_base_input_mode))) {
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) t).intValue() == 0) {
                    com.bytedance.android.input.r.j.m("ImeService", "onSettingsConfigChanged, full_base_input_mode 输入模式变更，切换到完整模式");
                    com.bytedance.android.input.g.c(IAppGlobals.a.getContext());
                    ImeService.this.o();
                    String str2 = Build.MANUFACTURER;
                    kotlin.s.c.l.e(str2, "MANUFACTURER");
                    String upperCase = str2.toUpperCase();
                    kotlin.s.c.l.e(upperCase, "this as java.lang.String).toUpperCase()");
                    String str3 = Build.BRAND;
                    kotlin.s.c.l.e(str3, "BRAND");
                    String upperCase2 = str3.toUpperCase();
                    kotlin.s.c.l.e(upperCase2, "this as java.lang.String).toUpperCase()");
                    if (kotlin.text.a.d(upperCase, SystemUtils.PRODUCT_HONOR, false, 2, null) || kotlin.text.a.d(upperCase2, SystemUtils.PRODUCT_HONOR, false, 2, null)) {
                        com.bytedance.android.input.r.j.m("ImeService", "hit ab test, KeyboardLayoutSettingsManager.initializeForNewUserIfNeeded");
                        Handler handler = ImeService.this.b;
                        final ImeService imeService = ImeService.this;
                        handler.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImeService imeService2 = ImeService.this;
                                kotlin.s.c.l.f(imeService2, "this$0");
                                com.bytedance.android.input.common.h.a.b(imeService2, true);
                            }
                        }, 500L);
                    }
                } else {
                    com.bytedance.android.input.r.j.m("ImeService", "onSettingsConfigChanged, full_base_input_mode 输入模式变更，切换到基础打字模式");
                    com.bytedance.android.input.g.a();
                    com.bytedance.android.input.common.h.a.b(ImeService.this, false);
                }
            }
            if (kotlin.s.c.l.a(str, ImeService.this.getString(C0838R.string.enable_update_contacts))) {
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) t).booleanValue()) {
                    com.bytedance.android.input.common.e.a(false);
                }
            }
            if (kotlin.s.c.l.a(str, ImeService.this.getString(C0838R.string.enable_one_hand_input_mode)) && (inputView = ImeService.x) != null) {
                inputView.g();
            }
            if (kotlin.s.c.l.a(str, ImeService.this.getString(C0838R.string.pinyin_location_style))) {
                InputView inputView2 = ImeService.x;
                if (inputView2 != null) {
                    inputView2.o0(true);
                }
                com.bytedance.android.input.common.h hVar = com.bytedance.android.input.common.h.a;
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Int");
                hVar.e(((Integer) t).intValue());
            }
            KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, t);
            keyboardJni.ReloadConfig(jSONObject.toString());
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.ImeService$onFinishInputView$1", f = "ImeService.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        g(kotlin.r.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new g(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            new g(dVar);
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            AsrContext.a.g0();
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            AsrContext.a.g0();
            return kotlin.o.a;
        }
    }

    public static final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = ImeService.this.getApplicationContext();
            kotlin.s.c.l.e(applicationContext, "applicationContext");
            com.bytedance.android.input.keyboard.q.c(applicationContext, 0, false, 6);
            ImeService.this.requestHideSelf(0);
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.ImeService$onStartInputView$1", f = "ImeService.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        i(kotlin.r.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new i(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            new i(dVar);
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            com.bytedance.android.input.o.e.a();
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            com.bytedance.android.input.o.e.a();
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.ImeService$onWindowShown$1", f = "ImeService.kt", l = {}, m = "invokeSuspend")
    static final class j extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        j(kotlin.r.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new j(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            j jVar = new j(dVar);
            kotlin.o oVar = kotlin.o.a;
            jVar.invokeSuspend(oVar);
            return oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.l] */
        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            ?? r2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            com.bytedance.android.input.keyboard.gif.list_layout.m mVar = com.bytedance.android.input.keyboard.gif.list_layout.m.a;
            Context context = IAppGlobals.a.getContext();
            kotlin.s.c.l.f(context, "context");
            try {
                File file = new File(context.getExternalCacheDir(), "share/emoticons");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    kotlin.s.c.l.e(listFiles, "listFiles()");
                    r2 = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            r2.add(file2);
                        }
                    }
                } else {
                    r2 = 0;
                }
                if (r2 == 0) {
                    r2 = kotlin.collections.l.a;
                }
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            if (r2.size() <= 3) {
                com.bytedance.android.input.r.j.i("ImeEmoticons-Helper", "deleteEmoticonsShareFile files.size <= 3");
                return kotlin.o.a;
            }
            List Y = kotlin.collections.g.Y(r2, new com.bytedance.android.input.keyboard.gif.list_layout.l(mVar));
            Iterator it2 = kotlin.collections.g.n(Y, 3).iterator();
            while (it2.hasNext()) {
                ((File) it2.next()).delete();
            }
            com.bytedance.android.input.r.j.i("ImeEmoticons-Helper", "deleteEmoticonsShareFile sorted.size = " + Y.size());
            J2 = kotlin.o.a;
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                e.a.a.a.a.P0(b, e.a.a.a.a.M("clearAllEmoticonsShareFile exception: "), "ImeEmoticons-Helper");
            }
            return kotlin.o.a;
        }
    }

    public ImeService() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        this.m = IAppGlobals.a.o().getBoolean("keyboard_is_floating_mode", true);
        this.o = new e();
        this.q = new f();
        this.t = new Runnable() { // from class: com.bytedance.android.doubaoime.b
            @Override // java.lang.Runnable
            public final void run() {
                ImeService.z(ImeService.this);
            }
        };
        this.u = new BroadcastReceiver() { // from class: com.bytedance.android.doubaoime.ImeService$mShutDownReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                kotlin.s.c.l.f(context, "context");
                kotlin.s.c.l.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                com.bytedance.android.input.r.j.m("ImeService", "onReceive: shutdown");
                KeyboardJni.getKeyboardJni().saveUsrDicts(true);
            }
        };
        this.v = new BroadcastReceiver() { // from class: com.bytedance.android.doubaoime.ImeService$mScreenReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                kotlin.s.c.l.f(context, "context");
                kotlin.s.c.l.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent.getAction() == "android.intent.action.SCREEN_ON") {
                    com.bytedance.android.input.r.j.m("ImeService", "screen on");
                    ImeService.B = true;
                    IAppLog.a aVar = IAppLog.a;
                    Objects.requireNonNull(aVar);
                    aVar.s(true);
                    KeyboardJni.getKeyboardJni().updateScreenOn(true);
                    return;
                }
                if (intent.getAction() == "android.intent.action.SCREEN_OFF") {
                    com.bytedance.android.input.r.j.m("ImeService", "screen off");
                    ImeService.B = false;
                    IAppLog.a aVar2 = IAppLog.a;
                    Objects.requireNonNull(aVar2);
                    aVar2.s(false);
                    KeyboardJni.getKeyboardJni().updateScreenOn(false);
                }
            }
        };
        this.w = "";
    }

    private final void D() {
        Object J2;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            J2 = registerReceiver(this.v, intentFilter);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("registerScreen registerReceiver error:", b2, "ImeService");
        }
    }

    private final void E() {
        Object J2;
        try {
            unregisterReceiver(this.u);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("registerShutDown mShutDownReceiver error:", b2, "ImeService");
        }
        registerReceiver(this.u, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
    }

    private final void m() {
        AsrContext asrContext = AsrContext.a;
        asrContext.O();
        asrContext.h0(true);
        asrContext.Z(true, "send");
        asrContext.N(1);
        AsrManager.a.S();
        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
        com.bytedance.android.input.i.c.k();
        if (com.bytedance.android.input.common.o.j()) {
            return;
        }
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_name", getPackageName());
        jSONObject.put("keyboardinput", com.bytedance.android.input.common.o.g());
        jSONObject.put("voiceinput", com.bytedance.android.input.common.o.h());
        jSONObject.put("keyboard_lens", com.bytedance.android.input.common.o.f());
        jSONObject.put("voice_lens", com.bytedance.android.input.common.o.i());
        jSONObject.put("final_lens", com.bytedance.android.input.common.o.e());
        aVar.t("send", jSONObject);
        com.bytedance.android.input.r.j.i("ImeService", "onStartInputView. report send event.");
        com.bytedance.android.input.common.o.k();
    }

    public static WindowInsetsCompat y(ImeService imeService, View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        View decorView;
        kotlin.s.c.l.f(imeService, "this$0");
        kotlin.s.c.l.f(view, "$decorView");
        kotlin.s.c.l.f(view2, "v");
        kotlin.s.c.l.f(windowInsetsCompat, "insets");
        if (imeService.getResources().getConfiguration().orientation == 1) {
            int identifier = imeService.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? imeService.getResources().getDimensionPixelSize(identifier) : 0;
            int identifier2 = imeService.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize2 = identifier2 > 0 ? imeService.getResources().getDimensionPixelSize(identifier2) : 0;
            e.a.a.a.a.C0(e.a.a.a.a.O("resourceId: ", identifier2, ", status_bar_height: ", dimensionPixelSize, ", navigation_bar_height: "), dimensionPixelSize2, "ImeService");
            if (Build.VERSION.SDK_INT >= 30) {
                Window window = imeService.getWindow().getWindow();
                WindowInsets rootWindowInsets = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    Insets insetsIgnoringVisibility = rootWindowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                    kotlin.s.c.l.e(insetsIgnoringVisibility, "it.getInsetsIgnoringVisi…Insets.Type.systemBars())");
                    Insets min = Insets.min(rootWindowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout()), insetsIgnoringVisibility);
                    kotlin.s.c.l.e(min, "min(\n                   …rInsets\n                )");
                    com.bytedance.android.input.r.j.m("ImeService", "insetWindow " + min);
                    dimensionPixelSize2 = min.bottom;
                } else {
                    dimensionPixelSize2 = 0;
                }
            } else {
                e.a.a.a.a.k0("insetWindow low api = ", dimensionPixelSize2, "ImeService");
            }
            imeService.i = dimensionPixelSize2;
            e.a.a.a.a.C0(e.a.a.a.a.M("setOnApplyWindowInsetsListener navigationBarHeight: "), imeService.i, "ImeService");
            InputView inputView = x;
            if (inputView != null) {
                inputView.Y(imeService.i);
            }
        } else {
            InputView inputView2 = x;
            if (inputView2 != null) {
                inputView2.Y(-1);
            }
        }
        InputView inputView3 = x;
        if (inputView3 != null) {
            inputView3.setWindowBottomInsetPadding(imeService.j ? imeService.i : 0);
        }
        view.invalidate();
        return ViewCompat.onApplyWindowInsets(view2, windowInsetsCompat);
    }

    public static void z(ImeService imeService) {
        InputView inputView;
        kotlin.s.c.l.f(imeService, "this$0");
        TextView textView = imeService.s;
        if (textView != null && (inputView = x) != null) {
            inputView.removeView(textView);
        }
        imeService.s = null;
    }

    public final void A() {
        StringBuilder M = e.a.a.a.a.M("onUpgradeTipsClicked， mAppUpgradeHelper = ");
        M.append(this.n);
        com.bytedance.android.input.r.j.m("ImeService", M.toString());
        com.bytedance.android.input.upgrade.a aVar = this.n;
        if (aVar != null) {
            aVar.i();
        }
    }

    public final void B() {
        com.bytedance.android.input.upgrade.a aVar = this.n;
        if (aVar != null) {
            aVar.j();
        }
    }

    public final void C() {
        InputView inputView = x;
        if (inputView != null) {
            inputView.J();
        }
    }

    public final void F() {
        SelectionTracker selectionTracker = this.f1888e;
        if (selectionTracker != null) {
            com.bytedance.android.input.editor.a q = q();
            selectionTracker.o();
            selectionTracker.b(q);
        }
    }

    public final void G(boolean z2) {
        this.m = z2;
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.o().edit().putBoolean("keyboard_is_floating_mode", z2).apply();
        InputView inputView = x;
        if (inputView != null) {
            inputView.l(z2);
        }
        n(aVar.K() ? aVar.l(this, C0838R.color.transparent) : aVar.l(this, C0838R.color.navigation_bar_normal));
    }

    public final void H(boolean z2) {
        InputView inputView = x;
        if (inputView != null) {
            inputView.T(Boolean.valueOf(z2));
        }
    }

    public final void I(boolean z2) {
        InputView inputView = x;
        if (inputView != null) {
            inputView.U(Boolean.valueOf(z2));
        }
    }

    public final void J(boolean z2) {
        InputView inputView = x;
        if (inputView != null) {
            inputView.W(Boolean.valueOf(z2));
        }
    }

    public final void K(String str) {
        kotlin.s.c.l.f(str, "message");
        InputView inputView = x;
        if (inputView != null && this.s == null) {
            this.b.removeCallbacks(this.t);
            TextView textView = new TextView(inputView.getContext());
            this.s = textView;
            if (textView != null) {
                IAppGlobals.a aVar = IAppGlobals.a;
                Context context = inputView.getContext();
                kotlin.s.c.l.e(context, "inputView.context");
                textView.setBackground(aVar.D(context, C0838R.drawable.toast_shape));
            }
            TextView textView2 = this.s;
            if (textView2 != null) {
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Context context2 = inputView.getContext();
                kotlin.s.c.l.e(context2, "inputView.context");
                textView2.setTextColor(aVar2.l(context2, C0838R.color.toast_text_color));
            }
            TextView textView3 = this.s;
            if (textView3 != null) {
                textView3.setTextSize(12.0f);
            }
            TextView textView4 = this.s;
            if (textView4 != null) {
                textView4.setText(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, 150);
            TextView textView5 = this.s;
            if (textView5 != null) {
                float f2 = 36;
                int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
                float f3 = 18;
                int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f3);
                int e03 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
                Resources system = Resources.getSystem();
                kotlin.s.c.l.e(system, "Resources.getSystem()");
                textView5.setPadding(e0, e02, e03, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())));
            }
            TextView textView6 = this.s;
            if (textView6 != null) {
                textView6.setLayoutParams(layoutParams);
            }
            inputView.addView(this.s);
            this.b.postDelayed(this.t, WsConstants.EXIT_DELAY_TIME);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public void hideWindow() {
        InputView inputView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        if (v() && (inputView = x) != null && (animate = inputView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
            duration.start();
        }
        super.hideWindow();
    }

    public final void n(int i2) {
        if (this.h) {
            return;
        }
        Window window = getWindow().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || !ViewCompat.isAttachedToWindow(decorView)) {
            com.bytedance.android.input.r.j.r("ImeService", "changeNavigationBarColor failed: DecorView is not attached to window. Caching color.");
            this.r = Integer.valueOf(i2);
            if (decorView != null) {
                decorView.addOnAttachStateChangeListener(new d());
                return;
            }
            return;
        }
        StringBuilder M = e.a.a.a.a.M("ImeService changeNavigationBarColor ");
        M.append(Integer.toHexString(i2));
        com.bytedance.android.input.r.j.i("ImeService", M.toString());
        Window window2 = getWindow().getWindow();
        if (window2 != null) {
            if (v()) {
                IAppGlobals.a aVar = IAppGlobals.a;
                i2 = aVar.l(aVar.getContext(), C0838R.color.transparent);
            }
            window2.setNavigationBarColor(i2);
        }
        this.r = null;
    }

    public final void o() {
        com.bytedance.android.input.upgrade.a aVar = this.n;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onComputeInsets(InputMethodService.Insets insets) {
        kotlin.s.c.l.f(insets, "outInsets");
        Window window = getWindow().getWindow();
        kotlin.s.c.l.c(window);
        InputView inputView = (InputView) window.findViewById(C0838R.id.ime_inputview);
        if (inputView == null) {
            super.onComputeInsets(insets);
            return;
        }
        int[] iArr = this.f1886c;
        if (inputView.getVisibility() == 0) {
            inputView.getLocationInWindow(iArr);
        } else {
            View decorView = window.getDecorView();
            kotlin.s.c.l.e(decorView, "window.decorView");
            iArr[1] = decorView.getHeight();
        }
        if (!v()) {
            insets.contentTopInsets = iArr[1];
            insets.visibleTopInsets = iArr[1];
            insets.touchableInsets = 2;
            insets.touchableRegion.setEmpty();
            return;
        }
        View decorView2 = window.getDecorView();
        kotlin.s.c.l.e(decorView2, "window.decorView");
        insets.contentTopInsets = decorView2.getHeight();
        insets.visibleTopInsets = 0;
        insets.touchableInsets = 3;
        insets.touchableRegion.set(inputView.q());
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.s.c.l.f(configuration, "newConfig");
        StringBuilder sb = new StringBuilder();
        sb.append("ImeService onConfigurationChanged ui = ");
        e.a.a.a.a.C0(sb, configuration.uiMode, "ImeService");
        super.onConfigurationChanged(configuration);
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.y(configuration);
        KeyboardJni.getKeyboardJni().updateColorSchemeConf(aVar.d());
        n(aVar.K() ? aVar.l(this, C0838R.color.transparent) : aVar.l(this, C0838R.color.navigation_bar_normal));
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onConfigureWindow(Window window, boolean z2, boolean z3) {
        WindowManager.LayoutParams attributes;
        View decorView;
        Window window2 = getWindow().getWindow();
        Integer num = null;
        if (((window2 == null || (decorView = window2.getDecorView()) == null) ? null : decorView.getParent()) == null) {
            return;
        }
        Window window3 = getWindow().getWindow();
        if (window3 != null && (attributes = window3.getAttributes()) != null) {
            num = Integer.valueOf(attributes.height);
        }
        if (num == null || num.intValue() != -1) {
            Window window4 = getWindow().getWindow();
            kotlin.s.c.l.c(window4);
            window4.setLayout(-1, -1);
        }
        StringBuilder M = e.a.a.a.a.M("onConfigureWindow() + width = ");
        Window window5 = getWindow().getWindow();
        kotlin.s.c.l.c(window5);
        M.append(window5.getAttributes().width);
        M.append(" height = ");
        Window window6 = getWindow().getWindow();
        kotlin.s.c.l.c(window6);
        e.a.a.a.a.C0(M, window6.getAttributes().height, "ImeService");
    }

    @Override // com.bytedance.android.input.service.LifecycleInputMethodService, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        Object J2;
        com.bytedance.android.input.r.j.m("ImeService", "onCreate start");
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.android.input.s.j jVar = com.bytedance.android.input.s.j.a;
        com.bytedance.android.input.s.j.d();
        super.onCreate();
        com.bytedance.android.input.r.j.m("ImeService", "initialize Start");
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f1888e = new SelectionTracker();
        com.bytedance.android.input.editor.a aVar = new com.bytedance.android.input.editor.a();
        aVar.f(this.f1888e);
        this.f1887d = aVar;
        KeyboardJni.SetImeService(this);
        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        keyboardJni.setThirdSystem(!aVar2.F());
        KeyboardJni.getKeyboardJni().setExternalPackage(aVar2.h());
        if (y) {
            StringBuilder M = e.a.a.a.a.M("Environment is ready? ");
            M.append(IEnvironment.a.c());
            com.bytedance.android.input.r.j.m("ImeService", M.toString());
            while (!IEnvironment.a.c()) {
            }
            com.bytedance.android.input.r.j.m("ImeService", "Environment is ready.");
            KeyboardJni keyboardJni2 = KeyboardJni.getKeyboardJni();
            IAppGlobals.a aVar3 = IAppGlobals.a;
            keyboardJni2.updateRatioAdaptiveConf(aVar3.s());
            com.bytedance.android.input.r.j.m("ImeService", "updateRatioAdaptiveConf end");
            if (x == null) {
                View E = aVar3.E(this, C0838R.layout.ime_inputview);
                kotlin.s.c.l.d(E, "null cannot be cast to non-null type com.bytedance.android.input.keyboard.InputView");
                x = (InputView) E;
            }
            InputView inputView = x;
            if (inputView != null) {
                inputView.F();
            }
            SettingsConfigNext.a.j(this.q);
            com.bytedance.android.input.common.e.a(false);
            boolean F = aVar3.F();
            boolean h2 = aVar3.h();
            boolean z2 = h2 || !F;
            com.bytedance.android.input.r.j.m("ImeService", "toggleAppIcon(): FLAG_SYSTEM = " + F + ", isEnabled = " + z2 + ", isExternal = " + h2 + ", isDebug = false");
            getPackageManager().setComponentEnabledSetting(new ComponentName(getApplicationContext(), (Class<?>) LauncherActivity.class), z2 ? 1 : 2, 1);
            com.bytedance.android.input.r.j.m("ImeService", "toggleAppIcon(): end");
            SharedPreferences o = aVar3.o();
            KeyboardJni.getKeyboardJni().LoadGuideConfig(o.getString("fusiyin_guide_version_code", ""), o.getString("first_letter_capitalization_version_code", ""), o.getString("swipe_down_withdraw_tip", ""), o.getBoolean("keyboard_show_floating_mode_tip", true));
            com.bytedance.android.input.r.j.m("ImeService", "config init end.");
            C0795d.l(LifecycleOwnerKt.getLifecycleScope(this), S.b(), null, new q(null), 2, null);
            a.a.a(new r(this));
            c.a.a();
            this.b.post(new s(this));
            com.bytedance.android.input.fragment.custom_symbol.l.b bVar = com.bytedance.android.input.fragment.custom_symbol.l.b.a;
            com.bytedance.android.input.fragment.custom_symbol.l.b.c();
        }
        InputView inputView2 = x;
        if (inputView2 != null) {
            inputView2.f();
        }
        com.bytedance.android.input.r.j.m("ImeService", "start registerSystemReceiverAndListener.");
        try {
            E();
            if (this.f1889f == null) {
                b bVar2 = new b();
                this.f1889f = bVar2;
                registerReceiver(bVar2, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                Objects.requireNonNull(com.bytedance.android.input.keyboard.r.a());
            }
            com.bytedance.android.input.common.m.e(this);
            com.bytedance.android.input.common.d.c(this);
            com.bytedance.android.input.r.j.m("ImeService", "registerClipboard~");
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.b();
            if (this.f1890g == null) {
                AdbReceiver adbReceiver = new AdbReceiver();
                this.f1890g = adbReceiver;
                adbReceiver.a();
            }
            D();
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("registerSystemReceiverAndListener error:", b2, "ImeService");
        }
        y = false;
        if (this.n == null) {
            this.n = new com.bytedance.android.input.upgrade.a(this, LifecycleOwnerKt.getLifecycleScope(this), x);
        }
        if (!this.p) {
            IInputSettings.a.i(this.o);
            this.p = true;
        }
        StringBuilder M2 = e.a.a.a.a.M("initialize End cost = ");
        M2.append(System.currentTimeMillis() - currentTimeMillis2);
        com.bytedance.android.input.r.j.m("ImeService", M2.toString());
        com.bytedance.android.input.s.j jVar2 = com.bytedance.android.input.s.j.a;
        com.bytedance.android.input.s.j.c();
        AsrContext.a.H();
        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "startAsrGlobalMetrics");
        IAsr a2 = IAsr.a.a(IAsr.Type.SDK);
        if (a2 != null) {
            a2.b();
        }
        com.bytedance.android.input.common.h.a.f(com.bytedance.android.input.common.u.c.b(this) == -1);
        com.bytedance.android.input.r.j.m("ImeService", "onCreate end cost = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        com.bytedance.android.input.r.j.m("ImeService", "onCreateInputView()");
        InputView inputView = x;
        ViewParent parent = inputView != null ? inputView.getParent() : null;
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        BackspaceSwipeWindow j2 = BackspaceSwipeWindow.j();
        Window window = getWindow().getWindow();
        kotlin.s.c.l.c(window);
        j2.u(window.getDecorView(), x);
        com.bytedance.android.input.upgrade.a aVar = this.n;
        if (aVar != null) {
            aVar.p();
        }
        return x;
    }

    @Override // com.bytedance.android.input.service.LifecycleInputMethodService, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        Object J2;
        Object J3;
        Object J4;
        Object J5;
        Object J6;
        Object J7;
        Object J8;
        super.onDestroy();
        this.h = true;
        com.bytedance.android.input.r.j.m("ImeService", "onDestroy");
        if (this.p) {
            IInputSettings.a.n(this.o);
            this.p = false;
        }
        try {
            unregisterReceiver(this.u);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener mShutDownReceiver error:", b2, "ImeService");
        }
        try {
            AdbReceiver adbReceiver = this.f1890g;
            if (adbReceiver != null) {
                unregisterReceiver(adbReceiver);
                this.f1890g = null;
            }
            J3 = kotlin.o.a;
        } catch (Throwable th2) {
            J3 = com.prolificinteractive.materialcalendarview.r.J(th2);
        }
        Throwable b3 = kotlin.h.b(J3);
        if (b3 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener mAdbReceiver error:", b3, "ImeService");
        }
        try {
            unregisterReceiver(this.v);
            J4 = kotlin.o.a;
        } catch (Throwable th3) {
            J4 = com.prolificinteractive.materialcalendarview.r.J(th3);
        }
        Throwable b4 = kotlin.h.b(J4);
        if (b4 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener mScreenReceiver error:", b4, "ImeService");
        }
        try {
            BroadcastReceiver broadcastReceiver = this.f1889f;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                Objects.requireNonNull(com.bytedance.android.input.keyboard.r.a());
                this.f1889f = null;
            }
            J5 = kotlin.o.a;
        } catch (Throwable th4) {
            J5 = com.prolificinteractive.materialcalendarview.r.J(th4);
        }
        Throwable b5 = kotlin.h.b(J5);
        if (b5 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener unRegisterSoundChangeReceiver error:", b5, "ImeService");
        }
        try {
            com.bytedance.android.input.common.m.f();
            J6 = kotlin.o.a;
        } catch (Throwable th5) {
            J6 = com.prolificinteractive.materialcalendarview.r.J(th5);
        }
        Throwable b6 = kotlin.h.b(J6);
        if (b6 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener SmsListener error:", b6, "ImeService");
        }
        try {
            com.bytedance.android.input.common.d.d();
            J7 = kotlin.o.a;
        } catch (Throwable th6) {
            J7 = com.prolificinteractive.materialcalendarview.r.J(th6);
        }
        Throwable b7 = kotlin.h.b(J7);
        if (b7 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener ContactsContentObserver error:", b7, "ImeService");
        }
        try {
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.j();
            J8 = kotlin.o.a;
        } catch (Throwable th7) {
            J8 = com.prolificinteractive.materialcalendarview.r.J(th7);
        }
        Throwable b8 = kotlin.h.b(J8);
        if (b8 != null) {
            e.a.a.a.a.v0("unRegisterSystemReceiverAndListener ImeClipboardManager error:", b8, "ImeService");
        }
        this.b.removeCallbacksAndMessages(null);
        KeyboardJni.getKeyboardJni().onImeServiceDestory();
        try {
            com.bytedance.android.input.common_biz.performance.i.a(getWindow().getWindow());
            com.bytedance.android.input.common_biz.performance.h.a.d();
        } catch (Throwable th8) {
            com.prolificinteractive.materialcalendarview.r.J(th8);
        }
        com.bytedance.android.input.popup.q.f().k();
        InputView inputView = x;
        if (inputView != null) {
            inputView.K();
        }
        InputView inputView2 = x;
        if (inputView2 != null) {
            Boolean bool = Boolean.FALSE;
            inputView2.O(bool, bool);
        }
        AsrContext.a.M();
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onEvaluateFullscreenMode() {
        return this.h;
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onEvaluateInputViewShown() {
        super.onEvaluateInputViewShown();
        return !this.h;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onFinishInput() {
        super.onFinishInput();
        z.a.w();
        AsrManager.a.Q();
        KeyboardJni.onFinishInput();
        if (!com.bytedance.android.input.common.o.j()) {
            com.bytedance.android.input.r.j.i("ImeService", "onFinishInput. report keyclear event.");
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_name", com.bytedance.android.input.common.g.b());
            jSONObject.put("keyboardinput", com.bytedance.android.input.common.o.g());
            jSONObject.put("voiceinput", com.bytedance.android.input.common.o.h());
            jSONObject.put("keyboard_lens", com.bytedance.android.input.common.o.f());
            jSONObject.put("voice_lens", com.bytedance.android.input.common.o.i());
            jSONObject.put("final_lens", com.bytedance.android.input.common.o.e());
            aVar.t("keyclear", jSONObject);
            com.bytedance.android.input.common.o.k();
        }
        com.bytedance.android.input.quic.b bVar = com.bytedance.android.input.quic.b.a;
        com.bytedance.android.input.quic.b.b();
        com.bytedance.android.input.r.j.m("ImeService", "onFinishInput");
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z2) {
        super.onFinishInputView(z2);
        com.bytedance.android.input.speech.modifypair.d.a.s();
        z zVar = z.a;
        InputView inputView = x;
        if (!(inputView != null && inputView.y())) {
            com.bytedance.android.input.r.j.i("RecommendsManager", "onFinishInputView");
            com.bytedance.android.input.q.C.r.a.c();
            v.a.m();
            com.bytedance.android.input.q.q.a.b();
            z.H();
        }
        com.bytedance.android.input.popup.q.f().c();
        KeyboardJni.onFinishInputView();
        AsrManager.a.R();
        com.bytedance.android.input.keyboard.CustomToolbar.b.c();
        KeyboardJni.getKeyboardJni().saveUsrDicts(true);
        InputView inputView2 = x;
        if (inputView2 != null) {
            inputView2.G();
        }
        com.bytedance.android.input.m.a.b();
        AsrContext asrContext = AsrContext.a;
        asrContext.N(2);
        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
        com.bytedance.android.input.i.c.k();
        C0795d.l(LifecycleOwnerKt.getLifecycleScope(this), S.b(), null, new g(null), 2, null);
        asrContext.h0(false);
        asrContext.p();
        x xVar = x.a;
        x.g(true, false, null, null);
        SelectionTracker selectionTracker = this.f1888e;
        if (selectionTracker != null) {
            selectionTracker.o();
        }
        IAppLog.a.l();
        asrContext.M();
        com.bytedance.android.input.s.i.b();
        x.c();
        asrContext.U(false);
        asrContext.Q();
        TimerManager.killAllTimers();
        AsrManager.m0(false);
        com.bytedance.android.input.p.a aVar = com.bytedance.android.input.p.a.a;
        com.bytedance.android.input.p.a.e();
        com.bytedance.android.input.r.j.m("ImeService", "onFinishInputView finishing=" + z2);
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onInitializeInterface() {
        final View decorView;
        super.onInitializeInterface();
        com.bytedance.android.input.popup.q.f().k();
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        Window window = getWindow().getWindow();
        kotlin.s.c.l.c(window);
        f2.h(window.getDecorView());
        com.bytedance.android.input.r.j.m("ImeService", "onInitializeInterface()");
        Window window2 = getWindow().getWindow();
        if (window2 == null || (decorView = window2.getDecorView()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.bytedance.android.doubaoime.a
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ImeService.y(ImeService.this, decorView, view, windowInsetsCompat);
            }
        });
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        e.a.a.a.a.k0("onKeyDown, keycode is ", i2, "ImeService");
        if (i2 == 4) {
            InputView inputView = x;
            boolean z2 = false;
            if (inputView != null && inputView.x()) {
                C0601v.a.s(false);
                InputView inputView2 = x;
                if (inputView2 != null) {
                    inputView2.m().o();
                }
                return true;
            }
            InputView inputView3 = x;
            if (inputView3 != null && inputView3.y()) {
                z2 = true;
            }
            if (z2) {
                V.h();
                InputView inputView4 = x;
                if (inputView4 != null) {
                    Boolean bool = Boolean.FALSE;
                    inputView4.O(bool, bool);
                }
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        com.bytedance.android.input.r.j.m("ImeService", "onKeyUp");
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onShowInputRequested(int i2, boolean z2) {
        com.bytedance.android.input.r.j.i("ImeService", "onShowInputRequested");
        com.bytedance.android.input.s.h.b();
        com.bytedance.android.input.keyboard.q qVar = com.bytedance.android.input.keyboard.q.a;
        Context applicationContext = getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        if (!com.bytedance.android.input.keyboard.q.a(applicationContext)) {
            return super.onShowInputRequested(i2, z2);
        }
        long currentTimeMillis = System.currentTimeMillis() - com.bytedance.android.input.keyboard.q.b.get();
        Log.i("ImeService", "Privacystatement windows show timeInterval: " + currentTimeMillis);
        if (currentTimeMillis >= 550) {
            this.b.postDelayed(new h(), 100L);
            return false;
        }
        Log.e("ImeService", "privacy dialog shown recently， hide IME！！！");
        this.b.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.d
            @Override // java.lang.Runnable
            public final void run() {
                ImeService imeService = ImeService.this;
                int i3 = ImeService.C;
                kotlin.s.c.l.f(imeService, "this$0");
                imeService.requestHideSelf(0);
            }
        }, 100L);
        return false;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onStartInput(EditorInfo editorInfo, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onStartInput(editorInfo, z2);
        String str = editorInfo != null ? editorInfo.packageName : null;
        if (str == null) {
            str = "";
        }
        com.bytedance.android.input.r.j.m("ImeService", "onStartInput. packageName is " + str + ", restarting:" + z2);
        IAppGlobals.a.G(str);
        z.a.z(str);
        if (z2) {
            m();
        }
        com.bytedance.android.input.quic.b bVar = com.bytedance.android.input.quic.b.a;
        com.bytedance.android.input.quic.b.c();
        com.bytedance.android.input.upgrade.a aVar = this.n;
        if (aVar != null) {
            aVar.k();
        }
        StringBuilder M = e.a.a.a.a.M("onStartInput cost = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        com.bytedance.android.input.r.j.m("ImeService", M.toString());
        com.bytedance.android.input.common_biz.performance.j.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x02db  */
    @Override // android.inputmethodservice.InputMethodService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStartInputView(android.view.inputmethod.EditorInfo r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.ImeService.onStartInputView(android.view.inputmethod.EditorInfo, boolean):void");
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onUpdateSelection(int i2, int i3, int i4, int i5, int i6, int i7) {
        super.onUpdateSelection(i2, i3, i4, i5, i6, i7);
        if (isInputViewShown()) {
            InputView inputView = x;
            if (inputView != null && inputView.y()) {
                InputView inputView2 = x;
                if (((inputView2 == null || inputView2.x()) ? false : true) && i6 == -1 && i7 == -1) {
                    boolean z2 = (i3 != i2) && (i4 == i5);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onUpdateSelection ,isSelectionCleared: ");
                    sb.append(z2);
                    sb.append(",oldSelStart: ");
                    sb.append(i2);
                    sb.append(", oldSelEnd: ");
                    e.a.a.a.a.F0(sb, i3, ", newSelStart: ", i4, ", newSelEnd: ");
                    e.a.a.a.a.F0(sb, i5, ", candidatesStart: ", i6, ", candidatesEnd: ");
                    e.a.a.a.a.B0(sb, i7, "ImeService");
                    if (z2) {
                        V.h();
                        InputView inputView3 = x;
                        if (inputView3 != null) {
                            Boolean bool = Boolean.FALSE;
                            inputView3.O(bool, bool);
                        }
                    }
                }
            }
        }
        com.bytedance.android.input.editor.a aVar = this.f1887d;
        if (aVar != null) {
            aVar.i(i2, i3, i4, i5, i6, i7);
        }
        KeyboardJni.getKeyboardJni().onUpdateSelection(i2, i3, i4, i5, i6, i7);
        String a2 = com.bytedance.android.input.common.g.a();
        if (a2.length() > 0) {
            AsrContext.a.j0(true);
        }
        InputView inputView4 = x;
        if (inputView4 != null) {
            inputView4.j0(a2.length() > 0);
        }
        com.bytedance.android.input.common.o.l(a2.length());
        com.bytedance.android.input.r.j.i("ImeService", "onUpdateSelection: mFinalCommitWordCounts = " + com.bytedance.android.input.common.o.e());
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onViewClicked(boolean z2) {
        InputView inputView;
        AsrEditorLayoutView n;
        super.onViewClicked(z2);
        StringBuilder X = e.a.a.a.a.X("onViewClicked - focus: ", z2, ", isInputViewShown: ");
        X.append(isInputViewShown());
        com.bytedance.android.input.r.j.m("ImeService", X.toString());
        if (z2 || !isInputViewShown()) {
            return;
        }
        AsrManager.a.v();
        KeyboardJni.resetPreEditStartPosition();
        InputView inputView2 = x;
        if ((inputView2 == null || (n = inputView2.n()) == null || n.getVisibility() != 0) ? false : true) {
            com.bytedance.android.input.r.j.i("ImeService", "onViewClicked in asr. do not handle it.");
            return;
        }
        KeyboardJni.getKeyboardJni().onUserClickedEditor();
        InputView inputView3 = x;
        if (inputView3 != null) {
            inputView3.V(false, null, null);
        }
        InputView inputView4 = x;
        if (inputView4 != null && inputView4.y()) {
            InputView inputView5 = x;
            if ((inputView5 == null || inputView5.x()) ? false : true) {
                V.h();
                InputView inputView6 = x;
                if (inputView6 != null) {
                    Boolean bool = Boolean.FALSE;
                    inputView6.O(bool, bool);
                }
            }
        }
        InputView inputView7 = x;
        if ((inputView7 != null && inputView7.w()) && (inputView = x) != null) {
            inputView.i();
        }
        InputView inputView8 = x;
        if (inputView8 != null) {
            inputView8.U(Boolean.FALSE);
        }
        InputView inputView9 = x;
        if (inputView9 != null) {
            inputView9.T(Boolean.FALSE);
        }
        KeyboardJni.getKeyboardJni().exitCustomizeToolbar();
        com.bytedance.android.input.keyboard.CustomToolbar.b.a();
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onWindowHidden() {
        super.onWindowHidden();
        StringBuilder M = e.a.a.a.a.M("onWindowHidden, finishAiWriting， isAiPanelShow=");
        InputView inputView = x;
        M.append(inputView != null ? Boolean.valueOf(inputView.y()) : null);
        com.bytedance.android.input.r.j.m("ImeService", M.toString());
        try {
            com.bytedance.android.input.common_biz.performance.i.a(getWindow().getWindow());
            com.bytedance.android.input.common_biz.performance.h.a.d();
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
        InputView inputView2 = x;
        if (inputView2 != null) {
            Boolean bool = Boolean.FALSE;
            inputView2.O(bool, bool);
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onWindowShown() {
        ViewPropertyAnimator animate;
        super.onWindowShown();
        com.bytedance.android.input.r.j.m("ImeService", "onWindowShown");
        Window window = getWindow().getWindow();
        try {
            com.bytedance.android.input.common_biz.performance.j.h();
            com.bytedance.android.input.common_biz.performance.i.b(window);
            com.bytedance.android.input.common_biz.performance.h.a.c();
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
        InputView inputView = x;
        if (inputView != null && (animate = inputView.animate()) != null) {
            animate.cancel();
        }
        InputView inputView2 = x;
        if (inputView2 != null) {
            inputView2.setAlpha(1.0f);
        }
        AsrManager.a.W();
        KeyboardJni.onWindowShown();
        IAppGlobals.a.j("ImeAbTestManager", "[refresh]");
        try {
            com.bytedance.dataplatform.m.m();
        } catch (Throwable th2) {
            com.prolificinteractive.materialcalendarview.r.J(th2);
        }
        C0795d.l(LifecycleOwnerKt.getLifecycleScope(this), S.b(), null, new j(null), 2, null);
    }

    public final InputConnectionExt p() {
        try {
            Method method = InputMethodService.class.getMethod("getInputConnectionExt", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(this, new Object[0]);
            kotlin.s.c.l.d(invoke, "null cannot be cast to non-null type android.view.inputmethod.InputConnectionExt");
            return (InputConnectionExt) invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final com.bytedance.android.input.editor.a q() {
        InputView inputView = x;
        if ((inputView != null ? inputView.o() : null) == null) {
            this.k = false;
            com.bytedance.android.input.editor.a aVar = this.f1887d;
            if (aVar == null) {
                return null;
            }
            aVar.h(getCurrentInputConnection());
            return aVar;
        }
        this.k = true;
        com.bytedance.android.input.r.j.i("ImeService", "getInputConnectionWrapper use commonPhraseIC");
        com.bytedance.android.input.editor.a aVar2 = this.f1887d;
        if (aVar2 == null) {
            return null;
        }
        InputView inputView2 = x;
        aVar2.h(inputView2 != null ? inputView2.o() : null);
        return aVar2;
    }

    public final Point r() {
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = getSystemService("window");
            kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Rect bounds = ((WindowManager) systemService).getCurrentWindowMetrics().getBounds();
            kotlin.s.c.l.e(bounds, "windowManager.currentWindowMetrics.bounds");
            point.x = bounds.width();
            point.y = bounds.height();
            StringBuilder M = e.a.a.a.a.M("getRealScreenSize >= 30 x = ");
            M.append(point.x);
            M.append(", y = ");
            e.a.a.a.a.C0(M, point.y, "ImeService");
        } else {
            try {
                Object systemService2 = getSystemService("window");
                kotlin.s.c.l.d(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics);
                point.x = displayMetrics.widthPixels;
                point.y = displayMetrics.heightPixels;
                com.bytedance.android.input.r.j.m("ImeService", "getRealScreenSize < 30 x = " + point.x + ", y = " + point.y);
            } catch (NoSuchMethodException unused) {
            } catch (Exception e2) {
                e.a.a.a.a.f0(e2, e.a.a.a.a.M("getRealScreenSize error: "), "ImeService");
            }
        }
        return point;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void requestHideSelf(int i2) {
        try {
            super.requestHideSelf(i2);
            com.bytedance.android.input.r.j.m("ImeService", "requestHideSelf");
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("requestHideSelf guarded with exception: ");
            M.append(th.getMessage());
            com.bytedance.android.input.r.j.j("ImeService", M.toString());
        }
    }

    public final SelectionTracker s() {
        return this.f1888e;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void sendDownUpKeyEvents(int i2) {
        SelectionTracker selectionTracker = this.f1888e;
        if (selectionTracker != null) {
            selectionTracker.q(new KeyEvent(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, i2, 0, 0, -1, 0, 6));
        }
        super.sendDownUpKeyEvents(i2);
    }

    public final void t() {
        InputView inputView = x;
        if (inputView == null) {
            return;
        }
        this.b.removeCallbacks(this.t);
        TextView textView = this.s;
        if (textView != null) {
            inputView.removeView(textView);
            this.s = null;
        }
    }

    public final boolean u(InputConnection inputConnection) {
        kotlin.s.c.l.f(inputConnection, "ic");
        return this.k;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void updateInputViewShown() {
        int i2;
        try {
            com.bytedance.android.input.r.j.m("ImeService", "updateInputViewShown: width = " + getResources().getDisplayMetrics().widthPixels);
            super.updateInputViewShown();
            com.bytedance.android.input.r.j.m("ImeService", "updateInputViewShown: orientation = " + getResources().getConfiguration().orientation);
            Point r = r();
            boolean z2 = true;
            if (getResources().getConfiguration().orientation == 2) {
                InputView inputView = x;
                i2 = ((inputView != null && inputView.g0()) && this.m) ? 2 : 1;
            } else {
                i2 = 0;
            }
            Window window = getWindow().getWindow();
            View findViewById = window != null ? window.findViewById(R.id.inputArea) : null;
            ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            InputView inputView2 = x;
            if (inputView2 != null) {
                if (i2 != 2) {
                    z2 = false;
                }
                inputView2.X(z2);
            }
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            com.bytedance.android.input.keyboard.areacontrol.k.b0(i2);
            InputView inputView3 = x;
            if (inputView3 != null) {
                inputView3.I(r.x, r.y, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, i2);
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("updateInputViewShown error: ");
            M.append(e2.getMessage());
            com.bytedance.android.input.r.j.m("ImeService", M.toString());
        }
    }

    public final boolean v() {
        InputView inputView = x;
        return (inputView != null && inputView.g0()) && getResources().getConfiguration().orientation == 2 && this.m;
    }

    public final boolean w() {
        InputView inputView = x;
        return inputView != null && inputView.z();
    }

    public final boolean x() {
        return ((Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.sms_verification_enabled, "context.getString(R.stri…sms_verification_enabled)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
    }
}
