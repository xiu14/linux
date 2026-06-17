.class public final Lcom/google/android/gms/internal/play_billing/zzp;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lcom/google/android/gms/internal/play_billing/zzt;

.field public c:Lcom/google/android/gms/internal/play_billing/zzv;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzv;->j()Lcom/google/android/gms/internal/play_billing/zzv;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->c:Lcom/google/android/gms/internal/play_billing/zzv;

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->b:Lcom/google/android/gms/internal/play_billing/zzt;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/zzt;->i:Lcom/google/android/gms/internal/play_billing/zzo;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lcom/google/android/gms/internal/play_billing/zzo;->n:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2, p1}, Lcom/google/android/gms/internal/play_billing/zzd;->d(Lcom/google/android/gms/internal/play_billing/zzo;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->d(Lcom/google/android/gms/internal/play_billing/zzo;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lcom/google/android/gms/internal/play_billing/zzp;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v2, p0, Lcom/google/android/gms/internal/play_billing/zzp;->b:Lcom/google/android/gms/internal/play_billing/zzt;

    .line 32
    .line 33
    iput-object v2, p0, Lcom/google/android/gms/internal/play_billing/zzp;->c:Lcom/google/android/gms/internal/play_billing/zzv;

    .line 34
    .line 35
    :cond_1
    return-void
    .line 36
    .line 37
.end method

.method public final finalize()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->b:Lcom/google/android/gms/internal/play_billing/zzt;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/zzt;->i:Lcom/google/android/gms/internal/play_billing/zzo;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->isDone()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/internal/play_billing/zzq;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/zzp;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "The completer object was garbage collected - this future would otherwise never complete. The tag was: "

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/google/android/gms/internal/play_billing/zzg;

    .line 32
    .line 33
    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/play_billing/zzg;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 37
    .line 38
    invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/internal/play_billing/zzd;->d(Lcom/google/android/gms/internal/play_billing/zzo;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->d(Lcom/google/android/gms/internal/play_billing/zzo;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->d:Z

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzp;->c:Lcom/google/android/gms/internal/play_billing/zzv;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzv;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
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
    .line 72
    .line 73
    .line 74
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
