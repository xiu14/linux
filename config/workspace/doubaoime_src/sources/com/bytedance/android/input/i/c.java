package com.bytedance.android.input.i;

import android.content.ClipboardManager;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.editor.SelectionTracker;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.toolbar.clipboard.i;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.r.j;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g;
import kotlin.e;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static final c a = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2442d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f2443e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2444f;

    /* renamed from: g, reason: collision with root package name */
    private static int f2445g;
    private static int h;
    private static int i;
    private static final e b = kotlin.a.c(b.a);

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f2441c = new Handler(Looper.getMainLooper());
    private static final List<String> j = g.G("ttcbeyJrZXkiOiJ6bGlua19zY2hlbWVfbW", "677e2163cbeed74442e2247e57577098", "2233 DGYSNSYmlsaWJpbGk6Ly92aWRlby8xMTU0", "eyJ1cmwiOiJmbGVhbWFya2V0Oi8vaXRlbT9pZD", "dps://p?url=https%3A%2F%2Fmain.m.taobao.com%2Fdetail%2Findex.html%3F");
    private static final Object k = new Object();
    private static final List<WeakReference<a>> l = new ArrayList();
    private static final Runnable m = new Runnable() { // from class: com.bytedance.android.input.i.a
        @Override // java.lang.Runnable
        public final void run() {
            c.f();
        }
    };
    private static final ClipboardManager.OnPrimaryClipChangedListener n = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: com.bytedance.android.input.i.b
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            c.g();
        }
    };

    public interface a {
        void a(String str);
    }

    static final class b extends m implements kotlin.s.b.a<ClipboardManager> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ClipboardManager invoke() {
            Object systemService = IAppGlobals.a.getApplication().getSystemService("clipboard");
            l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            return (ClipboardManager) systemService;
        }
    }

    /* renamed from: com.bytedance.android.input.i.c$c, reason: collision with other inner class name */
    static final class C0076c extends m implements kotlin.s.b.l<WordSegmentationData, o> {
        public static final C0076c a = new C0076c();

        C0076c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(WordSegmentationData wordSegmentationData) {
            WordSegmentationData wordSegmentationData2 = wordSegmentationData;
            l.f(wordSegmentationData2, RemoteMessageConst.DATA);
            j.i("ImeClipboardManager", "isTypingInput = " + KeyboardJni.getKeyboardJni().isTypingInput() + "---isAssociate = " + KeyboardJni.getKeyboardJni().isAssociate() + "---data ? " + wordSegmentationData2);
            if (!KeyboardJni.getKeyboardJni().isTypingInput()) {
                KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
                KeyboardJni.ToolbarState toolbarState = KeyboardJni.ToolbarState.kToolbar;
                keyboardJni.setToolbarState(0);
            }
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.b0(ToolbarType.CLIPBOARD, new i(wordSegmentationData2));
            }
            return o.a;
        }
    }

    public static final void a(a aVar) {
        l.f(aVar, "listener");
        synchronized (k) {
            Iterator<WeakReference<a>> it2 = l.iterator();
            while (it2.hasNext()) {
                a aVar2 = it2.next().get();
                if (aVar2 == null || aVar2 == aVar) {
                    it2.remove();
                }
            }
            l.add(new WeakReference<>(aVar));
        }
    }

    public static final void b() {
        e().addPrimaryClipChangedListener(n);
    }

    public static final void c() {
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.CLIPBOARD, null, 2, null);
        }
    }

    public static final void d() {
        if (f2442d) {
            k();
        }
        f2442d = true;
        f2443e = false;
        f2444f = com.bytedance.android.input.common.g.a().length() > 0;
    }

    private static final ClipboardManager e() {
        return (ClipboardManager) b.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:10|(1:106)(1:14)|15|(11:17|(1:19)(1:104)|20|(3:22|(1:24)(1:27)|25)|28|29|30|31|(1:33)(2:98|(1:100)(1:101))|34|(2:36|37)(3:38|(2:39|(3:41|(1:43)(1:94)|(1:92)(1:48))(2:95|96))|(2:50|51)(2:52|(2:54|55)(6:56|(5:58|17d|75|(2:78|76)|79)|83|(1:85)|86|(2:88|89)(1:90)))))|105|29|30|31|(0)(0)|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00a5, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a6, code lost:
    
        r4.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (kotlin.text.a.j(r0 != null ? r0.toString() : null, "[Image]", false, 2, null) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0086 A[Catch: JSONException -> 0x00a5, TryCatch #0 {JSONException -> 0x00a5, blocks: (B:31:0x007c, B:34:0x0098, B:98:0x0086), top: B:30:0x007c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.i.c.f():void");
    }

    public static void g() {
        Handler handler = f2441c;
        Runnable runnable = m;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 100L);
    }

    public static final void h(SelectionTracker.ActionType actionType) {
        l.f(actionType, "actionType");
        if (f2442d) {
            j.i("ImeClipboardManager", "actionType = " + actionType);
            if (!f2443e && actionType == SelectionTracker.ActionType.INNER_COMMIT) {
                f2443e = true;
                return;
            }
            if (actionType == SelectionTracker.ActionType.INNER_COMMIT || actionType == SelectionTracker.ActionType.INNER_ENTER || actionType == SelectionTracker.ActionType.INNER_VOICE_COMMIT) {
                h++;
            } else if (actionType == SelectionTracker.ActionType.INNER_DELETE) {
                f2445g++;
            } else if (actionType == SelectionTracker.ActionType.INNER_CLEAR) {
                i++;
            }
        }
    }

    public static final void i(a aVar) {
        l.f(aVar, "listener");
        synchronized (k) {
            Iterator<WeakReference<a>> it2 = l.iterator();
            while (it2.hasNext()) {
                a aVar2 = it2.next().get();
                if (aVar2 == null || aVar2 == aVar) {
                    it2.remove();
                }
            }
        }
    }

    public static final void j() {
        e().removePrimaryClipChangedListener(n);
    }

    public static final void k() {
        if (f2442d) {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("have_text", f2444f);
            jSONObject.put("modify_delete", f2445g);
            jSONObject.put("modify_add", h);
            jSONObject.put("modify_clear", i);
            aVar.t("clipboard_edit", jSONObject);
            f2442d = false;
            f2444f = false;
            h = 0;
            f2445g = 0;
            i = 0;
        }
    }
}
