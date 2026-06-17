package com.ss.ttuploader.net;

import com.ss.ttuploader.net.TTVNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.A;
import okhttp3.B;
import okhttp3.D;
import okhttp3.InterfaceC0836d;
import okhttp3.InterfaceC0837e;
import okhttp3.Request;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTHTTPNetwork extends TTVNetClient {
    private static final int HTTP_TIME_OUT = 10;
    public static final v JSON = v.d("application/json");
    private static x mClient;
    private InterfaceC0836d mCall;

    @Override // com.ss.ttuploader.net.TTVNetClient
    public void cancel() {
        InterfaceC0836d interfaceC0836d = this.mCall;
        if (interfaceC0836d == null || ((y) interfaceC0836d).isCanceled()) {
            return;
        }
        ((y) this.mCall).cancel();
    }

    @Override // com.ss.ttuploader.net.TTVNetClient
    public void startTask(String str, Map<String, String> map, final TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                x.b l = new x().l();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                l.d(10L, timeUnit);
                l.s(10L, timeUnit);
                l.o(10L, timeUnit);
                mClient = l.c();
            }
        }
        Request.a aVar = new Request.a();
        aVar.j(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                aVar.d(str2, map.get(str2));
            }
        }
        InterfaceC0836d m = mClient.m(aVar.b());
        this.mCall = m;
        ((y) m).b(new InterfaceC0837e() { // from class: com.ss.ttuploader.net.TTHTTPNetwork.1
            @Override // okhttp3.InterfaceC0837e
            public void onFailure(InterfaceC0836d interfaceC0836d, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.InterfaceC0837e
            public void onResponse(InterfaceC0836d interfaceC0836d, B b) {
                D d2;
                Throwable th;
                JSONObject jSONObject;
                try {
                    d2 = b.a();
                    try {
                        try {
                            jSONObject = new JSONObject(d2.p());
                            e = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (d2 != null) {
                                try {
                                    d2.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        jSONObject = null;
                    }
                    if (e == null && !b.z()) {
                        e = new Exception("http fail");
                    }
                    if (d2 != null) {
                        try {
                            d2.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (e == null) {
                        completionListener.onCompletion(jSONObject, null);
                    } else {
                        completionListener.onCompletion(jSONObject, new Error(0, null, null, e.toString()));
                    }
                } catch (Throwable th3) {
                    d2 = null;
                    th = th3;
                }
            }
        });
    }

    @Override // com.ss.ttuploader.net.TTVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                x.b l = new x().l();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                l.d(10L, timeUnit);
                l.s(10L, timeUnit);
                l.o(10L, timeUnit);
                mClient = l.c();
            }
        }
        Request.a aVar = new Request.a();
        aVar.j(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                aVar.a(str2, map.get(str2));
            }
        }
        if (i == 1) {
            aVar.f("POST", A.c(JSON, String.valueOf(jSONObject)));
        }
        InterfaceC0836d m = mClient.m(aVar.b());
        this.mCall = m;
        ((y) m).b(new InterfaceC0837e() { // from class: com.ss.ttuploader.net.TTHTTPNetwork.2
            @Override // okhttp3.InterfaceC0837e
            public void onFailure(InterfaceC0836d interfaceC0836d, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // okhttp3.InterfaceC0837e
            public void onResponse(InterfaceC0836d interfaceC0836d, B b) throws IOException {
                D d2;
                Throwable th;
                String exc;
                JSONObject jSONObject2;
                try {
                    d2 = b.a();
                    try {
                        try {
                            jSONObject2 = new JSONObject(d2.p());
                            exc = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (d2 != null) {
                                try {
                                    d2.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        exc = e2.toString();
                        e2.printStackTrace();
                        jSONObject2 = null;
                    }
                    if (!b.z()) {
                        exc = b.A();
                    }
                    if (d2 != null) {
                        try {
                            d2.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (exc == null) {
                        completionListener.onCompletion(jSONObject2, null);
                    } else {
                        completionListener.onCompletion(jSONObject2, new Error(0, null, null, exc));
                    }
                } catch (Throwable th3) {
                    d2 = null;
                    th = th3;
                }
            }
        });
    }
}
