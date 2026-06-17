.class public Lcom/google/android/gms/common/GmsSignatureVerifier;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation runtime Lcom/google/errorprone/annotations/RestrictedInheritance;
    allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*"
    explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes."
    link = "go/gmscore-restrictedinheritance"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/common/zzz;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/zzz;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.google.android.gms"

    .line 7
    .line 8
    iput-object v1, v0, Lcom/google/android/gms/common/zzz;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-wide/32 v1, 0xc2bd840

    .line 11
    .line 12
    .line 13
    iput-wide v1, v0, Lcom/google/android/gms/common/zzz;->b:J

    .line 14
    .line 15
    sget-object v1, Lcom/google/android/gms/common/zzn;->d:Lcom/google/android/gms/common/zzi;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lcom/google/android/gms/common/zzn;->b:Lcom/google/android/gms/common/zzg;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/common/zzag;->p(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzag;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, Lcom/google/android/gms/internal/common/zzag;->m(Ljava/util/Collection;)Lcom/google/android/gms/internal/common/zzag;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, v0, Lcom/google/android/gms/common/zzz;->c:Lcom/google/android/gms/internal/common/zzag;

    .line 36
    .line 37
    sget-object v2, Lcom/google/android/gms/common/zzn;->c:Lcom/google/android/gms/common/zzh;

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    sget-object v4, Lcom/google/android/gms/common/zzn;->a:Lcom/google/android/gms/common/zzf;

    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/common/zzag;->p(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzag;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3}, Lcom/google/android/gms/internal/common/zzag;->m(Ljava/util/Collection;)Lcom/google/android/gms/internal/common/zzag;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v3, v0, Lcom/google/android/gms/common/zzz;->d:Lcom/google/android/gms/internal/common/zzag;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/gms/common/zzz;->a()V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lcom/google/android/gms/common/zzz;

    .line 63
    .line 64
    invoke-direct {v0}, Lcom/google/android/gms/common/zzz;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "com.android.vending"

    .line 68
    .line 69
    iput-object v3, v0, Lcom/google/android/gms/common/zzz;->a:Ljava/lang/String;

    .line 70
    .line 71
    const-wide/32 v3, 0x4e6e200

    .line 72
    .line 73
    .line 74
    iput-wide v3, v0, Lcom/google/android/gms/common/zzz;->b:J

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzag;->o(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzag;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzag;->m(Ljava/util/Collection;)Lcom/google/android/gms/internal/common/zzag;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, v0, Lcom/google/android/gms/common/zzz;->c:Lcom/google/android/gms/internal/common/zzag;

    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/google/android/gms/common/zzl;->l()[B

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzag;->o(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzag;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzag;->m(Ljava/util/Collection;)Lcom/google/android/gms/internal/common/zzag;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, v0, Lcom/google/android/gms/common/zzz;->d:Lcom/google/android/gms/internal/common/zzag;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/google/android/gms/common/zzz;->a()V

    .line 105
    .line 106
    .line 107
    new-instance v0, Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    return-void
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
