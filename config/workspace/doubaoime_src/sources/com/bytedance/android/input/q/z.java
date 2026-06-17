package com.bytedance.android.input.q;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.q.v;
import com.bytedance.android.input.q.z;
import com.bytedance.android.input.recommend.preview.ImageViewerPopupWindow;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    private static com.bytedance.android.input.popup.i f3007d;

    /* renamed from: e, reason: collision with root package name */
    private static kotlin.s.b.l<? super Boolean, kotlin.o> f3008e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3009f;

    /* renamed from: g, reason: collision with root package name */
    private static com.bytedance.android.input.popup.i f3010g;
    private static kotlin.s.b.l<? super Boolean, kotlin.o> h;
    private static volatile IRecognizer.f j;
    public static final z a = new z();
    private static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f3006c = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.q.p
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            z zVar = z.a;
            return new Thread(runnable, "RecommendsShare");
        }
    });
    private static int i = -1;
    private static IRecognizer.Scene k = IRecognizer.Scene.UNKNOWN;
    private static String l = "";
    private static final kotlin.e m = kotlin.a.c(e.a);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            IRecognizer.Scene.values();
            int[] iArr = new int[5];
            try {
                IRecognizer.Scene scene = IRecognizer.Scene.CHAT;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            IRecommends.Data.Source.values();
            int[] iArr2 = new int[17];
            try {
                IRecommends.Data.Source source = IRecommends.Data.Source.CHAT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IRecommends.Data.Source source2 = IRecommends.Data.Source.BAIKE;
                iArr2[14] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.f3011c = str3;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            bool.booleanValue();
            z.e(z.a, this.a, this.b, this.f3011c);
            return kotlin.o.a;
        }
    }

    /* synthetic */ class c extends kotlin.s.c.k implements kotlin.s.b.a<kotlin.o> {
        c(Object obj) {
            super(0, obj, z.class, "onAccessibilityEnabled", "onAccessibilityEnabled()V", 0);
        }

        public final void a() {
            z zVar = (z) this.receiver;
            Objects.requireNonNull(zVar);
            zVar.B(A.a);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ kotlin.o invoke() {
            a();
            return kotlin.o.a;
        }
    }

    /* synthetic */ class d extends kotlin.s.c.k implements kotlin.s.b.a<kotlin.o> {
        d(Object obj) {
            super(0, obj, z.class, "onAccessibilityDisable", "onAccessibilityDisable()V", 0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            z.d((z) this.receiver);
            return kotlin.o.a;
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<ImageViewerPopupWindow> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ImageViewerPopupWindow invoke() {
            return new ImageViewerPopupWindow(IAppGlobals.a.getApplication());
        }
    }

    public static final class f implements IRecognizer.a {
        final /* synthetic */ long a;
        final /* synthetic */ kotlin.s.b.p<String, IRecognizer.e, kotlin.o> b;

        /* JADX WARN: Multi-variable type inference failed */
        f(long j, kotlin.s.b.p<? super String, ? super IRecognizer.e, kotlin.o> pVar) {
            this.a = j;
            this.b = pVar;
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer.a
        public void a(final String str, final IRecognizer.e eVar) {
            kotlin.s.c.l.f(str, "id");
            kotlin.s.c.l.f(eVar, "result");
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            long j = this.a;
            jSONObject.put("isSuccess", true);
            jSONObject.put("duration", System.currentTimeMillis() - j);
            aVar.t("recommend_recognize_finish", jSONObject);
            z zVar = z.a;
            z.j = (IRecognizer.f) eVar;
            z.k = eVar.a();
            z zVar2 = z.a;
            StringBuilder U = e.a.a.a.a.U("recognize onFinish. id: ", str, ", scene:");
            U.append(z.k);
            com.bytedance.android.input.r.j.i("RecommendsManager", U.toString());
            if (eVar instanceof IRecognizer.d) {
            }
            Handler handler = z.b;
            final kotlin.s.b.p<String, IRecognizer.e, kotlin.o> pVar = this.b;
            handler.post(new Runnable() { // from class: com.bytedance.android.input.q.j
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.s.b.p pVar2 = kotlin.s.b.p.this;
                    String str2 = str;
                    IRecognizer.e eVar2 = eVar;
                    kotlin.s.c.l.f(pVar2, "$action");
                    kotlin.s.c.l.f(str2, "$id");
                    kotlin.s.c.l.f(eVar2, "$result");
                    pVar2.invoke(str2, eVar2);
                }
            });
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, String str3) {
            super(2);
            this.a = str;
            this.b = str2;
            this.f3012c = str3;
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(String str, IRecognizer.e eVar) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "id");
            kotlin.s.c.l.f(eVar, "result");
            IRecognizer.a.b(str2);
            Handler handler = z.b;
            final String str3 = this.a;
            final String str4 = this.b;
            final String str5 = this.f3012c;
            handler.post(new Runnable() { // from class: com.bytedance.android.input.q.l
                @Override // java.lang.Runnable
                public final void run() {
                    String str6 = str3;
                    String str7 = str4;
                    String str8 = str5;
                    e.a.a.a.a.u0(str6, "$inputText", str7, "$message", str8, "$mandate");
                    z.v(z.a, str6, str7, str8, true, false, 16);
                }
            });
            return kotlin.o.a;
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
        public static final h a = new h();

        h() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(String str, IRecognizer.e eVar) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "id");
            kotlin.s.c.l.f(eVar, "result");
            IRecognizer.a.b(str2);
            z.b.post(new Runnable() { // from class: com.bytedance.android.input.q.m
                @Override // java.lang.Runnable
                public final void run() {
                    int l;
                    z.h hVar = z.h.a;
                    z zVar = z.a;
                    StringBuilder M = e.a.a.a.a.M("start currentScene=");
                    M.append(z.k);
                    com.bytedance.android.input.r.j.m("RecommendsManager", M.toString());
                    KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
                    l = z.a.l(z.k);
                    keyboardJni.setEnableRecommend(l);
                    KeyboardJni.getKeyboardJni().setRecommendScene(z.k.ordinal());
                }
            });
            return kotlin.o.a;
        }
    }

    private z() {
    }

    public static final void A(LinkedHashMap<String, Boolean> linkedHashMap, int i2) {
        kotlin.s.c.l.f(linkedHashMap, "uris");
        if (linkedHashMap.isEmpty()) {
            return;
        }
        kotlin.e eVar = m;
        ((ImageViewerPopupWindow) eVar.getValue()).n(linkedHashMap, i2);
        com.bytedance.android.input.popup.q.f().m((ImageViewerPopupWindow) eVar.getValue(), 0);
    }

    public static final void C(String str, String str2, String str3) {
        e.a.a.a.a.u0(str, "inputText", str2, "message", str3, "mandate");
        IRecognizer.f fVar = j;
        if ((fVar != null ? fVar.b() : null) != null) {
            v(a, str, str2, str3, true, false, 16);
            return;
        }
        g gVar = new g(str, str2, str3);
        kotlin.s.c.l.f(gVar, "action");
        String b2 = com.bytedance.android.input.common.g.b();
        IRecognizer.a.a(b2).d(b2, new f(System.currentTimeMillis(), gVar), null);
    }

    public static final void F(final List<String> list) {
        kotlin.s.c.l.f(list, "list");
        if (list.isEmpty()) {
            return;
        }
        f3006c.submit(new Runnable() { // from class: com.bytedance.android.input.q.c
            @Override // java.lang.Runnable
            public final void run() {
                z.n(list);
            }
        });
    }

    public static final boolean G() {
        com.bytedance.android.input.r.j.i("RecommendsManager", "start");
        Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
        String str = a.a[k.ordinal()] == 1 ? "RECOMMEND_CHAT_ASSISTANT_ALLOW" : "";
        if (str.length() > 0) {
            IAppGlobals.a aVar = IAppGlobals.a;
            SharedPreferences.Editor edit = aVar.o().edit();
            Objects.requireNonNull(aVar);
            edit.putInt(str, 100309006).apply();
        }
        f3009f = true;
        IAppLog.a aVar2 = IAppLog.a;
        Objects.requireNonNull(aVar2);
        aVar2.i("recommend_start");
        h hVar = h.a;
        kotlin.s.c.l.f(hVar, "action");
        String b2 = com.bytedance.android.input.common.g.b();
        IRecognizer.a.a(b2).d(b2, new f(System.currentTimeMillis(), hVar), null);
        return true;
    }

    public static final void H() {
        KeyboardJni.getService().t();
        i = -1;
        j = null;
        if (f3009f) {
            com.bytedance.android.input.r.j.i("RecommendsManager", "recommend stop report");
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.t("recommend_stop", new JSONObject());
            f3009f = false;
        }
        I();
    }

    public static final void I() {
        com.bytedance.android.input.r.j.i("RecommendsManager", "recommend stopRequest");
        com.bytedance.android.input.q.C.k.h.o();
        com.bytedance.android.input.q.C.w.h.o();
        com.bytedance.android.input.popup.i iVar = f3007d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public static final void d(z zVar) {
        Objects.requireNonNull(zVar);
        IRecognizer.Scene scene = IRecognizer.Scene.UNKNOWN;
        k = scene;
        StringBuilder M = e.a.a.a.a.M("onAccessibilityDisable: currentScene=");
        M.append(k);
        M.append(", setRecommendScene(false)");
        com.bytedance.android.input.r.j.i("RecommendsManager", M.toString());
        KeyboardJni.getKeyboardJni().setEnableRecommend(zVar.l(scene));
        KeyboardJni.getKeyboardJni().setRecommendScene(0);
    }

    public static final void e(z zVar, String str, String str2, String str3) {
        IRecognizer.f fVar = j;
        if ((fVar != null ? fVar.b() : null) == null) {
            com.bytedance.android.input.r.j.i("RecommendsManager", "recognizeAndLoadRecommend conversation is null");
            zVar.B(new B(str, str2, str3));
        } else {
            com.bytedance.android.input.r.j.i("RecommendsManager", "recognizeAndLoadRecommend conv not null, begin loadRecommend");
            v(zVar, str, str2, str3, false, false, 24);
        }
    }

    public static final void h() {
        com.bytedance.android.input.basic.recognition.api.a b2;
        IRecognizer.f fVar = j;
        if (fVar == null || (b2 = fVar.b()) == null) {
            return;
        }
        String a2 = com.bytedance.android.input.common.g.a();
        com.bytedance.android.input.r.j.i("RecommendsManager", "chatAssistantLoadMore call assistantLoadMore");
        com.bytedance.android.input.q.C.k.h.y(b2, a2);
    }

    private final com.bytedance.android.input.popup.i i(final boolean z) {
        final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(IAppGlobals.a.getApplication(), WindowId.CONFIRM_RECOMMEND_PERMISSION, 1, C0838R.layout.layout_aichat_assistant_permission);
        iVar.t(z ? iVar.c().getString(C0838R.string.aichat_permission_content_basic_input_mode) : iVar.c().getString(C0838R.string.aichat_permission_content));
        iVar.setClippingEnabled(false);
        iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.q.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.s(z, iVar, view);
            }
        });
        iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.q.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.r(z, iVar, view);
            }
        });
        return iVar;
    }

    private final com.bytedance.android.input.popup.i j() {
        final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(IAppGlobals.a.getApplication(), WindowId.CONFIRM_RECOMMEND_PERMISSION, 1, C0838R.layout.layout_aichat_assistant_permission);
        iVar.setClippingEnabled(false);
        iVar.A(iVar.c().getString(C0838R.string.aichat_permission_tip_goto_setting));
        final String b2 = com.bytedance.android.input.common.g.b();
        iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.q.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.p(b2, iVar, view);
            }
        });
        iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.q.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str = b2;
                kotlin.s.c.l.f(str, "$pname");
                com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
                com.bytedance.android.input.r.j.i("RecommendsManager", "packagename: " + str + " click goto settings");
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                Intent intent = new Intent(aVar.getContext(), (Class<?>) SettingsActivityNext.class);
                intent.addFlags(268435456);
                intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
                aVar.getContext().startActivity(intent);
            }
        });
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(IRecognizer.Scene scene) {
        int i2 = a.a[scene.ordinal()] == 1 ? 0 : 8;
        com.bytedance.android.input.r.j.i("RecommendsManager", "getPageForScene scene:" + scene);
        SharedPreferences o = IAppGlobals.a.o();
        StringBuilder M = e.a.a.a.a.M("RECOMMEND_TAB_FOR_SCENE_");
        M.append(scene.name());
        return o.getInt(M.toString(), i2);
    }

    public static final IRecognizer.Scene m() {
        return k;
    }

    public static void n(List list) {
        kotlin.s.c.l.f(list, "$list");
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            final Application application = aVar.getApplication();
            ContentResolver contentResolver = application.getContentResolver();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                InputStream openInputStream = contentResolver.openInputStream(Uri.parse(str));
                if (openInputStream != null) {
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                        File externalCacheDir = application.getExternalCacheDir();
                        if (externalCacheDir == null) {
                            externalCacheDir = application.getCacheDir();
                        }
                        File file = new File(externalCacheDir, "share");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, String.valueOf(str.hashCode()));
                        if (!file2.exists()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                com.prolificinteractive.materialcalendarview.r.E(fileOutputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    com.prolificinteractive.materialcalendarview.r.E(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        Uri uriForFile = FileProvider.getUriForFile(application, application.getPackageName() + ".fileprovider", file2, file2.getName() + ".jpg");
                        kotlin.s.c.l.e(uriForFile, "getUriForFile(\n         …                        )");
                        arrayList.add(uriForFile);
                        com.prolificinteractive.materialcalendarview.r.E(openInputStream, null);
                    } finally {
                    }
                }
            }
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.setPackage(com.bytedance.android.input.common.g.b());
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.setType("image/*");
            intent.addFlags(1);
            intent.addFlags(268435456);
            b.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.android.input.q.o
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = application;
                    Intent intent2 = intent;
                    kotlin.s.c.l.f(context, "$context");
                    kotlin.s.c.l.f(intent2, "$shareIntent");
                    context.startActivity(intent2);
                }
            });
        } catch (FileNotFoundException unused) {
        }
    }

    public static void o(View view) {
        IAppLog.a.i("recommend_permission_once_apply");
        KeyboardJni.getKeyboardJni().setAiTabLoadingFlag(true);
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        IAppGlobals.a.o().edit().putInt("RECOMMEND_PERMISSION_USER_SELECT", 2).apply();
        com.bytedance.android.input.q.C.k.h.A(true);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = f3008e;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    public static void p(String str, com.bytedance.android.input.popup.i iVar, View view) {
        kotlin.s.c.l.f(str, "$pname");
        kotlin.s.c.l.f(iVar, "$this_apply");
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        if (kotlin.s.c.l.a(str, "com.tencent.mm")) {
            String string = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_wechat);
            kotlin.s.c.l.e(string, "context.getString(R.stri…ai_chat_assistant_wechat)");
            SettingsConfigNext.l(string, Boolean.FALSE);
        } else if (kotlin.s.c.l.a(str, "com.tencent.mobileqq")) {
            String string2 = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_qq);
            kotlin.s.c.l.e(string2, "context.getString(R.stri…ble_ai_chat_assistant_qq)");
            SettingsConfigNext.l(string2, Boolean.FALSE);
        }
        com.bytedance.android.input.r.j.m("RecommendsManager", "packagename: " + str + " refuse permision");
        com.bytedance.android.input.q.C.k.h.A(false);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = h;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    public static void q(View view) {
        IAppLog.a.i("recommend_permission_apply");
        KeyboardJni.getKeyboardJni().setAiTabLoadingFlag(true);
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        IAppGlobals.a.o().edit().putInt("RECOMMEND_PERMISSION_USER_SELECT", 1).apply();
        com.bytedance.android.input.q.C.k.h.A(true);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = f3008e;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    public static void r(boolean z, com.bytedance.android.input.popup.i iVar, View view) {
        kotlin.s.c.l.f(iVar, "$this_apply");
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        if (z) {
            KeyboardJni.updateSettingsValue(iVar.c().getString(C0838R.string.full_base_input_mode), 0);
        }
        String string = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_all);
        kotlin.s.c.l.e(string, "context.getString(R.stri…le_ai_chat_assistant_all)");
        KeyboardJni.updateSettingsValue(iVar.c().getString(C0838R.string.enable_ai_chat_assistant_all), 1);
        com.bytedance.android.input.r.j.i("RecommendsManager", "getAiChatPermissionPopup key: " + string + ", set value to 1");
        String string2 = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_wechat);
        kotlin.s.c.l.e(string2, "context.getString(R.stri…ai_chat_assistant_wechat)");
        KeyboardJni.updateSettingsBooleanValue(string2, true);
        com.bytedance.android.input.r.j.i("RecommendsManager", "getAiChatPermissionPopup key: " + string2 + ", set value to true");
        String string3 = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_qq);
        kotlin.s.c.l.e(string3, "context.getString(R.stri…ble_ai_chat_assistant_qq)");
        KeyboardJni.updateSettingsBooleanValue(string3, true);
        com.bytedance.android.input.r.j.i("RecommendsManager", "getAiChatPermissionPopup click open");
        com.bytedance.android.input.q.C.k.h.A(true);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = h;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    public static void s(boolean z, com.bytedance.android.input.popup.i iVar, View view) {
        kotlin.s.c.l.f(iVar, "$this_apply");
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        if (!z) {
            kotlin.s.c.l.e(iVar.c().getString(C0838R.string.enable_ai_chat_assistant_all), "context.getString(R.stri…le_ai_chat_assistant_all)");
            KeyboardJni.updateSettingsValue(iVar.c().getString(C0838R.string.enable_ai_chat_assistant_all), 0);
            String string = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_wechat);
            kotlin.s.c.l.e(string, "context.getString(R.stri…ai_chat_assistant_wechat)");
            KeyboardJni.updateSettingsBooleanValue(string, false);
            String string2 = iVar.c().getString(C0838R.string.enable_ai_chat_assistant_qq);
            kotlin.s.c.l.e(string2, "context.getString(R.stri…ble_ai_chat_assistant_qq)");
            KeyboardJni.updateSettingsBooleanValue(string2, false);
        }
        com.bytedance.android.input.r.j.i("RecommendsManager", "getAiChatPermissionPopup click refuse");
        com.bytedance.android.input.q.C.k.h.A(false);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = h;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    public static void t(View view) {
        IAppLog.a.i("recommend_permission_refuse");
        KeyboardJni.getKeyboardJni().setAiTabLoadingFlag(true);
        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_RECOMMEND_PERMISSION);
        IAppGlobals.a.o().edit().putInt("RECOMMEND_PERMISSION_USER_SELECT", 0).apply();
        com.bytedance.android.input.q.C.k.h.A(false);
        kotlin.s.b.l<? super Boolean, kotlin.o> lVar = f3008e;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    public static /* synthetic */ void v(z zVar, String str, String str2, String str3, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        zVar.u(str, str2, str3, z, z2);
    }

    public static final void x(int i2, boolean z, String str, String str2, String str3, boolean z2) {
        e.a.a.a.a.u0(str, "inputText", str2, "message", str3, "mandate");
        com.bytedance.android.input.popup.i iVar = f3007d;
        if (iVar != null) {
            iVar.dismiss();
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i;
        if (i3 != i2 && z2) {
            switch (i3) {
                case 0:
                    com.bytedance.android.input.q.C.k.h.o();
                    break;
                case 1:
                    com.bytedance.android.input.q.C.x.h.o();
                    break;
                case 2:
                    com.bytedance.android.input.q.C.m.h.o();
                    break;
                case 3:
                    com.bytedance.android.input.q.C.q.h.o();
                    break;
                case 4:
                    com.bytedance.android.input.q.C.n.h.o();
                    break;
                case 5:
                    com.bytedance.android.input.q.C.j.h.o();
                    break;
                case 6:
                    com.bytedance.android.input.q.C.p.h.o();
                    break;
                case 7:
                    com.bytedance.android.input.q.C.o.h.o();
                    break;
                case 8:
                    com.bytedance.android.input.q.C.s.h.o();
                    break;
                case 9:
                    com.bytedance.android.input.q.C.h.h.o();
                    break;
                case 10:
                    com.bytedance.android.input.q.C.i.h.o();
                    break;
                case 11:
                    com.bytedance.android.input.q.C.d.h.o();
                    break;
                case 12:
                    com.bytedance.android.input.q.C.e.h.o();
                    break;
                case 13:
                    com.bytedance.android.input.q.C.w.h.o();
                    break;
            }
        }
        z zVar = a;
        i = i2;
        StringBuilder M = e.a.a.a.a.M("onPageChange: currentPage=");
        M.append(i);
        M.append(", currentScene=");
        M.append(k);
        com.bytedance.android.input.r.j.m("RecommendsManager", M.toString());
        com.bytedance.android.input.r.j.i("RecommendsManager", "onPageChange page=" + i2 + ", loading=" + z + ", inputText:" + str + ", message=" + str2 + ", mandate=" + str3);
        int i4 = i;
        if (i4 != 0 && i4 != 13) {
            SharedPreferences.Editor edit = IAppGlobals.a.o().edit();
            StringBuilder M2 = e.a.a.a.a.M("RECOMMEND_TAB_FOR_SCENE_");
            M2.append(k.name());
            edit.putInt(M2.toString(), i).apply();
            KeyboardJni.getKeyboardJni().setEnableRecommend(i);
        } else {
            if (k != IRecognizer.Scene.CHAT) {
                com.bytedance.android.input.r.j.m("RecommendsManager", "scene not chat");
                return;
            }
            SharedPreferences.Editor edit2 = IAppGlobals.a.o().edit();
            StringBuilder M3 = e.a.a.a.a.M("RECOMMEND_TAB_FOR_SCENE_");
            M3.append(k.name());
            edit2.putInt(M3.toString(), 0).apply();
            KeyboardJni.getKeyboardJni().setEnableRecommend(0);
        }
        if (z) {
            int i5 = i;
            if (i5 == 0 || i5 == 13) {
                zVar.D(new b(str, str2, str3));
            } else {
                zVar.u(str, str2, str3, false, true);
            }
        }
    }

    public static /* synthetic */ void y(int i2, boolean z, String str, String str2, String str3, boolean z2, int i3) {
        String str4 = (i3 & 4) != 0 ? "" : str;
        String str5 = (i3 & 8) != 0 ? "" : str2;
        String str6 = (i3 & 16) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            z2 = true;
        }
        x(i2, z, str4, str5, str6, z2);
    }

    public final String B(kotlin.s.b.p<? super String, ? super IRecognizer.e, kotlin.o> pVar) {
        kotlin.s.c.l.f(pVar, "action");
        String b2 = com.bytedance.android.input.common.g.b();
        return IRecognizer.a.a(b2).d(b2, new f(System.currentTimeMillis(), pVar), null);
    }

    public final void D(kotlin.s.b.l<? super Boolean, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        com.bytedance.android.input.r.j.i("RecommendsManager", "requestAiChatPermission: currentScene=" + k);
        if (k != IRecognizer.Scene.CHAT) {
            StringBuilder M = e.a.a.a.a.M("not support scene=");
            M.append(k);
            com.bytedance.android.input.r.j.j("RecommendsManager", M.toString());
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        int intValue = ((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "context.getString(R.string.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue == 1) {
            h = lVar;
            f3010g = i(intValue == 1);
            com.bytedance.android.input.popup.q.f().m(f3010g, 0);
            return;
        }
        String string = aVar.getContext().getString(C0838R.string.enable_ai_chat_assistant_all);
        kotlin.s.c.l.e(string, "context.getString(R.stri…le_ai_chat_assistant_all)");
        if (!kotlin.s.c.l.a(SettingsConfigNext.f(string), 1)) {
            com.bytedance.android.input.r.j.i("RecommendsManager", "show aiChatPopupPermission window");
            h = lVar;
            f3010g = i(false);
            com.bytedance.android.input.popup.q.f().m(f3010g, 0);
            return;
        }
        String b2 = com.bytedance.android.input.common.g.b();
        if (kotlin.s.c.l.a(b2, "com.tencent.mm")) {
            String string2 = aVar.getContext().getString(C0838R.string.enable_ai_chat_assistant_wechat);
            kotlin.s.c.l.e(string2, "context.getString(R.stri…ai_chat_assistant_wechat)");
            Object f2 = SettingsConfigNext.f(string2);
            Boolean bool = Boolean.TRUE;
            if (kotlin.s.c.l.a(f2, bool)) {
                com.bytedance.android.input.q.C.k.h.A(true);
                lVar.invoke(bool);
                return;
            } else {
                h = lVar;
                f3010g = j();
                com.bytedance.android.input.popup.q.f().m(f3010g, 0);
                return;
            }
        }
        if (!kotlin.s.c.l.a(b2, "com.tencent.mobileqq")) {
            lVar.invoke(Boolean.FALSE);
            return;
        }
        String string3 = aVar.getContext().getString(C0838R.string.enable_ai_chat_assistant_qq);
        kotlin.s.c.l.e(string3, "context.getString(R.stri…ble_ai_chat_assistant_qq)");
        Object f3 = SettingsConfigNext.f(string3);
        Boolean bool2 = Boolean.TRUE;
        if (kotlin.s.c.l.a(f3, bool2)) {
            com.bytedance.android.input.q.C.k.h.A(true);
            lVar.invoke(bool2);
        } else {
            h = lVar;
            f3010g = j();
            com.bytedance.android.input.popup.q.f().m(f3010g, 0);
        }
    }

    public final void E(kotlin.s.b.l<? super Boolean, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        com.bytedance.android.input.r.j.i("RecommendsManager", "requestPermission: currentScene=" + k);
        if (k != IRecognizer.Scene.CHAT) {
            StringBuilder M = e.a.a.a.a.M("not support scene: {");
            M.append(k);
            M.append('}');
            com.bytedance.android.input.r.j.j("RecommendsManager", M.toString());
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        int i2 = aVar.o().getInt("RECOMMEND_PERMISSION_USER_SELECT", -1);
        if (i2 == 0) {
            ((v.b) lVar).invoke(Boolean.FALSE);
            return;
        }
        if (i2 == 2) {
            ((v.b) lVar).invoke(Boolean.TRUE);
            return;
        }
        f3008e = lVar;
        com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(aVar.getApplication(), WindowId.CONFIRM_RECOMMEND_PERMISSION, 1, C0838R.layout.layout_ai_permission);
        iVar.setClippingEnabled(false);
        iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.q.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.t(view);
            }
        });
        iVar.x(new View.OnClickListener() { // from class: com.bytedance.android.input.q.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.q(view);
            }
        });
        iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.q.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.o(view);
            }
        });
        f3007d = iVar;
        com.bytedance.android.input.popup.q.f().m(f3007d, 0);
        KeyboardJni.getKeyboardJni().setAiTabLoadingFlag(false);
        IAppLog.a.i("recommend_permission_show");
    }

    public final IRecommends.Data.Source k() {
        switch (i) {
            case 0:
                return IRecommends.Data.Source.CHAT;
            case 1:
                return IRecommends.Data.Source.POPULAR;
            case 2:
                return IRecommends.Data.Source.CIRCLE;
            case 3:
                return IRecommends.Data.Source.MAIL;
            case 4:
                return IRecommends.Data.Source.EVALUATE;
            case 5:
                return IRecommends.Data.Source.BLESSING;
            case 6:
                return IRecommends.Data.Source.INVITATION;
            case 7:
                return IRecommends.Data.Source.INTRODUCTION;
            case 8:
                return IRecommends.Data.Source.OPTIMIZE;
            case 9:
                return IRecommends.Data.Source.REWRITE;
            case 10:
                return IRecommends.Data.Source.SUMMARY;
            case 11:
                return IRecommends.Data.Source.KEYPOINTS;
            case 12:
                return IRecommends.Data.Source.LIST;
            case 13:
                return IRecommends.Data.Source.BAIKE;
            default:
                return IRecommends.Data.Source.OPTIMIZE;
        }
    }

    public final void u(String str, String str2, String str3, boolean z, boolean z2) {
        IRecommends.Data.Source source;
        com.bytedance.android.input.basic.recognition.api.a a2;
        kotlin.s.c.l.f(str, "inputText");
        kotlin.s.c.l.f(str2, "message");
        kotlin.s.c.l.f(str3, "mandate");
        StringBuilder sb = new StringBuilder();
        sb.append("loadRecommend currentPage: ");
        e.a.a.a.a.B0(sb, i, "RecommendsManager");
        switch (i) {
            case 0:
                source = IRecommends.Data.Source.CHAT;
                break;
            case 1:
                source = IRecommends.Data.Source.POPULAR;
                break;
            case 2:
                source = IRecommends.Data.Source.CIRCLE;
                break;
            case 3:
                source = IRecommends.Data.Source.MAIL;
                break;
            case 4:
                source = IRecommends.Data.Source.EVALUATE;
                break;
            case 5:
                source = IRecommends.Data.Source.BLESSING;
                break;
            case 6:
                source = IRecommends.Data.Source.INVITATION;
                break;
            case 7:
                source = IRecommends.Data.Source.INTRODUCTION;
                break;
            case 8:
                source = IRecommends.Data.Source.OPTIMIZE;
                break;
            case 9:
                source = IRecommends.Data.Source.REWRITE;
                break;
            case 10:
                source = IRecommends.Data.Source.SUMMARY;
                break;
            case 11:
                source = IRecommends.Data.Source.KEYPOINTS;
                break;
            case 12:
                source = IRecommends.Data.Source.LIST;
                break;
            case 13:
                source = IRecommends.Data.Source.BAIKE;
                break;
            default:
                source = IRecommends.Data.Source.OPTIMIZE;
                break;
        }
        IRecognizer.f fVar = j;
        if (!z2 && fVar == null) {
            com.bytedance.android.input.r.j.j("RecommendsManager", "loadRecommend recognizeResult failed result=" + fVar);
            int ordinal = source.ordinal();
            if (ordinal == 0 || ordinal == 14) {
                AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
                IRecommends.Data.Type type = IRecommends.Data.Type.ERROR;
                source.ordinal();
                aiChatMenuViewModel.g(true, "加载失败", type);
            }
            C0601v c0601v = C0601v.a;
            IRecommends.Data.Type type2 = IRecommends.Data.Type.ERROR;
            source.ordinal();
            c0601v.z(true, "加载失败", type2);
            return;
        }
        String a3 = kotlin.text.a.s(str) ^ true ? str : kotlin.text.a.s(str3) ? com.bytedance.android.input.common.g.a() : kotlin.text.a.s(str2) ? com.bytedance.android.input.common.g.a() : str2;
        e.a.a.a.a.r0("currentInput: ", a3, "RecommendsManager");
        if (fVar == null || (a2 = fVar.b()) == null) {
            a2 = com.bytedance.android.input.basic.recognition.api.a.f2075e.a("");
        }
        com.bytedance.android.input.basic.recognition.api.a aVar = a2;
        if (i == 0) {
            IAppLog.a aVar2 = IAppLog.a;
            Objects.requireNonNull(aVar2);
            aVar2.t("Input_smartreply", new JSONObject());
        } else {
            IAppLog.a aVar3 = IAppLog.a;
            Objects.requireNonNull(aVar3);
            aVar3.t("Input_refinish", new JSONObject());
        }
        switch (i) {
            case 0:
                com.bytedance.android.input.q.C.k.h.x(aVar, a3);
                break;
            case 1:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.x.h, aVar, a3, str3, z, IRecommends.Data.Source.POPULAR, null, 32, null);
                break;
            case 2:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.m.h, aVar, a3, str3, z, IRecommends.Data.Source.CIRCLE, null, 32, null);
                break;
            case 3:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.q.h, aVar, a3, str3, z, IRecommends.Data.Source.MAIL, null, 32, null);
                break;
            case 4:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.n.h, aVar, a3, str3, z, IRecommends.Data.Source.EVALUATE, null, 32, null);
                break;
            case 5:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.j.h, aVar, a3, str3, z, IRecommends.Data.Source.BLESSING, null, 32, null);
                break;
            case 6:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.p.h, aVar, a3, str3, z, IRecommends.Data.Source.INVITATION, null, 32, null);
                break;
            case 7:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.o.h, aVar, a3, str3, z, IRecommends.Data.Source.INTRODUCTION, null, 32, null);
                break;
            case 8:
                com.bytedance.android.input.q.C.v.j(com.bytedance.android.input.q.C.s.h, aVar, a3, str3, z, IRecommends.Data.Source.OPTIMIZE, null, 32, null);
                break;
            case 9:
                com.bytedance.android.input.q.C.h.h.i(aVar, a3, str3, z, IRecommends.Data.Source.REWRITE, str2);
                break;
            case 10:
                com.bytedance.android.input.q.C.i.h.i(aVar, a3, str3, z, IRecommends.Data.Source.SUMMARY, str2);
                break;
            case 11:
                com.bytedance.android.input.q.C.d.h.i(aVar, a3, str3, z, IRecommends.Data.Source.KEYPOINTS, str2);
                break;
            case 12:
                com.bytedance.android.input.q.C.e.h.i(aVar, a3, str3, z, IRecommends.Data.Source.LIST, str2);
                break;
            case 13:
                com.bytedance.android.input.r.j.i("RecommendsManager", "currentPage is baike, begin request");
                com.bytedance.android.input.q.C.w.h.i(aVar, a3, str3, z, IRecommends.Data.Source.BAIKE, str2);
                break;
        }
    }

    public final void w() {
        InputView inputView = ImeService.x;
        if (inputView != null && inputView.y()) {
            return;
        }
        com.bytedance.android.input.r.j.i("RecommendsManager", "onFinishInput");
        l = "";
        com.bytedance.android.input.q.C.r.a.b();
        H();
    }

    public final void z(String str) {
        String b2 = str == null ? com.bytedance.android.input.common.g.b() : str;
        IRecognizer.b bVar = IRecognizer.a;
        IRecognizer a2 = bVar.a(b2);
        IAppGlobals.a aVar = IAppGlobals.a;
        if (aVar.F() || bVar.a(b2).isEnabled()) {
            if (bVar.a(b2).a(b2)) {
                if (!aVar.F() && !kotlin.s.c.l.a(l, str)) {
                    B(A.a);
                }
                a2.c(new c(this));
                a2.e(new d(this));
                com.bytedance.android.input.r.j.i("RecommendsManager", "onStartInput wait onAccessibilityEnabled, packageName = " + str);
                Objects.requireNonNull(com.bytedance.android.input.keyboard.r.a());
            } else {
                IRecognizer.Scene scene = IRecognizer.Scene.UNKNOWN;
                k = scene;
                KeyboardJni.getKeyboardJni().setEnableRecommend(l(scene));
                KeyboardJni.getKeyboardJni().setRecommendScene(0);
                com.bytedance.android.input.r.j.i("RecommendsManager", "onStartInput setRecommendScene(false), currentScene = " + k + ", packageName = " + str);
            }
        }
        l = b2;
    }
}
