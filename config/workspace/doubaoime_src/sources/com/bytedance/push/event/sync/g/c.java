package com.bytedance.push.event.sync.g;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;
import com.bytedance.push.C;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends a implements Observer {
    private void r() {
        Rect g2 = com.bytedance.common.push.b.e().g();
        if (g2 != null) {
            WindowManager windowManager = (WindowManager) com.ss.android.message.a.a().getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            StringBuilder O = e.a.a.a.a.O("[reportAppPositionSignal]deviceWidth:", i, " deviceHeight:", i2, " icon_widget:");
            O.append(g2.width());
            O.append(" icon_height:");
            O.append(g2.height());
            com.bytedance.push.g0.f.c("AppPositionReporter", O.toString());
            JSONObject jSONObject = new JSONObject();
            add(jSONObject, "icon_left", g2.left);
            add(jSONObject, "icon_top", g2.top);
            add(jSONObject, "icon_right", g2.right);
            add(jSONObject, "icon_bottom", g2.bottom);
            add(jSONObject, "icon_width", g2.width());
            add(jSONObject, "icon_height", g2.height());
            add(jSONObject, "device_width", i);
            add(jSONObject, "device_height", i2);
            ((com.bytedance.push.event.sync.f) ((C) C.a()).t().getISignalReporter()).n(this.a, "app_position", this.b, jSONObject);
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "app_position";
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        if (com.bytedance.push.K.a.d().f()) {
            r();
        } else {
            com.bytedance.push.K.a.d().addObserver(this);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        com.bytedance.push.K.a.d().deleteObserver(this);
        r();
    }
}
