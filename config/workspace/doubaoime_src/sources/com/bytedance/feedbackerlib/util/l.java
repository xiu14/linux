package com.bytedance.feedbackerlib.util;

import android.graphics.Rect;
import android.graphics.Region;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l {
    private static final Class<?> a;
    private static final Map<c, Object> b = new HashMap();

    static class a implements InvocationHandler {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            if (method == null || TextUtils.isEmpty(method.getName())) {
                return null;
            }
            String name = method.getName();
            name.hashCode();
            if (name.equals("onComputeInternalInsets")) {
                if (objArr != null && objArr.length == 1 && (obj2 = objArr[0]) != null) {
                    b bVar = new b();
                    b.a(bVar, obj2);
                    this.a.a(bVar);
                    b.b(bVar, obj2);
                    return null;
                }
            } else if (name.equals("equals")) {
                if (objArr == null || objArr.length != 1) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(obj == objArr[0]);
            }
            return method.invoke(this.a, objArr);
        }
    }

    public static final class b {
        public final Rect a = new Rect();
        public final Rect b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        public final Region f4991c = new Region();

        /* renamed from: d, reason: collision with root package name */
        private int f4992d;

        static void a(b bVar, Object obj) {
            Rect rect = (Rect) com.bytedance.feedbackerlib.util.a.b(obj, "contentInsets");
            Rect rect2 = (Rect) com.bytedance.feedbackerlib.util.a.b(obj, "visibleInsets");
            Region region = (Region) com.bytedance.feedbackerlib.util.a.b(obj, "touchableRegion");
            int intValue = ((Integer) com.bytedance.feedbackerlib.util.a.b(obj, "mTouchableInsets")).intValue();
            bVar.a.set(rect);
            bVar.b.set(rect2);
            bVar.f4991c.set(region);
            bVar.f4992d = intValue;
        }

        static void b(b bVar, Object obj) {
            Rect rect = (Rect) com.bytedance.feedbackerlib.util.a.b(obj, "contentInsets");
            Rect rect2 = (Rect) com.bytedance.feedbackerlib.util.a.b(obj, "visibleInsets");
            Region region = (Region) com.bytedance.feedbackerlib.util.a.b(obj, "touchableRegion");
            ((Integer) com.bytedance.feedbackerlib.util.a.b(obj, "mTouchableInsets")).intValue();
            rect.set(bVar.a);
            rect2.set(bVar.b);
            region.set(bVar.f4991c);
            Integer valueOf = Integer.valueOf(bVar.f4992d);
            com.bytedance.feedbackerlib.a.i(obj, "target object must not be null");
            Field a = com.bytedance.feedbackerlib.util.a.a(obj.getClass(), "mTouchableInsets");
            if (a != null) {
                com.bytedance.feedbackerlib.a.i(a, "The field must not be null");
                if (!a.isAccessible()) {
                    a.setAccessible(true);
                }
                a.set(obj, valueOf);
            }
        }

        public void c(int i) {
            this.f4992d = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4992d == bVar.f4992d && this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.f4991c.equals(bVar.f4991c);
        }

        public int hashCode() {
            return ((this.f4991c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.f4992d;
        }
    }

    public interface c {
        void a(b bVar);
    }

    static {
        a = Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener");
    }

    public static void a(@NonNull ViewTreeObserver viewTreeObserver, @NonNull c cVar) {
        if (cVar == null) {
            return;
        }
        Object newProxyInstance = Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{a}, new a(cVar));
        b.put(cVar, newProxyInstance);
        g.b(viewTreeObserver, "addOnComputeInternalInsetsListener", newProxyInstance);
    }

    public static void b(@NonNull ViewTreeObserver viewTreeObserver, @NonNull c cVar) {
        Object obj = b.get(cVar);
        if (obj == null) {
            return;
        }
        g.b(viewTreeObserver, "removeOnComputeInternalInsetsListener", obj);
    }
}
