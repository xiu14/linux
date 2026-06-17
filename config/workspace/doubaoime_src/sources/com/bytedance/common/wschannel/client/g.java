package com.bytedance.common.wschannel.client;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;

/* loaded from: classes.dex */
public class g extends a {
    public g(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.c
    public void a(Intent intent, com.bytedance.common.wschannel.model.a aVar) {
        intent.setExtrasClassLoader(ServiceConnectEvent.class.getClassLoader());
        try {
            this.a.d((ServiceConnectEvent) intent.getParcelableExtra("service"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
