.class final Lcom/google/android/gms/common/zad;
.super Lcom/google/android/gms/internal/base/zau;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final synthetic b:Lcom/google/android/gms/common/GoogleApiAvailability;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/GoogleApiAvailability;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/zad;->b:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/google/android/gms/common/zad;->a:Landroid/content/Context;

    .line 26
    .line 27
    return-void
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
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Don\'t know how to handle this message: "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "GoogleApiAvailability"

    .line 21
    .line 22
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget p1, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->a:I

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/gms/common/zad;->b:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/android/gms/common/zad;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->b(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    sget-object v3, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    if-eq p1, v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    if-eq p1, v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    const/16 v0, 0x9

    .line 47
    .line 48
    if-eq p1, v0, :cond_1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string v0, "n"

    .line 52
    .line 53
    invoke-virtual {v1, v2, v0, p1}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    sget v3, Lcom/google/android/gms/internal/common/zzd;->a:I

    .line 62
    .line 63
    const/high16 v4, 0x8000000

    .line 64
    .line 65
    or-int/2addr v3, v4

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-static {v2, v4, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_0
    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/common/GoogleApiAvailability;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 72
    .line 73
    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
