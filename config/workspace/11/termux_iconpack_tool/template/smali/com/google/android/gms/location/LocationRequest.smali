.class public final Lcom/google/android/gms/location/LocationRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:I

.field public i:J

.field public j:J

.field public k:Z

.field public l:J

.field public m:I

.field public n:F

.field public o:J

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/location/zzbf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/location/zzbf;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x66

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 7
    .line 8
    const-wide/32 v0, 0x36ee80

    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 12
    .line 13
    const-wide/32 v0, 0x927c0

    .line 14
    .line 15
    .line 16
    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->k:Z

    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    iput-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 27
    .line 28
    const v1, 0x7fffffff

    .line 29
    .line 30
    .line 31
    iput v1, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput v1, p0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 35
    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    iput-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 39
    .line 40
    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->p:Z

    .line 41
    .line 42
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/location/LocationRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/location/LocationRequest;

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 8
    .line 9
    iget v1, p1, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_2

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 14
    .line 15
    iget-wide v2, p1, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 22
    .line 23
    iget-wide v6, p1, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 24
    .line 25
    cmp-long v8, v4, v6

    .line 26
    .line 27
    if-nez v8, :cond_2

    .line 28
    .line 29
    iget-boolean v4, p0, Lcom/google/android/gms/location/LocationRequest;->k:Z

    .line 30
    .line 31
    iget-boolean v5, p1, Lcom/google/android/gms/location/LocationRequest;->k:Z

    .line 32
    .line 33
    if-ne v4, v5, :cond_2

    .line 34
    .line 35
    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 36
    .line 37
    iget-wide v6, p1, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 38
    .line 39
    cmp-long v8, v4, v6

    .line 40
    .line 41
    if-nez v8, :cond_2

    .line 42
    .line 43
    iget v4, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 44
    .line 45
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 46
    .line 47
    if-ne v4, v5, :cond_2

    .line 48
    .line 49
    iget v4, p0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 50
    .line 51
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 52
    .line 53
    cmpl-float v4, v4, v5

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 58
    .line 59
    cmp-long v6, v4, v0

    .line 60
    .line 61
    if-gez v6, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-wide v0, v4

    .line 65
    :goto_0
    iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 66
    .line 67
    cmp-long v6, v4, v2

    .line 68
    .line 69
    if-gez v6, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-wide v2, v4

    .line 73
    :goto_1
    cmp-long v4, v0, v2

    .line 74
    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->p:Z

    .line 78
    .line 79
    iget-boolean p1, p1, Lcom/google/android/gms/location/LocationRequest;->p:Z

    .line 80
    .line 81
    if-ne v0, p1, :cond_2

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    return p1

    .line 85
    :cond_2
    const/4 p1, 0x0

    .line 86
    return p1
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

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 20
    .line 21
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x4

    .line 26
    new-array v4, v4, [Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v4, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object v3, v4, v0

    .line 39
    .line 40
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 6
    .line 7
    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 8
    .line 9
    new-instance v6, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v7, "Request["

    .line 12
    .line 13
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v7, p0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 17
    .line 18
    const/16 v8, 0x64

    .line 19
    .line 20
    const/16 v9, 0x69

    .line 21
    .line 22
    if-eq v7, v8, :cond_3

    .line 23
    .line 24
    const/16 v8, 0x66

    .line 25
    .line 26
    if-eq v7, v8, :cond_2

    .line 27
    .line 28
    const/16 v8, 0x68

    .line 29
    .line 30
    if-eq v7, v8, :cond_1

    .line 31
    .line 32
    if-eq v7, v9, :cond_0

    .line 33
    .line 34
    const-string v8, "???"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v8, "PRIORITY_NO_POWER"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-string v8, "PRIORITY_LOW_POWER"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string v8, "PRIORITY_BALANCED_POWER_ACCURACY"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const-string v8, "PRIORITY_HIGH_ACCURACY"

    .line 47
    .line 48
    :goto_0
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v8, "ms"

    .line 52
    .line 53
    if-eq v7, v9, :cond_4

    .line 54
    .line 55
    const-string v7, " requested="

    .line 56
    .line 57
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_4
    const-string v7, " fastest="

    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-wide v9, p0, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 72
    .line 73
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    cmp-long v7, v2, v4

    .line 80
    .line 81
    if-lez v7, :cond_5

    .line 82
    .line 83
    const-string v4, " maxWait="

    .line 84
    .line 85
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_5
    const/4 v2, 0x0

    .line 95
    cmpl-float v2, v1, v2

    .line 96
    .line 97
    if-lez v2, :cond_6

    .line 98
    .line 99
    const-string v2, " smallestDisplacement="

    .line 100
    .line 101
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, "m"

    .line 108
    .line 109
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 113
    .line 114
    const-wide v3, 0x7fffffffffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    cmp-long v5, v1, v3

    .line 120
    .line 121
    if-eqz v5, :cond_7

    .line 122
    .line 123
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    const-string v5, " expireIn="

    .line 128
    .line 129
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    sub-long/2addr v1, v3

    .line 133
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    :cond_7
    const v1, 0x7fffffff

    .line 140
    .line 141
    .line 142
    if-eq v0, v1, :cond_8

    .line 143
    .line 144
    const-string v1, " num="

    .line 145
    .line 146
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    :cond_8
    const/16 v0, 0x5d

    .line 153
    .line 154
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0
    .line 162
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->h(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->j:J

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->k:Z

    .line 38
    .line 39
    invoke-static {p1, v2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    .line 46
    .line 47
    const/4 v3, 0x5

    .line 48
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 52
    .line 53
    .line 54
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    .line 55
    .line 56
    const/4 v1, 0x6

    .line 57
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    .line 63
    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->n:F

    .line 64
    .line 65
    const/4 v1, 0x7

    .line 66
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 70
    .line 71
    .line 72
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->o:J

    .line 73
    .line 74
    invoke-static {p1, v4, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 78
    .line 79
    .line 80
    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->p:Z

    .line 81
    .line 82
    const/16 v1, 0x9

    .line 83
    .line 84
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 91
    .line 92
    .line 93
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method
