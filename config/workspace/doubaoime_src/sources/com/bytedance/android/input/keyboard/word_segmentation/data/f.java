package com.bytedance.android.input.keyboard.word_segmentation.data;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.r.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    private static ExecutorService b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    private static Handler f2824c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private static final Object f2825d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final a f2826e = new a();

    private f() {
    }

    public static void a(String str, l lVar) {
        kotlin.s.c.l.f(str, "$originText");
        kotlin.s.c.l.f(lVar, "$callback");
        a.d(str, false, lVar);
    }

    public static void b(String str, ArrayList arrayList, l lVar) {
        kotlin.s.c.l.f(str, "$originText");
        kotlin.s.c.l.f(arrayList, "$indexArray");
        kotlin.s.c.l.f(lVar, "$callback");
        a.e(str, arrayList, false, lVar);
    }

    private final void d(String str, boolean z, final l<? super WordSegmentationData, o> lVar) {
        final WordSegmentationData wordSegmentationData;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f2825d;
        synchronized (obj) {
            a aVar = f2826e;
            if (aVar.containsKey(str)) {
                wordSegmentationData = (WordSegmentationData) aVar.get(str);
            } else {
                WordSegmentationData wordSegmentation = KeyboardJni.getKeyboardJni().wordSegmentation(str);
                synchronized (obj) {
                    aVar.put(str, wordSegmentation);
                }
                wordSegmentationData = wordSegmentation;
            }
        }
        if (wordSegmentationData != null) {
            wordSegmentationData.setOriginText(str);
            if (z) {
                lVar.invoke(wordSegmentationData);
            } else {
                f2824c.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.data.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar2 = l.this;
                        WordSegmentationData wordSegmentationData2 = wordSegmentationData;
                        kotlin.s.c.l.f(lVar2, "$callback");
                        kotlin.s.c.l.f(wordSegmentationData2, "$it");
                        lVar2.invoke(wordSegmentationData2);
                    }
                });
            }
        } else {
            j.m("WordSegmentationDataManager", "realLoadWordSegmentationResult result is null");
        }
        StringBuilder X = e.a.a.a.a.X("loadWordSegmentationResult syncLoad = ", z, "---cost time = ");
        X.append(System.currentTimeMillis() - currentTimeMillis);
        j.m("WordSegmentationDataManager", X.toString());
    }

    private final void e(String str, ArrayList<Integer> arrayList, boolean z, final l<? super String, o> lVar) {
        long currentTimeMillis = System.currentTimeMillis();
        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
        kotlin.s.c.l.f(arrayList, "<this>");
        int[] iArr = new int[arrayList.size()];
        Iterator<Integer> it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            iArr[i] = it2.next().intValue();
            i++;
        }
        final String transformSelectedWordSegmentationByIndex = keyboardJni.transformSelectedWordSegmentationByIndex(str, iArr);
        if (transformSelectedWordSegmentationByIndex != null) {
            f2824c.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.data.d
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar2 = l.this;
                    String str2 = transformSelectedWordSegmentationByIndex;
                    kotlin.s.c.l.f(lVar2, "$callback");
                    kotlin.s.c.l.f(str2, "$it");
                    lVar2.invoke(str2);
                }
            });
        } else {
            j.m("WordSegmentationDataManager", "realTransformSelectedStrByIndex result is null");
        }
        StringBuilder X = e.a.a.a.a.X("realTransformSelectedStrByIndex syncLoad = ", z, "---cost time = ");
        X.append(System.currentTimeMillis() - currentTimeMillis);
        j.m("WordSegmentationDataManager", X.toString());
    }

    public void c(final String str, boolean z, final l<? super WordSegmentationData, o> lVar) {
        kotlin.s.c.l.f(str, "originText");
        kotlin.s.c.l.f(lVar, "callback");
        if (KeyboardJni.getKeyboardJni().isSettingsOpen()) {
            j.m("WordSegmentationDataManager", "Settings is open, skip word segmentation");
        } else if (z) {
            d(str, true, lVar);
        } else {
            b.execute(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.data.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.a(str, lVar);
                }
            });
        }
    }

    public void f(final String str, final ArrayList<Integer> arrayList, boolean z, final l<? super String, o> lVar) {
        kotlin.s.c.l.f(str, "originText");
        kotlin.s.c.l.f(arrayList, "indexArray");
        kotlin.s.c.l.f(lVar, "callback");
        if (z) {
            e(str, arrayList, true, lVar);
        } else {
            b.execute(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.data.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.b(str, arrayList, lVar);
                }
            });
        }
    }

    public static final class a extends LinkedHashMap<String, WordSegmentationData> {
        a() {
            super(100, 0.75f, true);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj == null ? true : obj instanceof WordSegmentationData) {
                return super.containsValue((WordSegmentationData) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return (WordSegmentationData) super.get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (WordSegmentationData) super.getOrDefault((String) obj, (WordSegmentationData) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return (WordSegmentationData) super.remove((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, WordSegmentationData> entry) {
            kotlin.s.c.l.f(entry, "eldest");
            return super.size() > 100;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 == null ? true : obj2 instanceof WordSegmentationData) {
                return super.remove((String) obj, (WordSegmentationData) obj2);
            }
            return false;
        }
    }
}
