package com.bytedance.android.input.speech;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.permission.PermissionRequestActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class F {
    public final boolean a(boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        boolean a = com.bytedance.android.input.common_biz.permission.i.a(aVar.getContext(), "android.permission.RECORD_AUDIO");
        if (!a && z) {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrManager", "StartAsr: RequestAudioPermissions");
            if (aVar.o().getBoolean("record_audio_system_pop_have_show", false)) {
                Objects.requireNonNull(aVar);
                Context context = aVar.getContext();
                Objects.requireNonNull(aVar);
                String string = aVar.getContext().getString(C0838R.string.recorder_tip_title);
                Objects.requireNonNull(aVar);
                String string2 = aVar.getContext().getString(C0838R.string.recorder_tip);
                Objects.requireNonNull(aVar);
                String string3 = aVar.getContext().getString(C0838R.string.recorder_tip_left_btn);
                Objects.requireNonNull(aVar);
                String string4 = aVar.getContext().getString(C0838R.string.recorder_tip_right_btn);
                Bundle bundle = new Bundle();
                bundle.putInt("request_type", 3);
                if (!TextUtils.isEmpty(string3)) {
                    bundle.putString("left_btn_text", string3);
                }
                bundle.putBoolean("is_need_delay", true);
                if (!TextUtils.isEmpty(string4)) {
                    bundle.putString("right_btn_text", string4);
                }
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString("tip_title", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("tip_desc", string2);
                }
                Intent intent = new Intent(context, (Class<?>) PermissionRequestActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("key_bundle", bundle);
                intent.addFlags(65536);
                context.startActivity(intent);
            } else {
                Objects.requireNonNull(aVar);
                d.a.b.a.m(aVar.getContext(), "android.permission.RECORD_AUDIO", 10, "该功能需开启你的麦克风权限", "用于为你提供语音输入服务");
            }
        }
        return a;
    }
}
