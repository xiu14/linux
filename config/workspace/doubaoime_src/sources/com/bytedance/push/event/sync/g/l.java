package com.bytedance.push.event.sync.g;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.common.device.DeviceKeyReceiver;
import com.bytedance.push.C;
import com.bytedance.push.event.sync.UserExitsReason;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public class l extends com.bytedance.push.event.sync.g.a implements Application.ActivityLifecycleCallbacks, Observer {

    /* renamed from: c, reason: collision with root package name */
    private boolean f5688c;

    /* renamed from: d, reason: collision with root package name */
    private UserExitsReason f5689d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f5690e;

    class a implements DeviceKeyReceiver.a {
        a() {
        }

        @Override // com.bytedance.common.device.DeviceKeyReceiver.a
        public void a() {
            com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[enterMultiTask]");
            l.this.f5689d = UserExitsReason.HOME;
        }

        @Override // com.bytedance.common.device.DeviceKeyReceiver.a
        public void b() {
            com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[onPressHomeKey]");
            l.this.f5689d = UserExitsReason.HOME;
        }
    }

    static void s(l lVar, Activity activity, KeyEvent keyEvent) {
        Objects.requireNonNull(lVar);
        com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[findDispatchKeyEvent]event：" + keyEvent);
        if (keyEvent.getKeyCode() == 3) {
            com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[findDispatchKeyEvent]find home press");
            lVar.f5690e = new WeakReference<>(activity);
            lVar.f5689d = UserExitsReason.HOME;
        } else if (keyEvent.getKeyCode() == 4) {
            com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[findDispatchKeyEvent]find back press");
            lVar.f5690e = new WeakReference<>(activity);
            lVar.f5689d = UserExitsReason.BACK;
        }
    }

    private void t(Activity activity) {
        com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[proxyWindowCallback]activity:" + activity + " window:" + activity.getWindow());
        if (activity.getWindow() != null) {
            Window.Callback callback = activity.getWindow().getCallback();
            com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[proxyWindowCallback]callback:" + callback);
            activity.getWindow().setCallback(new b(callback, activity));
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    public String n() {
        return "user_exits";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[onActivityCreated]activity:" + activity);
        t(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        com.bytedance.push.g0.f.c("UserExitsSignalReporter", "[onActivityStarted]activity:" + activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        Activity h = com.bytedance.common.push.b.e().h();
        if (h != null) {
            t(h);
        }
        this.f5688c = com.bytedance.common.push.b.e().j();
        com.bytedance.common.push.b.e().addObserver(this);
        com.bytedance.common.push.b.e().c(this);
        DeviceKeyReceiver.a(new a());
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (this.f5688c || !booleanValue) {
            this.f5688c = booleanValue;
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[update]app from foreground to background,mLastOperateType:");
        M.append(this.f5689d);
        com.bytedance.push.g0.f.c("UserExitsSignalReporter", M.toString());
        if (this.f5689d == null) {
            com.bytedance.push.g0.f.e("UserExitsSignalReporter", "[update]invalid app status change because mUserExitsReason is null");
            return;
        }
        com.bytedance.push.event.sync.e iUserExitsValidityChecker = ((C) C.a()).t().getIUserExitsValidityChecker();
        if (iUserExitsValidityChecker == null) {
            com.bytedance.push.g0.f.e("UserExitsSignalReporter", "[update]invalid app status change because userExitsValidityChecker is null");
            return;
        }
        WeakReference<Activity> weakReference = this.f5690e;
        if (iUserExitsValidityChecker.a(weakReference != null ? weakReference.get() : null, this.f5689d) == null) {
            com.bytedance.push.g0.f.e("UserExitsSignalReporter", "[update]invalid app status change because userExitsValidityInfo is null");
            return;
        }
        com.bytedance.push.g0.f.e("UserExitsSignalReporter", "[update]invalid app status change because userExitsValidityInfo#isValid is false,last_page:" + ((String) null));
    }

    class b implements Window.Callback {
        private Window.Callback a;
        private Activity b;

        public b(Window.Callback callback, Activity activity) {
            this.a = callback;
            this.b = activity;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.dispatchGenericMotionEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.dispatchKeyEvent(keyEvent);
            }
            l.s(l.this, this.b, keyEvent);
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.dispatchKeyShortcutEvent(keyEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.dispatchTrackballEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public void onActionModeFinished(ActionMode actionMode) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onActionModeFinished(actionMode);
            }
        }

        @Override // android.view.Window.Callback
        public void onActionModeStarted(ActionMode actionMode) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onActionModeStarted(actionMode);
            }
        }

        @Override // android.view.Window.Callback
        public void onAttachedToWindow() {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onAttachedToWindow();
            }
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onCreatePanelView(i);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onDetachedFromWindow() {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onDetachedFromWindow();
            }
        }

        @Override // android.view.Window.Callback
        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onMenuItemSelected(i, menuItem);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onMenuOpened(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onPanelClosed(i, menu);
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onPreparePanel(i, view, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested() {
            Window.Callback callback = this.a;
            if (callback == null) {
                return false;
            }
            callback.onSearchRequested();
            return false;
        }

        @Override // android.view.Window.Callback
        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onWindowAttributesChanged(layoutParams);
            }
        }

        @Override // android.view.Window.Callback
        public void onWindowFocusChanged(boolean z) {
            Window.Callback callback = this.a;
            if (callback != null) {
                callback.onWindowFocusChanged(z);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            Window.Callback callback2 = this.a;
            if (callback2 != null) {
                return callback2.onWindowStartingActionMode(callback);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested(SearchEvent searchEvent) {
            Window.Callback callback = this.a;
            if (callback != null) {
                return callback.onSearchRequested(searchEvent);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Window.Callback callback2 = this.a;
            if (callback2 != null) {
                return callback2.onWindowStartingActionMode(callback, i);
            }
            return null;
        }
    }
}
