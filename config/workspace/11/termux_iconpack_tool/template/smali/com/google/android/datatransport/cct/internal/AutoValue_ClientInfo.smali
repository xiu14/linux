.class final Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;
.super Lcom/google/android/datatransport/cct/internal/ClientInfo;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo$Builder;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

.field public final b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;


# direct methods
.method public constructor <init>(Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/datatransport/cct/internal/ClientInfo;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

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
.method public final b()Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final c()Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/google/android/datatransport/cct/internal/ClientInfo;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/datatransport/cct/internal/ClientInfo;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/datatransport/cct/internal/ClientInfo;->c()Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/datatransport/cct/internal/ClientInfo;->c()Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/google/android/datatransport/cct/internal/ClientInfo;->b()Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/datatransport/cct/internal/ClientInfo;->b()Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    :goto_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_3
    const/4 p1, 0x0

    .line 55
    return p1
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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const v2, 0xf4243

    .line 13
    .line 14
    .line 15
    xor-int/2addr v1, v2

    .line 16
    mul-int v1, v1, v2

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_1
    xor-int/2addr v0, v1

    .line 28
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ClientInfo{clientType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->a:Lcom/google/android/datatransport/cct/internal/ClientInfo$ClientType;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", androidClientInfo="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/datatransport/cct/internal/AutoValue_ClientInfo;->b:Lcom/google/android/datatransport/cct/internal/AndroidClientInfo;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "}"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
    .line 33
.end method
