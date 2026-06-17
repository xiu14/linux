package com.gyf.barlibrary;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@TargetApi(19)
/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, a> f6850e = new HashMap();
    private Activity a;
    private Window b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f6851c;

    /* renamed from: d, reason: collision with root package name */
    private String f6852d;

    private a(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        new HashMap();
        this.a = activity;
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null!!!");
        }
        if (f6850e.get(activity.toString()) == null) {
            throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
        }
        this.b = this.a.getWindow();
        this.f6852d = activity.toString() + fragment.toString();
        BarHide barHide = BarHide.FLAG_SHOW_BAR;
        new HashMap();
        ViewGroup viewGroup = (ViewGroup) this.b.getDecorView();
        this.f6851c = viewGroup;
    }

    public static a b(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("Activity cannot be null!!!");
        }
        a aVar = f6850e.get(fragment.getActivity().toString() + fragment.toString());
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(fragment);
        f6850e.put(fragment.getActivity().toString() + fragment.toString(), aVar2);
        return aVar2;
    }

    public void a() {
        Activity activity = this.a;
        Iterator<Map.Entry<String, a>> it2 = f6850e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, a> next = it2.next();
            if (next.getKey().contains(this.f6852d) || next.getKey().equals(this.f6852d)) {
                it2.remove();
            }
        }
    }
}
