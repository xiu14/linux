package com.bytedance.apm.agent.instrumentation;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.internal.ApmDelegate;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class FragmentInstrumentation {
    private static final String TAG = "FragmentInstrumentation";
    private static long sCheckVisibilityStartTime;
    private static String sFragmentName;
    private static long sMaxWaitTime;
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static String sOnCreateFragmentName;
    private static long sOnCreateStart;
    private static long sOnCreateTime;
    private static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    private static WeakReference<View> sRootViewRef;
    private static Runnable sWaitViewTimeoutRunnable;

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Integer a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3319c;

        a(Integer num, long j, String str) {
            this.a = num;
            this.b = j;
            this.f3319c = str;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                if (FragmentInstrumentation.sRootViewRef != null && FragmentInstrumentation.sRootViewRef.get() != null) {
                    View findViewById = ((View) FragmentInstrumentation.sRootViewRef.get()).findViewById(this.a.intValue());
                    if (FragmentInstrumentation.sCheckVisibilityStartTime == 0) {
                        long unused = FragmentInstrumentation.sCheckVisibilityStartTime = System.currentTimeMillis();
                    }
                    if (findViewById == null || findViewById.getVisibility() != 0 || findViewById.getWidth() <= 0) {
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().isAlive() && FragmentInstrumentation.sOnGlobalLayoutListener != null) {
                        ((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                    }
                    ViewTreeObserver.OnGlobalLayoutListener unused2 = FragmentInstrumentation.sOnGlobalLayoutListener = null;
                    WeakReference unused3 = FragmentInstrumentation.sRootViewRef = null;
                    if (FragmentInstrumentation.sWaitViewTimeoutRunnable != null) {
                        com.bytedance.apm.F.a.a().removeCallbacks(FragmentInstrumentation.sWaitViewTimeoutRunnable);
                    }
                    long j = currentTimeMillis - this.b;
                    if (currentTimeMillis - FragmentInstrumentation.sCheckVisibilityStartTime <= 1 || j >= FragmentInstrumentation.sMaxWaitTime) {
                        return;
                    }
                    com.bytedance.apm.q.b.a.d(FragmentInstrumentation.sFragmentName, this.f3319c, j);
                }
            } catch (Exception unused4) {
            }
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (FragmentInstrumentation.sOnGlobalLayoutListener == null || FragmentInstrumentation.sRootViewRef == null || FragmentInstrumentation.sRootViewRef.get() == null) {
                    return;
                }
                ((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
            } catch (Exception unused) {
            }
        }
    }

    static boolean isValid(String str) {
        return !TextUtils.isEmpty(sFragmentName) && TextUtils.equals(str, sFragmentName);
    }

    @Keep
    public static void onCreate(String str) {
        sOnCreateFragmentName = str;
        sOnCreateTime = System.currentTimeMillis();
        if (sMaxWaitTime == 0) {
            sMaxWaitTime = ApmDelegate.i().g().h();
        }
    }

    @Keep
    public static void onHiddenChanged(Fragment fragment, boolean z) {
        com.bytedance.android.input.k.b.a.p0(fragment, !z);
        if (z) {
            return;
        }
        try {
            String canonicalName = fragment.getClass().getCanonicalName();
            registerOnGlobalLayoutListener(canonicalName, fragment.getView(), com.bytedance.apm.G.i.a.a(canonicalName), System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
        } catch (Exception unused) {
        }
    }

    @Keep
    public static void onPause(Fragment fragment) {
        if (!fragment.getUserVisibleHint() || fragment.isHidden()) {
            return;
        }
        com.bytedance.android.input.k.b.a.p0(fragment, false);
    }

    @Keep
    public static void onResume(Fragment fragment) {
        if (!fragment.getUserVisibleHint() || fragment.isHidden()) {
            return;
        }
        String canonicalName = fragment.getClass().getCanonicalName();
        try {
            com.bytedance.android.input.k.b.a.p0(fragment, true);
            if (TextUtils.equals(canonicalName, sOnCreateFragmentName)) {
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), com.bytedance.apm.G.i.a.a(canonicalName), sOnCreateTime, "fragmentOnCreateToViewShow");
            }
        } catch (Exception unused) {
        }
    }

    @Keep
    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
                return;
            } else {
                if (isValid(str)) {
                    sOnCreateEnd = System.currentTimeMillis();
                    return;
                }
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
                    return;
                }
                return;
            }
            if (sOnCreateStart > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                sOnResumeEnd = currentTimeMillis;
                if (currentTimeMillis - sOnCreateStart < com.heytap.mcssdk.constant.a.r) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("begin_time", sOnCreateStart);
                        jSONObject.put("end_time", sOnResumeEnd);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                        jSONObject2.put("onViewCreated", sOnViewCreatedEnd - sOnViewCreatedStart);
                        jSONObject2.put("onActivityCreated", sOnActivityCreatedEnd - sOnActivityCreatedStart);
                        jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                        jSONObject2.put("fragment_create_to_resume", sOnResumeEnd - sOnCreateStart);
                        if (fragment != null && fragment.getActivity() != null) {
                            jSONObject.put("attached_activity", fragment.getActivity().getClass().getName());
                        }
                        jSONObject.put("page_type", "fragment");
                        JSONObject jSONObject3 = new JSONObject();
                        HashSet<String> hashSet = sMethodSet;
                        StringBuilder sb = new StringBuilder();
                        sb.append(sFragmentName);
                        sb.append(str2);
                        jSONObject3.put("is_first", !hashSet.contains(sb.toString()));
                        jSONObject3.put("scene", str);
                        sMethodSet.add(sFragmentName + str2);
                        com.bytedance.apm.q.b.a.a("page_load", jSONObject2, jSONObject3, jSONObject);
                    } catch (Exception unused) {
                    }
                }
                sOnCreateStart = 0L;
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
        sOnGlobalLayoutListener = new a(num, j, str2);
        view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
        sWaitViewTimeoutRunnable = new b();
        com.bytedance.apm.F.a.a().postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
    }

    @Keep
    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (!fragment.isResumed() || fragment.isHidden()) {
            return;
        }
        com.bytedance.android.input.k.b.a.p0(fragment, z);
        if (z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), com.bytedance.apm.G.i.a.a(canonicalName), System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
            } catch (Exception unused) {
            }
        }
    }
}
