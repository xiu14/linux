package com.bytedance.android.input.fragment.message.data;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.fragment.message.entity.MessageState;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class i implements e {
    public static final i a = new i();

    private i() {
    }

    private final File e() {
        File file = new File(IEnvironment.a.k(), "storage_dir");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "message_list.store");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        return file2;
    }

    private final com.bytedance.android.input.fragment.message.entity.a f() {
        File e2 = e();
        if (!e2.exists() || e2.length() <= 0) {
            return new com.bytedance.android.input.fragment.message.entity.a();
        }
        Charset charset = StandardCharsets.UTF_8;
        l.e(charset, "UTF_8");
        l.f(e2, "<this>");
        l.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(e2), charset);
        try {
            l.f(inputStreamReader, "<this>");
            StringWriter stringWriter = new StringWriter();
            l.f(inputStreamReader, "<this>");
            l.f(stringWriter, "out");
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            l.e(stringWriter2, "buffer.toString()");
            r.E(inputStreamReader, null);
            if (kotlin.text.a.s(stringWriter2)) {
                return new com.bytedance.android.input.fragment.message.entity.a();
            }
            l.f(stringWriter2, "json");
            Object c2 = new Gson().c(stringWriter2, com.bytedance.android.input.fragment.message.entity.a.class);
            l.e(c2, "Gson().fromJson<MessageC…nterListData::class.java)");
            return (com.bytedance.android.input.fragment.message.entity.a) c2;
        } finally {
        }
    }

    private final void h(com.bytedance.android.input.fragment.message.entity.a aVar) {
        File e2 = e();
        String b = aVar.b();
        Charset charset = StandardCharsets.UTF_8;
        l.e(charset, "UTF_8");
        l.f(e2, "<this>");
        l.f(b, "text");
        l.f(charset, "charset");
        byte[] bytes = b.getBytes(charset);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        kotlin.io.b.e(e2, bytes);
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void a(String str) {
        Object J2;
        l.f(str, "messageId");
        try {
            synchronized (i.class) {
                com.bytedance.android.input.fragment.message.entity.a f2 = f();
                boolean z = false;
                for (com.bytedance.android.input.fragment.message.entity.c cVar : f2.a()) {
                    if (l.a(cVar.d(), str)) {
                        int g2 = cVar.g();
                        MessageState messageState = MessageState.DELETED;
                        if (g2 != messageState.getCode()) {
                            cVar.k(messageState.getCode());
                            z = true;
                        }
                    }
                }
                if (z) {
                    IAppGlobals.a.j("MessageCenter-FileData", "deleteMessage messageId = " + str + "---changed = true");
                    h(f2);
                }
                J2 = o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("deleteMessage exception "), IAppGlobals.a, "MessageCenter-FileData");
        }
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void b(String str) {
        Object J2;
        l.f(str, "messageId");
        try {
            synchronized (i.class) {
                com.bytedance.android.input.fragment.message.entity.a f2 = f();
                boolean z = false;
                for (com.bytedance.android.input.fragment.message.entity.c cVar : f2.a()) {
                    if (l.a(cVar.d(), str)) {
                        int g2 = cVar.g();
                        MessageState messageState = MessageState.READ;
                        if (g2 != messageState.getCode()) {
                            cVar.k(messageState.getCode());
                            z = true;
                        }
                    }
                }
                if (z) {
                    IAppGlobals.a.j("MessageCenter-FileData", "messageReadReported messageId = " + str + "---changed = true");
                    h(f2);
                }
                J2 = o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("messageReadReported exception "), IAppGlobals.a, "MessageCenter-FileData");
        }
    }

    @Override // com.bytedance.android.input.fragment.message.data.e
    public void c(String str, kotlin.s.b.l<? super com.bytedance.android.input.fragment.message.entity.a, o> lVar, p<? super Integer, ? super String, o> pVar) {
        Object J2;
        l.f(lVar, "onSuccess");
        l.f(pVar, "onFailure");
        try {
            synchronized (i.class) {
                com.bytedance.android.input.fragment.message.entity.a f2 = f();
                com.bytedance.android.input.fragment.message.entity.a aVar = new com.bytedance.android.input.fragment.message.entity.a();
                int size = f2.a().size();
                ArrayList<com.bytedance.android.input.fragment.message.entity.c> a2 = aVar.a();
                ArrayList<com.bytedance.android.input.fragment.message.entity.c> a3 = f2.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : a3) {
                    if (((com.bytedance.android.input.fragment.message.entity.c) obj).g() != MessageState.DELETED.getCode()) {
                        arrayList.add(obj);
                    }
                }
                a2.addAll(arrayList);
                int size2 = aVar.a().size();
                IAppGlobals.a.j("MessageCenter-FileData", "fetchListMessage filter deletedCount = " + (size - size2) + "---finalCount = " + size2 + "---originalCount = " + size);
                lVar.invoke(aVar);
                J2 = o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            IAppGlobals.a aVar2 = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("fetchListMessage exception ");
            M.append(kotlin.a.d(b));
            aVar2.e("MessageCenter-FileData", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("fetchListMessage exception = ");
            M2.append(b.getMessage());
            pVar.invoke(-1, M2.toString());
        }
    }

    public com.bytedance.android.input.fragment.message.entity.c d() {
        com.bytedance.android.input.fragment.message.entity.c cVar;
        synchronized (i.class) {
            try {
                cVar = (com.bytedance.android.input.fragment.message.entity.c) kotlin.collections.g.z(a.f().a(), 0);
            } catch (Throwable th) {
                Throwable b = kotlin.h.b(r.J(th));
                if (b == null) {
                    return null;
                }
                IAppGlobals.a.e("MessageCenter-FileData", "getFirstMessage exception " + kotlin.a.d(b));
                return null;
            }
        }
        return cVar;
    }

    public void g(com.bytedance.android.input.fragment.message.entity.a aVar) {
        Object J2;
        l.f(aVar, RemoteMessageConst.DATA);
        synchronized (i.class) {
            try {
                a.h(aVar);
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                IAppGlobals.a.e("MessageCenter-FileData", "save exception " + kotlin.a.d(b));
            }
        }
    }
}
