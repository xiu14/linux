package com.bytedance.frameworks.baselib.network.e;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.client.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b extends c {
    private static final String l = "b";
    private List<String> i;
    private boolean j;
    private boolean k;

    public b(int i) {
        super(i);
        this.i = new ArrayList();
        this.j = false;
        this.k = false;
    }

    @Override // com.bytedance.frameworks.baselib.network.e.c
    protected boolean b(Request request, Map<String, List<String>> map) {
        byte[] a;
        boolean z = false;
        if (!this.j && e(request)) {
            if (this.k) {
                request.setBodyEncryptEnabled(true);
                z = true;
            }
            if (map.isEmpty()) {
                return z;
            }
            if (!this.i.isEmpty() && !map.containsKey("x-tt-encrypt-queries")) {
                LinkedList<Pair> linkedList = new LinkedList();
                for (String str : this.i) {
                    if (map.containsKey(str)) {
                        linkedList.add(new Pair(str, map.get(str)));
                    }
                }
                if (linkedList.isEmpty()) {
                    return z;
                }
                StringBuilder sb = new StringBuilder();
                for (Pair pair : linkedList) {
                    String str2 = (String) pair.first;
                    List<String> list = (List) pair.second;
                    if (list != null && list.size() > 0) {
                        for (String str3 : list) {
                            if (sb.length() > 0) {
                                sb.append(ContainerUtils.FIELD_DELIMITER);
                            }
                            e.a.a.a.a.K0(sb, str2, ContainerUtils.KEY_VALUE_DELIMITER, str3);
                        }
                    }
                }
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2)) {
                    return z;
                }
                byte[] bArr = null;
                try {
                    bArr = sb2.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
                if (bArr == null || (a = EncryptorUtil.a(bArr, bArr.length)) == null) {
                    return z;
                }
                String encodeToString = Base64.encodeToString(a, 2);
                if (Logger.debug()) {
                    Logger.d(l, "encryptBytes:" + a + " , encryptString:" + encodeToString);
                }
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(encodeToString);
                request.setQueryEncryptEnabled(true);
                map.put("x-tt-encrypt-queries", linkedList2);
                Iterator<String> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    map.remove(it2.next());
                }
                return true;
            }
        }
        return z;
    }

    @Override // com.bytedance.frameworks.baselib.network.e.c
    protected void f(JSONObject jSONObject) {
        g(jSONObject);
        d.g(jSONObject.optJSONArray("encrypt_query_list"), this.i);
        this.k = jSONObject.optInt("encrypt_body_enabled", 0) > 0;
        if (!this.i.isEmpty() || this.k) {
            return;
        }
        this.j = true;
    }
}
