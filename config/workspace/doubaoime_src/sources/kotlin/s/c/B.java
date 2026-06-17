package kotlin.s.c;

/* loaded from: classes2.dex */
public class B {
    public String a(i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
