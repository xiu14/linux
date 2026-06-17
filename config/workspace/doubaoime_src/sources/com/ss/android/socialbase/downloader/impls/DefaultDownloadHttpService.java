package com.ss.android.socialbase.downloader.impls;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadInnerConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDefaultDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ss.android.socialbase.downloader.utils.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.B;
import okhttp3.D;
import okhttp3.InterfaceC0836d;
import okhttp3.Request;
import okhttp3.n;
import okhttp3.s;
import okhttp3.x;
import okhttp3.y;

/* loaded from: classes2.dex */
public class DefaultDownloadHttpService implements IDownloadHttpService {
    private final LruCache<String, x> hostIpClientCache = new LruCache<>(4, 8);

    private x createSpecialHostIpClient(String str, final String str2) {
        try {
            final String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                String str3 = host + BundleUtil.UNDERLINE_TAG + str2;
                synchronized (this.hostIpClientCache) {
                    x xVar = this.hostIpClientCache.get(str3);
                    if (xVar != null) {
                        return xVar;
                    }
                    x.b createDownloadClientBuilder = DownloadComponentManager.createDownloadClientBuilder();
                    createDownloadClientBuilder.i(new n() { // from class: com.ss.android.socialbase.downloader.impls.DefaultDownloadHttpService.2
                        @Override // okhttp3.n
                        public List<InetAddress> lookup(String str4) throws UnknownHostException {
                            return TextUtils.equals(host, str4) ? Collections.singletonList(InetAddress.getByName(str2)) : n.a.lookup(str4);
                        }
                    });
                    x c2 = createDownloadClientBuilder.c();
                    synchronized (this.hostIpClientCache) {
                        this.hostIpClientCache.put(str3, c2);
                    }
                    return c2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return DownloadComponentManager.getDownloadClient();
    }

    @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
    public IDownloadHttpConnection downloadWithConnection(int i, String str, List<HttpHeader> list) throws IOException {
        String str2;
        Request.a aVar = new Request.a();
        aVar.j(str);
        if (list == null || list.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (HttpHeader httpHeader : list) {
                String name = httpHeader.getName();
                if (!DownloadInnerConstants.TTNET_BIZ_ID_HEADER_NAME.equals(name) && !DownloadInnerConstants.TTNET_BIZ_VERSION_HEADER_NAME.equals(name)) {
                    if (str2 == null && DownloadConstants.EXTRA_REQUEST_HOST_IP.equals(name)) {
                        str2 = httpHeader.getValue();
                    } else {
                        aVar.a(name, DownloadUtils.getEncodedStr(httpHeader.getValue()));
                    }
                }
            }
        }
        x createSpecialHostIpClient = !TextUtils.isEmpty(str2) ? createSpecialHostIpClient(str, str2) : DownloadComponentManager.getDownloadClient();
        if (createSpecialHostIpClient == null) {
            throw new IOException("can't get httpClient");
        }
        final InterfaceC0836d m = createSpecialHostIpClient.m(aVar.b());
        final B c2 = ((y) m).c();
        final D a = c2.a();
        if (a == null) {
            return null;
        }
        InputStream a2 = a.a();
        String p = c2.p(DownloadHelper.CONTENT_ENCODING);
        final InputStream gZIPInputStream = (p == null || !DownloadHelper.GZIP.equalsIgnoreCase(p) || (a2 instanceof GZIPInputStream)) ? a2 : new GZIPInputStream(a2);
        return new IDefaultDownloadHttpConnection() { // from class: com.ss.android.socialbase.downloader.impls.DefaultDownloadHttpService.1
            @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
            public void cancel() {
                InterfaceC0836d interfaceC0836d = m;
                if (interfaceC0836d == null || ((y) interfaceC0836d).isCanceled()) {
                    return;
                }
                ((y) m).cancel();
            }

            @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpConnection
            public void end() {
                try {
                    D d2 = a;
                    if (d2 != null) {
                        d2.close();
                    }
                    InterfaceC0836d interfaceC0836d = m;
                    if (interfaceC0836d == null || ((y) interfaceC0836d).isCanceled()) {
                        return;
                    }
                    ((y) m).cancel();
                } catch (Throwable unused) {
                }
            }

            @Override // com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection
            public String getHostIp() {
                return "";
            }

            @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpConnection
            public InputStream getInputStream() throws IOException {
                return gZIPInputStream;
            }

            @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
            public int getResponseCode() throws IOException {
                return c2.l();
            }

            @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
            public String getResponseHeaderField(String str3) {
                return c2.p(str3);
            }

            @Override // com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection
            public List<Pair<String, String>> getResponseHeaders() {
                s w = c2.w();
                if (w == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int i2 = w.i();
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(new Pair(w.e(i3), w.k(i3)));
                }
                return arrayList;
            }

            @Override // com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection
            public boolean isOkhttp() {
                return true;
            }
        };
    }
}
