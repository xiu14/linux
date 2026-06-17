package com.ttnet.org.chromium.net;

import android.content.Context;
import android.util.Log;
import com.ttnet.org.chromium.net.AbstractC0759g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i {
    private static final String b = "i";
    protected final Context a;

    protected i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.a = context;
    }

    public static List<i> b(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            linkedHashSet.add((i) context.getClassLoader().loadClass("com.ttnet.org.chromium.net.impl.NativeCronetProvider").asSubclass(i.class).getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException e2) {
            f("com.ttnet.org.chromium.net.impl.NativeCronetProvider", false, e2);
        } catch (IllegalAccessException e3) {
            f("com.ttnet.org.chromium.net.impl.NativeCronetProvider", false, e3);
        } catch (InstantiationException e4) {
            f("com.ttnet.org.chromium.net.impl.NativeCronetProvider", false, e4);
        } catch (NoSuchMethodException e5) {
            f("com.ttnet.org.chromium.net.impl.NativeCronetProvider", false, e5);
        } catch (InvocationTargetException e6) {
            f("com.ttnet.org.chromium.net.impl.NativeCronetProvider", false, e6);
        }
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void f(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(b, "Unable to load provider class: " + str, exc);
            return;
        }
        String str2 = b;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    public abstract AbstractC0759g.a a(boolean z);

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("[class=");
        M.append(getClass().getName());
        M.append(", name=");
        M.append(c());
        M.append(", version=");
        M.append(d());
        M.append(", enabled=");
        M.append(e());
        M.append("]");
        return M.toString();
    }
}
