.class public Lcom/google/android/gms/common/internal/GetServiceRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/GetServiceRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:[Lcom/google/android/gms/common/api/Scope;

.field public static final w:[Lcom/google/android/gms/common/Feature;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public k:Ljava/lang/String;

.field public l:Landroid/os/IBinder;

.field public m:[Lcom/google/android/gms/common/api/Scope;

.field public n:Landroid/os/Bundle;

.field public o:Landroid/accounts/Account;

.field public p:[Lcom/google/android/gms/common/Feature;

.field public q:[Lcom/google/android/gms/common/Feature;

.field public final r:Z

.field public final s:I

.field public t:Z

.field public final u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/common/internal/zzn;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/internal/zzn;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/common/internal/GetServiceRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    .line 10
    .line 11
    sput-object v1, Lcom/google/android/gms/common/internal/GetServiceRequest;->v:[Lcom/google/android/gms/common/api/Scope;

    .line 12
    .line 13
    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    .line 14
    .line 15
    sput-object v0, Lcom/google/android/gms/common/internal/GetServiceRequest;->w:[Lcom/google/android/gms/common/Feature;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/Feature;[Lcom/google/android/gms/common/Feature;ZIZLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lcom/google/android/gms/common/internal/GetServiceRequest;->v:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    sget-object v0, Lcom/google/android/gms/common/internal/GetServiceRequest;->w:[Lcom/google/android/gms/common/Feature;

    if-nez p9, :cond_2

    move-object p9, v0

    :cond_2
    if-nez p10, :cond_3

    move-object p10, v0

    :cond_3
    iput p1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->h:I

    iput p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->i:I

    iput p3, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->j:I

    .line 2
    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->k:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_4
    iput-object p4, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->k:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_7

    const/4 p1, 0x0

    if-eqz p5, :cond_6

    .line 4
    sget p2, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->c:I

    .line 5
    const-string p2, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {p5, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p3

    instance-of p4, p3, Lcom/google/android/gms/common/internal/IAccountAccessor;

    if-eqz p4, :cond_5

    .line 6
    check-cast p3, Lcom/google/android/gms/common/internal/IAccountAccessor;

    goto :goto_1

    :cond_5
    new-instance p3, Lcom/google/android/gms/common/internal/zzw;

    .line 7
    invoke-direct {p3, p5, p2}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 8
    :goto_1
    sget p2, Lcom/google/android/gms/common/internal/AccountAccessor;->d:I

    .line 9
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide p4

    .line 10
    :try_start_0
    invoke-interface {p3}, Lcom/google/android/gms/common/internal/IAccountAccessor;->c()Landroid/accounts/Account;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    :goto_2
    invoke-static {p4, p5}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_1
    const-string p2, "AccountAccessor"

    const-string p3, "Remote account accessor probably died"

    .line 12
    invoke-static {p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 13
    :goto_3
    invoke-static {p4, p5}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 14
    throw p1

    .line 15
    :cond_6
    :goto_4
    iput-object p1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->o:Landroid/accounts/Account;

    goto :goto_5

    :cond_7
    iput-object p5, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->l:Landroid/os/IBinder;

    iput-object p8, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->o:Landroid/accounts/Account;

    :goto_5
    iput-object p6, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->m:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->n:Landroid/os/Bundle;

    iput-object p9, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->p:[Lcom/google/android/gms/common/Feature;

    iput-object p10, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->q:[Lcom/google/android/gms/common/Feature;

    iput-boolean p11, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->r:Z

    iput p12, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->s:I

    iput-boolean p13, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->t:Z

    iput-object p14, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/internal/zzn;->a(Lcom/google/android/gms/common/internal/GetServiceRequest;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
