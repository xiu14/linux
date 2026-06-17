package org.chromium.wschannel;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.B;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import org.chromium.CronetClient;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WsClient implements IWsClient {
    private static final String TAG = "WsClient";
    private static final String TTNET_INIT_CLASS = "com.bytedance.ttnet.TTNetInit";
    private static AbstractC0759g mCronetEngine;
    private a mCallback = new a();
    private IMessageReceiveListener mListener;
    private B mWebsocketConnection;

    class a extends B.b {
        a() {
        }

        @Override // com.ttnet.org.chromium.net.B.b
        public void a(B b, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, str2);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.B.b
        public void b(B b, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(WsConstants.KEY_CONNECTION_STATE, WsClient.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.B.b
        public void c(B b, String str) {
            if (WsClient.this.mListener != null) {
                WsClient.this.mListener.onFeedBackLog(str);
            }
        }

        @Override // com.ttnet.org.chromium.net.B.b
        public void d(B b, ByteBuffer byteBuffer, int i) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            if (i != 1 && i != 2) {
                i = 0;
            }
            try {
                byteBuffer.get(bArr);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onMessage(bArr, i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.B.b
        public void e(B b, String str, long j, long j2, boolean z) {
            try {
                d.a().b(str, j, j2, z);
            } catch (Throwable unused) {
            }
        }
    }

    public WsClient(IMessageReceiveListener iMessageReceiveListener) throws NullPointerException {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i;
        }
        return 5;
    }

    private AbstractC0759g getCronetEngine() {
        if (Logger.debug()) {
            Logger.d(TAG, "Init cronet engine");
        }
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            th.printStackTrace();
            if (Logger.debug()) {
                Logger.d(TAG, "TTNet init failed, cronet engine is null.");
            }
        }
        return CronetClient.getCronetEngine();
    }

    private static void loadCronetKernel() throws Exception {
        Object newInstance = Class.forName(TTNET_INIT_CLASS).newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        B b = this.mWebsocketConnection;
        if (b == null) {
            return false;
        }
        return b.d();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        B b = this.mWebsocketConnection;
        if (b != null) {
            b.f();
            this.mWebsocketConnection.c();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.M("openConnection url:"), list.get(0), TAG);
        }
        B.a d2 = mCronetEngine.d(this.mCallback, Executors.newSingleThreadExecutor());
        d2.l(list);
        if (map != null && !map.isEmpty()) {
            d2.f(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            d2.e(map2);
        }
        d2.k(z);
        d2.m(z2);
        B a2 = d2.a();
        this.mWebsocketConnection = a2;
        a2.e();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i) throws Exception {
        if (Logger.debug()) {
            Logger.d(TAG, "sendMessage data:" + bArr);
        }
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            this.mWebsocketConnection.a(allocateDirect);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Unsupported message type: ", i));
            }
            this.mWebsocketConnection.b(new String(bArr, "UTF-8"));
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        B b = this.mWebsocketConnection;
        if (b != null) {
            b.f();
            this.mWebsocketConnection.c();
        }
    }
}
