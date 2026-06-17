package com.bytedance.apm.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.bytedance.services.apm.api.IActivityLifeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ActivityLifeObserver implements Application.ActivityLifecycleCallbacks, IActivityLifeManager {
    private static final long CHECK_DELAY = 600;
    private static final String TAG = "ActivityLifeObserver";
    private static final ActivityLifeObserver mInstance = new ActivityLifeObserver();
    private boolean mChangingConfigActivity;
    private String mCurActivityHash;
    private int mFrontActivityCount;
    private volatile boolean mIsFrontV2;
    private WeakReference<Activity> mTopActivityRef;
    private ArrayList<com.bytedance.services.apm.api.d> mObservers = new ArrayList<>(8);
    private ArrayList<c> mLifecycleObservers = new ArrayList<>(8);
    private String mTopActivityClassName = null;

    private ActivityLifeObserver() {
    }

    private Object[] collectObservers() {
        Object[] array;
        synchronized (this.mObservers) {
            array = this.mObservers.size() > 0 ? this.mObservers.toArray() : null;
        }
        return array == null ? new Object[0] : array;
    }

    private String getActivityHash(Activity activity) {
        return activity.getClass().getName() + activity.hashCode();
    }

    public static ActivityLifeObserver getInstance() {
        return mInstance;
    }

    public static void init(Application application) {
        mInstance.initWithApp(application);
    }

    private void initWithApp(@NonNull Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((com.bytedance.services.apm.api.d) obj).onBackground(activity);
        }
        Iterator<c> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onBackground(activity);
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((com.bytedance.services.apm.api.d) obj).onFront(activity);
        }
        Iterator<c> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onFront(activity);
        }
    }

    public String getTopActivityClassName() {
        WeakReference<Activity> weakReference = this.mTopActivityRef;
        String str = "";
        if (weakReference == null) {
            return "";
        }
        Activity activity = weakReference.get();
        return (activity == null || (str = this.mTopActivityClassName) != null) ? str : activity.getClass().getName();
    }

    public WeakReference<Activity> getTopActivityRef() {
        return this.mTopActivityRef;
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public boolean isForeground() {
        return this.mIsFrontV2;
    }

    public boolean isV2Foreground() {
        return this.mIsFrontV2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((com.bytedance.services.apm.api.d) obj).onActivityCreated(activity, bundle);
        }
        Iterator<c> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (getActivityHash(activity).equals(this.mCurActivityHash)) {
            this.mCurActivityHash = null;
        }
        Iterator<c> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        for (Object obj : collectObservers()) {
            ((com.bytedance.services.apm.api.d) obj).onActivityPause(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mTopActivityRef = new WeakReference<>(activity);
        this.mTopActivityClassName = null;
        Object[] collectObservers = collectObservers();
        for (Object obj : collectObservers) {
            ((com.bytedance.services.apm.api.d) obj).onActivityResume(activity);
        }
        String activityHash = getActivityHash(activity);
        if (activityHash.equals(this.mCurActivityHash)) {
            return;
        }
        for (Object obj2 : collectObservers) {
            ((com.bytedance.services.apm.api.d) obj2).onChange(activity, null);
        }
        this.mCurActivityHash = activityHash;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (Object obj : collectObservers()) {
            ((com.bytedance.services.apm.api.d) obj).onActivityStarted(activity);
        }
        if (this.mChangingConfigActivity) {
            this.mChangingConfigActivity = false;
            return;
        }
        int i = this.mFrontActivityCount + 1;
        this.mFrontActivityCount = i;
        if (i == 1) {
            this.mIsFrontV2 = true;
            notifyFront(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mChangingConfigActivity = true;
            return;
        }
        int i = this.mFrontActivityCount - 1;
        this.mFrontActivityCount = i;
        if (i == 0) {
            this.mIsFrontV2 = false;
            notifyBackground(activity);
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void register(com.bytedance.services.apm.api.d dVar) {
        ArrayList<com.bytedance.services.apm.api.d> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.add(dVar);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void unregister(com.bytedance.services.apm.api.d dVar) {
        ArrayList<com.bytedance.services.apm.api.d> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.remove(dVar);
            }
        }
    }

    public void register(c cVar) {
        ArrayList<c> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mLifecycleObservers.add(cVar);
            }
        }
    }

    public void unregister(c cVar) {
        ArrayList<c> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mLifecycleObservers.remove(cVar);
            }
        }
    }
}
