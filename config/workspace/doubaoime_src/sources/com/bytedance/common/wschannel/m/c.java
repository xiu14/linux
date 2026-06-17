package com.bytedance.common.wschannel.m;

import android.text.TextUtils;
import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.squareup.wire.Wire;
import com.squareup.wire.internal.Internal;
import f.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class c implements a {
    c() {
    }

    @Override // com.bytedance.common.wschannel.m.a
    public WsChannelMsg a(byte[] bArr) throws IOException {
        StringBuilder sb;
        int indexOf;
        Frame decode = Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD)).intValue();
        List<Frame.b> list = (List) Wire.get(decode.headers, Collections.emptyList());
        String str = (String) Wire.get(decode.payload_encoding, "");
        String str2 = (String) Wire.get(decode.payload_type, "");
        byte[] s = ((h) Wire.get(decode.payload, Frame.DEFAULT_PAYLOAD)).s();
        String str3 = (String) Wire.get(decode.serverTiming, "");
        String str4 = (String) Wire.get(decode.msgId, "");
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.v(longValue2);
        wsChannelMsg.O(longValue);
        wsChannelMsg.T(intValue);
        wsChannelMsg.y(intValue2);
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (Frame.b bVar : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.c((String) Wire.get(bVar.a, ""));
                msgHeader.e((String) Wire.get(bVar.b, ""));
                arrayList.add(msgHeader);
            }
            wsChannelMsg.B(arrayList);
        }
        wsChannelMsg.J(str);
        wsChannelMsg.K(str2);
        wsChannelMsg.F(s);
        String str5 = null;
        if (!TextUtils.isEmpty(str3) && (indexOf = (sb = new StringBuilder(str3)).indexOf("ttnet;")) >= 0) {
            StringBuilder M = e.a.a.a.a.M("recv_time=");
            M.append(System.currentTimeMillis());
            M.append(";");
            sb.insert(indexOf + 6, M.toString());
            str5 = sb.toString();
        }
        if (!TextUtils.isEmpty(str5)) {
            str3 = str5;
        }
        wsChannelMsg.R(str3);
        wsChannelMsg.C(str4);
        return wsChannelMsg;
    }

    @Override // com.bytedance.common.wschannel.m.a
    public byte[] b(WsChannelMsg wsChannelMsg) {
        h l = wsChannelMsg.f() != null ? h.l(wsChannelMsg.f()) : h.f10045d;
        Frame.a aVar = new Frame.a();
        aVar.b = Long.valueOf(wsChannelMsg.a());
        aVar.a = Long.valueOf(wsChannelMsg.k());
        aVar.f4271c = Integer.valueOf(wsChannelMsg.m());
        aVar.f4274f = wsChannelMsg.g();
        aVar.f4275g = wsChannelMsg.i();
        aVar.h = l;
        aVar.f4272d = Integer.valueOf(wsChannelMsg.c());
        List<WsChannelMsg.MsgHeader> e2 = wsChannelMsg.e();
        ArrayList arrayList = new ArrayList();
        if (e2 != null) {
            for (WsChannelMsg.MsgHeader msgHeader : e2) {
                Frame.b.a aVar2 = new Frame.b.a();
                aVar2.a = msgHeader.a();
                aVar2.b = msgHeader.b();
                arrayList.add(aVar2.build());
            }
        }
        if (!arrayList.isEmpty()) {
            Internal.checkElementsNotNull(arrayList);
            aVar.f4273e = arrayList;
        }
        return Frame.ADAPTER.encode(aVar.build());
    }
}
