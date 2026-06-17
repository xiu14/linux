package com.obric.appstore.autoupdate;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Objects;

@TargetApi(3)
/* loaded from: classes2.dex */
public class e {
    private static final Uri b = Uri.parse("content://com.smartisanos.appstore.auto_update");

    /* renamed from: c, reason: collision with root package name */
    private static e f7518c = null;
    private a a;

    private class a extends AsyncTask<String, Void, Bundle> {
        private WeakReference<Context> a;

        public a(Context context) {
            this.a = new WeakReference<>(context);
        }

        @Override // android.os.AsyncTask
        protected Bundle doInBackground(String[] strArr) {
            NetworkInfo activeNetworkInfo;
            String[] strArr2 = strArr;
            boolean z = false;
            if (TextUtils.isEmpty(strArr2[0])) {
                Log.i("AutoUpdateUtils", "pkg is null");
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("auto_update_pkg", strArr2[0]);
            Context context = this.a.get();
            if (context != null) {
                e eVar = e.this;
                Context applicationContext = context.getApplicationContext();
                Objects.requireNonNull(eVar);
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    z = activeNetworkInfo.isConnected();
                }
                if (z) {
                    Bundle b = e.this.b(context, bundle, "checkAppUpdate");
                    Log.i("AutoUpdateUtils", "AutoUpdateTask: " + b);
                    return b;
                }
            }
            Log.i("AutoUpdateUtils", "network is not available.");
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(Bundle bundle) {
            Bundle bundle2 = bundle;
            if (isCancelled() || bundle2 == null || bundle2.isEmpty()) {
                Log.i("AutoUpdateUtils", "app update info is null.");
                return;
            }
            Context context = this.a.get();
            if (context == null) {
                Log.i("AutoUpdateUtils", "activity is null");
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    Log.i("AutoUpdateUtils", "context is null.");
                    return;
                } else if (activity.getWindow() == null) {
                    Log.i("AutoUpdateUtils", "window is null.");
                    return;
                } else if (activity.isDestroyed()) {
                    Log.i("AutoUpdateUtils", "activity is destroyed.");
                    return;
                }
            }
            new d(context, bundle2).i();
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Bundle b(Context context, Bundle bundle, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2 = 0;
        try {
            if (context == null) {
                return null;
            }
            try {
                contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(b);
                if (contentProviderClient == null) {
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    return null;
                }
                if (bundle == null) {
                    try {
                        bundle = new Bundle();
                    } catch (RemoteException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        return null;
                    }
                }
                bundle.putInt("client_ver", 1);
                Bundle call = contentProviderClient.call(str, null, bundle);
                contentProviderClient.close();
                return call;
            } catch (RemoteException e3) {
                e = e3;
                contentProviderClient = null;
            } catch (Throwable th) {
                th = th;
                if (contentProviderClient2 != 0) {
                    contentProviderClient2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            contentProviderClient2 = context;
        }
    }

    public static e e() {
        if (f7518c == null) {
            f7518c = new e();
        }
        return f7518c;
    }

    public void c(Context context, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("auto_update_pkg", str);
        bundle.putInt("auto_update_version_code", i);
        b(context, bundle, "delayUpdate");
    }

    public int d(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("auto_update_pkg", str);
        Bundle b2 = b(context, bundle, "getDownloadProgress");
        if (b2 != null) {
            return b2.getInt("auto_update_progress");
        }
        Log.d("AutoUpdateUtils", "getDownloadProgress:extrais null");
        return -1;
    }

    public void f(Context context, String str, Bundle bundle) {
        bundle.putString("auto_update_name", str);
        b(context, bundle, "installApp");
    }

    public void g() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.cancel(true);
            this.a = null;
        }
    }

    public void h(Context context, String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.cancel(true);
        }
        a aVar2 = new a(context);
        this.a = aVar2;
        aVar2.execute(str);
    }

    public void i(Context context, String str, boolean z, Bundle bundle) {
        bundle.putString("auto_update_name", str);
        bundle.putBoolean("useMobile", z);
        b(context, bundle, "startDownload");
    }

    public void j(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("auto_update_pkg", str);
        b(context, bundle, "stopDownload");
    }
}
