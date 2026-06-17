package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.P;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.mime.i;
import com.vivo.push.PushClient;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.A;

/* loaded from: classes2.dex */
public final class Request {
    public static final String KEY_BYPASS_DISPATCH = "x-tt-bypass-dp";
    public static final String KEY_BYPASS_OKHTTP_COOKIE = "x-metasec-bypass-okhttp-cookie";
    public static final String KEY_BYPASS_TTNET_COOKIE_HEADER = "x-ttnet-bypass-cookie";
    public static final String KEY_BYPASS_TTNET_FEATURES = "x-metasec-bypass-ttnet-features";
    private final boolean addCommonParam;
    private final i body;
    private int commonParamLevel;
    private Object extraInfo;
    private final List<b> headers;
    private boolean isBodyEncryptEnabled;
    private boolean isQueryEncryptEnabled;
    private final int maxLength;
    private final String method;
    private RetrofitMetrics metrics;
    private final int priorityLevel;
    private int queryFilterPriority;
    private final A requestBody;
    private final int requestPriorityLevel;
    private final boolean responseStreaming;
    private final String serviceType;
    private final Map<Class<?>, Object> tags;
    private URI uri;
    private final String url;

    public Request(String str, String str2, List<b> list, i iVar, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, iVar, null, i, 3, z, i2, z2, 0, obj, "", null);
    }

    private static URI createUriWithOutQuery(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private URI getUri() {
        return safeCreateUri(this.url);
    }

    private static URI safeCreateUri(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            try {
                return new URI(str);
            } catch (URISyntaxException unused) {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            }
        } catch (Exception unused2) {
            return createUriWithOutQuery(str);
        }
    }

    public i getBody() {
        A a2 = this.requestBody;
        return a2 != null ? P.b(a2) : this.body;
    }

    public int getCommonParamLevel() {
        return this.commonParamLevel;
    }

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public b getFirstHeader(String str) {
        List<b> list;
        if (str != null && (list = this.headers) != null) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public List<b> getHeaders() {
        return this.headers;
    }

    public String getHost() {
        URI uri = getUri();
        if (uri == null) {
            return null;
        }
        return uri.getHost();
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getMethod() {
        return this.method;
    }

    public RetrofitMetrics getMetrics() {
        return this.metrics;
    }

    public String getPath() {
        URI uri = getUri();
        if (uri == null) {
            return null;
        }
        return uri.getPath();
    }

    public int getPriorityLevel() {
        return this.priorityLevel;
    }

    public int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public A getRequestBody() {
        return this.requestBody;
    }

    public int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getUrl() {
        return this.url;
    }

    public List<b> headers(String str) {
        List<b> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.headers) != null) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.a())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public boolean isBodyEncryptEnabled() {
        return this.isBodyEncryptEnabled;
    }

    public boolean isBypassDispatch() {
        List<b> headers = headers(KEY_BYPASS_DISPATCH);
        return headers != null && headers.size() > 0 && PushClient.DEFAULT_REQUEST_ID.equals(headers.get(0).b());
    }

    public boolean isPureRequest() {
        List<b> headers = headers(KEY_BYPASS_TTNET_FEATURES);
        return headers != null && headers.size() > 0 && PushClient.DEFAULT_REQUEST_ID.equals(headers.get(0).b());
    }

    public boolean isQueryEncryptEnabled() {
        return this.isQueryEncryptEnabled;
    }

    public boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    public a newBuilder() {
        return new a(this);
    }

    public void setBodyEncryptEnabled(boolean z) {
        this.isBodyEncryptEnabled = z;
    }

    public void setCommonParamLevel(int i) {
        this.commonParamLevel = i;
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public void setMetrics(RetrofitMetrics retrofitMetrics) {
        this.metrics = retrofitMetrics;
    }

    public void setQueryEncryptEnabled(boolean z) {
        this.isQueryEncryptEnabled = z;
    }

    public void setQueryFilterPriority(int i) {
        this.queryFilterPriority = i;
    }

    public Object tag() {
        return tag(Object.class);
    }

    public static class a {
        String a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        List<b> f6005c;

        /* renamed from: d, reason: collision with root package name */
        i f6006d;

        /* renamed from: e, reason: collision with root package name */
        A f6007e;

        /* renamed from: f, reason: collision with root package name */
        int f6008f;

        /* renamed from: g, reason: collision with root package name */
        int f6009g;
        boolean h;
        int i;
        boolean j;
        int k;
        Object l;
        String m;
        RetrofitMetrics n;
        Map<Class<?>, Object> o;
        boolean p;
        boolean q;

        public a() {
            this.a = "GET";
        }

        public Request a() {
            if (this.b != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(List<b> list) {
            this.f6005c = list;
            return this;
        }

        public a c(i iVar) {
            if (!P.o("POST")) {
                throw new IllegalArgumentException("method POST must not have a request body.");
            }
            this.a = "POST";
            this.f6006d = iVar;
            return this;
        }

        public a d(int i) {
            this.f6008f = i;
            return this;
        }

        public a e(int i) {
            this.f6009g = i;
            return this;
        }

        public a f(Object obj) {
            this.l = obj;
            return this;
        }

        public a g(String str) {
            Objects.requireNonNull(str, "url == null");
            this.b = str;
            return this;
        }

        a(Request request) {
            this.a = request.method;
            this.b = request.url;
            LinkedList linkedList = new LinkedList();
            this.f6005c = linkedList;
            linkedList.addAll(request.headers);
            this.f6006d = request.body;
            this.f6007e = request.requestBody;
            this.f6008f = request.priorityLevel;
            this.f6009g = request.requestPriorityLevel;
            this.h = request.responseStreaming;
            this.i = request.maxLength;
            this.j = request.addCommonParam;
            this.k = request.commonParamLevel;
            this.l = request.extraInfo;
            this.m = request.serviceType;
            this.n = request.metrics;
            this.o = request.tags;
            this.p = request.isQueryEncryptEnabled;
            this.q = request.isBodyEncryptEnabled;
        }
    }

    public Request(String str, String str2, List<b> list, i iVar, A a2, int i, int i2, boolean z, int i3, boolean z2, int i4, Object obj, String str3, Map<Class<?>, Object> map) {
        this.queryFilterPriority = 0;
        Objects.requireNonNull(str, "Method must not be null.");
        Objects.requireNonNull(str2, "URL must not be null.");
        this.method = str;
        this.url = str2;
        if (list == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(list));
        }
        this.body = iVar;
        this.requestBody = a2;
        this.priorityLevel = i;
        this.requestPriorityLevel = i2;
        this.responseStreaming = z;
        this.maxLength = i3;
        this.addCommonParam = z2;
        this.commonParamLevel = i4;
        this.extraInfo = obj;
        this.serviceType = str3;
        this.tags = map;
    }

    public <T> T tag(Class<? extends T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return cls.cast(map.get(cls));
    }

    Request(a aVar) {
        this.queryFilterPriority = 0;
        String str = aVar.b;
        Objects.requireNonNull(str, "URL must not be null.");
        this.url = str;
        String str2 = aVar.a;
        Objects.requireNonNull(str2, "Method must not be null.");
        this.method = str2;
        if (aVar.f6005c == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(aVar.f6005c));
        }
        this.body = aVar.f6006d;
        this.requestBody = aVar.f6007e;
        this.priorityLevel = aVar.f6008f;
        this.requestPriorityLevel = aVar.f6009g;
        this.responseStreaming = aVar.h;
        this.maxLength = aVar.i;
        this.addCommonParam = aVar.j;
        this.commonParamLevel = aVar.k;
        this.extraInfo = aVar.l;
        this.serviceType = aVar.m;
        this.metrics = aVar.n;
        this.tags = aVar.o;
        this.isQueryEncryptEnabled = aVar.p;
        this.isBodyEncryptEnabled = aVar.q;
    }
}
