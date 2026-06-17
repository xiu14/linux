package com.bytedance.crash.util;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JSONWriter {
    private final Writer a;
    private final List<Scope> b = new ArrayList();

    enum Scope {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private JSONWriter(Writer writer) {
        this.a = writer;
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        Scope scope = Scope.EMPTY_ARRAY;
        b();
        this.b.add(scope);
        this.a.write("[");
        for (int i = 0; i < jSONArray.length(); i++) {
            g(jSONArray.get(i));
        }
        Scope scope2 = Scope.EMPTY_ARRAY;
        Scope scope3 = Scope.NONEMPTY_ARRAY;
        d();
        this.b.remove(r3.size() - 1);
        this.a.write("]");
    }

    private void b() throws JSONException, IOException {
        if (this.b.isEmpty()) {
            return;
        }
        Scope d2 = d();
        if (d2 == Scope.EMPTY_ARRAY) {
            e(Scope.NONEMPTY_ARRAY);
            return;
        }
        if (d2 == Scope.NONEMPTY_ARRAY) {
            this.a.write(44);
        } else if (d2 == Scope.DANGLING_KEY) {
            this.a.write(Constants.COLON_SEPARATOR);
            e(Scope.NONEMPTY_OBJECT);
        } else if (d2 != Scope.NULL) {
            throw new JSONException("Nesting problem");
        }
    }

    private void c(JSONObject jSONObject) throws JSONException, IOException {
        Scope scope = Scope.EMPTY_OBJECT;
        b();
        this.b.add(scope);
        this.a.write("{");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            Scope d2 = d();
            if (d2 == Scope.NONEMPTY_OBJECT) {
                this.a.write(44);
            } else if (d2 != Scope.EMPTY_OBJECT) {
                throw new JSONException("Nesting problem");
            }
            e(Scope.DANGLING_KEY);
            f(next);
            g(obj);
        }
        Scope scope2 = Scope.EMPTY_OBJECT;
        Scope scope3 = Scope.NONEMPTY_OBJECT;
        d();
        this.b.remove(r6.size() - 1);
        this.a.write("}");
    }

    private Scope d() {
        return this.b.get(r0.size() - 1);
    }

    private void e(Scope scope) {
        this.b.set(r0.size() - 1, scope);
    }

    private void f(String str) throws IOException {
        this.a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.a.write("\\f");
            } else if (charAt == '\r') {
                this.a.write("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.a.write("\\b");
                        break;
                    case '\t':
                        this.a.write("\\t");
                        break;
                    case '\n':
                        this.a.write("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.a.write(charAt);
                            break;
                        }
                }
            } else {
                this.a.write(92);
                this.a.write(charAt);
            }
        }
        this.a.write("\"");
    }

    private JSONWriter g(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            c((JSONObject) obj);
            return this;
        }
        b();
        if (obj == null || obj == JSONObject.NULL) {
            this.a.write("null");
        } else if (obj instanceof Boolean) {
            this.a.write(String.valueOf(obj));
        } else if (obj instanceof Number) {
            this.a.write(JSONObject.numberToString((Number) obj));
        } else {
            f(obj.toString());
        }
        return this;
    }

    public static void h(JSONArray jSONArray, Writer writer) throws Throwable {
        new JSONWriter(writer).a(jSONArray);
        writer.flush();
    }

    public static void i(JSONObject jSONObject, Writer writer) throws Throwable {
        new JSONWriter(writer).c(jSONObject);
        writer.flush();
    }

    public String toString() {
        return "";
    }
}
