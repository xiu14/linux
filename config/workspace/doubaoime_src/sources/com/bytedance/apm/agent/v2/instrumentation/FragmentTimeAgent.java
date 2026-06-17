package com.bytedance.apm.agent.v2.instrumentation;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.g;
import com.bytedance.apm.internal.ApmDelegate;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class FragmentTimeAgent {
    private static final String TAG = "FragmentTimeAgent";
    private static long sCheckVisibilityStartTime = 0;
    private static String sFragmentName = null;
    private static long sMaxWaitTime = 60000;
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static long sOnCreateStart;
    private static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    private static boolean sReported;
    private static WeakReference<View> sRootViewRef;
    private static Runnable sWaitViewTimeoutRunnable;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
            FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
            FragmentTimeAgent.reportStats(contains, null, 0L, 0L);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3338c;

        b(String str, long j, long j2) {
            this.a = str;
            this.b = j;
            this.f3338c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean contains = FragmentTimeAgent.sMethodSet.contains(FragmentTimeAgent.sFragmentName);
            FragmentTimeAgent.sMethodSet.add(FragmentTimeAgent.sFragmentName);
            FragmentTimeAgent.reportStats(contains, this.a, this.b, this.f3338c);
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Integer a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3339c;

        c(Integer num, long j, String str) {
            this.a = num;
            this.b = j;
            this.f3339c = str;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                if (FragmentTimeAgent.sRootViewRef != null && FragmentTimeAgent.sRootViewRef.get() != null) {
                    View findViewById = ((View) FragmentTimeAgent.sRootViewRef.get()).findViewById(this.a.intValue());
                    if (FragmentTimeAgent.sCheckVisibilityStartTime == 0) {
                        long unused = FragmentTimeAgent.sCheckVisibilityStartTime = System.currentTimeMillis();
                    }
                    if (findViewById == null || findViewById.getVisibility() != 0 || findViewById.getWidth() <= 0) {
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().isAlive() && FragmentTimeAgent.sOnGlobalLayoutListener != null) {
                        ((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
                    }
                    ViewTreeObserver.OnGlobalLayoutListener unused2 = FragmentTimeAgent.sOnGlobalLayoutListener = null;
                    WeakReference unused3 = FragmentTimeAgent.sRootViewRef = null;
                    if (FragmentTimeAgent.sWaitViewTimeoutRunnable != null) {
                        com.bytedance.apm.F.a.a().removeCallbacks(FragmentTimeAgent.sWaitViewTimeoutRunnable);
                    }
                    long j = currentTimeMillis - this.b;
                    if (currentTimeMillis - FragmentTimeAgent.sCheckVisibilityStartTime <= 1 || j >= FragmentTimeAgent.sMaxWaitTime) {
                        return;
                    }
                    FragmentTimeAgent.reportTraceTime(FragmentTimeAgent.sFragmentName, this.f3339c, this.b, currentTimeMillis);
                }
            } catch (Exception unused4) {
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (FragmentTimeAgent.sOnGlobalLayoutListener == null || FragmentTimeAgent.sRootViewRef == null || FragmentTimeAgent.sRootViewRef.get() == null) {
                    return;
                }
                ((View) FragmentTimeAgent.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentTimeAgent.sOnGlobalLayoutListener);
            } catch (Exception unused) {
            }
        }
    }

    private static boolean isValid(String str) {
        return !sReported && TextUtils.equals(str, sFragmentName);
    }

    @Keep
    public static void onHiddenChanged(Fragment fragment, boolean z) {
        if (z) {
            return;
        }
        try {
            String canonicalName = fragment.getClass().getCanonicalName();
            Integer a2 = com.bytedance.apm.G.i.a.a(canonicalName);
            if (a2 != null && a2.intValue() > 0) {
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a2, System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    public static void onResumeShow(Fragment fragment, String str) {
        if (!fragment.getUserVisibleHint() || fragment.isHidden()) {
            return;
        }
        try {
            Integer a2 = com.bytedance.apm.G.i.a.a(str);
            if (a2 != null && a2.intValue() > 0) {
                registerOnGlobalLayoutListener(str, fragment.getView(), a2, sOnCreateStart, "fragmentOnCreateToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    @Keep
    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (!z) {
                if (isValid(str)) {
                    sOnCreateEnd = System.currentTimeMillis();
                    return;
                }
                return;
            } else {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (sMaxWaitTime == 0) {
                    sMaxWaitTime = ApmDelegate.i().g().h();
                }
                sReported = false;
                return;
            }
        }
        if (TextUtils.equals("onViewCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart > 0) {
                    sOnViewCreatedStart = System.currentTimeMillis();
                    return;
                }
                return;
            } else {
                if (sOnCreateStart > 0) {
                    sOnViewCreatedEnd = System.currentTimeMillis();
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals("onActivityCreated", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedStart = System.currentTimeMillis();
                    return;
                }
                return;
            } else {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedEnd = System.currentTimeMillis();
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals("onResume", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart > 0) {
                    sOnResumeStart = System.currentTimeMillis();
                    onResumeShow(fragment, str);
                    return;
                }
                return;
            }
            if (sOnCreateStart > 0) {
                sOnResumeEnd = System.currentTimeMillis();
                try {
                    Integer a2 = com.bytedance.apm.G.i.a.a(str);
                    if (a2 == null || a2.intValue() <= 0) {
                        com.bytedance.apm.F.b.e().h(new a());
                    }
                } catch (Exception unused) {
                }
                sReported = true;
                sFragmentName = null;
            }
        }
    }

    @TargetApi(16)
    private static void registerOnGlobalLayoutListener(String str, View view, Integer num, long j, String str2) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        sFragmentName = str;
        WeakReference<View> weakReference = sRootViewRef;
        if (weakReference != null && weakReference.get() != view) {
            ViewTreeObserver viewTreeObserver = sRootViewRef.get().getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onGlobalLayoutListener = sOnGlobalLayoutListener) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            if (sWaitViewTimeoutRunnable != null) {
                com.bytedance.apm.F.a.a().removeCallbacks(sWaitViewTimeoutRunnable);
            }
        }
        sRootViewRef = new WeakReference<>(view);
        sCheckVisibilityStartTime = 0L;
        sOnGlobalLayoutListener = new c(num, j, str2);
        view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
        sWaitViewTimeoutRunnable = new d();
        com.bytedance.apm.F.a.a().postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportStats(boolean z, String str, long j, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "onCreate");
            jSONObject.put("start", sOnCreateStart);
            jSONObject.put("end", sOnCreateEnd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "onViewCreated");
            jSONObject2.put("start", sOnViewCreatedStart);
            jSONObject2.put("end", sOnViewCreatedEnd);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", "onActivityCreated");
            jSONObject3.put("start", sOnActivityCreatedStart);
            jSONObject3.put("end", sOnActivityCreatedEnd);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("name", "onResume");
            jSONObject4.put("start", sOnResumeStart);
            jSONObject4.put("end", sOnResumeEnd);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
            jSONArray.put(jSONObject4);
            if (str != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("name", str);
                jSONObject5.put("start", j);
                jSONObject5.put("end", j2);
                jSONArray.put(jSONObject5);
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("name", "page_load_stats");
            jSONObject6.put("page_type", "fragment");
            jSONObject6.put("start", sOnCreateStart);
            jSONObject6.put("spans", jSONArray);
            jSONObject6.put("launch_mode", z ? 2 : 1);
            jSONObject6.put("collect_from", 1);
            jSONObject6.put("page_name", sFragmentName);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("trace", jSONObject6);
            com.bytedance.apm.q.b.a.a("page_load_trace", null, null, jSONObject7);
        } catch (Exception e2) {
            if (g.B()) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportTraceTime(String str, String str2, long j, long j2) {
        com.bytedance.apm.F.b.e().h(new b(str2, j, j2));
    }

    @Keep
    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (z && fragment.isResumed() && !fragment.isHidden()) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                Integer a2 = com.bytedance.apm.G.i.a.a(canonicalName);
                if (a2 != null && a2.intValue() > 0) {
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a2, System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }
}
