package com.vivo.push.util;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ContextDelegate {
    private static final String TAG = "ContextDelegate";
    private static Context mContext = null;
    private static volatile Method mCreateCredentialProtectedStorageContext = null;
    private static volatile Method mCreateDeviceProtectedStorageContext = null;
    private static boolean mDelegateEnable = false;
    private static volatile Boolean mIsFbeProject;
    private static volatile Boolean mIsFdeProject;

    private static class a {
        private static ContextDelegate a = new ContextDelegate();
    }

    private static synchronized Context createCredentialProtectedStorageContext(Context context) {
        Context context2;
        synchronized (ContextDelegate.class) {
            try {
                if (mCreateCredentialProtectedStorageContext == null) {
                    mCreateCredentialProtectedStorageContext = Context.class.getMethod("createCredentialProtectedStorageContext", new Class[0]);
                }
                context2 = (Context) mCreateCredentialProtectedStorageContext.invoke(context, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
                return context;
            }
        }
        return context2;
    }

    private static synchronized Context createDeviceProtectedStorageContext(Context context) {
        Context context2;
        synchronized (ContextDelegate.class) {
            try {
                if (mCreateDeviceProtectedStorageContext == null) {
                    mCreateDeviceProtectedStorageContext = Context.class.getMethod("createDeviceProtectedStorageContext", new Class[0]);
                }
                context2 = (Context) mCreateDeviceProtectedStorageContext.invoke(context, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
                return context;
            }
        }
        return context2;
    }

    public static Context getContext(Context context) {
        if ((!isFBEProject() && !isFDEProject()) || context == null) {
            return context;
        }
        Context context2 = mContext;
        if (context2 != null) {
            return context2;
        }
        setContext(context);
        return mContext;
    }

    public static ContextDelegate getInstance() {
        return a.a;
    }

    public static synchronized boolean isFBEProject() {
        synchronized (ContextDelegate.class) {
            if (mIsFbeProject == null) {
                try {
                    mIsFbeProject = Boolean.valueOf("file".equals(m.a("ro.crypto.type", "unknow")));
                    t.b(TAG, "mIsFbeProject = " + mIsFbeProject.toString());
                } catch (Exception e2) {
                    t.a(TAG, "mIsFbeProject = " + e2.getMessage());
                }
            }
            if (mIsFbeProject == null) {
                return false;
            }
            return mIsFbeProject.booleanValue();
        }
    }

    private static synchronized boolean isFDEProject() {
        synchronized (ContextDelegate.class) {
            if (mIsFdeProject == null) {
                try {
                    mIsFdeProject = Boolean.valueOf("block".equals(m.a("ro.crypto.type", "unknow")));
                    t.b(TAG, "mIsFdeProject = " + mIsFdeProject.toString());
                } catch (Exception e2) {
                    t.a(TAG, "mIsFdeProject = " + e2.getMessage());
                }
            }
            if (mIsFdeProject == null) {
                return false;
            }
            return mIsFdeProject.booleanValue();
        }
    }

    private static void setAppContext() {
        Context context = mContext;
        if (context == null) {
            return;
        }
        setContext(context);
    }

    private static void setContext(Context context) {
        if (mDelegateEnable) {
            mContext = createDeviceProtectedStorageContext(context);
        } else {
            mContext = createCredentialProtectedStorageContext(context);
        }
    }

    public static void setEnable(boolean z) {
        mDelegateEnable = z;
        setAppContext();
    }
}
