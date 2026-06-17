.class public final Ll2/c0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Ljava/util/HashSet;

.field public final c:Ll2/h;

.field public final d:Ll2/h;

.field public final e:I

.field public final f:I

.field public final g:Ll2/d;

.field public final h:J

.field public final i:Ll2/b0;

.field public final j:J

.field public final k:I

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/util/UUID;ILjava/util/HashSet;Ll2/h;Ll2/h;IILl2/d;JLl2/b0;JI)V
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p2, v0}, Landroidx/appcompat/app/b;->t(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outputData"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "progress"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ll2/c0;->a:Ljava/util/UUID;

    .line 20
    .line 21
    iput p2, p0, Ll2/c0;->l:I

    .line 22
    .line 23
    iput-object p3, p0, Ll2/c0;->b:Ljava/util/HashSet;

    .line 24
    .line 25
    iput-object p4, p0, Ll2/c0;->c:Ll2/h;

    .line 26
    .line 27
    iput-object p5, p0, Ll2/c0;->d:Ll2/h;

    .line 28
    .line 29
    iput p6, p0, Ll2/c0;->e:I

    .line 30
    .line 31
    iput p7, p0, Ll2/c0;->f:I

    .line 32
    .line 33
    iput-object p8, p0, Ll2/c0;->g:Ll2/d;

    .line 34
    .line 35
    iput-wide p9, p0, Ll2/c0;->h:J

    .line 36
    .line 37
    iput-object p11, p0, Ll2/c0;->i:Ll2/b0;

    .line 38
    .line 39
    iput-wide p12, p0, Ll2/c0;->j:J

    .line 40
    .line 41
    iput p14, p0, Ll2/c0;->k:I

    .line 42
    .line 43
    return-void
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
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_d

    .line 6
    .line 7
    const-class v0, Ll2/c0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_1
    check-cast p1, Ll2/c0;

    .line 22
    .line 23
    iget v0, p0, Ll2/c0;->e:I

    .line 24
    .line 25
    iget v1, p1, Ll2/c0;->e:I

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_2
    iget v0, p0, Ll2/c0;->f:I

    .line 32
    .line 33
    iget v1, p1, Ll2/c0;->f:I

    .line 34
    .line 35
    if-eq v0, v1, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    iget-object v0, p0, Ll2/c0;->a:Ljava/util/UUID;

    .line 39
    .line 40
    iget-object v1, p1, Ll2/c0;->a:Ljava/util/UUID;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    iget v0, p0, Ll2/c0;->l:I

    .line 50
    .line 51
    iget v1, p1, Ll2/c0;->l:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-object v0, p0, Ll2/c0;->c:Ll2/h;

    .line 57
    .line 58
    iget-object v1, p1, Ll2/c0;->c:Ll2/h;

    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    iget-object v0, p0, Ll2/c0;->g:Ll2/d;

    .line 68
    .line 69
    iget-object v1, p1, Ll2/c0;->g:Ll2/d;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ll2/d;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_7

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_7
    iget-wide v0, p0, Ll2/c0;->h:J

    .line 79
    .line 80
    iget-wide v2, p1, Ll2/c0;->h:J

    .line 81
    .line 82
    cmp-long v4, v0, v2

    .line 83
    .line 84
    if-eqz v4, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, Ll2/c0;->i:Ll2/b0;

    .line 88
    .line 89
    iget-object v1, p1, Ll2/c0;->i:Ll2/b0;

    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-wide v0, p0, Ll2/c0;->j:J

    .line 99
    .line 100
    iget-wide v2, p1, Ll2/c0;->j:J

    .line 101
    .line 102
    cmp-long v4, v0, v2

    .line 103
    .line 104
    if-eqz v4, :cond_a

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    iget v0, p0, Ll2/c0;->k:I

    .line 108
    .line 109
    iget v1, p1, Ll2/c0;->k:I

    .line 110
    .line 111
    if-eq v0, v1, :cond_b

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_b
    iget-object v0, p0, Ll2/c0;->b:Ljava/util/HashSet;

    .line 115
    .line 116
    iget-object v1, p1, Ll2/c0;->b:Ljava/util/HashSet;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_c

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_c
    iget-object v0, p0, Ll2/c0;->d:Ll2/h;

    .line 126
    .line 127
    iget-object p1, p1, Ll2/c0;->d:Ll2/h;

    .line 128
    .line 129
    invoke-static {v0, p1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    return p1

    .line 134
    :cond_d
    :goto_0
    const/4 p1, 0x0

    .line 135
    return p1
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Ll2/c0;->a:Ljava/util/UUID;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Ll2/c0;->l:I

    .line 10
    .line 11
    invoke-static {v1}, Lu/h;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Ll2/c0;->c:Ll2/h;

    .line 19
    .line 20
    invoke-virtual {v0}, Ll2/h;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Ll2/c0;->b:Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, Ll2/c0;->d:Ll2/h;

    .line 37
    .line 38
    invoke-virtual {v0}, Ll2/h;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget v1, p0, Ll2/c0;->e:I

    .line 46
    .line 47
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget v1, p0, Ll2/c0;->f:I

    .line 51
    .line 52
    add-int/2addr v0, v1

    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Ll2/c0;->g:Ll2/d;

    .line 56
    .line 57
    invoke-virtual {v1}, Ll2/d;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v1, v0

    .line 62
    mul-int/lit8 v1, v1, 0x1f

    .line 63
    .line 64
    iget-wide v2, p0, Ll2/c0;->h:J

    .line 65
    .line 66
    const/16 v0, 0x20

    .line 67
    .line 68
    ushr-long v4, v2, v0

    .line 69
    .line 70
    xor-long/2addr v2, v4

    .line 71
    long-to-int v3, v2

    .line 72
    add-int/2addr v1, v3

    .line 73
    mul-int/lit8 v1, v1, 0x1f

    .line 74
    .line 75
    iget-object v2, p0, Ll2/c0;->i:Ll2/b0;

    .line 76
    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    invoke-virtual {v2}, Ll2/b0;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const/4 v2, 0x0

    .line 85
    :goto_0
    add-int/2addr v1, v2

    .line 86
    mul-int/lit8 v1, v1, 0x1f

    .line 87
    .line 88
    iget-wide v2, p0, Ll2/c0;->j:J

    .line 89
    .line 90
    ushr-long v4, v2, v0

    .line 91
    .line 92
    xor-long/2addr v2, v4

    .line 93
    long-to-int v0, v2

    .line 94
    add-int/2addr v1, v0

    .line 95
    mul-int/lit8 v1, v1, 0x1f

    .line 96
    .line 97
    iget v0, p0, Ll2/c0;->k:I

    .line 98
    .line 99
    add-int/2addr v1, v0

    .line 100
    return v1
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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "WorkInfo{id=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/c0;->a:Ljava/util/UUID;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', state="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Ll2/c0;->l:I

    .line 19
    .line 20
    invoke-static {v1}, Landroidx/appcompat/app/b;->B(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", outputData="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ll2/c0;->c:Ll2/h;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", tags="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Ll2/c0;->b:Ljava/util/HashSet;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", progress="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Ll2/c0;->d:Ll2/h;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", runAttemptCount="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget v1, p0, Ll2/c0;->e:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, ", generation="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget v1, p0, Ll2/c0;->f:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", constraints="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Ll2/c0;->g:Ll2/d;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", initialDelayMillis="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-wide v1, p0, Ll2/c0;->h:J

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", periodicityInfo="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Ll2/c0;->i:Ll2/b0;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", nextScheduleTimeMillis="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-wide v1, p0, Ll2/c0;->j:J

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, "}, stopReason="

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget v1, p0, Ll2/c0;->k:I

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
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
