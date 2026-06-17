package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.x.c;

/* loaded from: classes.dex */
public final class o {

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<String, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "it");
            return Boolean.valueOf(str2.length() > 0);
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<String, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "it");
            return Boolean.valueOf(str2.length() > 0);
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<String, Boolean> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "it");
            return Boolean.valueOf(str2.length() > 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<h> a(Context context, q qVar) {
        List<i> d2;
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(qVar, "parser");
        ArrayList arrayList = new ArrayList();
        try {
            InputStream open = context.getAssets().open(qVar.a());
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                try {
                    Iterator it2 = ((kotlin.x.c) kotlin.x.h.b(kotlin.io.b.c(bufferedReader), a.a)).iterator();
                    h hVar = null;
                    while (true) {
                        c.a aVar = (c.a) it2;
                        if (!aVar.hasNext()) {
                            break;
                        }
                        String str = (String) aVar.next();
                        if (kotlin.text.a.K(str, "# ", false, 2, null)) {
                            hVar = new h(kotlin.text.a.B(str, "# "), null, 2);
                            arrayList.add(hVar);
                        } else {
                            h hVar2 = hVar;
                            if (hVar2 != null && (d2 = hVar2.d()) != null) {
                                d2.add(qVar.e(str));
                            }
                        }
                    }
                    com.prolificinteractive.materialcalendarview.r.E(bufferedReader, null);
                    com.prolificinteractive.materialcalendarview.r.E(open, null);
                    com.bytedance.android.input.r.j.i("EmojiRepository", "loadSystemData");
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.i("EmojiRepository", e2.getMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h b(q qVar) {
        kotlin.s.c.l.f(qVar, "parser");
        h hVar = new h("常用", null, 2);
        File file = new File(qVar.b());
        if (file.exists()) {
            try {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), kotlin.text.c.a);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    Iterator it2 = ((kotlin.x.c) kotlin.x.h.b(kotlin.io.b.c(bufferedReader), b.a)).iterator();
                    while (true) {
                        c.a aVar = (c.a) it2;
                        if (!aVar.hasNext()) {
                            break;
                        }
                        hVar.d().add(qVar.e((String) aVar.next()));
                    }
                    com.prolificinteractive.materialcalendarview.r.E(bufferedReader, null);
                } finally {
                }
            } catch (IOException e2) {
                com.bytedance.android.input.r.j.i("EmojiRepository", e2.getMessage());
            }
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h c(Context context, q qVar) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(qVar, "parser");
        h hVar = new h("常用", null, 2);
        try {
            InputStream open = context.getAssets().open(qVar.d());
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                try {
                    Iterator it2 = ((kotlin.x.c) kotlin.x.h.b(kotlin.io.b.c(bufferedReader), c.a)).iterator();
                    while (true) {
                        c.a aVar = (c.a) it2;
                        if (!aVar.hasNext()) {
                            break;
                        }
                        hVar.d().add(qVar.e((String) aVar.next()));
                    }
                    com.prolificinteractive.materialcalendarview.r.E(bufferedReader, null);
                    com.prolificinteractive.materialcalendarview.r.E(open, null);
                    com.bytedance.android.input.r.j.i("EmojiRepository", "loadHotData");
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.i("EmojiRepository", e2.getMessage());
        }
        return hVar;
    }

    public final void d(h hVar, q qVar) {
        kotlin.s.c.l.f(hVar, "group");
        kotlin.s.c.l.f(qVar, "parser");
        List<i> d2 = hVar.d();
        if (d2.isEmpty()) {
            return;
        }
        try {
            Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(qVar.b())), kotlin.text.c.a);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    bufferedWriter.write(qVar.c((i) it2.next()));
                    bufferedWriter.newLine();
                }
                com.prolificinteractive.materialcalendarview.r.E(bufferedWriter, null);
            } finally {
            }
        } catch (IOException e2) {
            com.bytedance.android.input.r.j.i("EmojiRepository", e2.getMessage());
        }
    }
}
