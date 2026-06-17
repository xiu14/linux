package com.bytedance.android.input.keyboard.s.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.keyboard.gif.list_layout.models.h;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.speech.IRequests;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.retrofit2.N;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    private static final Handler b = new Handler(Looper.getMainLooper());

    public static final class a extends com.google.gson.u.a<com.bytedance.android.input.keyboard.gif.list_layout.models.a> {
    }

    public static final class b extends com.google.gson.u.a<com.bytedance.android.input.keyboard.gif.list_layout.models.c> {
    }

    static final class c extends m implements l<Boolean, o> {
        final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.d a;
        final /* synthetic */ l<Boolean, o> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(com.bytedance.android.input.keyboard.gif.list_layout.models.d dVar, l<? super Boolean, o> lVar) {
            super(1);
            this.a = dVar;
            this.b = lVar;
        }

        @Override // kotlin.s.b.l
        public o invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                IAppGlobals.a.o().edit().putInt("emoticons_version_code", this.a.c()).apply();
            }
            this.b.invoke(Boolean.valueOf(booleanValue));
            return o.a;
        }
    }

    public static final class d extends com.google.gson.u.a<h> {
    }

    private f() {
    }

    private final void b(String str, l<? super Boolean, o> lVar) {
        Object J2;
        e.a.a.a.a.r0("downloadEmoticons = pkgUrl = ", str, "ImeEmoticons-Api");
        try {
            final String str2 = "EmotionPictureDictType";
            IEnvironment.a aVar = IEnvironment.a;
            Objects.requireNonNull(aVar);
            boolean f2 = RetrofitUtils.f(-1, str, aVar.l(), null, "EmotionPictureDictType", null, null, null, null, null);
            if (f2) {
                File file = new File(aVar.l(), "5a272508274f");
                File file2 = new File(aVar.l(), "EmotionPictureDictType");
                if (file2.exists()) {
                    if (file.exists()) {
                        file.delete();
                    }
                    file2.renameTo(file);
                    b.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.s.a.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = str2;
                            kotlin.s.c.l.f(str3, "$fileName");
                            e.a.a.a.a.j0("downloadEmoticons = success, status = ", KeyboardJni.getKeyboardJni().updateAdditionalDict(str3), "ImeEmoticons-Api");
                        }
                    });
                } else {
                    j.i("ImeEmoticons-Api", "downloadEmoticons = success, oldFile not exist");
                }
            } else {
                j.i("ImeEmoticons-Api", "downloadEmoticons = fail");
            }
            ((c) lVar).invoke(Boolean.valueOf(f2));
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.P0(b2, e.a.a.a.a.M("downloadEmoticons exception = "), "ImeEmoticons-Api");
            ((c) lVar).invoke(Boolean.FALSE);
        }
    }

    private final int e(ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> arrayList) {
        Iterator<com.bytedance.android.input.keyboard.gif.list_layout.models.b> it2 = arrayList.iterator();
        kotlin.s.c.l.e(it2, "list.iterator()");
        int i = 0;
        while (it2.hasNext()) {
            com.bytedance.android.input.keyboard.gif.list_layout.models.b next = it2.next();
            kotlin.s.c.l.e(next, "iterator.next()");
            if (TextUtils.isEmpty(next.c())) {
                i++;
                it2.remove();
            }
        }
        return i;
    }

    public final void a(com.google.gson.l lVar) {
        Object J2;
        kotlin.s.c.l.f(lVar, "commitJson");
        j.i("ImeEmoticons-Api", "commitRecord = commitJson = " + lVar);
        try {
            N<String> execute = IRequests.a.c().commitRecord(lVar, true).execute();
            if (execute.f()) {
                j.i("ImeEmoticons-Api", "commitRecord = success");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("commitRecord failure code = ");
                sb.append(execute.b());
                sb.append("---message = ");
                execute.g();
                sb.append((String) null);
                j.i("ImeEmoticons-Api", sb.toString());
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.P0(b2, e.a.a.a.a.M("commitRecord exception = "), "ImeEmoticons-Api");
        }
    }

    public final void c(int i, int i2, final l<? super com.bytedance.android.input.keyboard.gif.list_layout.models.a, o> lVar, final p<? super Integer, ? super String, o> pVar) {
        Object J2;
        ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> a2;
        ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> a3;
        kotlin.s.c.l.f(lVar, "onSuccess");
        kotlin.s.c.l.f(pVar, "onFailure");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(MonitorConstants.SIZE, Integer.valueOf(i));
        hashMap.put("page", Integer.valueOf(i2));
        j.i("ImeEmoticons-Api", "hostList start request params = " + hashMap);
        try {
            j.i("ImeEmoticons-Api", "prepare request");
            N<String> execute = IRequests.a.c().hotList(hashMap, true).execute();
            com.bytedance.android.input.basic.network.d.b bVar = com.bytedance.android.input.basic.network.d.b.a;
            kotlin.s.c.l.e(execute, "hotList");
            int i3 = 0;
            Type e2 = com.google.gson.u.a.c(com.bytedance.android.input.basic.network.b.a.class, new a().e()).e();
            kotlin.s.c.l.e(e2, "responseType");
            final com.bytedance.android.input.basic.network.b.a b2 = bVar.b(execute, e2);
            com.bytedance.android.input.keyboard.gif.list_layout.models.a aVar = (com.bytedance.android.input.keyboard.gif.list_layout.models.a) b2.b();
            Integer valueOf = (aVar == null || (a3 = aVar.a()) == null) ? null : Integer.valueOf(a3.size());
            com.bytedance.android.input.keyboard.gif.list_layout.models.a aVar2 = (com.bytedance.android.input.keyboard.gif.list_layout.models.a) b2.b();
            if (aVar2 != null && (a2 = aVar2.a()) != null) {
                i3 = e(a2);
            }
            j.i("ImeEmoticons-Api", "hostList parse finish code = " + b2.a() + ", message = " + b2.c() + "---originDataSize = " + valueOf + "---removeCount = " + i3);
            J2 = Boolean.valueOf(b.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.s.a.b
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar;
                    com.bytedance.android.input.basic.network.b.a aVar3 = com.bytedance.android.input.basic.network.b.a.this;
                    f fVar = this;
                    p pVar2 = pVar;
                    l lVar2 = lVar;
                    kotlin.s.c.l.f(aVar3, "$responseResult");
                    kotlin.s.c.l.f(fVar, "$this_runCatching");
                    kotlin.s.c.l.f(pVar2, "$onFailure");
                    kotlin.s.c.l.f(lVar2, "$onSuccess");
                    if (!aVar3.d()) {
                        pVar2.invoke(Integer.valueOf(aVar3.a()), aVar3.c());
                        return;
                    }
                    com.bytedance.android.input.keyboard.gif.list_layout.models.a aVar4 = (com.bytedance.android.input.keyboard.gif.list_layout.models.a) aVar3.b();
                    if (aVar4 != null) {
                        lVar2.invoke(aVar4);
                        oVar = o.a;
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
                        Integer valueOf2 = Integer.valueOf(aVar3.a());
                        StringBuilder M = e.a.a.a.a.M("data is null, raw message = ");
                        M.append(aVar3.c());
                        pVar2.invoke(valueOf2, M.toString());
                    }
                }
            }));
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        final Throwable b3 = kotlin.h.b(J2);
        if (b3 != null) {
            e.a.a.a.a.P0(b3, e.a.a.a.a.M("hostList exception = "), "ImeEmoticons-Api");
            b.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.s.a.c
                @Override // java.lang.Runnable
                public final void run() {
                    p pVar2 = p.this;
                    Throwable th2 = b3;
                    kotlin.s.c.l.f(pVar2, "$onFailure");
                    kotlin.s.c.l.f(th2, "$it");
                    StringBuilder M = e.a.a.a.a.M("hostList exception = ");
                    M.append(kotlin.a.d(th2));
                    pVar2.invoke(-1, M.toString());
                }
            });
        }
    }

    public final void d(int i, int i2, String str, final l<? super com.bytedance.android.input.keyboard.gif.list_layout.models.c, o> lVar, final p<? super Integer, ? super String, o> pVar) {
        Object J2;
        ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> a2;
        ArrayList<com.bytedance.android.input.keyboard.gif.list_layout.models.b> a3;
        kotlin.s.c.l.f(str, "query");
        kotlin.s.c.l.f(lVar, "onSuccess");
        kotlin.s.c.l.f(pVar, "onFailure");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(MonitorConstants.SIZE, Integer.valueOf(i));
        hashMap.put("page", Integer.valueOf(i2));
        hashMap.put("query", str);
        j.i("ImeEmoticons-Api", "query start request params = " + hashMap);
        try {
            N<String> execute = IRequests.a.c().queryByContext(hashMap, true).execute();
            com.bytedance.android.input.basic.network.d.b bVar = com.bytedance.android.input.basic.network.d.b.a;
            kotlin.s.c.l.e(execute, "queryByContext");
            int i3 = 0;
            Type e2 = com.google.gson.u.a.c(com.bytedance.android.input.basic.network.b.a.class, new b().e()).e();
            kotlin.s.c.l.e(e2, "responseType");
            final com.bytedance.android.input.basic.network.b.a b2 = bVar.b(execute, e2);
            com.bytedance.android.input.keyboard.gif.list_layout.models.c cVar = (com.bytedance.android.input.keyboard.gif.list_layout.models.c) b2.b();
            Integer valueOf = (cVar == null || (a3 = cVar.a()) == null) ? null : Integer.valueOf(a3.size());
            com.bytedance.android.input.keyboard.gif.list_layout.models.c cVar2 = (com.bytedance.android.input.keyboard.gif.list_layout.models.c) b2.b();
            if (cVar2 != null && (a2 = cVar2.a()) != null) {
                i3 = e(a2);
            }
            j.i("ImeEmoticons-Api", "query parse finish code = " + b2.a() + ", message = " + b2.c() + "---originDataSize = " + valueOf + "---removeCount = " + i3);
            J2 = Boolean.valueOf(b.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.s.a.e
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar;
                    com.bytedance.android.input.basic.network.b.a aVar = com.bytedance.android.input.basic.network.b.a.this;
                    f fVar = this;
                    p pVar2 = pVar;
                    l lVar2 = lVar;
                    kotlin.s.c.l.f(aVar, "$responseResult");
                    kotlin.s.c.l.f(fVar, "$this_runCatching");
                    kotlin.s.c.l.f(pVar2, "$onFailure");
                    kotlin.s.c.l.f(lVar2, "$onSuccess");
                    if (!aVar.d()) {
                        pVar2.invoke(Integer.valueOf(aVar.a()), aVar.c());
                        return;
                    }
                    com.bytedance.android.input.keyboard.gif.list_layout.models.c cVar3 = (com.bytedance.android.input.keyboard.gif.list_layout.models.c) aVar.b();
                    if (cVar3 != null) {
                        lVar2.invoke(cVar3);
                        oVar = o.a;
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
                        Integer valueOf2 = Integer.valueOf(aVar.a());
                        StringBuilder M = e.a.a.a.a.M("query data is null, raw message = ");
                        M.append(aVar.c());
                        pVar2.invoke(valueOf2, M.toString());
                    }
                }
            }));
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        final Throwable b3 = kotlin.h.b(J2);
        if (b3 != null) {
            e.a.a.a.a.P0(b3, e.a.a.a.a.M("query exception = "), "ImeEmoticons-Api");
            b.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.s.a.d
                @Override // java.lang.Runnable
                public final void run() {
                    p pVar2 = p.this;
                    Throwable th2 = b3;
                    kotlin.s.c.l.f(pVar2, "$onFailure");
                    kotlin.s.c.l.f(th2, "$it");
                    StringBuilder M = e.a.a.a.a.M("query exception = ");
                    M.append(kotlin.a.d(th2));
                    pVar2.invoke(-1, M.toString());
                }
            });
        }
    }

    public final boolean f(l<? super Boolean, o> lVar) {
        o oVar;
        kotlin.s.c.l.f(lVar, "actionDownLoadFile");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("channel", "emoticons_words");
        hashMap.put(WsConstants.KEY_PLATFORM, DownloadSettingKeys.BugFix.DEFAULT);
        hashMap.put("history_version", Boolean.FALSE);
        hashMap.put("version_code", Integer.valueOf(IAppGlobals.a.o().getInt("emoticons_version_code", 1)));
        j.i("ImeEmoticons-Api", "wordVersionUpdate start request params = " + hashMap);
        try {
            N<String> execute = IRequests.a.c().wordsVersion(hashMap, true).execute();
            com.bytedance.android.input.basic.network.d.b bVar = com.bytedance.android.input.basic.network.d.b.a;
            kotlin.s.c.l.e(execute, "queryByContext");
            Type e2 = com.google.gson.u.a.c(com.bytedance.android.input.basic.network.b.a.class, new d().e()).e();
            kotlin.s.c.l.e(e2, "responseType");
            com.bytedance.android.input.basic.network.b.a b2 = bVar.b(execute, e2);
            if (b2.d() && b2.a() == 0) {
                j.i("ImeEmoticons-Api", "wordVersionUpdate = success, data = " + b2.b() + "， queryByContext = " + execute.a());
                h hVar = (h) b2.b();
                if (hVar != null) {
                    for (com.bytedance.android.input.keyboard.gif.list_layout.models.d dVar : hVar.a()) {
                        if (kotlin.s.c.l.a(dVar.a(), "emoticons_words")) {
                            if (dVar.d()) {
                                j.i("ImeEmoticons-Api", "wordVersionUpdate = new version");
                                b(dVar.b(), new c(dVar, lVar));
                            } else {
                                j.i("ImeEmoticons-Api", "wordVersionUpdate = not new version");
                            }
                        }
                    }
                    oVar = o.a;
                } else {
                    oVar = null;
                }
                if (oVar == null) {
                    j.i("ImeEmoticons-Api", "wordVersionUpdate = data is null");
                }
            } else {
                j.i("ImeEmoticons-Api", "wordVersionUpdate failure code = " + b2.a() + "---message = " + b2.c());
            }
            return b2.d();
        } catch (Throwable th) {
            Throwable b3 = kotlin.h.b(r.J(th));
            if (b3 != null) {
                e.a.a.a.a.P0(b3, e.a.a.a.a.M("wordVersionUpdate exception = "), "ImeEmoticons-Api");
            }
            return false;
        }
    }
}
