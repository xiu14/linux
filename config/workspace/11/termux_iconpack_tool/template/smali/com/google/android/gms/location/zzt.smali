.class public final Lcom/google/android/gms/location/zzt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/location/zzs;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->s(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const-wide/16 v3, 0x32

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const-wide v6, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const v8, 0x7fffffff

    .line 17
    .line 18
    .line 19
    move-wide v11, v3

    .line 20
    move-wide v14, v6

    .line 21
    const/4 v10, 0x1

    .line 22
    const/4 v13, 0x0

    .line 23
    const v16, 0x7fffffff

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v3, v1, :cond_5

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-char v4, v3

    .line 37
    if-eq v4, v2, :cond_4

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    if-eq v4, v5, :cond_3

    .line 41
    .line 42
    const/4 v5, 0x3

    .line 43
    if-eq v4, v5, :cond_2

    .line 44
    .line 45
    const/4 v5, 0x4

    .line 46
    if-eq v4, v5, :cond_1

    .line 47
    .line 48
    const/4 v5, 0x5

    .line 49
    if-eq v4, v5, :cond_0

    .line 50
    .line 51
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    move/from16 v16, v3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    move-wide v14, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->l(Landroid/os/Parcel;I)F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    move v13, v3

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    move-wide v11, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    goto :goto_0

    .line 85
    :cond_5
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    new-instance v9, Lcom/google/android/gms/location/zzs;

    .line 89
    .line 90
    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/location/zzs;-><init>(ZJFJI)V

    .line 91
    .line 92
    .line 93
    return-object v9
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

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/location/zzs;

    .line 2
    .line 3
    return-object p1
    .line 4
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
.end method
