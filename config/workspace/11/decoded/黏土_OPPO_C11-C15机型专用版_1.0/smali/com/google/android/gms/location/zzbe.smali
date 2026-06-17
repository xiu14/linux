.class public final Lcom/google/android/gms/location/zzbe;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/location/LocationAvailability;",
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
    .locals 11

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->s(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x3e8

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x1

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    if-ge v8, v0, :cond_5

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    int-to-char v9, v8

    .line 24
    if-eq v9, v2, :cond_4

    .line 25
    .line 26
    const/4 v10, 0x2

    .line 27
    if-eq v9, v10, :cond_3

    .line 28
    .line 29
    const/4 v10, 0x3

    .line 30
    if-eq v9, v10, :cond_2

    .line 31
    .line 32
    const/4 v10, 0x4

    .line 33
    if-eq v9, v10, :cond_1

    .line 34
    .line 35
    const/4 v10, 0x5

    .line 36
    if-eq v9, v10, :cond_0

    .line 37
    .line 38
    invoke-static {p1, v8}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->r(Landroid/os/Parcel;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v5, Lcom/google/android/gms/location/zzbo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 43
    .line 44
    invoke-static {p1, v8, v5}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, [Lcom/google/android/gms/location/zzbo;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p1, v8}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {p1, v8}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {p1, v8}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-static {p1, v8}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lcom/google/android/gms/location/LocationAvailability;

    .line 75
    .line 76
    invoke-direct {p1}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 77
    .line 78
    .line 79
    iput v1, p1, Lcom/google/android/gms/location/LocationAvailability;->k:I

    .line 80
    .line 81
    iput v6, p1, Lcom/google/android/gms/location/LocationAvailability;->h:I

    .line 82
    .line 83
    iput v7, p1, Lcom/google/android/gms/location/LocationAvailability;->i:I

    .line 84
    .line 85
    iput-wide v3, p1, Lcom/google/android/gms/location/LocationAvailability;->j:J

    .line 86
    .line 87
    iput-object v5, p1, Lcom/google/android/gms/location/LocationAvailability;->l:[Lcom/google/android/gms/location/zzbo;

    .line 88
    .line 89
    return-object p1
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

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/location/LocationAvailability;

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
