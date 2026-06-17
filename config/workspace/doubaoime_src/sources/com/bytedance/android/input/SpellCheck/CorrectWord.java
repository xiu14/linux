package com.bytedance.android.input.SpellCheck;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.input.SpellCheck.CorrectWord;
import com.bytedance.android.input.keyboard.aiwrite.CheckViewModel;
import com.bytedance.android.input.network.api.ICorrectWord;
import com.bytedance.android.input.r.j;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0704h;
import com.bytedance.retrofit2.N;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CorrectWord {
    static String[] a;
    static int[] b;

    /* renamed from: c, reason: collision with root package name */
    static int[] f2024c;

    /* renamed from: d, reason: collision with root package name */
    static int[] f2025d;

    /* renamed from: e, reason: collision with root package name */
    private static final Handler f2026e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f2027f = new AtomicInteger(0);

    public static class RequestCorrect implements Runnable {
        private final Integer a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2028c;

        /* renamed from: d, reason: collision with root package name */
        private final RecifyType f2029d = RecifyType.ZhEn;

        public enum RecifyType {
            none,
            Zh,
            En,
            ZhEn
        }

        class a implements InterfaceC0704h<String> {
            a() {
            }

            @Override // com.bytedance.retrofit2.InterfaceC0704h
            public void a(InterfaceC0701e<String> interfaceC0701e, final N<String> n) {
                StringBuilder M = e.a.a.a.a.M("nowid = ");
                M.append(CorrectWord.f2027f.get());
                M.append(" requestid ");
                M.append(RequestCorrect.this.a);
                j.m("CorrectWord", M.toString());
                j.i("CorrectWord", n.a());
                if (!CorrectWord.f2027f.compareAndSet(RequestCorrect.this.a.intValue(), CorrectWord.f2027f.get())) {
                    StringBuilder M2 = e.a.a.a.a.M("不相等 nowid = ");
                    M2.append(CorrectWord.f2027f.get());
                    M2.append(" requestid ");
                    M2.append(RequestCorrect.this.a);
                    j.m("CorrectWord", M2.toString());
                    return;
                }
                StringBuilder M3 = e.a.a.a.a.M(" 相等 nowid = ");
                M3.append(CorrectWord.f2027f.get());
                M3.append(" requestid ");
                M3.append(RequestCorrect.this.a);
                j.m("CorrectWord", M3.toString());
                CorrectWord.f2026e.post(new Runnable() { // from class: com.bytedance.android.input.SpellCheck.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i;
                        CorrectWord.RequestCorrect.a aVar = CorrectWord.RequestCorrect.a.this;
                        N n2 = n;
                        Objects.requireNonNull(aVar);
                        try {
                            JSONArray jSONArray = new JSONObject((String) n2.a()).getJSONObject(RemoteMessageConst.DATA).getJSONArray("correct_word_info");
                            int length = jSONArray.length();
                            j.m("CorrectWord", " arrayObject length = " + length);
                            if (length == 0) {
                                CheckViewModel.a.v(2);
                            } else {
                                String[] strArr = CorrectWord.a;
                                CorrectWord correctWord = CorrectWord.b.a;
                                str = CorrectWord.RequestCorrect.this.b;
                                i = CorrectWord.RequestCorrect.this.f2028c;
                                CorrectWord.b(correctWord, jSONArray, str, i);
                            }
                        } catch (JSONException e2) {
                            CheckViewModel.a.v(1);
                            j.j("CorrectWord", e2.getMessage());
                        }
                    }
                });
            }

            @Override // com.bytedance.retrofit2.InterfaceC0704h
            public void b(InterfaceC0701e<String> interfaceC0701e, Throwable th) {
                CorrectWord.f2026e.post(new Runnable() { // from class: com.bytedance.android.input.SpellCheck.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CheckViewModel.a.v(1);
                    }
                });
                j.j("CorrectWord", "请求失败, t = " + th.getMessage());
            }
        }

        public RequestCorrect(String str, int i, Integer num) {
            this.a = num;
            this.b = str;
            this.f2028c = i;
            e.a.a.a.a.k0("text start cursor = ", i, "CorrectWord");
        }

        public void d() throws Exception {
            N<String> execute = ICorrectWord.a.a().getCorrectWord(new ICorrectWord.b(this.b, this.f2029d.ordinal(), false)).execute();
            if (!execute.f()) {
                CheckViewModel.a.v(1);
                StringBuilder sb = new StringBuilder();
                sb.append("请求失败, response = ");
                execute.g();
                sb.append((String) null);
                sb.append(" code = ");
                sb.append(execute.b());
                sb.append(" body = ");
                sb.append(execute.a());
                j.j("CorrectWord", sb.toString());
                return;
            }
            StringBuilder M = e.a.a.a.a.M("nowid = ");
            M.append(CorrectWord.f2027f.get());
            M.append(" requestid ");
            M.append(this.a);
            j.m("CorrectWord", M.toString());
            j.i("CorrectWord", execute.a());
            if (!CorrectWord.f2027f.compareAndSet(this.a.intValue(), CorrectWord.f2027f.get())) {
                StringBuilder M2 = e.a.a.a.a.M("不相等 nowid = ");
                M2.append(CorrectWord.f2027f.get());
                M2.append(" requestid ");
                M2.append(this.a);
                j.m("CorrectWord", M2.toString());
                return;
            }
            StringBuilder M3 = e.a.a.a.a.M(" 相等 nowid = ");
            M3.append(CorrectWord.f2027f.get());
            M3.append(" requestid ");
            M3.append(this.a);
            j.m("CorrectWord", M3.toString());
            try {
                JSONArray jSONArray = new JSONObject(execute.a()).getJSONObject(RemoteMessageConst.DATA).getJSONArray("correct_word_info");
                int length = jSONArray.length();
                j.m("CorrectWord", " arrayObject length = " + length);
                if (length == 0) {
                    CheckViewModel.a.v(2);
                } else {
                    CorrectWord.b(b.a, jSONArray, this.b, this.f2028c);
                }
            } catch (JSONException e2) {
                CheckViewModel.a.v(1);
                j.j("CorrectWord", e2.getMessage());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ICorrectWord.a.a().getCorrectWord(new ICorrectWord.b(this.b, this.f2029d.ordinal(), false)).enqueue(new a());
        }
    }

    public static class b {
        private static final CorrectWord a = new CorrectWord(null);
    }

    CorrectWord(a aVar) {
    }

    static void b(CorrectWord correctWord, JSONArray jSONArray, String str, int i) throws JSONException {
        Objects.requireNonNull(correctWord);
        int length = jSONArray.length();
        if (length == 0) {
            CheckViewModel.a.v(2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (Character.charCount(str.codePointAt(i4)) == 2) {
                i3++;
                z = true;
            } else {
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(i4 - i3));
                i2++;
                i3 = 0;
            }
        }
        j.m("CorrectWord", "needModify = " + z);
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i6);
            if (jSONObject.getDouble("confidence") >= 0.6d) {
                arrayList.add(jSONObject.getString("source_word"));
                arrayList2.add(jSONObject.getString("predict_word"));
                arrayList3.add(Integer.valueOf(jSONObject.getInt("word_idx_in_text")));
                int intValue = ((Integer) arrayList3.get(i5)).intValue();
                if (z && hashMap.containsKey(Integer.valueOf(intValue))) {
                    try {
                        arrayList3.set(i5, Integer.valueOf(((Integer) hashMap.get(Integer.valueOf(intValue))).intValue()));
                    } catch (Exception e2) {
                        e.a.a.a.a.f0(e2, e.a.a.a.a.M("index modify error = "), "CorrectWord");
                    }
                }
                i5++;
            }
        }
        if (i5 == 0) {
            j.m("CorrectWord", "confidence > 0.6 not found");
            CheckViewModel.a.v(2);
            return;
        }
        int[] iArr = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr[i7] = ((Integer) arrayList3.get(i7)).intValue() + i;
        }
        a = (String[]) arrayList2.toArray(new String[i5]);
        b = iArr;
        f2025d = new int[i5];
        f2024c = new int[i5];
        for (int i8 = 0; i8 < arrayList.toArray().length; i8++) {
            f2025d[i8] = ((String) arrayList.get(i8)).length();
            f2024c[i8] = b[i8] + f2025d[i8];
        }
        for (int i9 = 0; i9 < arrayList.toArray().length; i9++) {
            StringBuilder M = e.a.a.a.a.M("mResults= ");
            M.append(a[i9]);
            M.append(", mOffsets= ");
            M.append(b[i9]);
            M.append(", mLengths= ");
            M.append(f2025d[i9]);
            j.i("CorrectWord", M.toString());
        }
        CheckViewModel.a.v(0);
    }

    public static CorrectWord g() {
        return b.a;
    }

    public int[] d() {
        return b;
    }

    public int[] e() {
        return f2024c;
    }

    public String[] f() {
        return a;
    }

    public void h(String str) {
        AtomicInteger atomicInteger = f2027f;
        atomicInteger.incrementAndGet();
        f2026e.removeCallbacksAndMessages(null);
        a = null;
        b = null;
        f2024c = null;
        f2025d = null;
        if (str == null || str.length() <= 0) {
            return;
        }
        new RequestCorrect(str, 0, Integer.valueOf(atomicInteger.get())).run();
    }

    public void i(String str, int i) {
        e.a.a.a.a.r0("text = ", str, "CorrectWord");
        AtomicInteger atomicInteger = f2027f;
        atomicInteger.incrementAndGet();
        f2026e.removeCallbacksAndMessages(null);
        a = null;
        b = null;
        f2024c = null;
        f2025d = null;
        if (str.length() > 0) {
            char charAt = str.charAt(str.length() - 1);
            if (Character.isLowerCase(charAt) || Character.isUpperCase(charAt)) {
                return;
            }
            try {
                new RequestCorrect(str, i, Integer.valueOf(atomicInteger.get())).d();
            } catch (Exception e2) {
                e.a.a.a.a.f0(e2, e.a.a.a.a.M("requestCorrect.syncRun() = "), "CorrectWord");
            }
        }
    }
}
