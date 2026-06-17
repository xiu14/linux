.class final Lcom/google/android/gms/internal/play_billing/zzcj$zzb;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:Lcom/google/android/gms/internal/play_billing/zzcj;

.field public final i:Lcom/google/android/gms/internal/play_billing/zzcz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/zzcj;Lcom/google/android/gms/internal/play_billing/zzcz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->h:Lcom/google/android/gms/internal/play_billing/zzcj;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->i:Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->h:Lcom/google/android/gms/internal/play_billing/zzcj;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/zzck;->h:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->i:Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->h:Lcom/google/android/gms/internal/play_billing/zzcj;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzcj;->i(Lcom/google/android/gms/internal/play_billing/zzcz;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzck;->n:Lcom/google/android/gms/internal/play_billing/zzck$zza;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p0, v0}, Lcom/google/android/gms/internal/play_billing/zzck$zza;->f(Lcom/google/android/gms/internal/play_billing/zzck;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzcj$zzb;->h:Lcom/google/android/gms/internal/play_billing/zzcj;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzcj;->k(Lcom/google/android/gms/internal/play_billing/zzcj;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method
