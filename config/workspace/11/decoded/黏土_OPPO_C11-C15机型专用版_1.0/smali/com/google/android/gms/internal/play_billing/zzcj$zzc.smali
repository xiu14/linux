.class final Lcom/google/android/gms/internal/play_billing/zzcj$zzc;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final b:Lcom/google/android/gms/internal/play_billing/zzcj$zzc;

.field public static final c:Lcom/google/android/gms/internal/play_billing/zzcj$zzc;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzcj$zzc$1;

    .line 4
    .line 5
    const-string v2, "Failure occurred while trying to finish a future."

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;->b:Lcom/google/android/gms/internal/play_billing/zzcj$zzc;

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;

    .line 16
    .line 17
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzcj$zzc$2;

    .line 18
    .line 19
    const-string v2, "Failure.exception is unexpectedly null."

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;->c:Lcom/google/android/gms/internal/play_billing/zzcj$zzc;

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzc;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    return-void
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
.end method
